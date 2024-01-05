package org.example.restdsl.semantic;

//identifier already exists exception
public class IdentifierAlreadyExists  extends Exception  
{  
	public IdentifierAlreadyExists (Identifier identifier)  
	{  
		// calling the constructor of parent Exception  
		super(identifier.getName() + " WAAS ALREADY DECLARED!");  
	}  
}  