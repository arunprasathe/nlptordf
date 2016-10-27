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

package org.nlp2rdf.vm.olia.models;

import org.apache.commons.collections.map.MultiValueMap;

import java.util.ArrayList;
import java.util.HashMap;

public class Penn implements OliaInterface { 

	public static MultiValueMap links = MultiValueMap.decorate(new HashMap<String, ArrayList<String>>());
	
	static {
		
		links.put("http://purl.org/olia/penn.owl#RP", "http://purl.org/olia/penn.owl#Particle");
		links.put("http://purl.org/olia/penn.owl#TO", "http://purl.org/olia/penn.owl#To");
		links.put("http://purl.org/olia/penn.owl#IN", "http://purl.org/olia/penn.owl#PrepositionOrSubordinatingConjunction");
		links.put("http://purl.org/olia/penn.owl#LS", "http://purl.org/olia/olia.owl#Residual");
		links.put("http://purl.org/olia/penn.owl#JJS", "http://purl.org/olia/olia.owl#Adjective");
		links.put("http://purl.org/olia/penn.owl#leftCurlyBracket", "http://purl.org/olia/olia.owl#ParentheticalPunctuation");
		links.put("http://purl.org/olia/penn.owl#leftCurlyBracket", "http://purl.org/olia/olia.owl#LeftParentheticalPunctuation");
		links.put("http://purl.org/olia/penn.owl#leftCurlyBracket", "http://purl.org/olia/olia.owl#Punctuation");
		links.put("http://purl.org/olia/penn.owl#leftCurlyBracket", "http://purl.org/olia/olia.owl#SecondaryPunctuation");
		links.put("http://purl.org/olia/penn.owl#fullStop", "http://purl.org/olia/olia.owl#Point");
		links.put("http://purl.org/olia/penn.owl#fullStop", "http://purl.org/olia/olia.owl#MainPunctuation");
		links.put("http://purl.org/olia/penn.owl#fullStop", "http://purl.org/olia/olia.owl#SentenceFinalPunctuation");
		links.put("http://purl.org/olia/penn.owl#fullStop", "http://purl.org/olia/olia.owl#Punctuation");
		links.put("http://purl.org/olia/penn.owl#NNPS", "http://purl.org/olia/olia.owl#ProperNoun");
		links.put("http://purl.org/olia/penn.owl#NNPS", "http://purl.org/olia/olia.owl#Noun");
		links.put("http://purl.org/olia/penn.owl#doubleQuote", "http://purl.org/olia/olia.owl#Punctuation");
		links.put("http://purl.org/olia/penn.owl#doubleQuote", "http://purl.org/olia/olia.owl#Quote");
		links.put("http://purl.org/olia/penn.owl#doubleQuote", "http://purl.org/olia/olia.owl#SecondaryPunctuation");
		links.put("http://purl.org/olia/penn.owl#RBR", "http://purl.org/olia/olia.owl#Adverb");
		links.put("http://purl.org/olia/penn.owl#VB", "http://purl.org/olia/olia.owl#Verb");
		links.put("http://purl.org/olia/penn.owl#WRB", "http://purl.org/olia/olia.owl#Adverb");
		links.put("http://purl.org/olia/penn.owl#WRB", "http://purl.org/olia/olia.owl#WHTypeAdverbs");
		links.put("http://purl.org/olia/penn.owl#VBZ", "http://purl.org/olia/olia.owl#Verb");
		links.put("http://purl.org/olia/penn.owl#VBP", "http://purl.org/olia/olia.owl#Verb");
		links.put("http://purl.org/olia/penn.owl#JJR", "http://purl.org/olia/olia.owl#Adjective");
		links.put("http://purl.org/olia/penn.owl#RB", "http://purl.org/olia/olia.owl#Adverb");
		links.put("http://purl.org/olia/penn.owl#POS", "http://purl.org/olia/olia.owl#Residual");
		links.put("http://purl.org/olia/penn.owl#WP", "http://purl.org/olia/olia.owl#PronounOrDeterminer");
		links.put("http://purl.org/olia/penn.owl#WP", "http://purl.org/olia/olia.owl#Pronoun");
		links.put("http://purl.org/olia/penn.owl#WP", "http://purl.org/olia/olia.owl#WHPronoun");
		links.put("http://purl.org/olia/penn.owl#PRPpossessive", "http://purl.org/olia/olia.owl#PossessivePronoun");
		links.put("http://purl.org/olia/penn.owl#PRPpossessive", "http://purl.org/olia/olia.owl#Pronoun");
		links.put("http://purl.org/olia/penn.owl#PRPpossessive", "http://purl.org/olia/olia.owl#PronounOrDeterminer");
		links.put("http://purl.org/olia/penn.owl#NNS", "http://purl.org/olia/olia.owl#Noun");
		links.put("http://purl.org/olia/penn.owl#NNS", "http://purl.org/olia/olia.owl#CommonNoun");
		links.put("http://purl.org/olia/penn.owl#VBG", "http://purl.org/olia/olia.owl#Verb");
		links.put("http://purl.org/olia/penn.owl#VBG", "http://purl.org/olia/olia.owl#Gerund");
		links.put("http://purl.org/olia/penn.owl#VBG", "http://purl.org/olia/olia.owl#NonFiniteVerb");
		links.put("http://purl.org/olia/penn.owl#VBG", "http://purl.org/olia/olia.owl#Participle");
		links.put("http://purl.org/olia/penn.owl#VBG", "http://purl.org/olia/olia.owl#ing");
		links.put("http://purl.org/olia/penn.owl#WPpossessive", "http://purl.org/olia/olia.owl#PossessivePronoun");
		links.put("http://purl.org/olia/penn.owl#WPpossessive", "http://purl.org/olia/olia.owl#WHDeterminer");
		links.put("http://purl.org/olia/penn.owl#WPpossessive", "http://purl.org/olia/olia.owl#PronounOrDeterminer");
		links.put("http://purl.org/olia/penn.owl#WPpossessive", "http://purl.org/olia/olia.owl#Pronoun");
		links.put("http://purl.org/olia/penn.owl#WPpossessive", "http://purl.org/olia/olia.owl#Determiner");
		links.put("http://purl.org/olia/penn.owl#WPpossessive", "http://purl.org/olia/olia.owl#PossessiveDeterminer");
		links.put("http://purl.org/olia/penn.owl#WPpossessive", "http://purl.org/olia/olia.owl#WHPronoun");
		links.put("http://purl.org/olia/penn.owl#WPpossessive", "http://purl.org/olia/olia.owl#AttributivePronoun");
		links.put("http://purl.org/olia/penn.owl#JJ", "http://purl.org/olia/olia.owl#Adjective");
		links.put("http://purl.org/olia/penn.owl#CC", "http://purl.org/olia/olia.owl#CoordinatingConjunction");
		links.put("http://purl.org/olia/penn.owl#CC", "http://purl.org/olia/olia.owl#Conjunction");
		links.put("http://purl.org/olia/penn.owl#DT", "http://purl.org/olia/olia.owl#PronounOrDeterminer");
		links.put("http://purl.org/olia/penn.owl#DT", "http://purl.org/olia/olia.owl#Determiner");
		links.put("http://purl.org/olia/penn.owl#EX", "http://purl.org/olia/olia.owl#Unique");
		links.put("http://purl.org/olia/penn.owl#RBS", "http://purl.org/olia/olia.owl#Adverb");
		links.put("http://purl.org/olia/penn.owl#comma", "http://purl.org/olia/olia.owl#Punctuation");
		links.put("http://purl.org/olia/penn.owl#comma", "http://purl.org/olia/olia.owl#SecondaryPunctuation");
		links.put("http://purl.org/olia/penn.owl#comma", "http://purl.org/olia/olia.owl#SentenceMedialPunctuation");
		links.put("http://purl.org/olia/penn.owl#comma", "http://purl.org/olia/olia.owl#Comma");
		links.put("http://purl.org/olia/penn.owl#PP", "http://purl.org/olia/olia.owl#PronounOrDeterminer");
		links.put("http://purl.org/olia/penn.owl#PP", "http://purl.org/olia/olia.owl#Pronoun");
		links.put("http://purl.org/olia/penn.owl#FW", "http://purl.org/olia/olia.owl#Foreign");
		links.put("http://purl.org/olia/penn.owl#FW", "http://purl.org/olia/olia.owl#Residual");
		links.put("http://purl.org/olia/penn.owl#leftSquareBracket", "http://purl.org/olia/olia.owl#LeftParentheticalPunctuation");
		links.put("http://purl.org/olia/penn.owl#leftSquareBracket", "http://purl.org/olia/olia.owl#ParentheticalPunctuation");
		links.put("http://purl.org/olia/penn.owl#leftSquareBracket", "http://purl.org/olia/olia.owl#Punctuation");
		links.put("http://purl.org/olia/penn.owl#leftSquareBracket", "http://purl.org/olia/olia.owl#SecondaryPunctuation");
		links.put("http://purl.org/olia/penn.owl#dollar", "http://purl.org/olia/olia.owl#Punctuation");
		links.put("http://purl.org/olia/penn.owl#dollar", "http://purl.org/olia/olia.owl#Symbol");
		links.put("http://purl.org/olia/penn.owl#dollar", "http://purl.org/olia/olia.owl#Residual");
		links.put("http://purl.org/olia/penn.owl#UH", "http://purl.org/olia/olia.owl#Interjection");
		links.put("http://purl.org/olia/penn.owl#WDT", "http://purl.org/olia/olia.owl#PronounOrDeterminer");
		links.put("http://purl.org/olia/penn.owl#WDT", "http://purl.org/olia/olia.owl#WHDeterminer");
		links.put("http://purl.org/olia/penn.owl#WDT", "http://purl.org/olia/olia.owl#Determiner");
		links.put("http://purl.org/olia/penn.owl#VBD", "http://purl.org/olia/olia.owl#Verb");
		links.put("http://purl.org/olia/penn.owl#NNP", "http://purl.org/olia/olia.owl#Noun");
		links.put("http://purl.org/olia/penn.owl#NNP", "http://purl.org/olia/olia.owl#ProperNoun");
		links.put("http://purl.org/olia/penn.owl#PPpossessive", "http://purl.org/olia/olia.owl#PronounOrDeterminer");
		links.put("http://purl.org/olia/penn.owl#PPpossessive", "http://purl.org/olia/olia.owl#Pronoun");
		links.put("http://purl.org/olia/penn.owl#PPpossessive", "http://purl.org/olia/olia.owl#PossessivePronoun");
		links.put("http://purl.org/olia/penn.owl#forwardDoubleQuote", "http://purl.org/olia/olia.owl#OpenQuote");
		links.put("http://purl.org/olia/penn.owl#forwardDoubleQuote", "http://purl.org/olia/olia.owl#Punctuation");
		links.put("http://purl.org/olia/penn.owl#forwardDoubleQuote", "http://purl.org/olia/olia.owl#Quote");
		links.put("http://purl.org/olia/penn.owl#forwardDoubleQuote", "http://purl.org/olia/olia.owl#SecondaryPunctuation");
		links.put("http://purl.org/olia/penn.owl#CD", "http://purl.org/olia/olia.owl#Quantifier");
		links.put("http://purl.org/olia/penn.owl#CD", "http://purl.org/olia/olia.owl#CardinalNumber");
		links.put("http://purl.org/olia/penn.owl#CD", "http://purl.org/olia/olia.owl#Numeral");
		links.put("http://purl.org/olia/penn.owl#rightRoundBracket", "http://purl.org/olia/olia.owl#Punctuation");
		links.put("http://purl.org/olia/penn.owl#rightRoundBracket", "http://purl.org/olia/olia.owl#SecondaryPunctuation");
		links.put("http://purl.org/olia/penn.owl#rightRoundBracket", "http://purl.org/olia/olia.owl#RightParentheticalPunctuation");
		links.put("http://purl.org/olia/penn.owl#rightRoundBracket", "http://purl.org/olia/olia.owl#ParentheticalPunctuation");
		links.put("http://purl.org/olia/penn.owl#PRP", "http://purl.org/olia/olia.owl#PronounOrDeterminer");
		links.put("http://purl.org/olia/penn.owl#PRP", "http://purl.org/olia/olia.owl#Pronoun");
		links.put("http://purl.org/olia/penn.owl#leftRoundBracket", "http://purl.org/olia/olia.owl#ParentheticalPunctuation");
		links.put("http://purl.org/olia/penn.owl#leftRoundBracket", "http://purl.org/olia/olia.owl#Punctuation");
		links.put("http://purl.org/olia/penn.owl#leftRoundBracket", "http://purl.org/olia/olia.owl#LeftParentheticalPunctuation");
		links.put("http://purl.org/olia/penn.owl#leftRoundBracket", "http://purl.org/olia/olia.owl#SecondaryPunctuation");
		links.put("http://purl.org/olia/penn.owl#NN", "http://purl.org/olia/olia.owl#Noun");
		links.put("http://purl.org/olia/penn.owl#NN", "http://purl.org/olia/olia.owl#CommonNoun");
		links.put("http://purl.org/olia/penn.owl#rightSquareBracket", "http://purl.org/olia/olia.owl#Punctuation");
		links.put("http://purl.org/olia/penn.owl#rightSquareBracket", "http://purl.org/olia/olia.owl#RightParentheticalPunctuation");
		links.put("http://purl.org/olia/penn.owl#rightSquareBracket", "http://purl.org/olia/olia.owl#ParentheticalPunctuation");
		links.put("http://purl.org/olia/penn.owl#rightSquareBracket", "http://purl.org/olia/olia.owl#SecondaryPunctuation");
		links.put("http://purl.org/olia/penn.owl#VBN", "http://purl.org/olia/olia.owl#NonFiniteVerb");
		links.put("http://purl.org/olia/penn.owl#VBN", "http://purl.org/olia/olia.owl#Verb");
		links.put("http://purl.org/olia/penn.owl#VBN", "http://purl.org/olia/olia.owl#Participle");
		links.put("http://purl.org/olia/penn.owl#rightCurlyBracket", "http://purl.org/olia/olia.owl#RightParentheticalPunctuation");
		links.put("http://purl.org/olia/penn.owl#rightCurlyBracket", "http://purl.org/olia/olia.owl#SecondaryPunctuation");
		links.put("http://purl.org/olia/penn.owl#rightCurlyBracket", "http://purl.org/olia/olia.owl#ParentheticalPunctuation");
		links.put("http://purl.org/olia/penn.owl#rightCurlyBracket", "http://purl.org/olia/olia.owl#Punctuation");
		links.put("http://purl.org/olia/penn.owl#MD", "http://purl.org/olia/olia.owl#Verb");
		links.put("http://purl.org/olia/penn.owl#MD", "http://purl.org/olia/olia.owl#ModalVerb");
		links.put("http://purl.org/olia/penn.owl#MD", "http://purl.org/olia/olia.owl#AuxiliaryVerb");
		links.put("http://purl.org/olia/penn.owl#colon", "http://purl.org/olia/olia.owl#SentenceMedialPunctuation");
		links.put("http://purl.org/olia/penn.owl#colon", "http://purl.org/olia/olia.owl#Punctuation");
		links.put("http://purl.org/olia/penn.owl#colon", "http://purl.org/olia/olia.owl#Colon");
		links.put("http://purl.org/olia/penn.owl#colon", "http://purl.org/olia/olia.owl#SecondaryPunctuation");
		links.put("http://purl.org/olia/penn.owl#SYM", "http://purl.org/olia/olia.owl#Symbol");
		links.put("http://purl.org/olia/penn.owl#SYM", "http://purl.org/olia/olia.owl#Residual");
		links.put("http://purl.org/olia/penn.owl#backwardDoubleQuote", "http://purl.org/olia/olia.owl#CloseQuote");
		links.put("http://purl.org/olia/penn.owl#backwardDoubleQuote", "http://purl.org/olia/olia.owl#SecondaryPunctuation");
		links.put("http://purl.org/olia/penn.owl#backwardDoubleQuote", "http://purl.org/olia/olia.owl#Quote");
		links.put("http://purl.org/olia/penn.owl#backwardDoubleQuote", "http://purl.org/olia/olia.owl#Punctuation");
	}
	
	public static MultiValueMap hasTag = MultiValueMap.decorate(new HashMap<String, ArrayList<String>>());
	
	static {

		hasTag.put("CC", "http://purl.org/olia/penn.owl#CC");
		hasTag.put("CD", "http://purl.org/olia/penn.owl#CD");
		hasTag.put("DT", "http://purl.org/olia/penn.owl#DT");
		hasTag.put("EX", "http://purl.org/olia/penn.owl#EX");
		hasTag.put("FW", "http://purl.org/olia/penn.owl#FW");
		hasTag.put("IN", "http://purl.org/olia/penn.owl#IN");
		hasTag.put("JJ", "http://purl.org/olia/penn.owl#JJ");
		hasTag.put("JJR", "http://purl.org/olia/penn.owl#JJR");
		hasTag.put("JJS", "http://purl.org/olia/penn.owl#JJS");
		hasTag.put("LS", "http://purl.org/olia/penn.owl#LS");
		hasTag.put("MD", "http://purl.org/olia/penn.owl#MD");
		hasTag.put("NN", "http://purl.org/olia/penn.owl#NN");
		hasTag.put("NNP", "http://purl.org/olia/penn.owl#NNP");
		hasTag.put("NNPS", "http://purl.org/olia/penn.owl#NNPS");
		hasTag.put("NNS", "http://purl.org/olia/penn.owl#NNS");
		hasTag.put("PDT", "http://purl.org/olia/penn.owl#PDT");
		hasTag.put("POS", "http://purl.org/olia/penn.owl#POS");
		hasTag.put("PP", "http://purl.org/olia/penn.owl#PP");
		hasTag.put("PP$", "http://purl.org/olia/penn.owl#PPpossessive");
		hasTag.put("PRP", "http://purl.org/olia/penn.owl#PRP");
		hasTag.put("PRP$", "http://purl.org/olia/penn.owl#PRPpossessive");
		hasTag.put("RB", "http://purl.org/olia/penn.owl#RB");
		hasTag.put("RBR", "http://purl.org/olia/penn.owl#RBR");
		hasTag.put("RBS", "http://purl.org/olia/penn.owl#RBS");
		hasTag.put("RP", "http://purl.org/olia/penn.owl#RP");
		hasTag.put("SYM", "http://purl.org/olia/penn.owl#SYM");
		hasTag.put("TO", "http://purl.org/olia/penn.owl#TO");
		hasTag.put("UH", "http://purl.org/olia/penn.owl#UH");
		hasTag.put("VB", "http://purl.org/olia/penn.owl#VB");
		hasTag.put("VBD", "http://purl.org/olia/penn.owl#VBD");
		hasTag.put("VBG", "http://purl.org/olia/penn.owl#VBG");
		hasTag.put("VBN", "http://purl.org/olia/penn.owl#VBN");
		hasTag.put("VBP", "http://purl.org/olia/penn.owl#VBP");
		hasTag.put("VBZ", "http://purl.org/olia/penn.owl#VBZ");
		hasTag.put("WDT", "http://purl.org/olia/penn.owl#WDT");
		hasTag.put("WP", "http://purl.org/olia/penn.owl#WP");
		hasTag.put("WP$", "http://purl.org/olia/penn.owl#WPpossessive");
		hasTag.put("WRB", "http://purl.org/olia/penn.owl#WRB");
		hasTag.put("''", "http://purl.org/olia/penn.owl#backwardDoubleQuote");
		hasTag.put(":", "http://purl.org/olia/penn.owl#colon");
		hasTag.put(",", "http://purl.org/olia/penn.owl#comma");
		hasTag.put("$", "http://purl.org/olia/penn.owl#dollar");
		hasTag.put("\"", "http://purl.org/olia/penn.owl#doubleQuote");
		hasTag.put("``", "http://purl.org/olia/penn.owl#forwardDoubleQuote");
		hasTag.put(".", "http://purl.org/olia/penn.owl#fullStop");
		hasTag.put("{", "http://purl.org/olia/penn.owl#leftCurlyBracket");
		hasTag.put("-LCB-", "http://purl.org/olia/penn.owl#leftCurlyBracket");
		hasTag.put("(", "http://purl.org/olia/penn.owl#leftRoundBracket");
		hasTag.put("-LRB-", "http://purl.org/olia/penn.owl#leftRoundBracket");
		hasTag.put("-LSB-", "http://purl.org/olia/penn.owl#leftSquareBracket");
		hasTag.put("[", "http://purl.org/olia/penn.owl#leftSquareBracket");
		hasTag.put("-RCB-", "http://purl.org/olia/penn.owl#rightCurlyBracket");
		hasTag.put("}", "http://purl.org/olia/penn.owl#rightCurlyBracket");
		hasTag.put("-RRB-", "http://purl.org/olia/penn.owl#rightRoundBracket");
		hasTag.put(")", "http://purl.org/olia/penn.owl#rightRoundBracket");
		hasTag.put("]", "http://purl.org/olia/penn.owl#rightSquareBracket");
		hasTag.put("-RSB-", "http://purl.org/olia/penn.owl#rightSquareBracket");
	}
	
	@Override 
	public MultiValueMap getLinks()
	{
		return links;
	}
	
	@Override 
	public MultiValueMap getTags()
	{
		return hasTag;
	}

}
	
