/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package eu.irve.emf.test.testconf;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see eu.irve.emf.test.testconf.TestconfFactory
 * @model kind="package"
 * @generated
 */
public interface TestconfPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "testconf";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://testconf/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "testconf";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TestconfPackage eINSTANCE = eu.irve.emf.test.testconf.impl.TestconfPackageImpl.init();

	/**
	 * The meta object id for the '{@link eu.irve.emf.test.testconf.impl.systemImpl <em>system</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.irve.emf.test.testconf.impl.systemImpl
	 * @see eu.irve.emf.test.testconf.impl.TestconfPackageImpl#getsystem()
	 * @generated
	 */
	int SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__NODE = 0;

	/**
	 * The feature id for the '<em><b>Tester</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__TESTER = 1;

	/**
	 * The number of structural features of the '<em>system</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link eu.irve.emf.test.testconf.impl.nodeImpl <em>node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.irve.emf.test.testconf.impl.nodeImpl
	 * @see eu.irve.emf.test.testconf.impl.TestconfPackageImpl#getnode()
	 * @generated
	 */
	int NODE = 1;

	/**
	 * The feature id for the '<em><b>Nimi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NIMI = 0;

	/**
	 * The feature id for the '<em><b>Testib</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__TESTIB = 1;

	/**
	 * The number of structural features of the '<em>node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 2;


	/**
	 * The meta object id for the '{@link eu.irve.emf.test.testconf.impl.testerImpl <em>tester</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.irve.emf.test.testconf.impl.testerImpl
	 * @see eu.irve.emf.test.testconf.impl.TestconfPackageImpl#gettester()
	 * @generated
	 */
	int TESTER = 2;

	/**
	 * The feature id for the '<em><b>Nimi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTER__NIMI = 0;

	/**
	 * The feature id for the '<em><b>Sugu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTER__SUGU = 1;

	/**
	 * The number of structural features of the '<em>tester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTER_FEATURE_COUNT = 2;


	/**
	 * The meta object id for the '{@link eu.irve.emf.test.testconf.impl.TestitavImpl <em>Testitav</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.irve.emf.test.testconf.impl.TestitavImpl
	 * @see eu.irve.emf.test.testconf.impl.TestconfPackageImpl#getTestitav()
	 * @generated
	 */
	int TESTITAV = 3;

	/**
	 * The number of structural features of the '<em>Testitav</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTITAV_FEATURE_COUNT = 0;


	/**
	 * The meta object id for the '{@link eu.irve.emf.test.testconf.Sugu <em>Sugu</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.irve.emf.test.testconf.Sugu
	 * @see eu.irve.emf.test.testconf.impl.TestconfPackageImpl#getSugu()
	 * @generated
	 */
	int SUGU = 4;


	/**
	 * Returns the meta object for class '{@link eu.irve.emf.test.testconf.system <em>system</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>system</em>'.
	 * @see eu.irve.emf.test.testconf.system
	 * @generated
	 */
	EClass getsystem();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.irve.emf.test.testconf.system#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node</em>'.
	 * @see eu.irve.emf.test.testconf.system#getNode()
	 * @see #getsystem()
	 * @generated
	 */
	EReference getsystem_Node();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.irve.emf.test.testconf.system#getTester <em>Tester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tester</em>'.
	 * @see eu.irve.emf.test.testconf.system#getTester()
	 * @see #getsystem()
	 * @generated
	 */
	EReference getsystem_Tester();

	/**
	 * Returns the meta object for class '{@link eu.irve.emf.test.testconf.node <em>node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>node</em>'.
	 * @see eu.irve.emf.test.testconf.node
	 * @generated
	 */
	EClass getnode();

	/**
	 * Returns the meta object for the attribute '{@link eu.irve.emf.test.testconf.node#getNimi <em>Nimi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nimi</em>'.
	 * @see eu.irve.emf.test.testconf.node#getNimi()
	 * @see #getnode()
	 * @generated
	 */
	EAttribute getnode_Nimi();

	/**
	 * Returns the meta object for the reference '{@link eu.irve.emf.test.testconf.node#getTestib <em>Testib</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Testib</em>'.
	 * @see eu.irve.emf.test.testconf.node#getTestib()
	 * @see #getnode()
	 * @generated
	 */
	EReference getnode_Testib();

	/**
	 * Returns the meta object for class '{@link eu.irve.emf.test.testconf.tester <em>tester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>tester</em>'.
	 * @see eu.irve.emf.test.testconf.tester
	 * @generated
	 */
	EClass gettester();

	/**
	 * Returns the meta object for the attribute '{@link eu.irve.emf.test.testconf.tester#getNimi <em>Nimi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nimi</em>'.
	 * @see eu.irve.emf.test.testconf.tester#getNimi()
	 * @see #gettester()
	 * @generated
	 */
	EAttribute gettester_Nimi();

	/**
	 * Returns the meta object for the attribute '{@link eu.irve.emf.test.testconf.tester#getSugu <em>Sugu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sugu</em>'.
	 * @see eu.irve.emf.test.testconf.tester#getSugu()
	 * @see #gettester()
	 * @generated
	 */
	EAttribute gettester_Sugu();

	/**
	 * Returns the meta object for class '{@link eu.irve.emf.test.testconf.Testitav <em>Testitav</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Testitav</em>'.
	 * @see eu.irve.emf.test.testconf.Testitav
	 * @generated
	 */
	EClass getTestitav();

	/**
	 * Returns the meta object for enum '{@link eu.irve.emf.test.testconf.Sugu <em>Sugu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sugu</em>'.
	 * @see eu.irve.emf.test.testconf.Sugu
	 * @generated
	 */
	EEnum getSugu();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TestconfFactory getTestconfFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link eu.irve.emf.test.testconf.impl.systemImpl <em>system</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.irve.emf.test.testconf.impl.systemImpl
		 * @see eu.irve.emf.test.testconf.impl.TestconfPackageImpl#getsystem()
		 * @generated
		 */
		EClass SYSTEM = eINSTANCE.getsystem();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__NODE = eINSTANCE.getsystem_Node();

		/**
		 * The meta object literal for the '<em><b>Tester</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__TESTER = eINSTANCE.getsystem_Tester();

		/**
		 * The meta object literal for the '{@link eu.irve.emf.test.testconf.impl.nodeImpl <em>node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.irve.emf.test.testconf.impl.nodeImpl
		 * @see eu.irve.emf.test.testconf.impl.TestconfPackageImpl#getnode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getnode();

		/**
		 * The meta object literal for the '<em><b>Nimi</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__NIMI = eINSTANCE.getnode_Nimi();

		/**
		 * The meta object literal for the '<em><b>Testib</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__TESTIB = eINSTANCE.getnode_Testib();

		/**
		 * The meta object literal for the '{@link eu.irve.emf.test.testconf.impl.testerImpl <em>tester</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.irve.emf.test.testconf.impl.testerImpl
		 * @see eu.irve.emf.test.testconf.impl.TestconfPackageImpl#gettester()
		 * @generated
		 */
		EClass TESTER = eINSTANCE.gettester();

		/**
		 * The meta object literal for the '<em><b>Nimi</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TESTER__NIMI = eINSTANCE.gettester_Nimi();

		/**
		 * The meta object literal for the '<em><b>Sugu</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TESTER__SUGU = eINSTANCE.gettester_Sugu();

		/**
		 * The meta object literal for the '{@link eu.irve.emf.test.testconf.impl.TestitavImpl <em>Testitav</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.irve.emf.test.testconf.impl.TestitavImpl
		 * @see eu.irve.emf.test.testconf.impl.TestconfPackageImpl#getTestitav()
		 * @generated
		 */
		EClass TESTITAV = eINSTANCE.getTestitav();

		/**
		 * The meta object literal for the '{@link eu.irve.emf.test.testconf.Sugu <em>Sugu</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.irve.emf.test.testconf.Sugu
		 * @see eu.irve.emf.test.testconf.impl.TestconfPackageImpl#getSugu()
		 * @generated
		 */
		EEnum SUGU = eINSTANCE.getSugu();

	}

} //TestconfPackage
