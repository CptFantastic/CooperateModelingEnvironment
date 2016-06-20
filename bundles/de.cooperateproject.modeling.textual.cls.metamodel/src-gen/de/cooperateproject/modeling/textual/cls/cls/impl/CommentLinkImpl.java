/**
 */
package de.cooperateproject.modeling.textual.cls.cls.impl;

import com.google.common.base.Objects;

import de.cooperateproject.modeling.textual.cls.cls.ClassifierAssociationEnd;
import de.cooperateproject.modeling.textual.cls.cls.ClsPackage;
import de.cooperateproject.modeling.textual.cls.cls.Comment;
import de.cooperateproject.modeling.textual.cls.cls.CommentLink;

import java.lang.reflect.InvocationTargetException;

import java.util.ArrayList;
import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.xtext.xbase.lib.CollectionLiterals;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comment Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cooperateproject.modeling.textual.cls.cls.impl.CommentLinkImpl#getLeft <em>Left</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommentLinkImpl extends ConnectorImpl implements CommentLink {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommentLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClsPackage.Literals.COMMENT_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassifierAssociationEnd getLeft() {
		return (ClassifierAssociationEnd)eDynamicGet(ClsPackage.COMMENT_LINK__LEFT, ClsPackage.Literals.COMMENT_LINK__LEFT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeft(ClassifierAssociationEnd newLeft, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newLeft, ClsPackage.COMMENT_LINK__LEFT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeft(ClassifierAssociationEnd newLeft) {
		eDynamicSet(ClsPackage.COMMENT_LINK__LEFT, ClsPackage.Literals.COMMENT_LINK__LEFT, newLeft);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasComment(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		Comment _comment = this.getComment();
		boolean _equals = Objects.equal(_comment, null);
		if (_equals) {
			ArrayList<Object> _newArrayList = CollectionLiterals.<Object>newArrayList(this, context);
			Object[] _array = _newArrayList.toArray();
			BasicDiagnostic _basicDiagnostic = new BasicDiagnostic(BasicDiagnostic.ERROR, "hasComment", 1, "A comment link must have a comment.", _array);
			diagnostics.add(_basicDiagnostic);
			return false;
		}
		diagnostics.add(BasicDiagnostic.OK_INSTANCE);
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ClsPackage.COMMENT_LINK__LEFT:
				return basicSetLeft(null, msgs);
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
			case ClsPackage.COMMENT_LINK__LEFT:
				return getLeft();
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
			case ClsPackage.COMMENT_LINK__LEFT:
				setLeft((ClassifierAssociationEnd)newValue);
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
			case ClsPackage.COMMENT_LINK__LEFT:
				setLeft((ClassifierAssociationEnd)null);
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
			case ClsPackage.COMMENT_LINK__LEFT:
				return getLeft() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ClsPackage.COMMENT_LINK___HAS_COMMENT__DIAGNOSTICCHAIN_MAP:
				return hasComment((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CommentLinkImpl