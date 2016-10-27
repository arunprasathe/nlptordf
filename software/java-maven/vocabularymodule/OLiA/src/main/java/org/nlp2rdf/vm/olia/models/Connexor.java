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

public class Connexor { 

	public static MultiValueMap links = MultiValueMap.decorate(new HashMap<String, ArrayList<String>>());
	
	static {

		links.put("http://purl.org/olia/connexor.owl#WH", "http://purl.org/olia/olia.owl#PronounOrDeterminer");
		links.put("http://purl.org/olia/connexor.owl#WH", "http://purl.org/olia/olia.owl#WHPronoun");
		links.put("http://purl.org/olia/connexor.owl#WH", "http://purl.org/olia/olia.owl#Pronoun");
		links.put("http://purl.org/olia/connexor.owl#NounVerbCombination", "http://purl.org/olia/olia.owl#Noun");
		links.put("http://purl.org/olia/connexor.owl#NounVerbCombination", "http://purl.org/olia/olia.owl#Verb");
		links.put("http://purl.org/olia/connexor.owl#NounVerbCombination", "http://purl.org/olia/olia.owl#FiniteVerb");
		links.put("http://purl.org/olia/connexor.owl#PRES", "http://purl.org/olia/olia.owl#Present");
		links.put("http://purl.org/olia/connexor.owl#PRES", "http://purl.org/olia/olia.owl#Verb");
		links.put("http://purl.org/olia/connexor.owl#PRES", "http://purl.org/olia/olia.owl#AbsoluteTense");
		links.put("http://purl.org/olia/connexor.owl#NEG-PART", "http://purl.org/olia/olia.owl#Unique");
		links.put("http://purl.org/olia/connexor.owl#Indef_adj", "http://purl.org/olia/olia.owl#PronounOrDeterminer");
		links.put("http://purl.org/olia/connexor.owl#Indef_adj", "http://purl.org/olia/olia.owl#Pronoun");
		links.put("http://purl.org/olia/connexor.owl#IMP", "http://purl.org/olia/olia.owl#FiniteVerb");
		links.put("http://purl.org/olia/connexor.owl#IMP", "http://purl.org/olia/olia.owl#Verb");
		links.put("http://purl.org/olia/connexor.owl#IMP", "http://purl.org/olia/olia.owl#ImperativeVerb");
		links.put("http://purl.org/olia/connexor.owl#Dem_adj", "http://purl.org/olia/olia.owl#Pronoun");
		links.put("http://purl.org/olia/connexor.owl#Dem_adj", "http://purl.org/olia/olia.owl#PronounOrDeterminer");
		links.put("http://purl.org/olia/connexor.owl#EN", "http://purl.org/olia/olia.owl#Participle");
		links.put("http://purl.org/olia/connexor.owl#EN", "http://purl.org/olia/olia.owl#Verb");
		links.put("http://purl.org/olia/connexor.owl#EN", "http://purl.org/olia/olia.owl#NonFiniteVerb");
		links.put("http://purl.org/olia/connexor.owl#Poss_Refl_adj", "http://purl.org/olia/olia.owl#Pronoun");
		links.put("http://purl.org/olia/connexor.owl#Poss_Refl_adj", "http://purl.org/olia/olia.owl#PronounOrDeterminer");
		links.put("http://purl.org/olia/connexor.owl#Indef_Refl", "http://purl.org/olia/olia.owl#PronounOrDeterminer");
		links.put("http://purl.org/olia/connexor.owl#Indef_Refl", "http://purl.org/olia/olia.owl#Pronoun");
		links.put("http://purl.org/olia/connexor.owl#Vsbj", "http://purl.org/olia/olia.owl#SubjunctiveVerb");
		links.put("http://purl.org/olia/connexor.owl#Vsbj", "http://purl.org/olia/olia.owl#FiniteVerb");
		links.put("http://purl.org/olia/connexor.owl#Vsbj", "http://purl.org/olia/olia.owl#Verb");
		links.put("http://purl.org/olia/connexor.owl#RECIPR", "http://purl.org/olia/olia.owl#PersReflPronoun");
		links.put("http://purl.org/olia/connexor.owl#RECIPR", "http://purl.org/olia/olia.owl#Pronoun");
		links.put("http://purl.org/olia/connexor.owl#RECIPR", "http://purl.org/olia/olia.owl#ReciprocalPronoun");
		links.put("http://purl.org/olia/connexor.owl#RECIPR", "http://purl.org/olia/olia.owl#PronounOrDeterminer");
		links.put("http://purl.org/olia/connexor.owl#Refl", "http://purl.org/olia/olia.owl#PersReflPronoun");
		links.put("http://purl.org/olia/connexor.owl#Refl", "http://purl.org/olia/olia.owl#PronounOrDeterminer");
		links.put("http://purl.org/olia/connexor.owl#Refl", "http://purl.org/olia/olia.owl#Pronoun");
		links.put("http://purl.org/olia/connexor.owl#Refl", "http://purl.org/olia/olia.owl#ReflexivePronoun");
		links.put("http://purl.org/olia/connexor.owl#N_Abbr", "http://purl.org/olia/olia.owl#Noun");
		links.put("http://purl.org/olia/connexor.owl#P1", "http://purl.org/olia/olia.owl#First");
		links.put("http://purl.org/olia/connexor.owl#N", "http://purl.org/olia/olia.owl#Noun");
		links.put("http://purl.org/olia/connexor.owl#Interr_adj", "http://purl.org/olia/olia.owl#PronounOrDeterminer");
		links.put("http://purl.org/olia/connexor.owl#Interr_adj", "http://purl.org/olia/olia.owl#Pronoun");
		links.put("http://purl.org/olia/connexor.owl#ABS", "http://purl.org/olia/olia.owl#Positive");
		links.put("http://purl.org/olia/connexor.owl#Refl_tonic", "http://purl.org/olia/olia.owl#PronounOrDeterminer");
		links.put("http://purl.org/olia/connexor.owl#Refl_tonic", "http://purl.org/olia/olia.owl#Pronoun");
		links.put("http://purl.org/olia/connexor.owl#GER", "http://purl.org/olia/olia.owl#Verb");
		links.put("http://purl.org/olia/connexor.owl#Interr", "http://purl.org/olia/olia.owl#InterrogativePronoun");
		links.put("http://purl.org/olia/connexor.owl#Interr", "http://purl.org/olia/olia.owl#PronounOrDeterminer");
		links.put("http://purl.org/olia/connexor.owl#Interr", "http://purl.org/olia/olia.owl#Adverb");
		links.put("http://purl.org/olia/connexor.owl#Interr", "http://purl.org/olia/olia.owl#WHPronoun");
		links.put("http://purl.org/olia/connexor.owl#Interr", "http://purl.org/olia/olia.owl#Pronoun");
		links.put("http://purl.org/olia/connexor.owl#V", "http://purl.org/olia/olia.owl#Verb");
		links.put("http://purl.org/olia/connexor.owl#PronAdj", "http://purl.org/olia/olia.owl#Determiner");
		links.put("http://purl.org/olia/connexor.owl#PronAdj", "http://purl.org/olia/olia.owl#Pronoun");
		links.put("http://purl.org/olia/connexor.owl#PronAdj", "http://purl.org/olia/olia.owl#AttributivePronoun");
		links.put("http://purl.org/olia/connexor.owl#PronAdj", "http://purl.org/olia/olia.owl#PronounOrDeterminer");
		links.put("http://purl.org/olia/connexor.owl#feminine", "http://purl.org/olia/olia.owl#Feminine");
		links.put("http://purl.org/olia/connexor.owl#Ex", "http://purl.org/olia/olia.owl#Adverb");
		links.put("http://purl.org/olia/connexor.owl#Ex", "http://purl.org/olia/olia.owl#Unique");
		links.put("http://purl.org/olia/connexor.owl#SG1", "http://purl.org/olia/olia.owl#First");
		links.put("http://purl.org/olia/connexor.owl#SG1", "http://purl.org/olia/olia.owl#Singular");
		links.put("http://purl.org/olia/connexor.owl#PRON", "http://purl.org/olia/olia.owl#PronounOrDeterminer");
		links.put("http://purl.org/olia/connexor.owl#PRON", "http://purl.org/olia/olia.owl#Pronoun");
		links.put("http://purl.org/olia/connexor.owl#INTERJ", "http://purl.org/olia/olia.owl#Interjection");
		links.put("http://purl.org/olia/connexor.owl#Pers_tonic", "http://purl.org/olia/olia.owl#PronounOrDeterminer");
		links.put("http://purl.org/olia/connexor.owl#Pers_tonic", "http://purl.org/olia/olia.owl#Pronoun");
		links.put("http://purl.org/olia/connexor.owl#NOM", "http://purl.org/olia/olia.owl#Nominative");
		links.put("http://purl.org/olia/connexor.owl#SUBJUNCTIVE", "http://purl.org/olia/olia.owl#FiniteVerb");
		links.put("http://purl.org/olia/connexor.owl#SUBJUNCTIVE", "http://purl.org/olia/olia.owl#SubjunctiveVerb");
		links.put("http://purl.org/olia/connexor.owl#SUBJUNCTIVE", "http://purl.org/olia/olia.owl#Verb");
		links.put("http://purl.org/olia/connexor.owl#SG3_1", "http://purl.org/olia/olia.owl#Singular");
		links.put("http://purl.org/olia/connexor.owl#SG3_1", "http://purl.org/olia/olia.owl#Third");
		links.put("http://purl.org/olia/connexor.owl#ORD", "http://purl.org/olia/olia.owl#Quantifier");
		links.put("http://purl.org/olia/connexor.owl#ORD", "http://purl.org/olia/olia.owl#OrdinalNumber");
		links.put("http://purl.org/olia/connexor.owl#ORD", "http://purl.org/olia/olia.owl#Numeral");
		links.put("http://purl.org/olia/connexor.owl#PERS", "http://purl.org/olia/olia.owl#PersReflPronoun");
		links.put("http://purl.org/olia/connexor.owl#PERS", "http://purl.org/olia/olia.owl#PronounOrDeterminer");
		links.put("http://purl.org/olia/connexor.owl#PERS", "http://purl.org/olia/olia.owl#Pronoun");
		links.put("http://purl.org/olia/connexor.owl#PERS", "http://purl.org/olia/olia.owl#PersonalPronoun");
		links.put("http://purl.org/olia/connexor.owl#PREP", "http://purl.org/olia/olia.owl#Adposition");
		links.put("http://purl.org/olia/connexor.owl#PREP", "http://purl.org/olia/olia.owl#Preposition");
		links.put("http://purl.org/olia/connexor.owl#Indef", "http://purl.org/olia/olia.owl#PronounOrDeterminer");
		links.put("http://purl.org/olia/connexor.owl#Indef", "http://purl.org/olia/olia.owl#Pronoun");
		links.put("http://purl.org/olia/connexor.owl#ING", "http://purl.org/olia/olia.owl#Participle");
		links.put("http://purl.org/olia/connexor.owl#ING", "http://purl.org/olia/olia.owl#Verb");
		links.put("http://purl.org/olia/connexor.owl#ING", "http://purl.org/olia/olia.owl#NonFiniteVerb");
		links.put("http://purl.org/olia/connexor.owl#ING", "http://purl.org/olia/olia.owl#ing");
		links.put("http://purl.org/olia/connexor.owl#ING", "http://purl.org/olia/olia.owl#Gerund");
		links.put("http://purl.org/olia/connexor.owl#PL3", "http://purl.org/olia/olia.owl#Third");
		links.put("http://purl.org/olia/connexor.owl#PL3", "http://purl.org/olia/olia.owl#Plural");
		links.put("http://purl.org/olia/connexor.owl#SG1_1", "http://purl.org/olia/olia.owl#Singular");
		links.put("http://purl.org/olia/connexor.owl#SG1_1", "http://purl.org/olia/olia.owl#First");
		links.put("http://purl.org/olia/connexor.owl#SG3", "http://purl.org/olia/olia.owl#Third");
		links.put("http://purl.org/olia/connexor.owl#SG3", "http://purl.org/olia/olia.owl#Singular");
		links.put("http://purl.org/olia/connexor.owl#Vimp", "http://purl.org/olia/olia.owl#FiniteVerb");
		links.put("http://purl.org/olia/connexor.owl#Vimp", "http://purl.org/olia/olia.owl#Verb");
		links.put("http://purl.org/olia/connexor.owl#Vimp", "http://purl.org/olia/olia.owl#ImperativeVerb");
		links.put("http://purl.org/olia/connexor.owl#masculine", "http://purl.org/olia/olia.owl#Masculine");
		links.put("http://purl.org/olia/connexor.owl#Poss", "http://purl.org/olia/olia.owl#Pronoun");
		links.put("http://purl.org/olia/connexor.owl#Poss", "http://purl.org/olia/olia.owl#PronounOrDeterminer");
		links.put("http://purl.org/olia/connexor.owl#DET", "http://purl.org/olia/olia.owl#Determiner");
		links.put("http://purl.org/olia/connexor.owl#DET", "http://purl.org/olia/olia.owl#PronounOrDeterminer");
		links.put("http://purl.org/olia/connexor.owl#DET", "http://purl.org/olia/olia.owl#Article");
		links.put("http://purl.org/olia/connexor.owl#N_Prop", "http://purl.org/olia/olia.owl#Noun");
		links.put("http://purl.org/olia/connexor.owl#Vind", "http://purl.org/olia/olia.owl#Verb");
		links.put("http://purl.org/olia/connexor.owl#Vind", "http://purl.org/olia/olia.owl#IndicativeVerb");
		links.put("http://purl.org/olia/connexor.owl#Vind", "http://purl.org/olia/olia.owl#FiniteVerb");
		links.put("http://purl.org/olia/connexor.owl#DEM_1", "http://purl.org/olia/olia.owl#DemonstrativeDeterminer");
		links.put("http://purl.org/olia/connexor.owl#DEM_1", "http://purl.org/olia/olia.owl#AttributivePronoun");
		links.put("http://purl.org/olia/connexor.owl#DEM_1", "http://purl.org/olia/olia.owl#Determiner");
		links.put("http://purl.org/olia/connexor.owl#DEM_1", "http://purl.org/olia/olia.owl#Pronoun");
		links.put("http://purl.org/olia/connexor.owl#DEM_1", "http://purl.org/olia/olia.owl#PronounOrDeterminer");
		links.put("http://purl.org/olia/connexor.owl#Rel", "http://purl.org/olia/olia.owl#WHPronoun");
		links.put("http://purl.org/olia/connexor.owl#Rel", "http://purl.org/olia/olia.owl#PronounOrDeterminer");
		links.put("http://purl.org/olia/connexor.owl#Rel", "http://purl.org/olia/olia.owl#Adverb");
		links.put("http://purl.org/olia/connexor.owl#Rel", "http://purl.org/olia/olia.owl#Pronoun");
		links.put("http://purl.org/olia/connexor.owl#Rel", "http://purl.org/olia/olia.owl#RelativePronoun");
		links.put("http://purl.org/olia/connexor.owl#Rel_adj", "http://purl.org/olia/olia.owl#Pronoun");
		links.put("http://purl.org/olia/connexor.owl#Rel_adj", "http://purl.org/olia/olia.owl#PronounOrDeterminer");
		links.put("http://purl.org/olia/connexor.owl#CS", "http://purl.org/olia/olia.owl#Conjunction");
		links.put("http://purl.org/olia/connexor.owl#CS", "http://purl.org/olia/olia.owl#SubordinatingConjunction");
		links.put("http://purl.org/olia/connexor.owl#ACC", "http://purl.org/olia/olia.owl#Accusative");
		links.put("http://purl.org/olia/connexor.owl#PAST", "http://purl.org/olia/olia.owl#Verb");
		links.put("http://purl.org/olia/connexor.owl#PAST", "http://purl.org/olia/olia.owl#AbsoluteTense");
		links.put("http://purl.org/olia/connexor.owl#PAST", "http://purl.org/olia/olia.owl#Past");
		links.put("http://purl.org/olia/connexor.owl#DAT", "http://purl.org/olia/olia.owl#Dative");
		links.put("http://purl.org/olia/connexor.owl#neutral", "http://purl.org/olia/olia.owl#Neuter");
		links.put("http://purl.org/olia/connexor.owl#CARD", "http://purl.org/olia/olia.owl#Numeral");
		links.put("http://purl.org/olia/connexor.owl#CARD", "http://purl.org/olia/olia.owl#Quantifier");
		links.put("http://purl.org/olia/connexor.owl#CARD", "http://purl.org/olia/olia.owl#CardinalNumber");
		links.put("http://purl.org/olia/connexor.owl#INF", "http://purl.org/olia/olia.owl#NonFiniteVerb");
		links.put("http://purl.org/olia/connexor.owl#INF", "http://purl.org/olia/olia.owl#Infinitive");
		links.put("http://purl.org/olia/connexor.owl#INF", "http://purl.org/olia/olia.owl#Verb");
		links.put("http://purl.org/olia/connexor.owl#Poss_adj", "http://purl.org/olia/olia.owl#PronounOrDeterminer");
		links.put("http://purl.org/olia/connexor.owl#Poss_adj", "http://purl.org/olia/olia.owl#Pronoun");
		links.put("http://purl.org/olia/connexor.owl#WH_1", "http://purl.org/olia/olia.owl#Determiner");
		links.put("http://purl.org/olia/connexor.owl#WH_1", "http://purl.org/olia/olia.owl#WHDeterminer");
		links.put("http://purl.org/olia/connexor.owl#WH_1", "http://purl.org/olia/olia.owl#PronounOrDeterminer");
		links.put("http://purl.org/olia/connexor.owl#CMP", "http://purl.org/olia/olia.owl#Comparative");
		links.put("http://purl.org/olia/connexor.owl#AUXMOD", "http://purl.org/olia/olia.owl#AuxiliaryVerb");
		links.put("http://purl.org/olia/connexor.owl#AUXMOD", "http://purl.org/olia/olia.owl#Verb");
		links.put("http://purl.org/olia/connexor.owl#AUXMOD", "http://purl.org/olia/olia.owl#ModalVerb");
		links.put("http://purl.org/olia/connexor.owl#PL", "http://purl.org/olia/olia.owl#Plural");
		links.put("http://purl.org/olia/connexor.owl#PL1", "http://purl.org/olia/olia.owl#Plural");
		links.put("http://purl.org/olia/connexor.owl#PL1", "http://purl.org/olia/olia.owl#First");
		links.put("http://purl.org/olia/connexor.owl#SUP", "http://purl.org/olia/olia.owl#Superlative");
		links.put("http://purl.org/olia/connexor.owl#PCP", "http://purl.org/olia/olia.owl#NonFiniteVerb");
		links.put("http://purl.org/olia/connexor.owl#PCP", "http://purl.org/olia/olia.owl#Participle");
		links.put("http://purl.org/olia/connexor.owl#PCP", "http://purl.org/olia/olia.owl#Verb");
		links.put("http://purl.org/olia/connexor.owl#P2", "http://purl.org/olia/olia.owl#Second");
		links.put("http://purl.org/olia/connexor.owl#DEM", "http://purl.org/olia/olia.owl#Pronoun");
		links.put("http://purl.org/olia/connexor.owl#DEM", "http://purl.org/olia/olia.owl#DemonstrativePronoun");
		links.put("http://purl.org/olia/connexor.owl#DEM", "http://purl.org/olia/olia.owl#PronounOrDeterminer");
		links.put("http://purl.org/olia/connexor.owl#NUM", "http://purl.org/olia/olia.owl#Quantifier");
		links.put("http://purl.org/olia/connexor.owl#NUM", "http://purl.org/olia/olia.owl#Numeral");
		links.put("http://purl.org/olia/connexor.owl#INFMARK", "http://purl.org/olia/olia.owl#Unique");
		links.put("http://purl.org/olia/connexor.owl#A", "http://purl.org/olia/olia.owl#Adjective");
		links.put("http://purl.org/olia/connexor.owl#GEN", "http://purl.org/olia/olia.owl#Genitive");
		links.put("http://purl.org/olia/connexor.owl#WH_2", "http://purl.org/olia/olia.owl#Adverb");
		links.put("http://purl.org/olia/connexor.owl#WH_2", "http://purl.org/olia/olia.owl#WHTypeAdverbs");
		links.put("http://purl.org/olia/connexor.owl#CC", "http://purl.org/olia/olia.owl#Conjunction");
		links.put("http://purl.org/olia/connexor.owl#CC", "http://purl.org/olia/olia.owl#CoordinatingConjunction");
		links.put("http://purl.org/olia/connexor.owl#Vinf", "http://purl.org/olia/olia.owl#Verb");
		links.put("http://purl.org/olia/connexor.owl#Vinf", "http://purl.org/olia/olia.owl#NonFiniteVerb");
		links.put("http://purl.org/olia/connexor.owl#Vinf", "http://purl.org/olia/olia.owl#Infinitive");
		links.put("http://purl.org/olia/connexor.owl#P3", "http://purl.org/olia/olia.owl#Third");
		links.put("http://purl.org/olia/connexor.owl#SG", "http://purl.org/olia/olia.owl#Singular");
		links.put("http://purl.org/olia/connexor.owl#progressive", "http://purl.org/olia/olia.owl#Verb");
		links.put("http://purl.org/olia/connexor.owl#progressive", "http://purl.org/olia/olia.owl#ProgressiveAspect");
		links.put("http://purl.org/olia/connexor.owl#perfective", "http://purl.org/olia/olia.owl#PerfectiveAspect");
		links.put("http://purl.org/olia/connexor.owl#perfective", "http://purl.org/olia/olia.owl#Verb");
		links.put("http://purl.org/olia/connexor.owl#ADV", "http://purl.org/olia/olia.owl#Adverb");
	}
	
	public static MultiValueMap hasTag = MultiValueMap.decorate(new HashMap<String, ArrayList<String>>());
	
	static {

		hasTag.put("A", "http://purl.org/olia/connexor.owl#A");
		hasTag.put("ABBR", "http://purl.org/olia/connexor.owl#ABBR");
		hasTag.put("ABS", "http://purl.org/olia/connexor.owl#ABS");
		hasTag.put("ACC", "http://purl.org/olia/connexor.owl#ACC");
		hasTag.put("ACT", "http://purl.org/olia/connexor.owl#ACT");
		hasTag.put("ADV", "http://purl.org/olia/connexor.owl#ADV");
		hasTag.put("@ADVL", "http://purl.org/olia/connexor.owl#ADVL");
		hasTag.put("@AUX", "http://purl.org/olia/connexor.owl#AUX");
		hasTag.put("AUXMOD", "http://purl.org/olia/connexor.owl#AUXMOD");
		hasTag.put("CARD", "http://purl.org/olia/connexor.owl#CARD");
		hasTag.put("CC", "http://purl.org/olia/connexor.owl#CC");
		hasTag.put("@CC", "http://purl.org/olia/connexor.owl#CC_syntax");
		hasTag.put("CMP", "http://purl.org/olia/connexor.owl#CMP");
		hasTag.put("CND", "http://purl.org/olia/connexor.owl#COND");
		hasTag.put("CS", "http://purl.org/olia/connexor.owl#CS");
		hasTag.put("Dem", "http://purl.org/olia/connexor.owl#DEM");
		hasTag.put("Dem", "http://purl.org/olia/connexor.owl#DEM_1");
		hasTag.put("DET", "http://purl.org/olia/connexor.owl#DET");
		hasTag.put("Def", "http://purl.org/olia/connexor.owl#Def");
		hasTag.put("Dem adj", "http://purl.org/olia/connexor.owl#Dem_adj");
		hasTag.put("EN", "http://purl.org/olia/connexor.owl#EN");
		hasTag.put("Ex", "http://purl.org/olia/connexor.owl#Ex");
		hasTag.put("<Ex>", "http://purl.org/olia/connexor.owl#Ex");
		hasTag.put("FUT", "http://purl.org/olia/connexor.owl#FUT");
		hasTag.put("GER", "http://purl.org/olia/connexor.owl#GER");
		hasTag.put("Heur", "http://purl.org/olia/connexor.owl#Heur");
		hasTag.put("IMPF", "http://purl.org/olia/connexor.owl#IMPF");
		hasTag.put("INDEP", "http://purl.org/olia/connexor.owl#INDEP");
		hasTag.put("INF", "http://purl.org/olia/connexor.owl#INF");
		hasTag.put("INFMARK", "http://purl.org/olia/connexor.owl#INFMARK");
		hasTag.put("ING", "http://purl.org/olia/connexor.owl#ING");
		hasTag.put("INTERJ", "http://purl.org/olia/connexor.owl#INTERJ");
		hasTag.put("Indef", "http://purl.org/olia/connexor.owl#Indef");
		hasTag.put("Indef Refl", "http://purl.org/olia/connexor.owl#Indef_Refl");
		hasTag.put("Indef adj", "http://purl.org/olia/connexor.owl#Indef_adj");
		hasTag.put("Interr adj", "http://purl.org/olia/connexor.owl#Interr_adj");
		hasTag.put("@MAIN", "http://purl.org/olia/connexor.owl#MAIN");
		hasTag.put("N", "http://purl.org/olia/connexor.owl#N");
		hasTag.put("NEG-PART", "http://purl.org/olia/connexor.owl#NEG-PART");
		hasTag.put("@NH", "http://purl.org/olia/connexor.owl#NH");
		hasTag.put("NOM", "http://purl.org/olia/connexor.owl#NOM");
		hasTag.put("NUM", "http://purl.org/olia/connexor.owl#NUM");
		hasTag.put("N+", "http://purl.org/olia/connexor.owl#NounVerbCombination");
		hasTag.put("ORD", "http://purl.org/olia/connexor.owl#ORD");
		hasTag.put("P1", "http://purl.org/olia/connexor.owl#P1");
		hasTag.put("P2", "http://purl.org/olia/connexor.owl#P2");
		hasTag.put("P3", "http://purl.org/olia/connexor.owl#P3");
		hasTag.put("PASS", "http://purl.org/olia/connexor.owl#PASS");
		hasTag.put("V PCP", "http://purl.org/olia/connexor.owl#PCP");
		hasTag.put("Pers", "http://purl.org/olia/connexor.owl#PERS");
		hasTag.put("PL", "http://purl.org/olia/connexor.owl#PL");
		hasTag.put("@POSTMOD", "http://purl.org/olia/connexor.owl#POSTMOD");
		hasTag.put("POSTP", "http://purl.org/olia/connexor.owl#POSTP");
		hasTag.put("@PREMARK", "http://purl.org/olia/connexor.owl#PREMARK");
		hasTag.put("@PREMOD", "http://purl.org/olia/connexor.owl#PREMOD");
		hasTag.put("PREP", "http://purl.org/olia/connexor.owl#PREP");
		hasTag.put("PRES", "http://purl.org/olia/connexor.owl#PRES");
		hasTag.put("PRET", "http://purl.org/olia/connexor.owl#PRET");
		hasTag.put("PRON", "http://purl.org/olia/connexor.owl#PRON");
		hasTag.put("Pers tonic", "http://purl.org/olia/connexor.owl#Pers_tonic");
		hasTag.put("Poss", "http://purl.org/olia/connexor.owl#Poss");
		hasTag.put("Poss Refl adj", "http://purl.org/olia/connexor.owl#Poss_Refl_adj");
		hasTag.put("Poss adj", "http://purl.org/olia/connexor.owl#Poss_adj");
		hasTag.put("PRON adj", "http://purl.org/olia/connexor.owl#PronAdj");
		hasTag.put("RECIPR", "http://purl.org/olia/connexor.owl#RECIPR");
		hasTag.put("Recipr", "http://purl.org/olia/connexor.owl#RECIPR");
		hasTag.put("Refl tonic", "http://purl.org/olia/connexor.owl#Refl_tonic");
		hasTag.put("Rel", "http://purl.org/olia/connexor.owl#Rel");
		hasTag.put("Rel adj", "http://purl.org/olia/connexor.owl#Rel_adj");
		hasTag.put("SG1", "http://purl.org/olia/connexor.owl#SG1");
		hasTag.put("SG1", "http://purl.org/olia/connexor.owl#SG1_1");
		hasTag.put("SG3", "http://purl.org/olia/connexor.owl#SG3");
		hasTag.put("SG3", "http://purl.org/olia/connexor.owl#SG3_1");
		hasTag.put("SUB", "http://purl.org/olia/connexor.owl#SUBJUNCTIVE");
		hasTag.put("V", "http://purl.org/olia/connexor.owl#V");
		hasTag.put("VPART", "http://purl.org/olia/connexor.owl#VPART");
		hasTag.put("V IMP", "http://purl.org/olia/connexor.owl#Vimp");
		hasTag.put("V IND", "http://purl.org/olia/connexor.owl#Vind");
		hasTag.put("V INF", "http://purl.org/olia/connexor.owl#Vinf");
		hasTag.put("V SUB", "http://purl.org/olia/connexor.owl#Vsbj");
		hasTag.put("WH", "http://purl.org/olia/connexor.owl#WH");
		hasTag.put("WH", "http://purl.org/olia/connexor.owl#WH_1");
		hasTag.put("WH", "http://purl.org/olia/connexor.owl#WH_2");
		hasTag.put("ad", "http://purl.org/olia/connexor.owl#ad");
		hasTag.put("ads", "http://purl.org/olia/connexor.owl#ads");
		hasTag.put("advl", "http://purl.org/olia/connexor.owl#advl");
		hasTag.put("agt", "http://purl.org/olia/connexor.owl#agt");
		hasTag.put("app", "http://purl.org/olia/connexor.owl#app");
		hasTag.put("attr", "http://purl.org/olia/connexor.owl#attr");
		hasTag.put("cc", "http://purl.org/olia/connexor.owl#cc");
		hasTag.put("cla", "http://purl.org/olia/connexor.owl#cla");
		hasTag.put("cnd", "http://purl.org/olia/connexor.owl#cnd");
		hasTag.put("cnt", "http://purl.org/olia/connexor.owl#cnt");
		hasTag.put("com", "http://purl.org/olia/connexor.owl#com");
		hasTag.put("UTR", "http://purl.org/olia/connexor.owl#common");
		hasTag.put("comp", "http://purl.org/olia/connexor.owl#comp");
		hasTag.put("copred", "http://purl.org/olia/connexor.owl#copred");
		hasTag.put("dat", "http://purl.org/olia/connexor.owl#dat");
		hasTag.put("det", "http://purl.org/olia/connexor.owl#det");
		hasTag.put("dur", "http://purl.org/olia/connexor.owl#dur");
		hasTag.put("FEM", "http://purl.org/olia/connexor.owl#feminine");
		hasTag.put("frq", "http://purl.org/olia/connexor.owl#frq");
		hasTag.put("goa", "http://purl.org/olia/connexor.owl#goa");
		hasTag.put("ha", "http://purl.org/olia/connexor.owl#ha");
		hasTag.put("ins", "http://purl.org/olia/connexor.owl#ins");
		hasTag.put("loc", "http://purl.org/olia/connexor.owl#loc");
		hasTag.put("main", "http://purl.org/olia/connexor.owl#main");
		hasTag.put("man", "http://purl.org/olia/connexor.owl#man");
		hasTag.put("MSC", "http://purl.org/olia/connexor.owl#masculine");
		hasTag.put("meta", "http://purl.org/olia/connexor.owl#meta");
		hasTag.put("mod", "http://purl.org/olia/connexor.owl#mod");
		hasTag.put("neg", "http://purl.org/olia/connexor.owl#neg");
		hasTag.put("NEU", "http://purl.org/olia/connexor.owl#neutral");
		hasTag.put("obj", "http://purl.org/olia/connexor.owl#obj");
		hasTag.put("oc", "http://purl.org/olia/connexor.owl#oc");
		hasTag.put("PERF", "http://purl.org/olia/connexor.owl#perfective");
		hasTag.put("phr", "http://purl.org/olia/connexor.owl#phr");
		hasTag.put("pm", "http://purl.org/olia/connexor.owl#pm");
		hasTag.put("PROG", "http://purl.org/olia/connexor.owl#progressive");
		hasTag.put("pth", "http://purl.org/olia/connexor.owl#pth");
		hasTag.put("qn", "http://purl.org/olia/connexor.owl#qn");
		hasTag.put("qtag", "http://purl.org/olia/connexor.owl#qtag");
		hasTag.put("qua", "http://purl.org/olia/connexor.owl#qua");
		hasTag.put("rsn", "http://purl.org/olia/connexor.owl#rsn");
		hasTag.put("sou", "http://purl.org/olia/connexor.owl#sou");
		hasTag.put("subj", "http://purl.org/olia/connexor.owl#subj");
		hasTag.put("tmp", "http://purl.org/olia/connexor.owl#tmp");
		hasTag.put("v-ch", "http://purl.org/olia/connexor.owl#v-ch");
		hasTag.put("voc", "http://purl.org/olia/connexor.owl#voc");
	}
	

	}
	
