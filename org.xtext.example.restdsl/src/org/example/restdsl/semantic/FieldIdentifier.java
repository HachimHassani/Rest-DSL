package org.example.restdsl.semantic;

public class FieldIdentifier extends Identifier {
	String type;
	
	public FieldIdentifier(String name, String type)
	{
		super(name);
		this.type = type;
	}
	
	String getType()
	{
		return this.type;
	}

}
