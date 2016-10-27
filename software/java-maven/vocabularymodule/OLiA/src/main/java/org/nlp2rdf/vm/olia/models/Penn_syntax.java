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

public class Penn_syntax { 

	public static MultiValueMap links = MultiValueMap.decorate(new HashMap<String, ArrayList<String>>());
	
	static {

		links.put("http://purl.org/olia/penn-syntax.owl#PPA", "http://purl.org/olia/olia.owl#Token");
		links.put("http://purl.org/olia/penn-syntax.owl#NOM", "http://purl.org/olia/olia.owl#Nominal");
		links.put("http://purl.org/olia/penn-syntax.owl#RSB", "http://purl.org/olia/olia.owl#CloseSquareBracket");
		links.put("http://purl.org/olia/penn-syntax.owl#RSB", "http://purl.org/olia/olia.owl#Punctuation");
		links.put("http://purl.org/olia/penn-syntax.owl#RSB", "http://purl.org/olia/olia.owl#SecondaryPunctuation");
		links.put("http://purl.org/olia/penn-syntax.owl#RSB", "http://purl.org/olia/olia.owl#ParentheticalPunctuation");
		links.put("http://purl.org/olia/penn-syntax.owl#RSB", "http://purl.org/olia/olia.owl#RightParentheticalPunctuation");
		links.put("http://purl.org/olia/penn-syntax.owl#RSB", "http://purl.org/olia/olia.owl#Token");
		links.put("http://purl.org/olia/penn-syntax.owl#PRN", "http://purl.org/olia/olia.owl#ParentheticalPunctuation");
		links.put("http://purl.org/olia/penn-syntax.owl#PRN", "http://purl.org/olia/olia.owl#Punctuation");
		links.put("http://purl.org/olia/penn-syntax.owl#PRN", "http://purl.org/olia/olia.owl#SecondaryPunctuation");
		links.put("http://purl.org/olia/penn-syntax.owl#PRN", "http://purl.org/olia/olia.owl#Phrase");
		links.put("http://purl.org/olia/penn-syntax.owl#NIL", "http://purl.org/olia/olia.owl#Token");
		links.put("http://purl.org/olia/penn-syntax.owl#DIR", "http://purl.org/olia/olia.owl#SyntacticAdjunct");
		links.put("http://purl.org/olia/penn-syntax.owl#DIR", "http://purl.org/olia/olia.owl#DirectionRole");
		links.put("http://purl.org/olia/penn-syntax.owl#DIR", "http://purl.org/olia/olia.owl#Modifier");
		links.put("http://purl.org/olia/penn-syntax.owl#DIR", "http://purl.org/olia/olia.owl#AdverbialModifier");
		links.put("http://purl.org/olia/penn-syntax.owl#LRB", "http://purl.org/olia/olia.owl#SecondaryPunctuation");
		links.put("http://purl.org/olia/penn-syntax.owl#LRB", "http://purl.org/olia/olia.owl#Token");
		links.put("http://purl.org/olia/penn-syntax.owl#LRB", "http://purl.org/olia/olia.owl#LeftParentheticalPunctuation");
		links.put("http://purl.org/olia/penn-syntax.owl#LRB", "http://purl.org/olia/olia.owl#OpenBracket");
		links.put("http://purl.org/olia/penn-syntax.owl#LRB", "http://purl.org/olia/olia.owl#ParentheticalPunctuation");
		links.put("http://purl.org/olia/penn-syntax.owl#LRB", "http://purl.org/olia/olia.owl#Punctuation");
		links.put("http://purl.org/olia/penn-syntax.owl#U", "http://purl.org/olia/olia.owl#Token");
		links.put("http://purl.org/olia/penn-syntax.owl#U", "http://purl.org/olia/olia.owl#OmittedUnit");
		links.put("http://purl.org/olia/penn-syntax.owl#LCB", "http://purl.org/olia/olia.owl#SecondaryPunctuation");
		links.put("http://purl.org/olia/penn-syntax.owl#LCB", "http://purl.org/olia/olia.owl#ParentheticalPunctuation");
		links.put("http://purl.org/olia/penn-syntax.owl#LCB", "http://purl.org/olia/olia.owl#Token");
		links.put("http://purl.org/olia/penn-syntax.owl#LCB", "http://purl.org/olia/olia.owl#OpenCurlyBracket");
		links.put("http://purl.org/olia/penn-syntax.owl#LCB", "http://purl.org/olia/olia.owl#LeftParentheticalPunctuation");
		links.put("http://purl.org/olia/penn-syntax.owl#LCB", "http://purl.org/olia/olia.owl#Punctuation");
		links.put("http://purl.org/olia/penn-syntax.owl#WHADVP", "http://purl.org/olia/olia.owl#AdverbPhrase");
		links.put("http://purl.org/olia/penn-syntax.owl#WHADVP", "http://purl.org/olia/olia.owl#WHAdverbPhrase");
		links.put("http://purl.org/olia/penn-syntax.owl#WHADVP", "http://purl.org/olia/olia.owl#Phrase");
		links.put("http://purl.org/olia/penn-syntax.owl#RRB", "http://purl.org/olia/olia.owl#ParentheticalPunctuation");
		links.put("http://purl.org/olia/penn-syntax.owl#RRB", "http://purl.org/olia/olia.owl#SecondaryPunctuation");
		links.put("http://purl.org/olia/penn-syntax.owl#RRB", "http://purl.org/olia/olia.owl#RightParentheticalPunctuation");
		links.put("http://purl.org/olia/penn-syntax.owl#RRB", "http://purl.org/olia/olia.owl#Token");
		links.put("http://purl.org/olia/penn-syntax.owl#RRB", "http://purl.org/olia/olia.owl#CloseBracket");
		links.put("http://purl.org/olia/penn-syntax.owl#RRB", "http://purl.org/olia/olia.owl#Punctuation");
		links.put("http://purl.org/olia/penn-syntax.owl#PP", "http://purl.org/olia/olia.owl#Phrase");
		links.put("http://purl.org/olia/penn-syntax.owl#PP", "http://purl.org/olia/olia.owl#NounHeadedPhrase");
		links.put("http://purl.org/olia/penn-syntax.owl#PP", "http://purl.org/olia/olia.owl#PrepositionalPhrase");
		links.put("http://purl.org/olia/penn-syntax.owl#LOC", "http://purl.org/olia/olia.owl#AdverbialModifier");
		links.put("http://purl.org/olia/penn-syntax.owl#LOC", "http://purl.org/olia/olia.owl#LocationRole");
		links.put("http://purl.org/olia/penn-syntax.owl#LOC", "http://purl.org/olia/olia.owl#SyntacticAdjunct");
		links.put("http://purl.org/olia/penn-syntax.owl#LOC", "http://purl.org/olia/olia.owl#Modifier");
		links.put("http://purl.org/olia/penn-syntax.owl#HLN", "http://purl.org/olia/olia.owl#Headline");
		links.put("http://purl.org/olia/penn-syntax.owl#LAB", "http://purl.org/olia/olia.owl#SecondaryPunctuation");
		links.put("http://purl.org/olia/penn-syntax.owl#LAB", "http://purl.org/olia/olia.owl#OpenAngleBracket");
		links.put("http://purl.org/olia/penn-syntax.owl#LAB", "http://purl.org/olia/olia.owl#Token");
		links.put("http://purl.org/olia/penn-syntax.owl#LAB", "http://purl.org/olia/olia.owl#LeftParentheticalPunctuation");
		links.put("http://purl.org/olia/penn-syntax.owl#LAB", "http://purl.org/olia/olia.owl#ParentheticalPunctuation");
		links.put("http://purl.org/olia/penn-syntax.owl#LAB", "http://purl.org/olia/olia.owl#Punctuation");
		links.put("http://purl.org/olia/penn-syntax.owl#ADJP", "http://purl.org/olia/olia.owl#AdjectivePhrase");
		links.put("http://purl.org/olia/penn-syntax.owl#ADJP", "http://purl.org/olia/olia.owl#Phrase");
		links.put("http://purl.org/olia/penn-syntax.owl#WHADJP", "http://purl.org/olia/olia.owl#WHAdjectivePhrase");
		links.put("http://purl.org/olia/penn-syntax.owl#WHADJP", "http://purl.org/olia/olia.owl#AdjectivePhrase");
		links.put("http://purl.org/olia/penn-syntax.owl#WHADJP", "http://purl.org/olia/olia.owl#Phrase");
		links.put("http://purl.org/olia/penn-syntax.owl#LSB", "http://purl.org/olia/olia.owl#RightParentheticalPunctuation");
		links.put("http://purl.org/olia/penn-syntax.owl#LSB", "http://purl.org/olia/olia.owl#CloseSquareBracket");
		links.put("http://purl.org/olia/penn-syntax.owl#LSB", "http://purl.org/olia/olia.owl#SecondaryPunctuation");
		links.put("http://purl.org/olia/penn-syntax.owl#LSB", "http://purl.org/olia/olia.owl#Token");
		links.put("http://purl.org/olia/penn-syntax.owl#LSB", "http://purl.org/olia/olia.owl#ParentheticalPunctuation");
		links.put("http://purl.org/olia/penn-syntax.owl#LSB", "http://purl.org/olia/olia.owl#Punctuation");
		links.put("http://purl.org/olia/penn-syntax.owl#VP", "http://purl.org/olia/olia.owl#Phrase");
		links.put("http://purl.org/olia/penn-syntax.owl#VP", "http://purl.org/olia/olia.owl#VerbPhrase");
		links.put("http://purl.org/olia/penn-syntax.owl#QP", "http://purl.org/olia/olia.owl#Phrase");
		links.put("http://purl.org/olia/penn-syntax.owl#QP", "http://purl.org/olia/olia.owl#Quantifier");
		links.put("http://purl.org/olia/penn-syntax.owl#MNR", "http://purl.org/olia/olia.owl#Modifier");
		links.put("http://purl.org/olia/penn-syntax.owl#MNR", "http://purl.org/olia/olia.owl#SyntacticAdjunct");
		links.put("http://purl.org/olia/penn-syntax.owl#MNR", "http://purl.org/olia/olia.owl#MannerRole");
		links.put("http://purl.org/olia/penn-syntax.owl#MNR", "http://purl.org/olia/olia.owl#AdverbialModifier");
		links.put("http://purl.org/olia/penn-syntax.owl#FRAG", "http://purl.org/olia/olia.owl#Phrase");
		links.put("http://purl.org/olia/penn-syntax.owl#FRAG", "http://purl.org/olia/olia.owl#Fragment");
		links.put("http://purl.org/olia/penn-syntax.owl#RAB", "http://purl.org/olia/olia.owl#Punctuation");
		links.put("http://purl.org/olia/penn-syntax.owl#RAB", "http://purl.org/olia/olia.owl#CloseAngleBracket");
		links.put("http://purl.org/olia/penn-syntax.owl#RAB", "http://purl.org/olia/olia.owl#ParentheticalPunctuation");
		links.put("http://purl.org/olia/penn-syntax.owl#RAB", "http://purl.org/olia/olia.owl#RightParentheticalPunctuation");
		links.put("http://purl.org/olia/penn-syntax.owl#RAB", "http://purl.org/olia/olia.owl#Token");
		links.put("http://purl.org/olia/penn-syntax.owl#RAB", "http://purl.org/olia/olia.owl#SecondaryPunctuation");
		links.put("http://purl.org/olia/penn-syntax.owl#PNP", "http://purl.org/olia/olia.owl#Phrase");
		links.put("http://purl.org/olia/penn-syntax.owl#PNP", "http://purl.org/olia/olia.owl#NounPhrase");
		links.put("http://purl.org/olia/penn-syntax.owl#PNP", "http://purl.org/olia/olia.owl#NounHeadedPhrase");
		links.put("http://purl.org/olia/penn-syntax.owl#clause", "http://purl.org/olia/olia.owl#Clause");
		links.put("http://purl.org/olia/penn-syntax.owl#BNF", "http://purl.org/olia/olia.owl#Modifier");
		links.put("http://purl.org/olia/penn-syntax.owl#BNF", "http://purl.org/olia/olia.owl#SyntacticAdjunct");
		links.put("http://purl.org/olia/penn-syntax.owl#BNF", "http://purl.org/olia/olia.owl#UndergoerMacroRole");
		links.put("http://purl.org/olia/penn-syntax.owl#BNF", "http://purl.org/olia/olia.owl#AdverbialModifier");
		links.put("http://purl.org/olia/penn-syntax.owl#BNF", "http://purl.org/olia/olia.owl#BenefactorRole");
		links.put("http://purl.org/olia/penn-syntax.owl#PRD", "http://purl.org/olia/olia.owl#Predicate");
		links.put("http://purl.org/olia/penn-syntax.owl#LGS", "http://purl.org/olia/olia.owl#Modifier");
		links.put("http://purl.org/olia/penn-syntax.owl#LGS", "http://purl.org/olia/olia.owl#ActorMacroRole");
		links.put("http://purl.org/olia/penn-syntax.owl#LGS", "http://purl.org/olia/olia.owl#SyntacticAdjunct");
		links.put("http://purl.org/olia/penn-syntax.owl#EXT", "http://purl.org/olia/olia.owl#SyntacticAdjunct");
		links.put("http://purl.org/olia/penn-syntax.owl#EXT", "http://purl.org/olia/olia.owl#AdverbialModifier");
		links.put("http://purl.org/olia/penn-syntax.owl#EXT", "http://purl.org/olia/olia.owl#ExtentRole");
		links.put("http://purl.org/olia/penn-syntax.owl#EXT", "http://purl.org/olia/olia.owl#Modifier");
		links.put("http://purl.org/olia/penn-syntax.owl#RCB", "http://purl.org/olia/olia.owl#ParentheticalPunctuation");
		links.put("http://purl.org/olia/penn-syntax.owl#RCB", "http://purl.org/olia/olia.owl#Token");
		links.put("http://purl.org/olia/penn-syntax.owl#RCB", "http://purl.org/olia/olia.owl#SecondaryPunctuation");
		links.put("http://purl.org/olia/penn-syntax.owl#RCB", "http://purl.org/olia/olia.owl#OpenCurlyBracket");
		links.put("http://purl.org/olia/penn-syntax.owl#RCB", "http://purl.org/olia/olia.owl#Punctuation");
		links.put("http://purl.org/olia/penn-syntax.owl#RCB", "http://purl.org/olia/olia.owl#LeftParentheticalPunctuation");
		links.put("http://purl.org/olia/penn-syntax.owl#zero", "http://purl.org/olia/olia.owl#Token");
		links.put("http://purl.org/olia/penn-syntax.owl#zero", "http://purl.org/olia/olia.owl#SubordinatingConjunction");
		links.put("http://purl.org/olia/penn-syntax.owl#zero", "http://purl.org/olia/olia.owl#ZeroComplementizer");
		links.put("http://purl.org/olia/penn-syntax.owl#zero", "http://purl.org/olia/olia.owl#Conjunction");
		links.put("http://purl.org/olia/penn-syntax.owl#TMP", "http://purl.org/olia/olia.owl#TimeRole");
		links.put("http://purl.org/olia/penn-syntax.owl#TMP", "http://purl.org/olia/olia.owl#SyntacticAdjunct");
		links.put("http://purl.org/olia/penn-syntax.owl#TMP", "http://purl.org/olia/olia.owl#Modifier");
		links.put("http://purl.org/olia/penn-syntax.owl#TMP", "http://purl.org/olia/olia.owl#AdverbialModifier");
		links.put("http://purl.org/olia/penn-syntax.owl#EXP", "http://purl.org/olia/olia.owl#PronounOrDeterminer");
		links.put("http://purl.org/olia/penn-syntax.owl#EXP", "http://purl.org/olia/olia.owl#Token");
		links.put("http://purl.org/olia/penn-syntax.owl#EXP", "http://purl.org/olia/olia.owl#ExpletivePronoun");
		links.put("http://purl.org/olia/penn-syntax.owl#EXP", "http://purl.org/olia/olia.owl#ThirdPersonPronoun");
		links.put("http://purl.org/olia/penn-syntax.owl#EXP", "http://purl.org/olia/olia.owl#Pronoun");
		links.put("http://purl.org/olia/penn-syntax.owl#EXP", "http://purl.org/olia/olia.owl#Expletive");
		links.put("http://purl.org/olia/penn-syntax.owl#EXP", "http://purl.org/olia/olia.owl#Unique");
		links.put("http://purl.org/olia/penn-syntax.owl#EXP", "http://purl.org/olia/olia.owl#PersReflPronoun");
		links.put("http://purl.org/olia/penn-syntax.owl#RRC", "http://purl.org/olia/olia.owl#SubordinateClause");
		links.put("http://purl.org/olia/penn-syntax.owl#RRC", "http://purl.org/olia/olia.owl#Clause");
		links.put("http://purl.org/olia/penn-syntax.owl#RRC", "http://purl.org/olia/olia.owl#FiniteClause");
		links.put("http://purl.org/olia/penn-syntax.owl#RRC", "http://purl.org/olia/olia.owl#ReducedRelativeClause");
		links.put("http://purl.org/olia/penn-syntax.owl#zeroPronoun", "http://purl.org/olia/olia.owl#PersReflPronoun");
		links.put("http://purl.org/olia/penn-syntax.owl#zeroPronoun", "http://purl.org/olia/olia.owl#ZeroPronoun");
		links.put("http://purl.org/olia/penn-syntax.owl#zeroPronoun", "http://purl.org/olia/olia.owl#PersonalPronoun");
		links.put("http://purl.org/olia/penn-syntax.owl#zeroPronoun", "http://purl.org/olia/olia.owl#Pronoun");
		links.put("http://purl.org/olia/penn-syntax.owl#zeroPronoun", "http://purl.org/olia/olia.owl#Token");
		links.put("http://purl.org/olia/penn-syntax.owl#zeroPronoun", "http://purl.org/olia/olia.owl#PronounOrDeterminer");
		links.put("http://purl.org/olia/penn-syntax.owl#SBJ", "http://purl.org/olia/olia.owl#SyntacticSubject");
		links.put("http://purl.org/olia/penn-syntax.owl#SBJ", "http://purl.org/olia/olia.owl#SyntacticArgument");
		links.put("http://purl.org/olia/penn-syntax.owl#LST", "http://purl.org/olia/olia.owl#Phrase");
		links.put("http://purl.org/olia/penn-syntax.owl#LST", "http://purl.org/olia/olia.owl#LayoutElement");
		links.put("http://purl.org/olia/penn-syntax.owl#LST", "http://purl.org/olia/olia.owl#Residual");
		links.put("http://purl.org/olia/penn-syntax.owl#LST", "http://purl.org/olia/olia.owl#ListMarker");
		links.put("http://purl.org/olia/penn-syntax.owl#TPC", "http://purl.org/olia/olia.owl#Fronting");
		links.put("http://purl.org/olia/penn-syntax.owl#TPC", "http://purl.org/olia/olia.owl#Topicalization");
		links.put("http://purl.org/olia/penn-syntax.owl#ADVP", "http://purl.org/olia/olia.owl#Phrase");
		links.put("http://purl.org/olia/penn-syntax.owl#ADVP", "http://purl.org/olia/olia.owl#AdverbPhrase");
		links.put("http://purl.org/olia/penn-syntax.owl#PRP", "http://purl.org/olia/olia.owl#Modifier");
		links.put("http://purl.org/olia/penn-syntax.owl#PRP", "http://purl.org/olia/olia.owl#AdverbialModifier");
		links.put("http://purl.org/olia/penn-syntax.owl#PRP", "http://purl.org/olia/olia.owl#PurposeRole");
		links.put("http://purl.org/olia/penn-syntax.owl#PRP", "http://purl.org/olia/olia.owl#SyntacticAdjunct");
		links.put("http://purl.org/olia/penn-syntax.owl#questionMark", "http://purl.org/olia/olia.owl#Token");
		links.put("http://purl.org/olia/penn-syntax.owl#questionMark", "http://purl.org/olia/olia.owl#Ellipsis");
		links.put("http://purl.org/olia/penn-syntax.owl#SINV", "http://purl.org/olia/olia.owl#Sentence");
		links.put("http://purl.org/olia/penn-syntax.owl#SINV", "http://purl.org/olia/olia.owl#Clause");
		links.put("http://purl.org/olia/penn-syntax.owl#SINV", "http://purl.org/olia/olia.owl#DeclarativeSentence");
		links.put("http://purl.org/olia/penn-syntax.owl#S", "http://purl.org/olia/olia.owl#DeclarativeSentence");
		links.put("http://purl.org/olia/penn-syntax.owl#S", "http://purl.org/olia/olia.owl#Sentence");
		links.put("http://purl.org/olia/penn-syntax.owl#S", "http://purl.org/olia/olia.owl#Clause");
		links.put("http://purl.org/olia/penn-syntax.owl#SBAR", "http://purl.org/olia/olia.owl#FiniteClause");
		links.put("http://purl.org/olia/penn-syntax.owl#SBAR", "http://purl.org/olia/olia.owl#SubordinateClause");
		links.put("http://purl.org/olia/penn-syntax.owl#SBAR", "http://purl.org/olia/olia.owl#Clause");
		links.put("http://purl.org/olia/penn-syntax.owl#NAC", "http://purl.org/olia/olia.owl#Phrase");
		links.put("http://purl.org/olia/penn-syntax.owl#ICH", "http://purl.org/olia/olia.owl#Token");
		links.put("http://purl.org/olia/penn-syntax.owl#PRT", "http://purl.org/olia/olia.owl#Unique");
		links.put("http://purl.org/olia/penn-syntax.owl#PRT", "http://purl.org/olia/olia.owl#Particle");
		links.put("http://purl.org/olia/penn-syntax.owl#PRT", "http://purl.org/olia/olia.owl#Phrase");
		links.put("http://purl.org/olia/penn-syntax.owl#SQ", "http://purl.org/olia/olia.owl#Question");
		links.put("http://purl.org/olia/penn-syntax.owl#SQ", "http://purl.org/olia/olia.owl#Clause");
		links.put("http://purl.org/olia/penn-syntax.owl#SQ", "http://purl.org/olia/olia.owl#YesNoQuestion");
		links.put("http://purl.org/olia/penn-syntax.owl#SQ", "http://purl.org/olia/olia.owl#DirectQuestion");
		links.put("http://purl.org/olia/penn-syntax.owl#SQ", "http://purl.org/olia/olia.owl#QuestionPredicate");
		links.put("http://purl.org/olia/penn-syntax.owl#RNR", "http://purl.org/olia/olia.owl#Token");
		links.put("http://purl.org/olia/penn-syntax.owl#INTJ", "http://purl.org/olia/olia.owl#Phrase");
		links.put("http://purl.org/olia/penn-syntax.owl#INTJ", "http://purl.org/olia/olia.owl#Interjection");
		links.put("http://purl.org/olia/penn-syntax.owl#UCP", "http://purl.org/olia/olia.owl#ConjunctionPhrase");
		links.put("http://purl.org/olia/penn-syntax.owl#UCP", "http://purl.org/olia/olia.owl#Conjunction");
		links.put("http://purl.org/olia/penn-syntax.owl#UCP", "http://purl.org/olia/olia.owl#Phrase");
		links.put("http://purl.org/olia/penn-syntax.owl#WHNP", "http://purl.org/olia/olia.owl#NounPhrase");
		links.put("http://purl.org/olia/penn-syntax.owl#WHNP", "http://purl.org/olia/olia.owl#Phrase");
		links.put("http://purl.org/olia/penn-syntax.owl#WHNP", "http://purl.org/olia/olia.owl#WHNounPhrase");
		links.put("http://purl.org/olia/penn-syntax.owl#WHNP", "http://purl.org/olia/olia.owl#NounHeadedPhrase");
		links.put("http://purl.org/olia/penn-syntax.owl#CONJP", "http://purl.org/olia/olia.owl#Phrase");
		links.put("http://purl.org/olia/penn-syntax.owl#CONJP", "http://purl.org/olia/olia.owl#Conjunction");
		links.put("http://purl.org/olia/penn-syntax.owl#CONJP", "http://purl.org/olia/olia.owl#ConjunctionPhrase");
		links.put("http://purl.org/olia/penn-syntax.owl#WHPP", "http://purl.org/olia/olia.owl#NounHeadedPhrase");
		links.put("http://purl.org/olia/penn-syntax.owl#WHPP", "http://purl.org/olia/olia.owl#Phrase");
		links.put("http://purl.org/olia/penn-syntax.owl#WHPP", "http://purl.org/olia/olia.owl#PrepositionalPhrase");
		links.put("http://purl.org/olia/penn-syntax.owl#WHPP", "http://purl.org/olia/olia.owl#WHPrepositionalPhrase");
		links.put("http://purl.org/olia/penn-syntax.owl#NP", "http://purl.org/olia/olia.owl#Phrase");
		links.put("http://purl.org/olia/penn-syntax.owl#NP", "http://purl.org/olia/olia.owl#NounHeadedPhrase");
		links.put("http://purl.org/olia/penn-syntax.owl#NP", "http://purl.org/olia/olia.owl#NounPhrase");
		links.put("http://purl.org/olia/penn-syntax.owl#T", "http://purl.org/olia/olia.owl#Trace");
		links.put("http://purl.org/olia/penn-syntax.owl#T", "http://purl.org/olia/olia.owl#Token");
		links.put("http://purl.org/olia/penn-syntax.owl#NX", "http://purl.org/olia/olia.owl#HeadOfNP");
		links.put("http://purl.org/olia/penn-syntax.owl#NX", "http://purl.org/olia/olia.owl#Head");
		links.put("http://purl.org/olia/penn-syntax.owl#NX", "http://purl.org/olia/olia.owl#Phrase");
		links.put("http://purl.org/olia/penn-syntax.owl#ADV", "http://purl.org/olia/olia.owl#Adverbial");
		links.put("http://purl.org/olia/penn-syntax.owl#CLF", "http://purl.org/olia/olia.owl#ItCleft");
		links.put("http://purl.org/olia/penn-syntax.owl#SBARQ", "http://purl.org/olia/olia.owl#DirectQuestion");
		links.put("http://purl.org/olia/penn-syntax.owl#SBARQ", "http://purl.org/olia/olia.owl#Clause");
		links.put("http://purl.org/olia/penn-syntax.owl#SBARQ", "http://purl.org/olia/olia.owl#DirectWHQuestion");
		links.put("http://purl.org/olia/penn-syntax.owl#SBARQ", "http://purl.org/olia/olia.owl#Question");
		links.put("http://purl.org/olia/penn-syntax.owl#NOT", "http://purl.org/olia/olia.owl#Gapping");
		links.put("http://purl.org/olia/penn-syntax.owl#NOT", "http://purl.org/olia/olia.owl#Token");
	}
	
	public static MultiValueMap hasTag = MultiValueMap.decorate(new HashMap<String, ArrayList<String>>());
	
	static {

		hasTag.put("BNF", "http://purl.org/olia/penn-syntax.owl#BNF");
		hasTag.put("ADVP", "http://purl.org/olia/penn-syntax.owl#ADVP");
		hasTag.put("NX", "http://purl.org/olia/penn-syntax.owl#NX");
		hasTag.put("MNR", "http://purl.org/olia/penn-syntax.owl#MNR");
		hasTag.put("PRP", "http://purl.org/olia/penn-syntax.owl#PRP");
		hasTag.put("*LAB*", "http://purl.org/olia/penn-syntax.owl#LAB");
		hasTag.put("*RCB*", "http://purl.org/olia/penn-syntax.owl#RCB");
		hasTag.put("*?*", "http://purl.org/olia/penn-syntax.owl#questionMark");
		hasTag.put("WHADVP", "http://purl.org/olia/penn-syntax.owl#WHADVP");
		hasTag.put("RRC", "http://purl.org/olia/penn-syntax.owl#RRC");
		hasTag.put("*LSB*", "http://purl.org/olia/penn-syntax.owl#LSB");
		hasTag.put("PUT", "http://purl.org/olia/penn-syntax.owl#PUT");
		hasTag.put("*RSB*", "http://purl.org/olia/penn-syntax.owl#RSB");
		hasTag.put("SBJ", "http://purl.org/olia/penn-syntax.owl#SBJ");
		hasTag.put("PP", "http://purl.org/olia/penn-syntax.owl#PP");
		hasTag.put("WHADJP", "http://purl.org/olia/penn-syntax.owl#WHADJP");
		hasTag.put("INTJ", "http://purl.org/olia/penn-syntax.owl#INTJ");
		hasTag.put("CLF", "http://purl.org/olia/penn-syntax.owl#CLF");
		hasTag.put("QP", "http://purl.org/olia/penn-syntax.owl#QP");
		hasTag.put("NP", "http://purl.org/olia/penn-syntax.owl#NP");
		hasTag.put("VP", "http://purl.org/olia/penn-syntax.owl#VP");
		hasTag.put("NAC", "http://purl.org/olia/penn-syntax.owl#NAC");
		hasTag.put("*PPA*", "http://purl.org/olia/penn-syntax.owl#PPA");
		hasTag.put("WHPP", "http://purl.org/olia/penn-syntax.owl#WHPP");
		hasTag.put("FRAG", "http://purl.org/olia/penn-syntax.owl#FRAG");
		hasTag.put("TPC", "http://purl.org/olia/penn-syntax.owl#TPC");
		hasTag.put("TMP", "http://purl.org/olia/penn-syntax.owl#TMP");
		hasTag.put("*EXP*", "http://purl.org/olia/penn-syntax.owl#EXP");
		hasTag.put("WHNP", "http://purl.org/olia/penn-syntax.owl#WHNP");
		hasTag.put("PNP", "http://purl.org/olia/penn-syntax.owl#PNP");
		hasTag.put("PRN", "http://purl.org/olia/penn-syntax.owl#PRN");
		hasTag.put("SQ", "http://purl.org/olia/penn-syntax.owl#SQ");
		hasTag.put("TTL", "http://purl.org/olia/penn-syntax.owl#TTL");
		hasTag.put("*ICH*", "http://purl.org/olia/penn-syntax.owl#ICH");
		hasTag.put("DIR", "http://purl.org/olia/penn-syntax.owl#DIR");
		hasTag.put("CONJP", "http://purl.org/olia/penn-syntax.owl#CONJP");
		hasTag.put("PRD", "http://purl.org/olia/penn-syntax.owl#PRD");
		hasTag.put("*RRB*", "http://purl.org/olia/penn-syntax.owl#RRB");
		hasTag.put("UCP", "http://purl.org/olia/penn-syntax.owl#UCP");
		hasTag.put("ADJP", "http://purl.org/olia/penn-syntax.owl#ADJP");
		hasTag.put("X", "http://purl.org/olia/penn-syntax.owl#X");
		hasTag.put("*LCB*", "http://purl.org/olia/penn-syntax.owl#LCB");
		hasTag.put("LOC", "http://purl.org/olia/penn-syntax.owl#LOC");
		hasTag.put("*T*", "http://purl.org/olia/penn-syntax.owl#T");
		hasTag.put("VOC", "http://purl.org/olia/penn-syntax.owl#VOC");
		hasTag.put("0", "http://purl.org/olia/penn-syntax.owl#zero");
		hasTag.put("DTV", "http://purl.org/olia/penn-syntax.owl#DTV");
		hasTag.put("LGS", "http://purl.org/olia/penn-syntax.owl#LGS");
		hasTag.put("*LRB*", "http://purl.org/olia/penn-syntax.owl#LRB");
		hasTag.put("PRT", "http://purl.org/olia/penn-syntax.owl#PRT");
		hasTag.put("NOM", "http://purl.org/olia/penn-syntax.owl#NOM");
		hasTag.put("*NOT*", "http://purl.org/olia/penn-syntax.owl#NOT");
		hasTag.put("SINV", "http://purl.org/olia/penn-syntax.owl#SINV");
		hasTag.put("EXT", "http://purl.org/olia/penn-syntax.owl#EXT");
		hasTag.put("SBARQ", "http://purl.org/olia/penn-syntax.owl#SBARQ");
		hasTag.put("LST", "http://purl.org/olia/penn-syntax.owl#LST");
		hasTag.put("ADV", "http://purl.org/olia/penn-syntax.owl#ADV");
		hasTag.put("*RAB*", "http://purl.org/olia/penn-syntax.owl#RAB");
		hasTag.put("SBAR", "http://purl.org/olia/penn-syntax.owl#SBAR");
		hasTag.put("CLR", "http://purl.org/olia/penn-syntax.owl#CLR");
		hasTag.put("NIL", "http://purl.org/olia/penn-syntax.owl#NIL");
		hasTag.put("*U*", "http://purl.org/olia/penn-syntax.owl#U");
		hasTag.put("HLN", "http://purl.org/olia/penn-syntax.owl#HLN");
		hasTag.put("S", "http://purl.org/olia/penn-syntax.owl#S");
		hasTag.put("*", "http://purl.org/olia/penn-syntax.owl#zeroPronoun");
		hasTag.put("*RNR*", "http://purl.org/olia/penn-syntax.owl#RNR");
	}
	

	}
	
