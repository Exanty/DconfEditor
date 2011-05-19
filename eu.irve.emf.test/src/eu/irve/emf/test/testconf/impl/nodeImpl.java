/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package eu.irve.emf.test.testconf.impl;

import eu.irve.emf.test.testconf.TestconfPackage;
import eu.irve.emf.test.testconf.node;

import eu.irve.emf.test.testconf.tester;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.irve.emf.test.testconf.impl.nodeImpl#getNimi <em>Nimi</em>}</li>
 *   <li>{@link eu.irve.emf.test.testconf.impl.nodeImpl#getTestib <em>Testib</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class nodeImpl extends EObjectImpl implements node {
	/**
	 * The default value of the '{@link #getNimi() <em>Nimi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNimi()
	 * @generated
	 * @ordered
	 */
	protected static final String NIMI_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getNimi() <em>Nimi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNimi()
	 * @generated
	 * @ordered
	 */
	protected String nimi = NIMI_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTestib() <em>Testib</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestib()
	 * @generated
	 * @ordered
	 */
	protected tester testib;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected nodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestconfPackage.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNimi() {
		return nimi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNimi(String newNimi) {
		String oldNimi = nimi;
		nimi = newNimi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestconfPackage.NODE__NIMI, oldNimi, nimi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tester getTestib() {
		if (testib != null && testib.eIsProxy()) {
			InternalEObject oldTestib = (InternalEObject)testib;
			testib = (tester)eResolveProxy(oldTestib);
			if (testib != oldTestib) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TestconfPackage.NODE__TESTIB, oldTestib, testib));
			}
		}
		return testib;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tester basicGetTestib() {
		return testib;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTestib(tester newTestib) {
		tester oldTestib = testib;
		testib = newTestib;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestconfPackage.NODE__TESTIB, oldTestib, testib));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TestconfPackage.NODE__NIMI:
				return getNimi();
			case TestconfPackage.NODE__TESTIB:
				if (resolve) return getTestib();
				return basicGetTestib();
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
			case TestconfPackage.NODE__NIMI:
				setNimi((String)newValue);
				return;
			case TestconfPackage.NODE__TESTIB:
				setTestib((tester)newValue);
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
			case TestconfPackage.NODE__NIMI:
				setNimi(NIMI_EDEFAULT);
				return;
			case TestconfPackage.NODE__TESTIB:
				setTestib((tester)null);
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
			case TestconfPackage.NODE__NIMI:
				return NIMI_EDEFAULT == null ? nimi != null : !NIMI_EDEFAULT.equals(nimi);
			case TestconfPackage.NODE__TESTIB:
				return testib != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (nimi: ");
		result.append(nimi);
		result.append(')');
		return result.toString();
	}

} //nodeImpl
