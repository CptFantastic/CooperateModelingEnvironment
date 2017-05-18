/*
 * generated by Xtext 2.11.0
 */
package de.cooperateproject.modeling.textual.usecase.serializer;

import com.google.inject.Inject;
import de.cooperateproject.modeling.textual.usecase.services.UsecaseGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class UsecaseSyntacticSequencer extends AbstractSyntacticSequencer {

	protected UsecaseGrammarAccess grammarAccess;
	protected AbstractElementAlias match_System___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_3__q;
	protected AbstractElementAlias match_UseCase___LeftCurlyBracketKeyword_4_1_0_RightCurlyBracketKeyword_4_1_3__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (UsecaseGrammarAccess) access;
		match_System___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_2_1_3()));
		match_UseCase___LeftCurlyBracketKeyword_4_1_0_RightCurlyBracketKeyword_4_1_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getUseCaseAccess().getLeftCurlyBracketKeyword_4_1_0()), new TokenAlias(false, false, grammarAccess.getUseCaseAccess().getRightCurlyBracketKeyword_4_1_3()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_System___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_3__q.equals(syntax))
				emit_System___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_UseCase___LeftCurlyBracketKeyword_4_1_0_RightCurlyBracketKeyword_4_1_3__q.equals(syntax))
				emit_UseCase___LeftCurlyBracketKeyword_4_1_0_RightCurlyBracketKeyword_4_1_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ('{' '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=FQN (ambiguity) (rule end)
	 */
	protected void emit_System___LeftCurlyBracketKeyword_2_1_0_RightCurlyBracketKeyword_2_1_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('{' '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     alias=ID (ambiguity) (rule end)
	 *     name=ID (ambiguity) (rule end)
	 */
	protected void emit_UseCase___LeftCurlyBracketKeyword_4_1_0_RightCurlyBracketKeyword_4_1_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
