/*
 * generated by Xtext 2.12.0
 */
package de.cooperateproject.modeling.textual.sequence.serializer;

import com.google.inject.Inject;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Comment;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;
import de.cooperateproject.modeling.textual.sequence.sequence.Actor;
import de.cooperateproject.modeling.textual.sequence.sequence.ActorClassifierMapping;
import de.cooperateproject.modeling.textual.sequence.sequence.Alternative;
import de.cooperateproject.modeling.textual.sequence.sequence.BiPointInTimeTimeIntervalSelector;
import de.cooperateproject.modeling.textual.sequence.sequence.Condition;
import de.cooperateproject.modeling.textual.sequence.sequence.CreateMessage;
import de.cooperateproject.modeling.textual.sequence.sequence.Critical;
import de.cooperateproject.modeling.textual.sequence.sequence.DestructionMessage;
import de.cooperateproject.modeling.textual.sequence.sequence.DestructionOccurenceSpecification;
import de.cooperateproject.modeling.textual.sequence.sequence.DurationConstraint;
import de.cooperateproject.modeling.textual.sequence.sequence.DurationObservation;
import de.cooperateproject.modeling.textual.sequence.sequence.ExplicitArrivalOccurenceReference;
import de.cooperateproject.modeling.textual.sequence.sequence.ExplicitArrivalOccurenceSpecification;
import de.cooperateproject.modeling.textual.sequence.sequence.FragmentTimeIntervalSelector;
import de.cooperateproject.modeling.textual.sequence.sequence.ImplicitMessageOccurenceSpecification;
import de.cooperateproject.modeling.textual.sequence.sequence.Loop;
import de.cooperateproject.modeling.textual.sequence.sequence.Option;
import de.cooperateproject.modeling.textual.sequence.sequence.OrderedFragmentContainer;
import de.cooperateproject.modeling.textual.sequence.sequence.Parallel;
import de.cooperateproject.modeling.textual.sequence.sequence.PointInTimeSelector;
import de.cooperateproject.modeling.textual.sequence.sequence.Reference;
import de.cooperateproject.modeling.textual.sequence.sequence.ResponseMessage;
import de.cooperateproject.modeling.textual.sequence.sequence.RootPackage;
import de.cooperateproject.modeling.textual.sequence.sequence.SequenceDiagram;
import de.cooperateproject.modeling.textual.sequence.sequence.SequencePackage;
import de.cooperateproject.modeling.textual.sequence.sequence.StandardMessage;
import de.cooperateproject.modeling.textual.sequence.sequence.TimeConstraint;
import de.cooperateproject.modeling.textual.sequence.sequence.TimeObservation;
import de.cooperateproject.modeling.textual.sequence.services.SequenceGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class SequenceSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SequenceGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == SequencePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case SequencePackage.ACTOR:
				sequence_Actor(context, (Actor) semanticObject); 
				return; 
			case SequencePackage.ACTOR_CLASSIFIER_MAPPING:
				sequence_ActorClassifierMapping(context, (ActorClassifierMapping) semanticObject); 
				return; 
			case SequencePackage.ALTERNATIVE:
				sequence_Alternative(context, (Alternative) semanticObject); 
				return; 
			case SequencePackage.BI_POINT_IN_TIME_TIME_INTERVAL_SELECTOR:
				sequence_BiPointInTimeTimeIntervalSelector(context, (BiPointInTimeTimeIntervalSelector) semanticObject); 
				return; 
			case SequencePackage.CONDITION:
				sequence_Condition(context, (Condition) semanticObject); 
				return; 
			case SequencePackage.CREATE_MESSAGE:
				sequence_CreateMessage(context, (CreateMessage) semanticObject); 
				return; 
			case SequencePackage.CRITICAL:
				sequence_Critical(context, (Critical) semanticObject); 
				return; 
			case SequencePackage.DESTRUCTION_MESSAGE:
				sequence_DestructionMessage(context, (DestructionMessage) semanticObject); 
				return; 
			case SequencePackage.DESTRUCTION_OCCURENCE_SPECIFICATION:
				sequence_DestructionOccurenceSpecification(context, (DestructionOccurenceSpecification) semanticObject); 
				return; 
			case SequencePackage.DURATION_CONSTRAINT:
				sequence_DurationConstraint(context, (DurationConstraint) semanticObject); 
				return; 
			case SequencePackage.DURATION_OBSERVATION:
				sequence_DurationObservation(context, (DurationObservation) semanticObject); 
				return; 
			case SequencePackage.EXPLICIT_ARRIVAL_OCCURENCE_REFERENCE:
				sequence_ExplicitArrivalOccurenceReference(context, (ExplicitArrivalOccurenceReference) semanticObject); 
				return; 
			case SequencePackage.EXPLICIT_ARRIVAL_OCCURENCE_SPECIFICATION:
				sequence_ExplicitArrivalOccurenceSpecification(context, (ExplicitArrivalOccurenceSpecification) semanticObject); 
				return; 
			case SequencePackage.FRAGMENT_TIME_INTERVAL_SELECTOR:
				sequence_FragmentTimeIntervalSelector(context, (FragmentTimeIntervalSelector) semanticObject); 
				return; 
			case SequencePackage.IMPLICIT_MESSAGE_OCCURENCE_SPECIFICATION:
				sequence_ImplicitArrivalOccurenceSpecification_ImplicitSendOccurenceSpecification(context, (ImplicitMessageOccurenceSpecification) semanticObject); 
				return; 
			case SequencePackage.LOOP:
				sequence_Loop(context, (Loop) semanticObject); 
				return; 
			case SequencePackage.OPTION:
				sequence_Option(context, (Option) semanticObject); 
				return; 
			case SequencePackage.ORDERED_FRAGMENT_CONTAINER:
				if (rule == grammarAccess.getOrderedFragmentContainerRule()) {
					sequence_OneFragment_OneOrMultipleFragments(context, (OrderedFragmentContainer) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getOneFragmentRule()) {
					sequence_OneFragment(context, (OrderedFragmentContainer) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getOneOrMultipleFragmentsRule()) {
					sequence_OneOrMultipleFragments(context, (OrderedFragmentContainer) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getOrderedFragmentContainerWithConditionMandatoryBracketsRule()) {
					sequence_OrderedFragmentContainerWithConditionMandatoryBrackets(context, (OrderedFragmentContainer) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getOrderedFragmentContainerWithConditionRule()) {
					sequence_OrderedFragmentContainerWithCondition(context, (OrderedFragmentContainer) semanticObject); 
					return; 
				}
				else break;
			case SequencePackage.PARALLEL:
				sequence_Parallel(context, (Parallel) semanticObject); 
				return; 
			case SequencePackage.POINT_IN_TIME_SELECTOR:
				sequence_PointInTimeSelector(context, (PointInTimeSelector) semanticObject); 
				return; 
			case SequencePackage.REFERENCE:
				sequence_Reference(context, (Reference) semanticObject); 
				return; 
			case SequencePackage.RESPONSE_MESSAGE:
				if (rule == grammarAccess.getLostMessageRule()) {
					sequence_LostMessage(context, (ResponseMessage) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getFragmentRule()
						|| rule == grammarAccess.getMessageRule()) {
					sequence_LostMessage_ResponseMessage(context, (ResponseMessage) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getResponseMessageRule()) {
					sequence_ResponseMessage(context, (ResponseMessage) semanticObject); 
					return; 
				}
				else break;
			case SequencePackage.ROOT_PACKAGE:
				sequence_RootPackage(context, (RootPackage) semanticObject); 
				return; 
			case SequencePackage.SEQUENCE_DIAGRAM:
				sequence_SequenceDiagram(context, (SequenceDiagram) semanticObject); 
				return; 
			case SequencePackage.STANDARD_MESSAGE:
				if (rule == grammarAccess.getFragmentRule()
						|| rule == grammarAccess.getMessageRule()) {
					sequence_FoundMessage_LostMessage_StandardMessage(context, (StandardMessage) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getFoundMessageRule()) {
					sequence_FoundMessage(context, (StandardMessage) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getLostMessageRule()) {
					sequence_LostMessage(context, (StandardMessage) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getStandardMessageRule()) {
					sequence_StandardMessage(context, (StandardMessage) semanticObject); 
					return; 
				}
				else break;
			case SequencePackage.TIME_CONSTRAINT:
				sequence_TimeConstraint(context, (TimeConstraint) semanticObject); 
				return; 
			case SequencePackage.TIME_OBSERVATION:
				sequence_TimeObservation(context, (TimeObservation) semanticObject); 
				return; 
			}
		else if (epackage == TextualCommonsPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case TextualCommonsPackage.COMMENT:
				if (rule == grammarAccess.getCommentRule()) {
					sequence_Comment(context, (Comment) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getInlineCommentRule()) {
					sequence_InlineComment(context, (Comment) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     ActorClassifierMapping returns ActorClassifierMapping
	 *
	 * Constraint:
	 *     classifier=[Classifier|FQN]
	 */
	protected void sequence_ActorClassifierMapping(ISerializationContext context, ActorClassifierMapping semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, SequencePackage.Literals.ACTOR_CLASSIFIER_MAPPING__CLASSIFIER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, SequencePackage.Literals.ACTOR_CLASSIFIER_MAPPING__CLASSIFIER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getActorClassifierMappingAccess().getClassifierClassifierFQNParserRuleCall_1_0_1(), semanticObject.eGet(SequencePackage.Literals.ACTOR_CLASSIFIER_MAPPING__CLASSIFIER, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Actor returns Actor
	 *
	 * Constraint:
	 *     (
	 *         deferred?='def'? 
	 *         (
	 *             (name=ID typeMapping=ActorClassifierMapping?) | 
	 *             (typeMapping=ActorClassifierMapping alias=ID) | 
	 *             (name=STRING typeMapping=ActorClassifierMapping? alias=ID)
	 *         ) 
	 *         actorType=ActorType? 
	 *         comments+=InlineComment?
	 *     )
	 */
	protected void sequence_Actor(ISerializationContext context, Actor semanticObject) {
		genericSequencer.createSequence(context, (EObject) semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Fragment returns Alternative
	 *     CombinedFragment returns Alternative
	 *     MultipleRegionContainer returns Alternative
	 *     Alternative returns Alternative
	 *
	 * Constraint:
	 *     regions+=OrderedFragmentContainerWithCondition+
	 */
	protected void sequence_Alternative(ISerializationContext context, Alternative semanticObject) {
		genericSequencer.createSequence(context, (EObject) semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TimeIntervalSelector returns BiPointInTimeTimeIntervalSelector
	 *     BiPointInTimeTimeIntervalSelector returns BiPointInTimeTimeIntervalSelector
	 *
	 * Constraint:
	 *     (start=PointInTimeSelector end=PointInTimeSelector)
	 */
	protected void sequence_BiPointInTimeTimeIntervalSelector(ISerializationContext context, BiPointInTimeTimeIntervalSelector semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, SequencePackage.Literals.BI_POINT_IN_TIME_TIME_INTERVAL_SELECTOR__START) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, SequencePackage.Literals.BI_POINT_IN_TIME_TIME_INTERVAL_SELECTOR__START));
			if (transientValues.isValueTransient((EObject) semanticObject, SequencePackage.Literals.BI_POINT_IN_TIME_TIME_INTERVAL_SELECTOR__END) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, SequencePackage.Literals.BI_POINT_IN_TIME_TIME_INTERVAL_SELECTOR__END));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getBiPointInTimeTimeIntervalSelectorAccess().getStartPointInTimeSelectorParserRuleCall_0_0(), semanticObject.getStart());
		feeder.accept(grammarAccess.getBiPointInTimeTimeIntervalSelectorAccess().getEndPointInTimeSelectorParserRuleCall_2_0(), semanticObject.getEnd());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Comment returns Comment
	 *
	 * Constraint:
	 *     body=CommentBody
	 */
	protected void sequence_Comment(ISerializationContext context, Comment semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, TextualCommonsPackage.Literals.COMMENT__BODY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, TextualCommonsPackage.Literals.COMMENT__BODY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getCommentAccess().getBodyCommentBodyParserRuleCall_1_0(), semanticObject.getBody());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Condition returns Condition
	 *
	 * Constraint:
	 *     condition=UnescapedString
	 */
	protected void sequence_Condition(ISerializationContext context, Condition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, SequencePackage.Literals.CONDITION__CONDITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, SequencePackage.Literals.CONDITION__CONDITION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getConditionAccess().getConditionUnescapedStringParserRuleCall_1_0(), semanticObject.getCondition());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Fragment returns CreateMessage
	 *     Message returns CreateMessage
	 *     CreateMessage returns CreateMessage
	 *
	 * Constraint:
	 *     (
	 *         name=UnescapedString? 
	 *         left=[Actor|FQN] 
	 *         right=[Actor|FQN] 
	 *         alias=ID? 
	 *         sendEvent=ImplicitSendOccurenceSpecification 
	 *         (arrivalEvent=ExplicitArrivalOccurenceReference | arrivalEvent=ImplicitArrivalOccurenceSpecification)
	 *     )
	 */
	protected void sequence_CreateMessage(ISerializationContext context, CreateMessage semanticObject) {
		genericSequencer.createSequence(context, (EObject) semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Fragment returns Critical
	 *     CombinedFragment returns Critical
	 *     SingleRegionContainer returns Critical
	 *     Critical returns Critical
	 *
	 * Constraint:
	 *     region=OneOrMultipleFragments
	 */
	protected void sequence_Critical(ISerializationContext context, Critical semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, SequencePackage.Literals.SINGLE_REGION_CONTAINER__REGION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, SequencePackage.Literals.SINGLE_REGION_CONTAINER__REGION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getCriticalAccess().getRegionOneOrMultipleFragmentsParserRuleCall_2_0(), semanticObject.getRegion());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Fragment returns DestructionMessage
	 *     Message returns DestructionMessage
	 *     DestructionMessage returns DestructionMessage
	 *
	 * Constraint:
	 *     (
	 *         name=UnescapedString? 
	 *         left=[Actor|FQN] 
	 *         right=[Actor|FQN] 
	 *         alias=ID? 
	 *         sendEvent=ImplicitSendOccurenceSpecification 
	 *         (arrivalEvent=ExplicitArrivalOccurenceReference | arrivalEvent=ImplicitArrivalOccurenceSpecification)
	 *     )
	 */
	protected void sequence_DestructionMessage(ISerializationContext context, DestructionMessage semanticObject) {
		genericSequencer.createSequence(context, (EObject) semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Fragment returns DestructionOccurenceSpecification
	 *     OccurenceSpecification returns DestructionOccurenceSpecification
	 *     DestructionOccurenceSpecification returns DestructionOccurenceSpecification
	 *
	 * Constraint:
	 *     target=[Actor|FQN]
	 */
	protected void sequence_DestructionOccurenceSpecification(ISerializationContext context, DestructionOccurenceSpecification semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, SequencePackage.Literals.DESTRUCTION_OCCURENCE_SPECIFICATION__TARGET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, SequencePackage.Literals.DESTRUCTION_OCCURENCE_SPECIFICATION__TARGET));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getDestructionOccurenceSpecificationAccess().getTargetActorFQNParserRuleCall_1_0_1(), semanticObject.eGet(SequencePackage.Literals.DESTRUCTION_OCCURENCE_SPECIFICATION__TARGET, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Constraint returns DurationConstraint
	 *     DurationConstraint returns DurationConstraint
	 *
	 * Constraint:
	 *     (interval=TimeIntervalSelector duration=UnescapedString)
	 */
	protected void sequence_DurationConstraint(ISerializationContext context, DurationConstraint semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, SequencePackage.Literals.DURATION_CONSTRAINT__INTERVAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, SequencePackage.Literals.DURATION_CONSTRAINT__INTERVAL));
			if (transientValues.isValueTransient((EObject) semanticObject, SequencePackage.Literals.DURATION_CONSTRAINT__DURATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, SequencePackage.Literals.DURATION_CONSTRAINT__DURATION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getDurationConstraintAccess().getIntervalTimeIntervalSelectorParserRuleCall_1_0(), semanticObject.getInterval());
		feeder.accept(grammarAccess.getDurationConstraintAccess().getDurationUnescapedStringParserRuleCall_5_0(), semanticObject.getDuration());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Observation returns DurationObservation
	 *     DurationObservation returns DurationObservation
	 *
	 * Constraint:
	 *     (interval=TimeIntervalSelector duration=UnescapedString)
	 */
	protected void sequence_DurationObservation(ISerializationContext context, DurationObservation semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, SequencePackage.Literals.DURATION_OBSERVATION__INTERVAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, SequencePackage.Literals.DURATION_OBSERVATION__INTERVAL));
			if (transientValues.isValueTransient((EObject) semanticObject, SequencePackage.Literals.DURATION_OBSERVATION__DURATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, SequencePackage.Literals.DURATION_OBSERVATION__DURATION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getDurationObservationAccess().getIntervalTimeIntervalSelectorParserRuleCall_1_0(), semanticObject.getInterval());
		feeder.accept(grammarAccess.getDurationObservationAccess().getDurationUnescapedStringParserRuleCall_5_0(), semanticObject.getDuration());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ExplicitArrivalOccurenceReference returns ExplicitArrivalOccurenceReference
	 *
	 * Constraint:
	 *     explicitOccurenceSpecification=[ExplicitArrivalOccurenceSpecification|ID]
	 */
	protected void sequence_ExplicitArrivalOccurenceReference(ISerializationContext context, ExplicitArrivalOccurenceReference semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, SequencePackage.Literals.EXPLICIT_ARRIVAL_OCCURENCE_REFERENCE__EXPLICIT_OCCURENCE_SPECIFICATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, SequencePackage.Literals.EXPLICIT_ARRIVAL_OCCURENCE_REFERENCE__EXPLICIT_OCCURENCE_SPECIFICATION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getExplicitArrivalOccurenceReferenceAccess().getExplicitOccurenceSpecificationExplicitArrivalOccurenceSpecificationIDTerminalRuleCall_2_0_1(), semanticObject.eGet(SequencePackage.Literals.EXPLICIT_ARRIVAL_OCCURENCE_REFERENCE__EXPLICIT_OCCURENCE_SPECIFICATION, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Fragment returns ExplicitArrivalOccurenceSpecification
	 *     ExplicitArrivalOccurenceSpecification returns ExplicitArrivalOccurenceSpecification
	 *     OccurenceSpecification returns ExplicitArrivalOccurenceSpecification
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_ExplicitArrivalOccurenceSpecification(ISerializationContext context, ExplicitArrivalOccurenceSpecification semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, TextualCommonsPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, TextualCommonsPackage.Literals.NAMED_ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getExplicitArrivalOccurenceSpecificationAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Fragment returns StandardMessage
	 *     Message returns StandardMessage
	 *
	 * Constraint:
	 *     (
	 *         (
	 *             type=MessageType 
	 *             name=UnescapedString 
	 *             left=[Actor|FQN] 
	 *             right=[Actor|FQN] 
	 *             alias=ID? 
	 *             sendEvent=ImplicitSendOccurenceSpecification 
	 *             (arrivalEvent=ExplicitArrivalOccurenceReference | arrivalEvent=ImplicitArrivalOccurenceSpecification)
	 *         ) | 
	 *         (type=MessageType name=UnescapedString right=[Actor|FQN] alias=ID? arrivalEvent=ImplicitArrivalOccurenceSpecification) | 
	 *         (type=MessageType name=UnescapedString left=[Actor|FQN] alias=ID? sendEvent=ImplicitSendOccurenceSpecification)
	 *     )
	 */
	protected void sequence_FoundMessage_LostMessage_StandardMessage(ISerializationContext context, StandardMessage semanticObject) {
		genericSequencer.createSequence(context, (EObject) semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FoundMessage returns StandardMessage
	 *
	 * Constraint:
	 *     (type=MessageType name=UnescapedString right=[Actor|FQN] alias=ID? arrivalEvent=ImplicitArrivalOccurenceSpecification)
	 */
	protected void sequence_FoundMessage(ISerializationContext context, StandardMessage semanticObject) {
		genericSequencer.createSequence(context, (EObject) semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TimeIntervalSelector returns FragmentTimeIntervalSelector
	 *     FragmentTimeIntervalSelector returns FragmentTimeIntervalSelector
	 *
	 * Constraint:
	 *     nonInstantaneousFragment=[NonInstantaneousFragment|FQN]
	 */
	protected void sequence_FragmentTimeIntervalSelector(ISerializationContext context, FragmentTimeIntervalSelector semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, SequencePackage.Literals.FRAGMENT_TIME_INTERVAL_SELECTOR__NON_INSTANTANEOUS_FRAGMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, SequencePackage.Literals.FRAGMENT_TIME_INTERVAL_SELECTOR__NON_INSTANTANEOUS_FRAGMENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getFragmentTimeIntervalSelectorAccess().getNonInstantaneousFragmentNonInstantaneousFragmentFQNParserRuleCall_0_1(), semanticObject.eGet(SequencePackage.Literals.FRAGMENT_TIME_INTERVAL_SELECTOR__NON_INSTANTANEOUS_FRAGMENT, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ImplicitSendOccurenceSpecification returns ImplicitMessageOccurenceSpecification
	 *     ImplicitArrivalOccurenceSpecification returns ImplicitMessageOccurenceSpecification
	 *
	 * Constraint:
	 *     {ImplicitMessageOccurenceSpecification}
	 */
	protected void sequence_ImplicitArrivalOccurenceSpecification_ImplicitSendOccurenceSpecification(ISerializationContext context, ImplicitMessageOccurenceSpecification semanticObject) {
		genericSequencer.createSequence(context, (EObject) semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     InlineComment returns Comment
	 *
	 * Constraint:
	 *     body=CommentBody
	 */
	protected void sequence_InlineComment(ISerializationContext context, Comment semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, TextualCommonsPackage.Literals.COMMENT__BODY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, TextualCommonsPackage.Literals.COMMENT__BODY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getInlineCommentAccess().getBodyCommentBodyParserRuleCall_2_0(), semanticObject.getBody());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Fragment returns Loop
	 *     CombinedFragment returns Loop
	 *     SingleRegionContainer returns Loop
	 *     Loop returns Loop
	 *
	 * Constraint:
	 *     region=OrderedFragmentContainerWithConditionMandatoryBrackets
	 */
	protected void sequence_Loop(ISerializationContext context, Loop semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, SequencePackage.Literals.SINGLE_REGION_CONTAINER__REGION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, SequencePackage.Literals.SINGLE_REGION_CONTAINER__REGION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getLoopAccess().getRegionOrderedFragmentContainerWithConditionMandatoryBracketsParserRuleCall_1_0(), semanticObject.getRegion());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     LostMessage returns ResponseMessage
	 *
	 * Constraint:
	 *     (name=UnescapedString left=[Actor|FQN] alias=ID? sendEvent=ImplicitSendOccurenceSpecification)
	 */
	protected void sequence_LostMessage(ISerializationContext context, ResponseMessage semanticObject) {
		genericSequencer.createSequence(context, (EObject) semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Fragment returns ResponseMessage
	 *     Message returns ResponseMessage
	 *
	 * Constraint:
	 *     (
	 *         (
	 *             name=UnescapedString 
	 *             left=[Actor|FQN]? 
	 *             right=[Actor|FQN]? 
	 *             alias=ID? 
	 *             sendEvent=ImplicitSendOccurenceSpecification 
	 *             (arrivalEvent=ExplicitArrivalOccurenceReference | arrivalEvent=ImplicitArrivalOccurenceSpecification)
	 *         ) | 
	 *         (name=UnescapedString left=[Actor|FQN] alias=ID? sendEvent=ImplicitSendOccurenceSpecification)
	 *     )
	 */
	protected void sequence_LostMessage_ResponseMessage(ISerializationContext context, ResponseMessage semanticObject) {
		genericSequencer.createSequence(context, (EObject) semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     LostMessage returns StandardMessage
	 *
	 * Constraint:
	 *     (type=MessageType name=UnescapedString left=[Actor|FQN] alias=ID? sendEvent=ImplicitSendOccurenceSpecification)
	 */
	protected void sequence_LostMessage(ISerializationContext context, StandardMessage semanticObject) {
		genericSequencer.createSequence(context, (EObject) semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     OrderedFragmentContainer returns OrderedFragmentContainer
	 *
	 * Constraint:
	 *     (fragments+=Fragment | fragments+=Fragment+)
	 */
	protected void sequence_OneFragment_OneOrMultipleFragments(ISerializationContext context, OrderedFragmentContainer semanticObject) {
		genericSequencer.createSequence(context, (EObject) semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     OneFragment returns OrderedFragmentContainer
	 *
	 * Constraint:
	 *     fragments+=Fragment
	 */
	protected void sequence_OneFragment(ISerializationContext context, OrderedFragmentContainer semanticObject) {
		genericSequencer.createSequence(context, (EObject) semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     OneOrMultipleFragments returns OrderedFragmentContainer
	 *
	 * Constraint:
	 *     fragments+=Fragment+
	 */
	protected void sequence_OneOrMultipleFragments(ISerializationContext context, OrderedFragmentContainer semanticObject) {
		genericSequencer.createSequence(context, (EObject) semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Fragment returns Option
	 *     CombinedFragment returns Option
	 *     SingleRegionContainer returns Option
	 *     Option returns Option
	 *
	 * Constraint:
	 *     region=OrderedFragmentContainerWithConditionMandatoryBrackets
	 */
	protected void sequence_Option(ISerializationContext context, Option semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, SequencePackage.Literals.SINGLE_REGION_CONTAINER__REGION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, SequencePackage.Literals.SINGLE_REGION_CONTAINER__REGION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getOptionAccess().getRegionOrderedFragmentContainerWithConditionMandatoryBracketsParserRuleCall_1_0(), semanticObject.getRegion());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     OrderedFragmentContainerWithConditionMandatoryBrackets returns OrderedFragmentContainer
	 *
	 * Constraint:
	 *     (condition=Condition fragments+=Fragment+)
	 */
	protected void sequence_OrderedFragmentContainerWithConditionMandatoryBrackets(ISerializationContext context, OrderedFragmentContainer semanticObject) {
		genericSequencer.createSequence(context, (EObject) semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     OrderedFragmentContainerWithCondition returns OrderedFragmentContainer
	 *
	 * Constraint:
	 *     (condition=Condition (fragments+=Fragment+ | fragments+=Fragment))
	 */
	protected void sequence_OrderedFragmentContainerWithCondition(ISerializationContext context, OrderedFragmentContainer semanticObject) {
		genericSequencer.createSequence(context, (EObject) semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Fragment returns Parallel
	 *     CombinedFragment returns Parallel
	 *     MultipleRegionContainer returns Parallel
	 *     Parallel returns Parallel
	 *
	 * Constraint:
	 *     regions+=OrderedFragmentContainer+
	 */
	protected void sequence_Parallel(ISerializationContext context, Parallel semanticObject) {
		genericSequencer.createSequence(context, (EObject) semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PointInTimeSelector returns PointInTimeSelector
	 *
	 * Constraint:
	 *     pointInTime=[AliasedPointInTime|FQN]
	 */
	protected void sequence_PointInTimeSelector(ISerializationContext context, PointInTimeSelector semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, SequencePackage.Literals.POINT_IN_TIME_SELECTOR__POINT_IN_TIME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, SequencePackage.Literals.POINT_IN_TIME_SELECTOR__POINT_IN_TIME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getPointInTimeSelectorAccess().getPointInTimeAliasedPointInTimeFQNParserRuleCall_0_1(), semanticObject.eGet(SequencePackage.Literals.POINT_IN_TIME_SELECTOR__POINT_IN_TIME, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Fragment returns Reference
	 *     Reference returns Reference
	 *
	 * Constraint:
	 *     (reference=[Interaction|FQN] alias=ID?)
	 */
	protected void sequence_Reference(ISerializationContext context, Reference semanticObject) {
		genericSequencer.createSequence(context, (EObject) semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ResponseMessage returns ResponseMessage
	 *
	 * Constraint:
	 *     (
	 *         name=UnescapedString 
	 *         left=[Actor|FQN]? 
	 *         right=[Actor|FQN]? 
	 *         alias=ID? 
	 *         sendEvent=ImplicitSendOccurenceSpecification 
	 *         (arrivalEvent=ExplicitArrivalOccurenceReference | arrivalEvent=ImplicitArrivalOccurenceSpecification)
	 *     )
	 */
	protected void sequence_ResponseMessage(ISerializationContext context, ResponseMessage semanticObject) {
		genericSequencer.createSequence(context, (EObject) semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RootPackage returns RootPackage
	 *
	 * Constraint:
	 *     name=FQN
	 */
	protected void sequence_RootPackage(ISerializationContext context, RootPackage semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, TextualCommonsPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, TextualCommonsPackage.Literals.NAMED_ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getRootPackageAccess().getNameFQNParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SequenceDiagram returns SequenceDiagram
	 *
	 * Constraint:
	 *     (title=STRING rootPackage=RootPackage actors+=Actor* fragments+=Fragment* (fragments+=Constraint | fragments+=Observation)*)
	 */
	protected void sequence_SequenceDiagram(ISerializationContext context, SequenceDiagram semanticObject) {
		genericSequencer.createSequence(context, (EObject) semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     StandardMessage returns StandardMessage
	 *
	 * Constraint:
	 *     (
	 *         type=MessageType 
	 *         name=UnescapedString 
	 *         left=[Actor|FQN] 
	 *         right=[Actor|FQN] 
	 *         alias=ID? 
	 *         sendEvent=ImplicitSendOccurenceSpecification 
	 *         (arrivalEvent=ExplicitArrivalOccurenceReference | arrivalEvent=ImplicitArrivalOccurenceSpecification)
	 *     )
	 */
	protected void sequence_StandardMessage(ISerializationContext context, StandardMessage semanticObject) {
		genericSequencer.createSequence(context, (EObject) semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Constraint returns TimeConstraint
	 *     TimeConstraint returns TimeConstraint
	 *
	 * Constraint:
	 *     (event=PointInTimeSelector time=UnescapedString)
	 */
	protected void sequence_TimeConstraint(ISerializationContext context, TimeConstraint semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, SequencePackage.Literals.TIME_CONSTRAINT__EVENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, SequencePackage.Literals.TIME_CONSTRAINT__EVENT));
			if (transientValues.isValueTransient((EObject) semanticObject, SequencePackage.Literals.TIME_CONSTRAINT__TIME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, SequencePackage.Literals.TIME_CONSTRAINT__TIME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getTimeConstraintAccess().getEventPointInTimeSelectorParserRuleCall_1_0(), semanticObject.getEvent());
		feeder.accept(grammarAccess.getTimeConstraintAccess().getTimeUnescapedStringParserRuleCall_5_0(), semanticObject.getTime());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Observation returns TimeObservation
	 *     TimeObservation returns TimeObservation
	 *
	 * Constraint:
	 *     (event=PointInTimeSelector time=UnescapedString)
	 */
	protected void sequence_TimeObservation(ISerializationContext context, TimeObservation semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient((EObject) semanticObject, SequencePackage.Literals.TIME_OBSERVATION__EVENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, SequencePackage.Literals.TIME_OBSERVATION__EVENT));
			if (transientValues.isValueTransient((EObject) semanticObject, SequencePackage.Literals.TIME_OBSERVATION__TIME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject) semanticObject, SequencePackage.Literals.TIME_OBSERVATION__TIME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, (EObject) semanticObject);
		feeder.accept(grammarAccess.getTimeObservationAccess().getEventPointInTimeSelectorParserRuleCall_1_0(), semanticObject.getEvent());
		feeder.accept(grammarAccess.getTimeObservationAccess().getTimeUnescapedStringParserRuleCall_5_0(), semanticObject.getTime());
		feeder.finish();
	}
	
	
}
