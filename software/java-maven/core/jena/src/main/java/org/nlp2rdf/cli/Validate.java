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

package org.nlp2rdf.cli;

import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.ontology.OntModelSpec;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import joptsimple.OptionParser;
import joptsimple.OptionSet;
import org.aksw.rdfunit.validate.wrappers.RDFUnitStaticValidator;
import org.aksw.rdfunit.validate.wrappers.RDFUnitTestSuiteGenerator;
import org.nlp2rdf.core.Format;
import org.nlp2rdf.core.NIFParameters;
import org.nlp2rdf.core.vocab.RLOGOntClasses;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * User: hellmann
 * Date: 05.07.13
 "moved to implementation"
 */

@Deprecated
public class Validate {

    public static void main(String[] args) throws IOException {

        RDFUnitStaticValidator.initWrapper(
            new RDFUnitTestSuiteGenerator.Builder()
                    .addLocalResourceOrSchemaURI("nif", "org/uni-leipzig/persistence/nlp2rdf/nif-core/nif-core.ttl", "http://persistence.uni-leipzig.org/nlp2rdf/ontologies/nif-core#")
                    .build()
        );

        OptionParser parser = ParameterParser.getParser(args, "http://cli.nlp2rdf.org/validate#");
        try {
            OptionSet options = ParameterParser.getOption(parser, args);


            // print help screen
            if (options.has("h")) {
                String addHelp = "";
                throw new ParameterException(addHelp);
            }

            //check whether web service and start, if necessary
            if (options.has("start")) {
                int portNumber = (Integer) options.valueOf("port");
                System.err.println("Starting Web service at port " + portNumber);
                System.err.println("web service not implemented yet");


                System.exit(0);

            }

            NIFParameters nifParameters = ParameterParser.parseOptions(options, false);
            String outformat = nifParameters.getOutputFormat();

            //customize
            OntModel outputModel = ModelFactory.createOntologyModel(OntModelSpec.OWL_DL_MEM, ModelFactory.createDefaultModel());
            OntModel inputModel = ModelFactory.createOntologyModel(OntModelSpec.OWL_DL_MEM_RDFS_INF, ModelFactory.createDefaultModel());
            inputModel.add(nifParameters.getInputModel());
            inputModel.createOntology(nifParameters.getPrefix());
            nifParameters.setInputModel(inputModel);


            /*
            SPARQLValidator sparqlValidator = null;


            if (options.hasArgument("testsuite")) {
                File ttt = (File) options.valueOf("testsuite");
                if (!ttt.exists()) {
                    ParameterParser.die(parser, "testsuite ttl file does not exist: " + ttt.getAbsolutePath());
                }
                sparqlValidator = SPARQLValidator.getInstance(ttt);
            } else {
                sparqlValidator = SPARQLValidator.getInstance();
            }
            System.err.println("NIF Validator for defaultTestsuiteFile version " + sparqlValidator.getVersion() + ", " + sparqlValidator.getTests().size() + " tests total.");
            */

            if (outformat.equals("text")) {
                outputModel.add(RDFUnitStaticValidator.validate(inputModel));

            } else if (outformat.equals("turtle") || outformat.equals("rdfxml") || outformat.equals("ntriples")) {
                //sparqlValidator.setQuiet(true);
                outputModel.add(RDFUnitStaticValidator.validate(inputModel));
                if (options.hasArgument("outfile")) {
                    File outfile = (File) options.valueOf("outfile");
                    outputModel.write(new FileOutputStream(outfile), Format.toJena(outformat));
                } else {
                    outputModel.write(System.out, Format.toJena(outformat));
                }
            } else {
                outputModel.add(RDFUnitStaticValidator.validate(inputModel));
            }


            System.err.println(outputModel.listIndividuals(outputModel.createClass(RLOGOntClasses.Entry.getUri())).toSet().size() + " log messages found (could be debug messages, errors are displayed separately).");
            // TODO: some handling for inaccessible files or overwriting existing files
            //File f = (File) options.valueOf("o");

            // if plain and file option is given, redirect System.out to a file
            /*if (options.has("o") && (!options.has("f") || options.valueOf("f").equals("plain"))) {
               PrintStream printStream = new PrintStream(new FileOutputStream(f));
               System.setOut(printStream);
           } */
        } catch (ParameterException e) {
            ParameterParser.die(parser, e.getMessage());
        }


    }


}

