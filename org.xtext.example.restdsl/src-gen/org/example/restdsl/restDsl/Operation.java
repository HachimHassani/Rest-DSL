/**
 * generated by Xtext 2.32.0
 */
package org.example.restdsl.restDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.restdsl.restDsl.Operation#getName <em>Name</em>}</li>
 *   <li>{@link org.example.restdsl.restDsl.Operation#getMethod <em>Method</em>}</li>
 *   <li>{@link org.example.restdsl.restDsl.Operation#getPath <em>Path</em>}</li>
 *   <li>{@link org.example.restdsl.restDsl.Operation#getRequest <em>Request</em>}</li>
 *   <li>{@link org.example.restdsl.restDsl.Operation#getResponse <em>Response</em>}</li>
 *   <li>{@link org.example.restdsl.restDsl.Operation#getLogic <em>Logic</em>}</li>
 * </ul>
 *
 * @see org.example.restdsl.restDsl.RestDslPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.example.restdsl.restDsl.RestDslPackage#getOperation_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.example.restdsl.restDsl.Operation#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Method</em>' attribute.
   * @see #setMethod(String)
   * @see org.example.restdsl.restDsl.RestDslPackage#getOperation_Method()
   * @model
   * @generated
   */
  String getMethod();

  /**
   * Sets the value of the '{@link org.example.restdsl.restDsl.Operation#getMethod <em>Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Method</em>' attribute.
   * @see #getMethod()
   * @generated
   */
  void setMethod(String value);

  /**
   * Returns the value of the '<em><b>Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Path</em>' attribute.
   * @see #setPath(String)
   * @see org.example.restdsl.restDsl.RestDslPackage#getOperation_Path()
   * @model
   * @generated
   */
  String getPath();

  /**
   * Sets the value of the '{@link org.example.restdsl.restDsl.Operation#getPath <em>Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Path</em>' attribute.
   * @see #getPath()
   * @generated
   */
  void setPath(String value);

  /**
   * Returns the value of the '<em><b>Request</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Request</em>' containment reference.
   * @see #setRequest(Type)
   * @see org.example.restdsl.restDsl.RestDslPackage#getOperation_Request()
   * @model containment="true"
   * @generated
   */
  Type getRequest();

  /**
   * Sets the value of the '{@link org.example.restdsl.restDsl.Operation#getRequest <em>Request</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Request</em>' containment reference.
   * @see #getRequest()
   * @generated
   */
  void setRequest(Type value);

  /**
   * Returns the value of the '<em><b>Response</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Response</em>' containment reference.
   * @see #setResponse(Type)
   * @see org.example.restdsl.restDsl.RestDslPackage#getOperation_Response()
   * @model containment="true"
   * @generated
   */
  Type getResponse();

  /**
   * Sets the value of the '{@link org.example.restdsl.restDsl.Operation#getResponse <em>Response</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Response</em>' containment reference.
   * @see #getResponse()
   * @generated
   */
  void setResponse(Type value);

  /**
   * Returns the value of the '<em><b>Logic</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Logic</em>' containment reference.
   * @see #setLogic(Logic)
   * @see org.example.restdsl.restDsl.RestDslPackage#getOperation_Logic()
   * @model containment="true"
   * @generated
   */
  Logic getLogic();

  /**
   * Sets the value of the '{@link org.example.restdsl.restDsl.Operation#getLogic <em>Logic</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Logic</em>' containment reference.
   * @see #getLogic()
   * @generated
   */
  void setLogic(Logic value);

} // Operation