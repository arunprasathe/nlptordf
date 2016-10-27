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

package org.nlp2rdf.implementation.stanfordcore;


import com.hp.hpl.jena.ontology.Individual;
import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.ontology.OntModelSpec;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import org.junit.Test;
import org.nlp2rdf.core.NIFParameters;
import org.nlp2rdf.core.Text2RDF;
import org.nlp2rdf.core.urischemes.RFC5147String;
import org.nlp2rdf.core.urischemes.URIScheme;
import org.nlp2rdf.implementation.stanfordcorenlp.StanfordWrapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;

/**
 * @author Sebastian Hellmann - http://bis.informatik.uni-leipzig.de/SebastianHellmann
 *         Created: 30.07.11
 */
public class StanfordTest {

    private static Logger logger = LoggerFactory.getLogger(StanfordWrapper.class);


    @Test
    public void testStanford() throws URISyntaxException, MalformedURLException {
        URL u = new URI("http://persistence.uni-leipzig.org/nlp2rdf/specification/example/david_lynch_dune_quoteid_124.txt").toURL();

        try {

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(u.openStream()));

            String inputLine;
            StringBuilder sb = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                sb.append(inputLine);
                sb.append("\n");
            }
            in.close();
            String input = sb.toString();
            int targetLength = input.length();
            OntModel m = ModelFactory.createOntologyModel(OntModelSpec.OWL_DL_MEM, ModelFactory.createDefaultModel());
            URIScheme uriScheme = new RFC5147String();
            String prefix = "http://example.org/test/";
            Individual context = new Text2RDF().createContextIndividual(prefix, input, uriScheme, m);
            NIFParameters nifParameters = new NIFParameters(m, new HashMap<String, String>(), prefix, null, uriScheme, null, "turtle");


            new StanfordWrapper().process(context, m, m, nifParameters);
            //m.write(System.out, Format.toJena(nifParameters.getOutputFormat()));
            // logger.info(m.toString());
            //Assert.assertEquals(expected, m.toString());
        } catch (IOException ioe) {
            //if offline do nothing
        }
    }
}
