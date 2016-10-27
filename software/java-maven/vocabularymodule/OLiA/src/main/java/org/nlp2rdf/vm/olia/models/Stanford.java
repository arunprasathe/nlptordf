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

public class Stanford { 

	public static MultiValueMap links = MultiValueMap.decorate(new HashMap<String, ArrayList<String>>());
	
	static {

		links.put("http://purl.org/olia/stanford.owl#prep_", "http://purl.org/olia/olia.owl#Preposition");
		links.put("http://purl.org/olia/stanford.owl#prep_", "http://purl.org/olia/olia.owl#Adposition");
		links.put("http://purl.org/olia/stanford.owl#prep_", "http://purl.org/olia/olia.owl#SyntacticAdjunct");
		links.put("http://purl.org/olia/stanford.owl#prep_", "http://purl.org/olia/olia.owl#Modifier");
		links.put("http://purl.org/olia/stanford.owl#rel", "http://purl.org/olia/olia.owl#SyntacticArgument");
		links.put("http://purl.org/olia/stanford.owl#rel", "http://purl.org/olia/olia.owl#SyntacticComplement");
		links.put("http://purl.org/olia/stanford.owl#csubj", "http://purl.org/olia/olia.owl#SyntacticArgument");
		links.put("http://purl.org/olia/stanford.owl#csubj", "http://purl.org/olia/olia.owl#SyntacticSubject");
		links.put("http://purl.org/olia/stanford.owl#csubj", "http://purl.org/olia/olia.owl#Clause");
		links.put("http://purl.org/olia/stanford.owl#punct", "http://purl.org/olia/olia.owl#Punctuation");
		links.put("http://purl.org/olia/stanford.owl#advcl", "http://purl.org/olia/olia.owl#Modifier");
		links.put("http://purl.org/olia/stanford.owl#advcl", "http://purl.org/olia/olia.owl#SyntacticAdjunct");
		links.put("http://purl.org/olia/stanford.owl#abbrev", "http://purl.org/olia/olia.owl#SyntacticAdjunct");
		links.put("http://purl.org/olia/stanford.owl#abbrev", "http://purl.org/olia/olia.owl#Residual");
		links.put("http://purl.org/olia/stanford.owl#abbrev", "http://purl.org/olia/olia.owl#Abbreviation");
		links.put("http://purl.org/olia/stanford.owl#abbrev", "http://purl.org/olia/olia.owl#Modifier");
		links.put("http://purl.org/olia/stanford.owl#preconj", "http://purl.org/olia/olia.owl#Modifier");
		links.put("http://purl.org/olia/stanford.owl#preconj", "http://purl.org/olia/olia.owl#SyntacticAdjunct");
		links.put("http://purl.org/olia/stanford.owl#appos", "http://purl.org/olia/olia.owl#SyntacticAdjunct");
		links.put("http://purl.org/olia/stanford.owl#appos", "http://purl.org/olia/olia.owl#Adjunction");
		links.put("http://purl.org/olia/stanford.owl#appos", "http://purl.org/olia/olia.owl#Apposition");
		links.put("http://purl.org/olia/stanford.owl#appos", "http://purl.org/olia/olia.owl#Modifier");
		links.put("http://purl.org/olia/stanford.owl#compl", "http://purl.org/olia/olia.owl#SyntacticComplement");
		links.put("http://purl.org/olia/stanford.owl#compl", "http://purl.org/olia/olia.owl#SyntacticArgument");
		links.put("http://purl.org/olia/stanford.owl#nsubj", "http://purl.org/olia/olia.owl#SyntacticArgument");
		links.put("http://purl.org/olia/stanford.owl#nsubj", "http://purl.org/olia/olia.owl#Phrase");
		links.put("http://purl.org/olia/stanford.owl#nsubj", "http://purl.org/olia/olia.owl#NounHeadedPhrase");
		links.put("http://purl.org/olia/stanford.owl#nsubj", "http://purl.org/olia/olia.owl#SyntacticSubject");
		links.put("http://purl.org/olia/stanford.owl#nsubj", "http://purl.org/olia/olia.owl#NounPhrase");
		links.put("http://purl.org/olia/stanford.owl#prt", "http://purl.org/olia/olia.owl#SyntacticAdjunct");
		links.put("http://purl.org/olia/stanford.owl#prt", "http://purl.org/olia/olia.owl#Modifier");
		links.put("http://purl.org/olia/stanford.owl#prt", "http://purl.org/olia/olia.owl#Unique");
		links.put("http://purl.org/olia/stanford.owl#pobj", "http://purl.org/olia/olia.owl#SyntacticComplement");
		links.put("http://purl.org/olia/stanford.owl#pobj", "http://purl.org/olia/olia.owl#SyntacticArgument");
		links.put("http://purl.org/olia/stanford.owl#possessive", "http://purl.org/olia/olia.owl#Modifier");
		links.put("http://purl.org/olia/stanford.owl#possessive", "http://purl.org/olia/olia.owl#SyntacticAdjunct");
		links.put("http://purl.org/olia/stanford.owl#possessive", "http://purl.org/olia/olia.owl#MorphologicalParticle");
		links.put("http://purl.org/olia/stanford.owl#possessive", "http://purl.org/olia/olia.owl#Token");
		links.put("http://purl.org/olia/stanford.owl#possessive", "http://purl.org/olia/olia.owl#Morpheme");
		links.put("http://purl.org/olia/stanford.owl#prepc_", "http://purl.org/olia/olia.owl#Preposition");
		links.put("http://purl.org/olia/stanford.owl#prepc_", "http://purl.org/olia/olia.owl#SyntacticAdjunct");
		links.put("http://purl.org/olia/stanford.owl#prepc_", "http://purl.org/olia/olia.owl#Modifier");
		links.put("http://purl.org/olia/stanford.owl#prepc_", "http://purl.org/olia/olia.owl#Adposition");
		links.put("http://purl.org/olia/stanford.owl#expl", "http://purl.org/olia/olia.owl#ExpletivePronoun");
		links.put("http://purl.org/olia/stanford.owl#expl", "http://purl.org/olia/olia.owl#Expletive");
		links.put("http://purl.org/olia/stanford.owl#expl", "http://purl.org/olia/olia.owl#PersReflPronoun");
		links.put("http://purl.org/olia/stanford.owl#expl", "http://purl.org/olia/olia.owl#ThirdPersonPronoun");
		links.put("http://purl.org/olia/stanford.owl#expl", "http://purl.org/olia/olia.owl#PronounOrDeterminer");
		links.put("http://purl.org/olia/stanford.owl#expl", "http://purl.org/olia/olia.owl#Pronoun");
		links.put("http://purl.org/olia/stanford.owl#expl", "http://purl.org/olia/olia.owl#Unique");
		links.put("http://purl.org/olia/stanford.owl#iobj", "http://purl.org/olia/olia.owl#IndirectObject");
		links.put("http://purl.org/olia/stanford.owl#iobj", "http://purl.org/olia/olia.owl#SyntacticComplement");
		links.put("http://purl.org/olia/stanford.owl#iobj", "http://purl.org/olia/olia.owl#SyntacticObject");
		links.put("http://purl.org/olia/stanford.owl#iobj", "http://purl.org/olia/olia.owl#SyntacticArgument");
		links.put("http://purl.org/olia/stanford.owl#number", "http://purl.org/olia/olia.owl#Numeral");
		links.put("http://purl.org/olia/stanford.owl#number", "http://purl.org/olia/olia.owl#Quantifier");
		links.put("http://purl.org/olia/stanford.owl#number", "http://purl.org/olia/olia.owl#Modifier");
		links.put("http://purl.org/olia/stanford.owl#number", "http://purl.org/olia/olia.owl#SyntacticAdjunct");
		links.put("http://purl.org/olia/stanford.owl#purpcl", "http://purl.org/olia/olia.owl#SyntacticAdjunct");
		links.put("http://purl.org/olia/stanford.owl#purpcl", "http://purl.org/olia/olia.owl#PurposeRole");
		links.put("http://purl.org/olia/stanford.owl#purpcl", "http://purl.org/olia/olia.owl#Modifier");
		links.put("http://purl.org/olia/stanford.owl#mod", "http://purl.org/olia/olia.owl#SyntacticAdjunct");
		links.put("http://purl.org/olia/stanford.owl#mod", "http://purl.org/olia/olia.owl#Modifier");
		links.put("http://purl.org/olia/stanford.owl#aux", "http://purl.org/olia/olia.owl#Verb");
		links.put("http://purl.org/olia/stanford.owl#aux", "http://purl.org/olia/olia.owl#AuxiliaryVerb");
		links.put("http://purl.org/olia/stanford.owl#poss", "http://purl.org/olia/olia.owl#SyntacticAdjunct");
		links.put("http://purl.org/olia/stanford.owl#poss", "http://purl.org/olia/olia.owl#Modifier");
		links.put("http://purl.org/olia/stanford.owl#poss", "http://purl.org/olia/olia.owl#PossessorRole");
		links.put("http://purl.org/olia/stanford.owl#num", "http://purl.org/olia/olia.owl#Modifier");
		links.put("http://purl.org/olia/stanford.owl#num", "http://purl.org/olia/olia.owl#Quantifier");
		links.put("http://purl.org/olia/stanford.owl#num", "http://purl.org/olia/olia.owl#Numeral");
		links.put("http://purl.org/olia/stanford.owl#num", "http://purl.org/olia/olia.owl#SyntacticAdjunct");
		links.put("http://purl.org/olia/stanford.owl#arg", "http://purl.org/olia/olia.owl#SyntacticArgument");
		links.put("http://purl.org/olia/stanford.owl#neg", "http://purl.org/olia/olia.owl#Adverb");
		links.put("http://purl.org/olia/stanford.owl#neg", "http://purl.org/olia/olia.owl#Negation");
		links.put("http://purl.org/olia/stanford.owl#neg", "http://purl.org/olia/olia.owl#SyntacticAdjunct");
		links.put("http://purl.org/olia/stanford.owl#neg", "http://purl.org/olia/olia.owl#Modifier");
		links.put("http://purl.org/olia/stanford.owl#cc", "http://purl.org/olia/olia.owl#Phrase");
		links.put("http://purl.org/olia/stanford.owl#cc", "http://purl.org/olia/olia.owl#Coordination");
		links.put("http://purl.org/olia/stanford.owl#acomp", "http://purl.org/olia/olia.owl#SyntacticArgument");
		links.put("http://purl.org/olia/stanford.owl#acomp", "http://purl.org/olia/olia.owl#SyntacticComplement");
		links.put("http://purl.org/olia/stanford.owl#quantmod", "http://purl.org/olia/olia.owl#Quantifier");
		links.put("http://purl.org/olia/stanford.owl#quantmod", "http://purl.org/olia/olia.owl#Modifier");
		links.put("http://purl.org/olia/stanford.owl#quantmod", "http://purl.org/olia/olia.owl#SyntacticAdjunct");
		links.put("http://purl.org/olia/stanford.owl#attr", "http://purl.org/olia/olia.owl#SyntacticComplement");
		links.put("http://purl.org/olia/stanford.owl#attr", "http://purl.org/olia/olia.owl#SyntacticArgument");
		links.put("http://purl.org/olia/stanford.owl#xcomp", "http://purl.org/olia/olia.owl#SyntacticComplement");
		links.put("http://purl.org/olia/stanford.owl#xcomp", "http://purl.org/olia/olia.owl#SyntacticArgument");
		links.put("http://purl.org/olia/stanford.owl#pcomp", "http://purl.org/olia/olia.owl#SyntacticComplement");
		links.put("http://purl.org/olia/stanford.owl#pcomp", "http://purl.org/olia/olia.owl#SyntacticArgument");
		links.put("http://purl.org/olia/stanford.owl#nn", "http://purl.org/olia/olia.owl#Modifier");
		links.put("http://purl.org/olia/stanford.owl#nn", "http://purl.org/olia/olia.owl#Noun");
		links.put("http://purl.org/olia/stanford.owl#nn", "http://purl.org/olia/olia.owl#SyntacticAdjunct");
		links.put("http://purl.org/olia/stanford.owl#infmod", "http://purl.org/olia/olia.owl#Modifier");
		links.put("http://purl.org/olia/stanford.owl#infmod", "http://purl.org/olia/olia.owl#SyntacticAdjunct");
		links.put("http://purl.org/olia/stanford.owl#amod", "http://purl.org/olia/olia.owl#Adjective");
		links.put("http://purl.org/olia/stanford.owl#amod", "http://purl.org/olia/olia.owl#Modifier");
		links.put("http://purl.org/olia/stanford.owl#amod", "http://purl.org/olia/olia.owl#SyntacticAdjunct");
		links.put("http://purl.org/olia/stanford.owl#parataxis", "http://purl.org/olia/olia.owl#Coordination");
		links.put("http://purl.org/olia/stanford.owl#parataxis", "http://purl.org/olia/olia.owl#Phrase");
		links.put("http://purl.org/olia/stanford.owl#cop", "http://purl.org/olia/olia.owl#Copula");
		links.put("http://purl.org/olia/stanford.owl#cop", "http://purl.org/olia/olia.owl#Verb");
		links.put("http://purl.org/olia/stanford.owl#cop", "http://purl.org/olia/olia.owl#AuxiliaryVerb");
		links.put("http://purl.org/olia/stanford.owl#conj_", "http://purl.org/olia/olia.owl#Conjunct");
		links.put("http://purl.org/olia/stanford.owl#subj", "http://purl.org/olia/olia.owl#SyntacticArgument");
		links.put("http://purl.org/olia/stanford.owl#subj", "http://purl.org/olia/olia.owl#SyntacticSubject");
		links.put("http://purl.org/olia/stanford.owl#ccomp", "http://purl.org/olia/olia.owl#Clause");
		links.put("http://purl.org/olia/stanford.owl#ccomp", "http://purl.org/olia/olia.owl#SyntacticComplement");
		links.put("http://purl.org/olia/stanford.owl#ccomp", "http://purl.org/olia/olia.owl#SubordinateClause");
		links.put("http://purl.org/olia/stanford.owl#ccomp", "http://purl.org/olia/olia.owl#FiniteClause");
		links.put("http://purl.org/olia/stanford.owl#ccomp", "http://purl.org/olia/olia.owl#SyntacticArgument");
		links.put("http://purl.org/olia/stanford.owl#dobj", "http://purl.org/olia/olia.owl#DirectObject");
		links.put("http://purl.org/olia/stanford.owl#dobj", "http://purl.org/olia/olia.owl#SyntacticObject");
		links.put("http://purl.org/olia/stanford.owl#dobj", "http://purl.org/olia/olia.owl#SyntacticComplement");
		links.put("http://purl.org/olia/stanford.owl#dobj", "http://purl.org/olia/olia.owl#SyntacticArgument");
		links.put("http://purl.org/olia/stanford.owl#mark", "http://purl.org/olia/olia.owl#SyntacticArgument");
		links.put("http://purl.org/olia/stanford.owl#mark", "http://purl.org/olia/olia.owl#SyntacticComplement");
		links.put("http://purl.org/olia/stanford.owl#npadvmod", "http://purl.org/olia/olia.owl#Modifier");
		links.put("http://purl.org/olia/stanford.owl#npadvmod", "http://purl.org/olia/olia.owl#SyntacticAdjunct");
		links.put("http://purl.org/olia/stanford.owl#csubjpass", "http://purl.org/olia/olia.owl#Clause");
		links.put("http://purl.org/olia/stanford.owl#csubjpass", "http://purl.org/olia/olia.owl#SyntacticArgument");
		links.put("http://purl.org/olia/stanford.owl#csubjpass", "http://purl.org/olia/olia.owl#UndergoerMacroRole");
		links.put("http://purl.org/olia/stanford.owl#csubjpass", "http://purl.org/olia/olia.owl#SyntacticSubject");
		links.put("http://purl.org/olia/stanford.owl#predet", "http://purl.org/olia/olia.owl#SyntacticAdjunct");
		links.put("http://purl.org/olia/stanford.owl#predet", "http://purl.org/olia/olia.owl#Modifier");
		links.put("http://purl.org/olia/stanford.owl#obj", "http://purl.org/olia/olia.owl#SyntacticArgument");
		links.put("http://purl.org/olia/stanford.owl#obj", "http://purl.org/olia/olia.owl#SyntacticComplement");
		links.put("http://purl.org/olia/stanford.owl#comp", "http://purl.org/olia/olia.owl#SyntacticComplement");
		links.put("http://purl.org/olia/stanford.owl#comp", "http://purl.org/olia/olia.owl#SyntacticArgument");
		links.put("http://purl.org/olia/stanford.owl#rcmod", "http://purl.org/olia/olia.owl#Modifier");
		links.put("http://purl.org/olia/stanford.owl#rcmod", "http://purl.org/olia/olia.owl#SubordinateClause");
		links.put("http://purl.org/olia/stanford.owl#rcmod", "http://purl.org/olia/olia.owl#RelativeClause");
		links.put("http://purl.org/olia/stanford.owl#rcmod", "http://purl.org/olia/olia.owl#Clause");
		links.put("http://purl.org/olia/stanford.owl#rcmod", "http://purl.org/olia/olia.owl#FiniteClause");
		links.put("http://purl.org/olia/stanford.owl#rcmod", "http://purl.org/olia/olia.owl#SyntacticAdjunct");
		links.put("http://purl.org/olia/stanford.owl#advmod", "http://purl.org/olia/olia.owl#Modifier");
		links.put("http://purl.org/olia/stanford.owl#advmod", "http://purl.org/olia/olia.owl#SyntacticAdjunct");
		links.put("http://purl.org/olia/stanford.owl#advmod", "http://purl.org/olia/olia.owl#Adverb");
		links.put("http://purl.org/olia/stanford.owl#conj", "http://purl.org/olia/olia.owl#Conjunct");
		links.put("http://purl.org/olia/stanford.owl#auxpass", "http://purl.org/olia/olia.owl#Verb");
		links.put("http://purl.org/olia/stanford.owl#auxpass", "http://purl.org/olia/olia.owl#AuxiliaryVerb");
		links.put("http://purl.org/olia/stanford.owl#mwe", "http://purl.org/olia/olia.owl#SyntacticAdjunct");
		links.put("http://purl.org/olia/stanford.owl#mwe", "http://purl.org/olia/olia.owl#Modifier");
		links.put("http://purl.org/olia/stanford.owl#partmod", "http://purl.org/olia/olia.owl#Verb");
		links.put("http://purl.org/olia/stanford.owl#partmod", "http://purl.org/olia/olia.owl#SyntacticAdjunct");
		links.put("http://purl.org/olia/stanford.owl#partmod", "http://purl.org/olia/olia.owl#NonFiniteVerb");
		links.put("http://purl.org/olia/stanford.owl#partmod", "http://purl.org/olia/olia.owl#Participle");
		links.put("http://purl.org/olia/stanford.owl#partmod", "http://purl.org/olia/olia.owl#Modifier");
		links.put("http://purl.org/olia/stanford.owl#det", "http://purl.org/olia/olia.owl#SyntacticAdjunct");
		links.put("http://purl.org/olia/stanford.owl#det", "http://purl.org/olia/olia.owl#PronounOrDeterminer");
		links.put("http://purl.org/olia/stanford.owl#det", "http://purl.org/olia/olia.owl#Determiner");
		links.put("http://purl.org/olia/stanford.owl#det", "http://purl.org/olia/olia.owl#Modifier");
		links.put("http://purl.org/olia/stanford.owl#prep", "http://purl.org/olia/olia.owl#Modifier");
		links.put("http://purl.org/olia/stanford.owl#prep", "http://purl.org/olia/olia.owl#Preposition");
		links.put("http://purl.org/olia/stanford.owl#prep", "http://purl.org/olia/olia.owl#SyntacticAdjunct");
		links.put("http://purl.org/olia/stanford.owl#prep", "http://purl.org/olia/olia.owl#Adposition");
		links.put("http://purl.org/olia/stanford.owl#measure", "http://purl.org/olia/olia.owl#SyntacticAdjunct");
		links.put("http://purl.org/olia/stanford.owl#measure", "http://purl.org/olia/olia.owl#MeasureArgument");
		links.put("http://purl.org/olia/stanford.owl#measure", "http://purl.org/olia/olia.owl#Modifier");
		links.put("http://purl.org/olia/stanford.owl#measure", "http://purl.org/olia/olia.owl#AdnominalConstituent");
		links.put("http://purl.org/olia/stanford.owl#tmod", "http://purl.org/olia/olia.owl#TimeRole");
		links.put("http://purl.org/olia/stanford.owl#tmod", "http://purl.org/olia/olia.owl#SyntacticAdjunct");
		links.put("http://purl.org/olia/stanford.owl#tmod", "http://purl.org/olia/olia.owl#Modifier");
		links.put("http://purl.org/olia/stanford.owl#prepc", "http://purl.org/olia/olia.owl#Preposition");
		links.put("http://purl.org/olia/stanford.owl#prepc", "http://purl.org/olia/olia.owl#SyntacticAdjunct");
		links.put("http://purl.org/olia/stanford.owl#prepc", "http://purl.org/olia/olia.owl#Modifier");
		links.put("http://purl.org/olia/stanford.owl#prepc", "http://purl.org/olia/olia.owl#Adposition");
		links.put("http://purl.org/olia/stanford.owl#complm", "http://purl.org/olia/olia.owl#SyntacticArgument");
		links.put("http://purl.org/olia/stanford.owl#complm", "http://purl.org/olia/olia.owl#SyntacticComplement");
		links.put("http://purl.org/olia/stanford.owl#agent", "http://purl.org/olia/olia.owl#Modifier");
		links.put("http://purl.org/olia/stanford.owl#agent", "http://purl.org/olia/olia.owl#AgentRole");
		links.put("http://purl.org/olia/stanford.owl#agent", "http://purl.org/olia/olia.owl#SyntacticAdjunct");
		links.put("http://purl.org/olia/stanford.owl#agent", "http://purl.org/olia/olia.owl#ActorMacroRole");
		links.put("http://purl.org/olia/stanford.owl#agent", "http://purl.org/olia/olia.owl#SyntacticArgument");
		links.put("http://purl.org/olia/stanford.owl#nsubjpass", "http://purl.org/olia/olia.owl#UndergoerMacroRole");
		links.put("http://purl.org/olia/stanford.owl#nsubjpass", "http://purl.org/olia/olia.owl#NounHeadedPhrase");
		links.put("http://purl.org/olia/stanford.owl#nsubjpass", "http://purl.org/olia/olia.owl#NounPhrase");
		links.put("http://purl.org/olia/stanford.owl#nsubjpass", "http://purl.org/olia/olia.owl#Phrase");
		links.put("http://purl.org/olia/stanford.owl#nsubjpass", "http://purl.org/olia/olia.owl#SyntacticArgument");
		links.put("http://purl.org/olia/stanford.owl#nsubjpass", "http://purl.org/olia/olia.owl#SyntacticSubject");
	}
	
	public static MultiValueMap hasTag = MultiValueMap.decorate(new HashMap<String, ArrayList<String>>());
	
	static {

		hasTag.put("abbrev", "http://purl.org/olia/stanford.owl#abbrev");
		hasTag.put("acomp", "http://purl.org/olia/stanford.owl#acomp");
		hasTag.put("advcl", "http://purl.org/olia/stanford.owl#advcl");
		hasTag.put("advmod", "http://purl.org/olia/stanford.owl#advmod");
		hasTag.put("agent", "http://purl.org/olia/stanford.owl#agent");
		hasTag.put("amod", "http://purl.org/olia/stanford.owl#amod");
		hasTag.put("appos", "http://purl.org/olia/stanford.owl#appos");
		hasTag.put("arg", "http://purl.org/olia/stanford.owl#arg");
		hasTag.put("attr", "http://purl.org/olia/stanford.owl#attr");
		hasTag.put("aux", "http://purl.org/olia/stanford.owl#aux");
		hasTag.put("auxpass", "http://purl.org/olia/stanford.owl#auxpass");
		hasTag.put("cc", "http://purl.org/olia/stanford.owl#cc");
		hasTag.put("ccomp", "http://purl.org/olia/stanford.owl#ccomp");
		hasTag.put("comp", "http://purl.org/olia/stanford.owl#comp");
		hasTag.put("compl", "http://purl.org/olia/stanford.owl#compl");
		hasTag.put("complm", "http://purl.org/olia/stanford.owl#complm");
		hasTag.put("conj", "http://purl.org/olia/stanford.owl#conj");
		hasTag.put("cop", "http://purl.org/olia/stanford.owl#cop");
		hasTag.put("csubj", "http://purl.org/olia/stanford.owl#csubj");
		hasTag.put("csubjpass", "http://purl.org/olia/stanford.owl#csubjpass");
		hasTag.put("dep", "http://purl.org/olia/stanford.owl#dep");
		hasTag.put("det", "http://purl.org/olia/stanford.owl#det");
		hasTag.put("dobj", "http://purl.org/olia/stanford.owl#dobj");
		hasTag.put("expl", "http://purl.org/olia/stanford.owl#expl");
		hasTag.put("infmod", "http://purl.org/olia/stanford.owl#infmod");
		hasTag.put("iobj", "http://purl.org/olia/stanford.owl#iobj");
		hasTag.put("mark", "http://purl.org/olia/stanford.owl#mark");
		hasTag.put("measure", "http://purl.org/olia/stanford.owl#measure");
		hasTag.put("mod", "http://purl.org/olia/stanford.owl#mod");
		hasTag.put("mwe", "http://purl.org/olia/stanford.owl#mwe");
		hasTag.put("neg", "http://purl.org/olia/stanford.owl#neg");
		hasTag.put("nn", "http://purl.org/olia/stanford.owl#nn");
		hasTag.put("npadvmod", "http://purl.org/olia/stanford.owl#npadvmod");
		hasTag.put("nsubj", "http://purl.org/olia/stanford.owl#nsubj");
		hasTag.put("nsubjpass", "http://purl.org/olia/stanford.owl#nsubjpass");
		hasTag.put("num", "http://purl.org/olia/stanford.owl#num");
		hasTag.put("number", "http://purl.org/olia/stanford.owl#number");
		hasTag.put("obj", "http://purl.org/olia/stanford.owl#obj");
		hasTag.put("parataxis", "http://purl.org/olia/stanford.owl#parataxis");
		hasTag.put("partmod", "http://purl.org/olia/stanford.owl#partmod");
		hasTag.put("pcomp", "http://purl.org/olia/stanford.owl#pcomp");
		hasTag.put("pobj", "http://purl.org/olia/stanford.owl#pobj");
		hasTag.put("poss", "http://purl.org/olia/stanford.owl#poss");
		hasTag.put("possessive", "http://purl.org/olia/stanford.owl#possessive");
		hasTag.put("preconj", "http://purl.org/olia/stanford.owl#preconj");
		hasTag.put("predet", "http://purl.org/olia/stanford.owl#predet");
		hasTag.put("prep", "http://purl.org/olia/stanford.owl#prep");
		hasTag.put("prepc", "http://purl.org/olia/stanford.owl#prepc");
		hasTag.put("prt", "http://purl.org/olia/stanford.owl#prt");
		hasTag.put("punct", "http://purl.org/olia/stanford.owl#punct");
		hasTag.put("purpcl", "http://purl.org/olia/stanford.owl#purpcl");
		hasTag.put("quantmod", "http://purl.org/olia/stanford.owl#quantmod");
		hasTag.put("rcmod", "http://purl.org/olia/stanford.owl#rcmod");
		hasTag.put("ref", "http://purl.org/olia/stanford.owl#ref");
		hasTag.put("rel", "http://purl.org/olia/stanford.owl#rel");
		hasTag.put("root", "http://purl.org/olia/stanford.owl#root");
		hasTag.put("sdep", "http://purl.org/olia/stanford.owl#sdep");
		hasTag.put("subj", "http://purl.org/olia/stanford.owl#subj");
		hasTag.put("tmod", "http://purl.org/olia/stanford.owl#tmod");
		hasTag.put("xcomp", "http://purl.org/olia/stanford.owl#xcomp");
		hasTag.put("xsubj", "http://purl.org/olia/stanford.owl#xsubj");
	}
	

	}
	
