package org.example.restdsl.semantic;
import java.util.*;

//identifier doesn't exists or wrong type exception
public class IdentifierInvalid  extends Exception  
{  
	public IdentifierInvalid (String str)  
	{  
		// calling the constructor of parent Exception  
		super(str);  
	}  
}  
