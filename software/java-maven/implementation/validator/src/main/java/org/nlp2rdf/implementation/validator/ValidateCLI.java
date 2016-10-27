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

package org.nlp2rdf.implementation.validator;

import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.ontology.OntModelSpec;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import joptsimple.OptionParser;
import joptsimple.OptionSet;
import org.aksw.rdfunit.enums.TestCaseExecutionType;
import org.aksw.rdfunit.io.writer.*;
import org.aksw.rdfunit.validate.wrappers.RDFUnitStaticValidator;
import org.aksw.rdfunit.validate.wrappers.RDFUnitTestSuiteGenerator;
import org.nlp2rdf.cli.ParameterException;
import org.nlp2rdf.cli.ParameterParser;
import org.nlp2rdf.core.Format;
import org.nlp2rdf.core.NIFParameters;
import org.nlp2rdf.core.vocab.RLOGOntClasses;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * User: hellmann
 * Date: 08.09.13
 * mvn compile exec:java -e  -Dexec.mainClass="org.nlp2rdf.cli.Validate" -Dexec.args="-i src/test/resources/nif-erroneous-model.ttl"
 */
public class ValidateCLI {

    public static void main(String[] args) throws IOException {

        RDFUnitStaticValidator.initWrapper(
                new RDFUnitTestSuiteGenerator.Builder()
                        .addLocalResourceOrSchemaURI("nif", "org/uni-leipzig/persistence/nlp2rdf/nif-core/nif-core.ttl", "http://persistence.uni-leipzig.org/nlp2rdf/ontologies/nif-core#")
                        .build()
        );

        OptionParser parser = ParameterParser.getParser(args, "http://cli.nlp2rdf.org/validator#");
        ParameterParser.addCLIParameter(parser);

        try {
            OptionSet options = ParameterParser.getOption(parser, args);
            ParameterParser.handleHelpAndWS(options, "");

            NIFParameters nifParameters = ParameterParser.parseOptions(options, false);

            // enable RDFS reasoning in inputmodel
            OntModel inputModel = ModelFactory.createOntologyModel(OntModelSpec.OWL_DL_MEM_RDFS_INF, ModelFactory.createDefaultModel());
            inputModel.add(nifParameters.getInputModel());
            inputModel.createOntology(nifParameters.getPrefix());


            String outformat = nifParameters.getOutputFormat();

            OntModel outputModel = ModelFactory.createOntologyModel(OntModelSpec.OWL_DL_MEM, ModelFactory.createDefaultModel());

            OutputStream outputStream;
            if (options.hasArgument("outfile")) {
                File outfile = (File) options.valueOf("outfile");
                outputStream = new FileOutputStream(outfile);
            } else {
                outputStream = System.out;

            }

            // Initialize the results models
            Model validationResults = RDFUnitStaticValidator.validate(inputModel);
            outputModel.add(validationResults);

            //Default writer (RDFUnit)
            RDFWriter outputWriter = null;

            switch (outformat) {

                // treat them the same
                case "turtle":
                case "rdfxml":
                case "ntriples":
                    outputWriter = new RDFStreamWriter(outputStream, Format.toJena(outformat));
                    break;
                case "html": {
                    outputWriter = RDFWriterFactory.createHTMLWriter(TestCaseExecutionType.rlogTestCaseResult, outputStream);
                    break;
                }
                case "text": {
                    outputStream.write(outputModel.toString().getBytes());
                    break;
                }
            }

            // Write the output if outputWriter not null
            try {
                if (outputWriter != null)
                    outputWriter.write(outputModel);
            } catch (RDFWriterException e) {
                System.err.println("Cannot write to output: " + e.getMessage());
                e.printStackTrace();
            }

            System.err.println(outputModel.listIndividuals(outputModel.createClass(RLOGOntClasses.Entry.getUri())).toSet().size() + " log messages found (could be debug messages, errors are displayed separately).");
            // TODO: some handling for inaccessible files or overwriting existing files

        } catch (ParameterException e) {
            ParameterParser.die(parser, e.getMessage());
            // main script
        }

    }
}
