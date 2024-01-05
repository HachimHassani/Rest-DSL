package org.example.restdsl.semantic;

import java.util.*;
 
// identifier manager class
public class IdentifierManager {
	private HashMap<String, Identifier> identifiers = new HashMap<>();
	private Stack<List<String>> identifierStack = new Stack<>();
	
	// init identifier
	public IdentifierManager()
	{
		push();
		// add default identifiers
		try {
			addIdentifier(new TypeIdentifier("int"));
			addIdentifier(new TypeIdentifier("float"));
			addIdentifier(new TypeIdentifier("String"));
			addIdentifier(new TypeIdentifier("double"));
			addIdentifier(new TypeIdentifier("long"));
		} catch (IdentifierAlreadyExists e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// init stack
	public void push()
	{
		identifierStack.push(new ArrayList<String>());
	};
	
	// pop all
	public void pop()
	{
		List<String> identifierNames = identifierStack.peek();
		for (String name: identifierNames)
		{
			identifiers.remove(name);
		}
		
		identifierStack.pop();
	}
	
	// check if identifier exists
	public boolean hasIdentifier(String name)
	{
		return identifiers.containsKey(name);
	}
	
	// add identifier
	public void addIdentifier(Identifier identifier) throws IdentifierAlreadyExists
	{
		// check if identifier doesn't exist
		if (hasIdentifier(identifier.getName()))
		{
			throw new IdentifierAlreadyExists(identifier);
		}
		
		// add identifier and push to stack
		identifiers.put(identifier.getName(), identifier);
		identifierStack.peek().add(identifier.getName());
	}
	
	
	// get identifier
	public Identifier getIdentifier(String name) throws IdentifierInvalid
	{
		// check if identifier doesn't exist
		if (!hasIdentifier(name))
		{
			throw new IdentifierInvalid(name + " Does NOT exists");
		}
		
		return identifiers.get(name);
	}
	
	// get identifier while expecting it to be a certain type
	public Identifier getIndetifier(String name, Class identifierClass) throws IdentifierInvalid
	{
		Identifier identifier = getIdentifier(name);
		if (!identifierClass.isInstance(identifier))
		{
			throw new IdentifierInvalid(name + " EXPECTING TYPE TO BE " + identifierClass.getCanonicalName());
		}
		
		return identifier;
	}

}
