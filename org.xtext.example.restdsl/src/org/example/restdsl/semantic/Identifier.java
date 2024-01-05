package org.example.restdsl.semantic;

public abstract class Identifier {
	private String name;
	
	public Identifier(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return this.name;
	}
}
