/*
 * generated by Xtext 2.32.0
 */
package org.example.restdsl;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class RestDslStandaloneSetup extends RestDslStandaloneSetupGenerated {

	public static void doSetup() {
		new RestDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
