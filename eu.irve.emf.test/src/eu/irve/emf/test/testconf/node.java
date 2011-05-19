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
 * A representation of the model object '<em><b>node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.irve.emf.test.testconf.node#getNimi <em>Nimi</em>}</li>
 *   <li>{@link eu.irve.emf.test.testconf.node#getTestib <em>Testib</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.irve.emf.test.testconf.TestconfPackage#getnode()
 * @model
 * @generated
 */
public interface node extends EObject {

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
	 * @see eu.irve.emf.test.testconf.TestconfPackage#getnode_Nimi()
	 * @model
	 * @generated
	 */
	String getNimi();

	/**
	 * Sets the value of the '{@link eu.irve.emf.test.testconf.node#getNimi <em>Nimi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nimi</em>' attribute.
	 * @see #getNimi()
	 * @generated
	 */
	void setNimi(String value);

	/**
	 * Returns the value of the '<em><b>Testib</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Testib</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Testib</em>' reference.
	 * @see #setTestib(tester)
	 * @see eu.irve.emf.test.testconf.TestconfPackage#getnode_Testib()
	 * @model
	 * @generated
	 */
	tester getTestib();

	/**
	 * Sets the value of the '{@link eu.irve.emf.test.testconf.node#getTestib <em>Testib</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Testib</em>' reference.
	 * @see #getTestib()
	 * @generated
	 */
	void setTestib(tester value);
} // node
