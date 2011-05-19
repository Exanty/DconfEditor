/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package eu.irve.emf.test.testconf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>tester</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.irve.emf.test.testconf.tester#getNimi <em>Nimi</em>}</li>
 *   <li>{@link eu.irve.emf.test.testconf.tester#getSugu <em>Sugu</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.irve.emf.test.testconf.TestconfPackage#gettester()
 * @model
 * @generated
 */
public interface tester extends EObject {
	/**
	 * Returns the value of the '<em><b>Nimi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nimi</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nimi</em>' attribute.
	 * @see #setNimi(String)
	 * @see eu.irve.emf.test.testconf.TestconfPackage#gettester_Nimi()
	 * @model
	 * @generated
	 */
	String getNimi();

	/**
	 * Sets the value of the '{@link eu.irve.emf.test.testconf.tester#getNimi <em>Nimi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nimi</em>' attribute.
	 * @see #getNimi()
	 * @generated
	 */
	void setNimi(String value);

	/**
	 * Returns the value of the '<em><b>Sugu</b></em>' attribute.
	 * The literals are from the enumeration {@link eu.irve.emf.test.testconf.Sugu}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sugu</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sugu</em>' attribute.
	 * @see eu.irve.emf.test.testconf.Sugu
	 * @see #setSugu(Sugu)
	 * @see eu.irve.emf.test.testconf.TestconfPackage#gettester_Sugu()
	 * @model
	 * @generated
	 */
	Sugu getSugu();

	/**
	 * Sets the value of the '{@link eu.irve.emf.test.testconf.tester#getSugu <em>Sugu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sugu</em>' attribute.
	 * @see eu.irve.emf.test.testconf.Sugu
	 * @see #getSugu()
	 * @generated
	 */
	void setSugu(Sugu value);

} // tester
