/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package eu.irve.emf.test.testconf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>system</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.irve.emf.test.testconf.system#getNode <em>Node</em>}</li>
 *   <li>{@link eu.irve.emf.test.testconf.system#getTester <em>Tester</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.irve.emf.test.testconf.TestconfPackage#getsystem()
 * @model
 * @generated
 */
public interface system extends EObject {
	/**
	 * Returns the value of the '<em><b>Node</b></em>' containment reference list.
	 * The list contents are of type {@link eu.irve.emf.test.testconf.node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' containment reference list.
	 * @see eu.irve.emf.test.testconf.TestconfPackage#getsystem_Node()
	 * @model containment="true"
	 * @generated
	 */
	EList<node> getNode();

	/**
	 * Returns the value of the '<em><b>Tester</b></em>' containment reference list.
	 * The list contents are of type {@link eu.irve.emf.test.testconf.tester}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tester</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tester</em>' containment reference list.
	 * @see eu.irve.emf.test.testconf.TestconfPackage#getsystem_Tester()
	 * @model containment="true"
	 * @generated
	 */
	EList<tester> getTester();

} // system
