/******************************************************************************/
/*  Copyright (C) 2010-2011, Sebastian Hellmann                               */
/*                                                                            */
/*  Licensed under the Apache License, Version 2.0 (the "License");           */
/*  you may not use this file except in compliance with the License.          */
/*  You may obtain a copy of the License at                                   */
/*                                                                            */
/*      http://www.apache.org/licenses/LICENSE-2.0                            */
/*                                                                            */
/*  Unless required by applicable law or agreed to in writing, software       */
/*  distributed under the License is distributed on an "AS IS" BASIS,         */
/*  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  */
/*  See the License for the specific language governing permissions and       */
/*  limitations under the License.                                            */
/******************************************************************************/

package org.nlp2rdf.core;

import com.hp.hpl.jena.datatypes.RDFDatatype;
import com.hp.hpl.jena.datatypes.xsd.XSDDatatype;
import com.hp.hpl.jena.ontology.Individual;
import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.vocabulary.XSD;
import com.jamonapi.Monitor;
import com.jamonapi.MonitorFactory;
import org.nlp2rdf.core.urischemes.URIScheme;
import org.nlp2rdf.core.vocab.NIFDatatypeProperties;
import org.nlp2rdf.core.vocab.NIFObjectProperties;
import org.nlp2rdf.core.vocab.NIFOntClasses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * @author Sebastian Hellmann
 */
public class Text2RDF {
    private static Logger log = LoggerFactory.getLogger(Text2RDF.class);

    public Individual createContextIndividual(String prefix, String contextString, URIScheme uriScheme, OntModel model) {
        Span span = new Span(0, contextString.length());
        String uri = uriScheme.generate(prefix, contextString, span);
        Individual context = model.createIndividual(uri, model.createClass(uriScheme.getOWLClassURI()));
        context.addOntClass(NIFOntClasses.Context.getOntClass(model));
        context.addLiteral(NIFDatatypeProperties.isString.getDatatypeProperty(model), model.createTypedLiteral(contextString,XSDDatatype.XSDstring));
        context.addProperty(NIFDatatypeProperties.beginIndex.getDatatypeProperty(model), span.getStart() + "",XSDDatatype.XSDnonNegativeInteger);
        context.addProperty(NIFDatatypeProperties.endIndex.getDatatypeProperty(model), span.getEnd() + "",XSDDatatype.XSDnonNegativeInteger);
        return context;
    }


    public Individual createCStringIndividual(String prefix, Individual context, Span span, URIScheme uriScheme, OntModel model) {
        String contextString = context.getPropertyValue(NIFDatatypeProperties.isString.getDatatypeProperty(model)).asLiteral().getString();
        String uri = uriScheme.generate(prefix, contextString, new Span[]{span});
        Individual string = model.createIndividual(uri, model.createClass(uriScheme.getOWLClassURI()));
        string.addLiteral(NIFDatatypeProperties.anchorOf.getDatatypeProperty(model), model.createTypedLiteral(span.getCoveredText(contextString).toString(),XSDDatatype.XSDstring));
        string.addProperty(NIFDatatypeProperties.beginIndex.getDatatypeProperty(model), span.getStart() + "",XSDDatatype.XSDnonNegativeInteger);
        string.addProperty(NIFDatatypeProperties.endIndex.getDatatypeProperty(model), span.getEnd() + "",XSDDatatype.XSDnonNegativeInteger);
        string.addProperty(NIFObjectProperties.referenceContext.getObjectProperty(model), context);
        return string;
    }


    public void generateNIFModel(String prefix, Individual context, URIScheme uriScheme, OntModel model, TreeMap<Span, List<Span>> tokenizedText) {
        assert tokenizedText != null && context != null && uriScheme != null && prefix != null;

        String contextString = context.getPropertyValue(NIFDatatypeProperties.isString.getDatatypeProperty(model)).asLiteral().getString();

        //some stats
        Monitor mon = MonitorFactory.getTimeMonitor("generateNIFModel").start();

        int wordCount = 0;
        try {
            Individual previousSentence = null;
            for (Span sentenceSpan : tokenizedText.descendingKeySet()) {
                //String sentenceUri = uriScheme.generate(prefix, contextString, sentenceSpan);
                Individual sentence = createCStringIndividual(prefix, context, sentenceSpan, uriScheme, model);
                sentence.addOntClass(NIFOntClasses.Sentence.getOntClass(model));

                //detect words
                List<Span> wordSpans = new ArrayList<Span>(tokenizedText.get(sentenceSpan));
                wordCount += wordSpans.size();
                Individual previousWord = null;
                for (int i = 0; i < wordSpans.size(); i++) {
                    Span wordSpan = wordSpans.get(i);
                    Individual wordIndividual = createCStringIndividual(prefix, context, wordSpan, uriScheme, model);
                    wordIndividual.addOntClass(NIFOntClasses.Word.getOntClass(model));
                    wordIndividual.addProperty(NIFObjectProperties.referenceContext.getObjectProperty(model), context);
                    wordIndividual.addProperty(NIFObjectProperties.sentence.getObjectProperty(model), sentence);
                    if (i == 0) {
                        //first
                        sentence.addProperty(NIFObjectProperties.firstWord.getObjectProperty(model), wordIndividual);
                    } else if (i == wordSpans.size() - 1) {
                        //last
                        wordIndividual.addProperty(NIFObjectProperties.previousWord.getObjectProperty(model), previousWord);
                        previousWord.addProperty(NIFObjectProperties.nextWord.getObjectProperty(model), wordIndividual);
                        sentence.addProperty(NIFObjectProperties.lastWord.getObjectProperty(model), wordIndividual);
                    } else {
                        //inbetween
                        wordIndividual.addProperty(NIFObjectProperties.previousWord.getObjectProperty(model), previousWord);
                        previousWord.addProperty(NIFObjectProperties.nextWord.getObjectProperty(model), wordIndividual);
                        sentence.addProperty(NIFObjectProperties.word.getObjectProperty(model), wordIndividual);
                    }

                    previousWord = wordIndividual;

                    if (log.isTraceEnabled()) {
                        StringBuilder logging = new StringBuilder();
                        logging.append("\nword: " + wordSpan.getCoveredText(contextString));
                        logging.append("\nabsolute sentence position [start|end]: " + sentenceSpan.getStart() + "|" + sentenceSpan.getEnd());
                        logging.append("\nabsolute word position [start|end]: " + wordSpan.getStart() + "|" + wordSpan.getEnd());
                        log.trace(logging.toString());
                    }
                }
                if (previousSentence != null) {
                    sentence.addProperty(NIFObjectProperties.previousSentence.getObjectProperty(model), previousSentence);
                    previousSentence.addProperty(NIFObjectProperties.nextSentence.getObjectProperty(model), sentence);
                }

                previousSentence = sentence;
            }
        } finally {
            mon.stop();
        }
    }

    /*public void expand(String prefix, URIScheme uriScheme, final OntModel model) {

        final DatatypeProperty beginIndex = NIFDatatypeProperties.beginIndex.getDatatypeProperty(model);
      //  final ObjectProperty beginIndex = NIFDatatypeProperties.beginIndex.getDatatypeProperty(model);
        Monitor mon = MonitorFactory.getTimeMonitor("addNextAndPreviousProperties").start();

        long previous = model.size();
        ExtendedIterator<Individual> itw = model.listIndividuals(NIFOntClasses.Word.getOntClass(model));

        SortedSet<Individual> words = new TreeSet<Individual>(new Comparator<Individual>() {
            @Override
            public int compare(Individual individual, Individual individual1) {
                int a = individual.getPropertyValue(beginIndex).asLiteral().getInt();
                int b = individual1.getPropertyValue(beginIndex).asLiteral().getInt();
                return a - b;
            }
        });
        words.addAll(itw.toSet());

        Individual previousSentence = null;
        for (Individual word : words) {
           // Individual currentSentence = word.getPropertyValue()


            System.out.println(word);
        }

        System.exit(0);

        /**ExtendedIterator<Individual> its = model.listIndividuals(NIFOntClasses.Sentence.getOntClass(model));
         for (Individual sentence = null; its.hasNext(); sentence = its.next()) {


         }

         List<Sentence> sentences = Sentence.list(model);
         Collections.sort(sentences, new URIComparator(prefix, text, uriGenerator));
         for (int x = 0; x < sentences.size(); x++) {
         Sentence sentence = sentences.get(x);
         List<Word> words = sentence.listWord();
         Collections.sort(words, new URIComparator(prefix, text, uriGenerator));
         if (x < sentences.size() - 1) {
         //not the last one
         sentence.setNextSentence(sentences.get(x + 1));
         }

         for (int y = 0; y < words.size(); y++) {
         Word word = words.get(y);
         //not the last one
         if (y < words.size() - 1) {
         word.setNextWord(words.get(y + 1));
         }
         }
         }

        mon.stop();
        log.debug("Finished addition of next/previous properties " + (model.size() - previous) + " triples added, " + mon.getLastValue() + " ms.)");
    }  */


}
