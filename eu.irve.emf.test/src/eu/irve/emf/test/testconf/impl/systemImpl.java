/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package eu.irve.emf.test.testconf.impl;

import eu.irve.emf.test.testconf.TestconfPackage;
import eu.irve.emf.test.testconf.node;
import eu.irve.emf.test.testconf.system;

import eu.irve.emf.test.testconf.tester;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>system</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.irve.emf.test.testconf.impl.systemImpl#getNode <em>Node</em>}</li>
 *   <li>{@link eu.irve.emf.test.testconf.impl.systemImpl#getTester <em>Tester</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class systemImpl extends EObjectImpl implements system {
	/**
	 * The cached value of the '{@link #getNode() <em>Node</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected EList<node> node;

	/**
	 * The cached value of the '{@link #getTester() <em>Tester</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTester()
	 * @generated
	 * @ordered
	 */
	protected EList<tester> tester;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected systemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestconfPackage.Literals.SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<node> getNode() {
		if (node == null) {
			node = new EObjectContainmentEList<node>(node.class, this, TestconfPackage.SYSTEM__NODE);
		}
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<tester> getTester() {
		if (tester == null) {
			tester = new EObjectContainmentEList<tester>(tester.class, this, TestconfPackage.SYSTEM__TESTER);
		}
		return tester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TestconfPackage.SYSTEM__NODE:
				return ((InternalEList<?>)getNode()).basicRemove(otherEnd, msgs);
			case TestconfPackage.SYSTEM__TESTER:
				return ((InternalEList<?>)getTester()).basicRemove(otherEnd, msgs);
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
			case TestconfPackage.SYSTEM__NODE:
				return getNode();
			case TestconfPackage.SYSTEM__TESTER:
				return getTester();
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
			case TestconfPackage.SYSTEM__NODE:
				getNode().clear();
				getNode().addAll((Collection<? extends node>)newValue);
				return;
			case TestconfPackage.SYSTEM__TESTER:
				getTester().clear();
				getTester().addAll((Collection<? extends tester>)newValue);
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
			case TestconfPackage.SYSTEM__NODE:
				getNode().clear();
				return;
			case TestconfPackage.SYSTEM__TESTER:
				getTester().clear();
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
			case TestconfPackage.SYSTEM__NODE:
				return node != null && !node.isEmpty();
			case TestconfPackage.SYSTEM__TESTER:
				return tester != null && !tester.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //systemImpl
