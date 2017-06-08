/**
 * generated by Xtext 2.11.0
 */
package de.cooperateproject.modeling.textual.sequence.sequence;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Commentable;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;

import org.eclipse.uml2.uml.OccurrenceSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Occurence Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see de.cooperateproject.modeling.textual.sequence.sequence.SequencePackage#getOccurenceSpecification()
 * @model
 * @generated
 */
public interface OccurenceSpecification<UMLOccurenceType extends OccurrenceSpecification> extends Fragment, UMLReferencingElement<UMLOccurenceType>, AliasedPointInTime<UMLOccurenceType>, Commentable<UMLOccurenceType> {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return null;'"
     * @generated
     */
    OccurenceReference<OccurenceSpecification<UMLOccurenceType>> getOccurenceReference();

} // OccurenceSpecification
