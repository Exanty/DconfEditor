/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package eu.irve.emf.test.testconf;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see eu.irve.emf.test.testconf.TestconfPackage
 * @generated
 */
public interface TestconfFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TestconfFactory eINSTANCE = eu.irve.emf.test.testconf.impl.TestconfFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>system</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>system</em>'.
	 * @generated
	 */
	system createsystem();

	/**
	 * Returns a new object of class '<em>node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>node</em>'.
	 * @generated
	 */
	node createnode();

	/**
	 * Returns a new object of class '<em>tester</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>tester</em>'.
	 * @generated
	 */
	tester createtester();

	/**
	 * Returns a new object of class '<em>Testitav</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Testitav</em>'.
	 * @generated
	 */
	Testitav createTestitav();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TestconfPackage getTestconfPackage();

} //TestconfFactory
