/*
 * generated by Xtext 2.32.0
 */
package org.example.restdsl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class RestDslAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/example/restdsl/parser/antlr/internal/InternalRestDsl.tokens");
	}
}
