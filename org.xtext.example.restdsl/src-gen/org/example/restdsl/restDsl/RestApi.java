/**
 * generated by Xtext 2.32.0
 */
package org.example.restdsl.restDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rest Api</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.restdsl.restDsl.RestApi#getName <em>Name</em>}</li>
 *   <li>{@link org.example.restdsl.restDsl.RestApi#getPath <em>Path</em>}</li>
 *   <li>{@link org.example.restdsl.restDsl.RestApi#getOperations <em>Operations</em>}</li>
 * </ul>
 *
 * @see org.example.restdsl.restDsl.RestDslPackage#getRestApi()
 * @model
 * @generated
 */
public interface RestApi extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.example.restdsl.restDsl.RestDslPackage#getRestApi_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.example.restdsl.restDsl.RestApi#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Path</em>' attribute.
   * @see #setPath(String)
   * @see org.example.restdsl.restDsl.RestDslPackage#getRestApi_Path()
   * @model
   * @generated
   */
  String getPath();

  /**
   * Sets the value of the '{@link org.example.restdsl.restDsl.RestApi#getPath <em>Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Path</em>' attribute.
   * @see #getPath()
   * @generated
   */
  void setPath(String value);

  /**
   * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
   * The list contents are of type {@link org.example.restdsl.restDsl.Operation}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operations</em>' containment reference list.
   * @see org.example.restdsl.restDsl.RestDslPackage#getRestApi_Operations()
   * @model containment="true"
   * @generated
   */
  EList<Operation> getOperations();

} // RestApi
