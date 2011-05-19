/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package eu.irve.emf.test.testconf.impl;

import eu.irve.emf.test.testconf.Sugu;
import eu.irve.emf.test.testconf.TestconfPackage;
import eu.irve.emf.test.testconf.tester;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>tester</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.irve.emf.test.testconf.impl.testerImpl#getNimi <em>Nimi</em>}</li>
 *   <li>{@link eu.irve.emf.test.testconf.impl.testerImpl#getSugu <em>Sugu</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class testerImpl extends EObjectImpl implements tester {
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
	 * The default value of the '{@link #getSugu() <em>Sugu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSugu()
	 * @generated
	 * @ordered
	 */
	protected static final Sugu SUGU_EDEFAULT = Sugu.MEES;

	/**
	 * The cached value of the '{@link #getSugu() <em>Sugu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSugu()
	 * @generated
	 * @ordered
	 */
	protected Sugu sugu = SUGU_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected testerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestconfPackage.Literals.TESTER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TestconfPackage.TESTER__NIMI, oldNimi, nimi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sugu getSugu() {
		return sugu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSugu(Sugu newSugu) {
		Sugu oldSugu = sugu;
		sugu = newSugu == null ? SUGU_EDEFAULT : newSugu;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestconfPackage.TESTER__SUGU, oldSugu, sugu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TestconfPackage.TESTER__NIMI:
				return getNimi();
			case TestconfPackage.TESTER__SUGU:
				return getSugu();
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
			case TestconfPackage.TESTER__NIMI:
				setNimi((String)newValue);
				return;
			case TestconfPackage.TESTER__SUGU:
				setSugu((Sugu)newValue);
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
			case TestconfPackage.TESTER__NIMI:
				setNimi(NIMI_EDEFAULT);
				return;
			case TestconfPackage.TESTER__SUGU:
				setSugu(SUGU_EDEFAULT);
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
			case TestconfPackage.TESTER__NIMI:
				return NIMI_EDEFAULT == null ? nimi != null : !NIMI_EDEFAULT.equals(nimi);
			case TestconfPackage.TESTER__SUGU:
				return sugu != SUGU_EDEFAULT;
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
		result.append(", sugu: ");
		result.append(sugu);
		result.append(')');
		return result.toString();
	}

} //testerImpl
