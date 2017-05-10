/**
 * generated by Xtext 2.11.0
 */
package de.cooperateproject.modeling.textual.sequence.sequence.impl;

import de.cooperateproject.modeling.textual.sequence.sequence.BehaviorFragment;
import de.cooperateproject.modeling.textual.sequence.sequence.Loop;
import de.cooperateproject.modeling.textual.sequence.sequence.SequencePackage;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Loop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.sequence.sequence.impl.LoopImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link de.cooperateproject.modeling.textual.sequence.sequence.impl.LoopImpl#getFragments <em>Fragments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoopImpl extends CombinedFragmentImpl implements Loop {
    /**
     * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCondition()
     * @generated
     * @ordered
     */
    protected static final String CONDITION_EDEFAULT = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LoopImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SequencePackage.Literals.LOOP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getCondition() {
        return (String)eDynamicGet(SequencePackage.LOOP__CONDITION, SequencePackage.Literals.LOOP__CONDITION, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCondition(String newCondition) {
        eDynamicSet(SequencePackage.LOOP__CONDITION, SequencePackage.Literals.LOOP__CONDITION, newCondition);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<BehaviorFragment> getFragments() {
        return (EList<BehaviorFragment>)eDynamicGet(SequencePackage.LOOP__FRAGMENTS, SequencePackage.Literals.LOOP__FRAGMENTS, true, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SequencePackage.LOOP__FRAGMENTS:
                return ((InternalEList<?>)getFragments()).basicRemove(otherEnd, msgs);
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
            case SequencePackage.LOOP__CONDITION:
                return getCondition();
            case SequencePackage.LOOP__FRAGMENTS:
                return getFragments();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case SequencePackage.LOOP__CONDITION:
                setCondition((String)newValue);
                return;
            case SequencePackage.LOOP__FRAGMENTS:
                getFragments().clear();
                getFragments().addAll((Collection<? extends BehaviorFragment>)newValue);
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
            case SequencePackage.LOOP__CONDITION:
                setCondition(CONDITION_EDEFAULT);
                return;
            case SequencePackage.LOOP__FRAGMENTS:
                getFragments().clear();
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
            case SequencePackage.LOOP__CONDITION:
                return CONDITION_EDEFAULT == null ? getCondition() != null : !CONDITION_EDEFAULT.equals(getCondition());
            case SequencePackage.LOOP__FRAGMENTS:
                return !getFragments().isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //LoopImpl