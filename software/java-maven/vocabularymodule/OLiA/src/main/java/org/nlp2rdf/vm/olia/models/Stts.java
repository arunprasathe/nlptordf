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

public class Stts implements OliaInterface { 

	public static MultiValueMap links = MultiValueMap.decorate(new HashMap<String, ArrayList<String>>());
	
	static {

		links.put("http://purl.org/olia/stts.owl#TRUNC", "http://purl.org/olia/olia.owl#Residual");
		links.put("http://purl.org/olia/stts.owl#VVFIN", "http://purl.org/olia/olia.owl#FiniteVerb");
		links.put("http://purl.org/olia/stts.owl#VVFIN", "http://purl.org/olia/olia.owl#Verb");
		links.put("http://purl.org/olia/stts.owl#KOUI", "http://purl.org/olia/olia.owl#SubordinatingConjunction");
		links.put("http://purl.org/olia/stts.owl#KOUI", "http://purl.org/olia/olia.owl#Conjunction");
		links.put("http://purl.org/olia/stts.owl#PPOSAT", "http://purl.org/olia/olia.owl#Pronoun");
		links.put("http://purl.org/olia/stts.owl#PPOSAT", "http://purl.org/olia/olia.owl#PossessiveDeterminer");
		links.put("http://purl.org/olia/stts.owl#PPOSAT", "http://purl.org/olia/olia.owl#PossessivePronoun");
		links.put("http://purl.org/olia/stts.owl#PPOSAT", "http://purl.org/olia/olia.owl#AttributivePronoun");
		links.put("http://purl.org/olia/stts.owl#PPOSAT", "http://purl.org/olia/olia.owl#Determiner");
		links.put("http://purl.org/olia/stts.owl#PPOSAT", "http://purl.org/olia/olia.owl#PronounOrDeterminer");
		links.put("http://purl.org/olia/stts.owl#VVIMP", "http://purl.org/olia/olia.owl#Verb");
		links.put("http://purl.org/olia/stts.owl#VVIMP", "http://purl.org/olia/olia.owl#ImperativeVerb");
		links.put("http://purl.org/olia/stts.owl#VVIMP", "http://purl.org/olia/olia.owl#FiniteVerb");
		links.put("http://purl.org/olia/stts.owl#PIDAT", "http://purl.org/olia/olia.owl#PronounOrDeterminer");
		links.put("http://purl.org/olia/stts.owl#PIDAT", "http://purl.org/olia/olia.owl#Determiner");
		links.put("http://purl.org/olia/stts.owl#PIDAT", "http://purl.org/olia/olia.owl#IndefiniteDeterminer");
		links.put("http://purl.org/olia/stts.owl#PRELAT", "http://purl.org/olia/olia.owl#RelativeDeterminer");
		links.put("http://purl.org/olia/stts.owl#PRELAT", "http://purl.org/olia/olia.owl#Determiner");
		links.put("http://purl.org/olia/stts.owl#PRELAT", "http://purl.org/olia/olia.owl#PronounOrDeterminer");
		links.put("http://purl.org/olia/stts.owl#PRELAT", "http://purl.org/olia/olia.owl#WHDeterminer");
		links.put("http://purl.org/olia/stts.owl#sentencefinalpunctuation_tag", "http://purl.org/olia/olia.owl#Punctuation");
		links.put("http://purl.org/olia/stts.owl#sentencefinalpunctuation_tag", "http://purl.org/olia/olia.owl#SentenceFinalPunctuation");
		links.put("http://purl.org/olia/stts.owl#sentencefinalpunctuation_tag", "http://purl.org/olia/olia.owl#MainPunctuation");
		links.put("http://purl.org/olia/stts.owl#PIS", "http://purl.org/olia/olia.owl#PronounOrDeterminer");
		links.put("http://purl.org/olia/stts.owl#PIS", "http://purl.org/olia/olia.owl#Pronoun");
		links.put("http://purl.org/olia/stts.owl#PIS", "http://purl.org/olia/olia.owl#IndefinitePronoun");
		links.put("http://purl.org/olia/stts.owl#APZR", "http://purl.org/olia/olia.owl#Adposition");
		links.put("http://purl.org/olia/stts.owl#APZR", "http://purl.org/olia/olia.owl#Circumposition");
		links.put("http://purl.org/olia/stts.owl#VAPP", "http://purl.org/olia/olia.owl#Participle");
		links.put("http://purl.org/olia/stts.owl#VAPP", "http://purl.org/olia/olia.owl#NonFiniteVerb");
		links.put("http://purl.org/olia/stts.owl#VAPP", "http://purl.org/olia/olia.owl#Verb");
		links.put("http://purl.org/olia/stts.owl#VVIZU", "http://purl.org/olia/olia.owl#Infinitive");
		links.put("http://purl.org/olia/stts.owl#VVIZU", "http://purl.org/olia/olia.owl#Verb");
		links.put("http://purl.org/olia/stts.owl#VVIZU", "http://purl.org/olia/olia.owl#NonFiniteVerb");
		links.put("http://purl.org/olia/stts.owl#APPO", "http://purl.org/olia/olia.owl#Postposition");
		links.put("http://purl.org/olia/stts.owl#APPO", "http://purl.org/olia/olia.owl#Adposition");
		links.put("http://purl.org/olia/stts.owl#PRF", "http://purl.org/olia/olia.owl#ReflexivePronoun");
		links.put("http://purl.org/olia/stts.owl#PRF", "http://purl.org/olia/olia.owl#Pronoun");
		links.put("http://purl.org/olia/stts.owl#PRF", "http://purl.org/olia/olia.owl#PersReflPronoun");
		links.put("http://purl.org/olia/stts.owl#PRF", "http://purl.org/olia/olia.owl#PronounOrDeterminer");
		links.put("http://purl.org/olia/stts.owl#NNE", "http://purl.org/olia/olia.owl#ProperNoun");
		links.put("http://purl.org/olia/stts.owl#NNE", "http://purl.org/olia/olia.owl#Noun");
		links.put("http://purl.org/olia/stts.owl#PTKVZ", "http://purl.org/olia/olia.owl#Unique");
		links.put("http://purl.org/olia/stts.owl#KOKOM", "http://purl.org/olia/olia.owl#SubordinatingConjunction");
		links.put("http://purl.org/olia/stts.owl#KOKOM", "http://purl.org/olia/olia.owl#Conjunction");
		links.put("http://purl.org/olia/stts.owl#PROP", "http://purl.org/olia/olia.owl#Adverb");
		links.put("http://purl.org/olia/stts.owl#PROP", "http://purl.org/olia/olia.owl#PronominalAdverb");
		links.put("http://purl.org/olia/stts.owl#VAIMP", "http://purl.org/olia/olia.owl#ImperativeVerb");
		links.put("http://purl.org/olia/stts.owl#VAIMP", "http://purl.org/olia/olia.owl#Verb");
		links.put("http://purl.org/olia/stts.owl#VAIMP", "http://purl.org/olia/olia.owl#FiniteVerb");
		links.put("http://purl.org/olia/stts.owl#PTKNEG", "http://purl.org/olia/olia.owl#Unique");
		links.put("http://purl.org/olia/stts.owl#PDS", "http://purl.org/olia/olia.owl#DemonstrativePronoun");
		links.put("http://purl.org/olia/stts.owl#PDS", "http://purl.org/olia/olia.owl#PronounOrDeterminer");
		links.put("http://purl.org/olia/stts.owl#PDS", "http://purl.org/olia/olia.owl#Pronoun");
		links.put("http://purl.org/olia/stts.owl#PWAT", "http://purl.org/olia/olia.owl#PronounOrDeterminer");
		links.put("http://purl.org/olia/stts.owl#PWAT", "http://purl.org/olia/olia.owl#Determiner");
		links.put("http://purl.org/olia/stts.owl#PWAT", "http://purl.org/olia/olia.owl#InterrogativeDeterminer");
		links.put("http://purl.org/olia/stts.owl#PWAT", "http://purl.org/olia/olia.owl#WHDeterminer");
		links.put("http://purl.org/olia/stts.owl#PROAV", "http://purl.org/olia/olia.owl#PronominalAdverb");
		links.put("http://purl.org/olia/stts.owl#PROAV", "http://purl.org/olia/olia.owl#Adverb");
		links.put("http://purl.org/olia/stts.owl#CARD", "http://purl.org/olia/olia.owl#Quantifier");
		links.put("http://purl.org/olia/stts.owl#CARD", "http://purl.org/olia/olia.owl#Numeral");
		links.put("http://purl.org/olia/stts.owl#CARD", "http://purl.org/olia/olia.owl#CardinalNumber");
		links.put("http://purl.org/olia/stts.owl#PPOSS", "http://purl.org/olia/olia.owl#Pronoun");
		links.put("http://purl.org/olia/stts.owl#PPOSS", "http://purl.org/olia/olia.owl#PronounOrDeterminer");
		links.put("http://purl.org/olia/stts.owl#PPOSS", "http://purl.org/olia/olia.owl#PossessivePronoun");
		links.put("http://purl.org/olia/stts.owl#PDAT", "http://purl.org/olia/olia.owl#DemonstrativeDeterminer");
		links.put("http://purl.org/olia/stts.owl#PDAT", "http://purl.org/olia/olia.owl#AttributivePronoun");
		links.put("http://purl.org/olia/stts.owl#PDAT", "http://purl.org/olia/olia.owl#Pronoun");
		links.put("http://purl.org/olia/stts.owl#PDAT", "http://purl.org/olia/olia.owl#Determiner");
		links.put("http://purl.org/olia/stts.owl#PDAT", "http://purl.org/olia/olia.owl#PronounOrDeterminer");
		links.put("http://purl.org/olia/stts.owl#VVPP", "http://purl.org/olia/olia.owl#Participle");
		links.put("http://purl.org/olia/stts.owl#VVPP", "http://purl.org/olia/olia.owl#NonFiniteVerb");
		links.put("http://purl.org/olia/stts.owl#VVPP", "http://purl.org/olia/olia.owl#Verb");
		links.put("http://purl.org/olia/stts.owl#generalsentenceinternalpunctuation_tag", "http://purl.org/olia/olia.owl#Punctuation");
		links.put("http://purl.org/olia/stts.owl#generalsentenceinternalpunctuation_tag", "http://purl.org/olia/olia.owl#SecondaryPunctuation");
		links.put("http://purl.org/olia/stts.owl#PTKANT", "http://purl.org/olia/olia.owl#Unique");
		links.put("http://purl.org/olia/stts.owl#ITJ", "http://purl.org/olia/olia.owl#Interjection");
		links.put("http://purl.org/olia/stts.owl#XY", "http://purl.org/olia/olia.owl#Residual");
		links.put("http://purl.org/olia/stts.owl#ADJD", "http://purl.org/olia/olia.owl#PredicativeAdjective");
		links.put("http://purl.org/olia/stts.owl#ADJD", "http://purl.org/olia/olia.owl#Adjective");
		links.put("http://purl.org/olia/stts.owl#PTKZU", "http://purl.org/olia/olia.owl#Unique");
		links.put("http://purl.org/olia/stts.owl#FM", "http://purl.org/olia/olia.owl#Foreign");
		links.put("http://purl.org/olia/stts.owl#FM", "http://purl.org/olia/olia.owl#Residual");
		links.put("http://purl.org/olia/stts.owl#APPR", "http://purl.org/olia/olia.owl#Preposition");
		links.put("http://purl.org/olia/stts.owl#APPR", "http://purl.org/olia/olia.owl#Adposition");
		links.put("http://purl.org/olia/stts.owl#VVINF", "http://purl.org/olia/olia.owl#NonFiniteVerb");
		links.put("http://purl.org/olia/stts.owl#VVINF", "http://purl.org/olia/olia.owl#Infinitive");
		links.put("http://purl.org/olia/stts.owl#VVINF", "http://purl.org/olia/olia.owl#Verb");
		links.put("http://purl.org/olia/stts.owl#PIAT", "http://purl.org/olia/olia.owl#Determiner");
		links.put("http://purl.org/olia/stts.owl#PIAT", "http://purl.org/olia/olia.owl#IndefiniteDeterminer");
		links.put("http://purl.org/olia/stts.owl#PIAT", "http://purl.org/olia/olia.owl#PronounOrDeterminer");
		links.put("http://purl.org/olia/stts.owl#PWS", "http://purl.org/olia/olia.owl#WHPronoun");
		links.put("http://purl.org/olia/stts.owl#PWS", "http://purl.org/olia/olia.owl#Pronoun");
		links.put("http://purl.org/olia/stts.owl#PWS", "http://purl.org/olia/olia.owl#InterrogativePronoun");
		links.put("http://purl.org/olia/stts.owl#PWS", "http://purl.org/olia/olia.owl#PronounOrDeterminer");
		links.put("http://purl.org/olia/stts.owl#PRELS", "http://purl.org/olia/olia.owl#RelativePronoun");
		links.put("http://purl.org/olia/stts.owl#PRELS", "http://purl.org/olia/olia.owl#Pronoun");
		links.put("http://purl.org/olia/stts.owl#PRELS", "http://purl.org/olia/olia.owl#WHPronoun");
		links.put("http://purl.org/olia/stts.owl#PRELS", "http://purl.org/olia/olia.owl#PronounOrDeterminer");
		links.put("http://purl.org/olia/stts.owl#PAV", "http://purl.org/olia/olia.owl#PronominalAdverb");
		links.put("http://purl.org/olia/stts.owl#PAV", "http://purl.org/olia/olia.owl#Adverb");
		links.put("http://purl.org/olia/stts.owl#VMPP", "http://purl.org/olia/olia.owl#Verb");
		links.put("http://purl.org/olia/stts.owl#VMPP", "http://purl.org/olia/olia.owl#Participle");
		links.put("http://purl.org/olia/stts.owl#VMPP", "http://purl.org/olia/olia.owl#NonFiniteVerb");
		links.put("http://purl.org/olia/stts.owl#ADJA", "http://purl.org/olia/olia.owl#AttributiveAdjective");
		links.put("http://purl.org/olia/stts.owl#ADJA", "http://purl.org/olia/olia.owl#Adjective");
		links.put("http://purl.org/olia/stts.owl#BS", "http://purl.org/olia/olia.owl#Residual");
		links.put("http://purl.org/olia/stts.owl#VAFIN", "http://purl.org/olia/olia.owl#Verb");
		links.put("http://purl.org/olia/stts.owl#VAFIN", "http://purl.org/olia/olia.owl#FiniteVerb");
		links.put("http://purl.org/olia/stts.owl#VMFIN", "http://purl.org/olia/olia.owl#Verb");
		links.put("http://purl.org/olia/stts.owl#VMFIN", "http://purl.org/olia/olia.owl#FiniteVerb");
		links.put("http://purl.org/olia/stts.owl#VMFIN", "http://purl.org/olia/olia.owl#ModalVerb");
		links.put("http://purl.org/olia/stts.owl#VMFIN", "http://purl.org/olia/olia.owl#AuxiliaryVerb");
		links.put("http://purl.org/olia/stts.owl#PTKA", "http://purl.org/olia/olia.owl#Unique");
		links.put("http://purl.org/olia/stts.owl#VMINF", "http://purl.org/olia/olia.owl#Verb");
		links.put("http://purl.org/olia/stts.owl#VMINF", "http://purl.org/olia/olia.owl#Infinitive");
		links.put("http://purl.org/olia/stts.owl#VMINF", "http://purl.org/olia/olia.owl#NonFiniteVerb");
		links.put("http://purl.org/olia/stts.owl#NN", "http://purl.org/olia/olia.owl#CommonNoun");
		links.put("http://purl.org/olia/stts.owl#NN", "http://purl.org/olia/olia.owl#Noun");
		links.put("http://purl.org/olia/stts.owl#ADV", "http://purl.org/olia/olia.owl#Adverb");
		links.put("http://purl.org/olia/stts.owl#KOUS", "http://purl.org/olia/olia.owl#SubordinatingConjunction");
		links.put("http://purl.org/olia/stts.owl#KOUS", "http://purl.org/olia/olia.owl#Conjunction");
		links.put("http://purl.org/olia/stts.owl#comma_tag", "http://purl.org/olia/olia.owl#SentenceMedialPunctuation");
		links.put("http://purl.org/olia/stts.owl#comma_tag", "http://purl.org/olia/olia.owl#SecondaryPunctuation");
		links.put("http://purl.org/olia/stts.owl#comma_tag", "http://purl.org/olia/olia.owl#Punctuation");
		links.put("http://purl.org/olia/stts.owl#PWAV", "http://purl.org/olia/olia.owl#Adverb");
		links.put("http://purl.org/olia/stts.owl#PWAV", "http://purl.org/olia/olia.owl#WHTypeAdverbs");
		links.put("http://purl.org/olia/stts.owl#VAINF", "http://purl.org/olia/olia.owl#Infinitive");
		links.put("http://purl.org/olia/stts.owl#VAINF", "http://purl.org/olia/olia.owl#Verb");
		links.put("http://purl.org/olia/stts.owl#VAINF", "http://purl.org/olia/olia.owl#NonFiniteVerb");
		links.put("http://purl.org/olia/stts.owl#PPER", "http://purl.org/olia/olia.owl#PronounOrDeterminer");
		links.put("http://purl.org/olia/stts.owl#PPER", "http://purl.org/olia/olia.owl#Pronoun");
		links.put("http://purl.org/olia/stts.owl#PPER", "http://purl.org/olia/olia.owl#PersonalPronoun");
		links.put("http://purl.org/olia/stts.owl#PPER", "http://purl.org/olia/olia.owl#PersReflPronoun");
		links.put("http://purl.org/olia/stts.owl#NE", "http://purl.org/olia/olia.owl#Noun");
		links.put("http://purl.org/olia/stts.owl#NE", "http://purl.org/olia/olia.owl#ProperNoun");
		links.put("http://purl.org/olia/stts.owl#APPRART", "http://purl.org/olia/olia.owl#Adposition");
		links.put("http://purl.org/olia/stts.owl#APPRART", "http://purl.org/olia/olia.owl#Preposition");
		links.put("http://purl.org/olia/stts.owl#APPRART", "http://purl.org/olia/olia.owl#FusedPrepArt");
		links.put("http://purl.org/olia/stts.owl#APPRART", "http://purl.org/olia/olia.owl#Article");
		links.put("http://purl.org/olia/stts.owl#APPRART", "http://purl.org/olia/olia.owl#PronounOrDeterminer");
		links.put("http://purl.org/olia/stts.owl#APPRART", "http://purl.org/olia/olia.owl#Determiner");
		links.put("http://purl.org/olia/stts.owl#KON", "http://purl.org/olia/olia.owl#Conjunction");
		links.put("http://purl.org/olia/stts.owl#KON", "http://purl.org/olia/olia.owl#CoordinatingConjunction");
		links.put("http://purl.org/olia/stts.owl#ART", "http://purl.org/olia/olia.owl#Article");
		links.put("http://purl.org/olia/stts.owl#ART", "http://purl.org/olia/olia.owl#Determiner");
		links.put("http://purl.org/olia/stts.owl#ART", "http://purl.org/olia/olia.owl#PronounOrDeterminer");
	}
	
	public static MultiValueMap hasTag = MultiValueMap.decorate(new HashMap<String, ArrayList<String>>());
	
	static {

		hasTag.put("VAINF", "http://purl.org/olia/stts.owl#VAINF");
		hasTag.put("$(", "http://purl.org/olia/stts.owl#generalsentenceinternalpunctuation_tag");
		hasTag.put("ART", "http://purl.org/olia/stts.owl#ART");
		hasTag.put("PWS", "http://purl.org/olia/stts.owl#PWS");
		hasTag.put("NE", "http://purl.org/olia/stts.owl#NE");
		hasTag.put("CARD", "http://purl.org/olia/stts.owl#CARD");
		hasTag.put("PPER", "http://purl.org/olia/stts.owl#PPER");
		hasTag.put("NN", "http://purl.org/olia/stts.owl#NN");
		hasTag.put("ADJD", "http://purl.org/olia/stts.owl#ADJD");
		hasTag.put("PTKA", "http://purl.org/olia/stts.owl#PTKA");
		hasTag.put("VAIMP", "http://purl.org/olia/stts.owl#VAIMP");
		hasTag.put("VVPP", "http://purl.org/olia/stts.owl#VVPP");
		hasTag.put("KOKOM", "http://purl.org/olia/stts.owl#KOKOM");
		hasTag.put("KOUI", "http://purl.org/olia/stts.owl#KOUI");
		hasTag.put("PIDAT", "http://purl.org/olia/stts.owl#PIDAT");
		hasTag.put("PRF", "http://purl.org/olia/stts.owl#PRF");
		hasTag.put("APZR", "http://purl.org/olia/stts.owl#APZR");
		hasTag.put("PPOSS", "http://purl.org/olia/stts.owl#PPOSS");
		hasTag.put("APPR", "http://purl.org/olia/stts.owl#APPR");
		hasTag.put("PPOSAT", "http://purl.org/olia/stts.owl#PPOSAT");
		hasTag.put("FM", "http://purl.org/olia/stts.owl#FM");
		hasTag.put("VVINF", "http://purl.org/olia/stts.owl#VVINF");
		hasTag.put("ADV", "http://purl.org/olia/stts.owl#ADV");
		hasTag.put("VVFIN", "http://purl.org/olia/stts.owl#VVFIN");
		hasTag.put("PTKANT", "http://purl.org/olia/stts.owl#PTKANT");
		hasTag.put("VAPP", "http://purl.org/olia/stts.owl#VAPP");
		hasTag.put("VAFIN", "http://purl.org/olia/stts.owl#VAFIN");
		hasTag.put("PDAT", "http://purl.org/olia/stts.owl#PDAT");
		hasTag.put("$.", "http://purl.org/olia/stts.owl#sentencefinalpunctuation_tag");
		hasTag.put("PIS", "http://purl.org/olia/stts.owl#PIS");
		hasTag.put("PWAT", "http://purl.org/olia/stts.owl#PWAT");
		hasTag.put("KOUS", "http://purl.org/olia/stts.owl#KOUS");
		hasTag.put("XY", "http://purl.org/olia/stts.owl#XY");
		hasTag.put("APPRART", "http://purl.org/olia/stts.owl#APPRART");
		hasTag.put("VVIMP", "http://purl.org/olia/stts.owl#VVIMP");
		hasTag.put("PWAV", "http://purl.org/olia/stts.owl#PWAV");
		hasTag.put("APPO", "http://purl.org/olia/stts.owl#APPO");
		hasTag.put("VMFIN", "http://purl.org/olia/stts.owl#VMFIN");
		hasTag.put("PROAV", "http://purl.org/olia/stts.owl#PROAV");
		hasTag.put("PAV", "http://purl.org/olia/stts.owl#PAV");
		hasTag.put("KON", "http://purl.org/olia/stts.owl#KON");
		hasTag.put("NNE", "http://purl.org/olia/stts.owl#NNE");
		hasTag.put("PRELS", "http://purl.org/olia/stts.owl#PRELS");
		hasTag.put("VMPP", "http://purl.org/olia/stts.owl#VMPP");
		hasTag.put("PTKZU", "http://purl.org/olia/stts.owl#PTKZU");
		hasTag.put("PIAT", "http://purl.org/olia/stts.owl#PIAT");
		hasTag.put("VMINF", "http://purl.org/olia/stts.owl#VMINF");
		hasTag.put("ITJ", "http://purl.org/olia/stts.owl#ITJ");
		hasTag.put("PRELAT", "http://purl.org/olia/stts.owl#PRELAT");
		hasTag.put("PTKVZ", "http://purl.org/olia/stts.owl#PTKVZ");
		hasTag.put("PDS", "http://purl.org/olia/stts.owl#PDS");
		hasTag.put("ADJA", "http://purl.org/olia/stts.owl#ADJA");
		hasTag.put("BS", "http://purl.org/olia/stts.owl#BS");
		hasTag.put("$,", "http://purl.org/olia/stts.owl#comma_tag");
		hasTag.put("VVIZU", "http://purl.org/olia/stts.owl#VVIZU");
		hasTag.put("PROP", "http://purl.org/olia/stts.owl#PROP");
		hasTag.put("TRUNC", "http://purl.org/olia/stts.owl#TRUNC");
		hasTag.put("PTKNEG", "http://purl.org/olia/stts.owl#PTKNEG");
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
	
