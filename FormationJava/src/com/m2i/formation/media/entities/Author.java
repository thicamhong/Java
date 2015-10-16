package com.m2i.formation.media.entities;

public class Author implements IEntity
{
	private String firstName; 
	private String lastName;
	private int id;

	public Author()
	{
		// TODO Auto-generated constructor stub
	}

	public String getFirstName()
	{
		return firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	
	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public String toString()
	{
		String myAuthor = new String("");
		
		myAuthor = "\t Author : " + firstName + " " + lastName + "\n";
		return myAuthor;
	}
}
