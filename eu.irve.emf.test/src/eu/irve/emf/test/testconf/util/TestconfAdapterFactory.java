/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package eu.irve.emf.test.testconf.util;

import eu.irve.emf.test.testconf.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see eu.irve.emf.test.testconf.TestconfPackage
 * @generated
 */
public class TestconfAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TestconfPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestconfAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TestconfPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestconfSwitch<Adapter> modelSwitch =
		new TestconfSwitch<Adapter>() {
			@Override
			public Adapter casesystem(system object) {
				return createsystemAdapter();
			}
			@Override
			public Adapter casenode(node object) {
				return createnodeAdapter();
			}
			@Override
			public Adapter casetester(tester object) {
				return createtesterAdapter();
			}
			@Override
			public Adapter caseTestitav(Testitav object) {
				return createTestitavAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link eu.irve.emf.test.testconf.system <em>system</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.irve.emf.test.testconf.system
	 * @generated
	 */
	public Adapter createsystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.irve.emf.test.testconf.node <em>node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.irve.emf.test.testconf.node
	 * @generated
	 */
	public Adapter createnodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.irve.emf.test.testconf.tester <em>tester</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.irve.emf.test.testconf.tester
	 * @generated
	 */
	public Adapter createtesterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.irve.emf.test.testconf.Testitav <em>Testitav</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.irve.emf.test.testconf.Testitav
	 * @generated
	 */
	public Adapter createTestitavAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //TestconfAdapterFactory
