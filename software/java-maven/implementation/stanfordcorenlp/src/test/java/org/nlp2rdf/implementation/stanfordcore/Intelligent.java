package org.nlp2rdf.implementation.stanfordcore;

/*
 *  @author arun.p.edwin
 */

import java.util.HashMap;

import org.nlp2rdf.core.Format;
import org.nlp2rdf.core.NIFParameters;
import org.nlp2rdf.core.Text2RDF;
import org.nlp2rdf.core.urischemes.RFC5147String;
import org.nlp2rdf.core.urischemes.URIScheme;
import org.nlp2rdf.implementation.stanfordcorenlp.StanfordWrapper;

import com.hp.hpl.jena.ontology.Individual;
import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.rdf.model.ModelFactory;

public class Intelligent {
	
	public void getIntel(String contextString){
		OntModel ontmodel = ModelFactory.createOntologyModel();
		URIScheme uriScheme = new RFC5147String();
		String prefix = "http://jarvis.com/knowledge/";
		Individual context = new Text2RDF().createContextIndividual(prefix, contextString, uriScheme, ontmodel);
		NIFParameters nifParameters = new NIFParameters(ontmodel, new HashMap<String, String>(), prefix, null, uriScheme, null, "turtle");
		new StanfordWrapper().process(context, ontmodel, ontmodel, nifParameters);
		ontmodel.writeAll(System.out, Format.toJena(nifParameters.getOutputFormat()));
		
	}
	
   
	public static void main(String args[]) {
		Intelligent intel = new Intelligent();
		intel.getIntel("what an interesting world it is?");
	}

}
