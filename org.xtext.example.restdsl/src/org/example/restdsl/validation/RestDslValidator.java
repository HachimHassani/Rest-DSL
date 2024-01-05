/*
 * generated by Xtext 2.32.0
 */
package org.example.restdsl.validation;

import org.example.restdsl.semantic.*;

import java.util.*;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.validation.Check;
import org.example.restdsl.restDsl.*;

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class RestDslValidator extends AbstractRestDslValidator {

	@Check
	public void checkEntityIsUpper(Entity entity)
	{
		if (!Character.isUpperCase(entity.getName().charAt(0)))
			warning("Entity name should start with upper case", entity, RestDslPackage.Literals.ENTITY__NAME);
	}
	
	@Check
	public void checkRouterIsUpper(Router router)
	{
		if (!Character.isUpperCase(router.getName().charAt(0)))
			warning("Entity name should start with upper case", router, RestDslPackage.Literals.ENTITY__NAME);
	}
	
	@Check
	public void checkRestApi(RestApi restApi)
	{
		IdentifierManager identifierManager = new IdentifierManager();
		identifierManager.push();
		
		// do checks
		checkEntityIsUnique(identifierManager, restApi);
		checkRouterIsUnique(identifierManager, restApi);

		// clean stack
        identifierManager.pop();
	}
	
	public void checkEntityIsUnique(IdentifierManager identifierManager, RestApi restApi)
	{
		// add entites
		for (Entity entity: restApi.getEntities())
		{
			// create entity identifier
			try {
				identifierManager.addIdentifier(new EntityIdentifier(entity.getName()));
			} catch (IdentifierAlreadyExists e) {
				error(e.getMessage(), entity, RestDslPackage.Literals.ENTITY__NAME);
			}
			
			// check entity fields
			checkFieldIsUnique(identifierManager, entity);
		}
		
	}
	
	public void checkRouterIsUnique(IdentifierManager identifierManager, RestApi restApi)
	{
		// add routers
		for (Router router: restApi.getRouters())
		{
			// create router
			try {
				identifierManager.addIdentifier(new RouterIdentifier(router.getName()));
			} catch (IdentifierAlreadyExists e) {
				error(e.getMessage(), router, RestDslPackage.Literals.ROUTER__NAME);
			}
			
			// check 
			checkEndpointIsUnique(identifierManager, router);
		}
	}
	
	public void checkFieldIsUnique(IdentifierManager identifierManager, Entity entity)
	{
		identifierManager.push();
		
		// add entites
		for (Field field: entity.getFields())
		{
			try {
				identifierManager.addIdentifier(new FieldIdentifier(field.getName(), field.getType()));
			} catch (IdentifierAlreadyExists e) {
				error(e.getMessage(), field, RestDslPackage.Literals.FIELD__NAME);
			}
		}
		
		// clean stack
        identifierManager.pop();
	}
	
	public void checkEndpointIsUnique(IdentifierManager identifierManager, Router router)
	{
		identifierManager.push();
		
		// add endpoints
		for (Endpoint endpoint: router.getEndpoints())
		{
			try {
				identifierManager.addIdentifier(new EndpointIdentifier(endpoint.getName()));
			} catch (IdentifierAlreadyExists e) {
				error(e.getMessage(), endpoint, RestDslPackage.Literals.ENDPOINT__NAME);
			}
			
			identifierManager.push();
			
			// check request
			if (endpoint.getRequestParams() != null)
				checkRequestParams(identifierManager, endpoint.getRequestParams());
			
			if (endpoint.getRequestBody() != null)
				checkRequestBody(identifierManager, endpoint.getRequestBody());
			
			identifierManager.pop();
		}
		
		// clean stack
        identifierManager.pop();
	}
	
	
	public void checkRequestParams(IdentifierManager identifierManager, RequestParams params)
	{
		List<RequestParam> requestParams = new ArrayList<>();
		requestParams.add(params.getFirstParam());
		requestParams.addAll(params.getOtherParams());
		
		// add request params
		for (RequestParam param: requestParams)
		{
			try {
				identifierManager.addIdentifier(new FieldIdentifier(param.getName(), param.getType()));
			} catch (IdentifierAlreadyExists e) {
				error(e.getMessage(), param, RestDslPackage.Literals.REQUEST_PARAM__NAME);
			}
		}
		
	}
	
	
	public void checkRequestBody(IdentifierManager identifierManager, RequestBody body)
	{
		// add body identifier
		try {
			identifierManager.addIdentifier(new FieldIdentifier(body.getName(), body.getType()));
		} catch (IdentifierAlreadyExists e) {
			error(e.getMessage(), body, RestDslPackage.Literals.REQUEST_BODY__NAME);
		}
		
		// check field type validity
		try {
			identifierManager.getIndetifier(body.getType(), TypeIdentifier.class);
		} catch (IdentifierInvalid e) {
			error(e.getMessage(), body, RestDslPackage.Literals.REQUEST_BODY__TYPE);
		}
	}
}
