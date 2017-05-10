/**
 * generated by Xtext 2.11.0
 */
package de.cooperateproject.modeling.textual.sequence.sequence.impl;

import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.Element;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.NamedElement;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.PackageBase;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.TextualCommonsPackage;
import de.cooperateproject.modeling.textual.common.metamodel.textualCommons.UMLReferencingElement;

import de.cooperateproject.modeling.textual.sequence.sequence.Message;
import de.cooperateproject.modeling.textual.sequence.sequence.SequencePackage;
import de.cooperateproject.modeling.textual.sequence.sequence.TimeConstraint;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.sequence.sequence.impl.MessageImpl#getReferencedElement <em>Referenced Element</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.sequence.sequence.impl.MessageImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.sequence.sequence.impl.MessageImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.sequence.sequence.impl.MessageImpl#getTimeConstraint <em>Time Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageImpl extends BehaviorFragmentImpl implements Message {
    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The default value of the '{@link #getOrder() <em>Order</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOrder()
     * @generated
     * @ordered
     */
    protected static final String ORDER_EDEFAULT = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MessageImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SequencePackage.Literals.MESSAGE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public org.eclipse.uml2.uml.Message getReferencedElement() {
        return (org.eclipse.uml2.uml.Message)eDynamicGet(SequencePackage.MESSAGE__REFERENCED_ELEMENT, TextualCommonsPackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public org.eclipse.uml2.uml.Message basicGetReferencedElement() {
        return (org.eclipse.uml2.uml.Message)eDynamicGet(SequencePackage.MESSAGE__REFERENCED_ELEMENT, TextualCommonsPackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT, false, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setReferencedElement(org.eclipse.uml2.uml.Message newReferencedElement) {
        eDynamicSet(SequencePackage.MESSAGE__REFERENCED_ELEMENT, TextualCommonsPackage.Literals.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT, newReferencedElement);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
        return (String)eDynamicGet(SequencePackage.MESSAGE__NAME, TextualCommonsPackage.Literals.NAMED_ELEMENT__NAME, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setName(String newName) {
        eDynamicSet(SequencePackage.MESSAGE__NAME, TextualCommonsPackage.Literals.NAMED_ELEMENT__NAME, newName);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getOrder() {
        return (String)eDynamicGet(SequencePackage.MESSAGE__ORDER, SequencePackage.Literals.MESSAGE__ORDER, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOrder(String newOrder) {
        eDynamicSet(SequencePackage.MESSAGE__ORDER, SequencePackage.Literals.MESSAGE__ORDER, newOrder);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TimeConstraint getTimeConstraint() {
        return (TimeConstraint)eDynamicGet(SequencePackage.MESSAGE__TIME_CONSTRAINT, SequencePackage.Literals.MESSAGE__TIME_CONSTRAINT, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTimeConstraint(TimeConstraint newTimeConstraint, NotificationChain msgs) {
        msgs = eDynamicInverseAdd((InternalEObject)newTimeConstraint, SequencePackage.MESSAGE__TIME_CONSTRAINT, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTimeConstraint(TimeConstraint newTimeConstraint) {
        eDynamicSet(SequencePackage.MESSAGE__TIME_CONSTRAINT, SequencePackage.Literals.MESSAGE__TIME_CONSTRAINT, newTimeConstraint);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PackageBase<?> getNearestPackage() {
        EObject parent = this;
        while (parent != null && !(parent instanceof PackageBase)) {
            parent = parent.eContainer();
        }
        return (PackageBase<?>)parent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SequencePackage.MESSAGE__TIME_CONSTRAINT:
                return basicSetTimeConstraint(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SequencePackage.MESSAGE__REFERENCED_ELEMENT:
                if (resolve) return getReferencedElement();
                return basicGetReferencedElement();
            case SequencePackage.MESSAGE__NAME:
                return getName();
            case SequencePackage.MESSAGE__ORDER:
                return getOrder();
            case SequencePackage.MESSAGE__TIME_CONSTRAINT:
                return getTimeConstraint();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case SequencePackage.MESSAGE__REFERENCED_ELEMENT:
                setReferencedElement((org.eclipse.uml2.uml.Message)newValue);
                return;
            case SequencePackage.MESSAGE__NAME:
                setName((String)newValue);
                return;
            case SequencePackage.MESSAGE__ORDER:
                setOrder((String)newValue);
                return;
            case SequencePackage.MESSAGE__TIME_CONSTRAINT:
                setTimeConstraint((TimeConstraint)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case SequencePackage.MESSAGE__REFERENCED_ELEMENT:
                setReferencedElement((org.eclipse.uml2.uml.Message)null);
                return;
            case SequencePackage.MESSAGE__NAME:
                setName(NAME_EDEFAULT);
                return;
            case SequencePackage.MESSAGE__ORDER:
                setOrder(ORDER_EDEFAULT);
                return;
            case SequencePackage.MESSAGE__TIME_CONSTRAINT:
                setTimeConstraint((TimeConstraint)null);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case SequencePackage.MESSAGE__REFERENCED_ELEMENT:
                return basicGetReferencedElement() != null;
            case SequencePackage.MESSAGE__NAME:
                return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
            case SequencePackage.MESSAGE__ORDER:
                return ORDER_EDEFAULT == null ? getOrder() != null : !ORDER_EDEFAULT.equals(getOrder());
            case SequencePackage.MESSAGE__TIME_CONSTRAINT:
                return getTimeConstraint() != null;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
        if (baseClass == Element.class) {
            switch (derivedFeatureID) {
                default: return -1;
            }
        }
        if (baseClass == UMLReferencingElement.class) {
            switch (derivedFeatureID) {
                case SequencePackage.MESSAGE__REFERENCED_ELEMENT: return TextualCommonsPackage.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT;
                default: return -1;
            }
        }
        if (baseClass == NamedElement.class) {
            switch (derivedFeatureID) {
                case SequencePackage.MESSAGE__NAME: return TextualCommonsPackage.NAMED_ELEMENT__NAME;
                default: return -1;
            }
        }
        return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
        if (baseClass == Element.class) {
            switch (baseFeatureID) {
                default: return -1;
            }
        }
        if (baseClass == UMLReferencingElement.class) {
            switch (baseFeatureID) {
                case TextualCommonsPackage.UML_REFERENCING_ELEMENT__REFERENCED_ELEMENT: return SequencePackage.MESSAGE__REFERENCED_ELEMENT;
                default: return -1;
            }
        }
        if (baseClass == NamedElement.class) {
            switch (baseFeatureID) {
                case TextualCommonsPackage.NAMED_ELEMENT__NAME: return SequencePackage.MESSAGE__NAME;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
        if (baseClass == Element.class) {
            switch (baseOperationID) {
                case TextualCommonsPackage.ELEMENT___GET_NEAREST_PACKAGE: return SequencePackage.MESSAGE___GET_NEAREST_PACKAGE;
                default: return -1;
            }
        }
        if (baseClass == UMLReferencingElement.class) {
            switch (baseOperationID) {
                default: return -1;
            }
        }
        if (baseClass == NamedElement.class) {
            switch (baseOperationID) {
                default: return -1;
            }
        }
        return super.eDerivedOperationID(baseOperationID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
        switch (operationID) {
            case SequencePackage.MESSAGE___GET_NEAREST_PACKAGE:
                return getNearestPackage();
        }
        return super.eInvoke(operationID, arguments);
    }

} //MessageImpl