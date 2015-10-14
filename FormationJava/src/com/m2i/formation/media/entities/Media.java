package com.m2i.formation.media.entities;

import java.util.Date;

public abstract class Media extends Item
{
	private Publisher publisher;
	private Date date;
	private String language;
	private Author[] authors = new Author[10];
	private int nbAuthors = 0;

	
	public void addAuthor(Author newAuthor) throws MediaException
	{
		if(nbAuthors > 10)
		{
			throw new MediaException("Too many authors");
		}
		authors[nbAuthors++] = newAuthor;
		
	}

/*
	public double getVATPrice()
	{
		return getPrice()*1.2;
	}
*/
	public abstract double getVATPrice();
	
	public String getLanguage()
	{
		return language;
	}

	public Author[] getAuthors()
	{
		return authors;
	}

	public int getNbAuthors()
	{
		return nbAuthors;
	}

	public void setLanguage(String language)
	{
		this.language = language;
	}

	public void setAuthors(Author[] authors)
	{
		this.authors = authors;
	}

	public void setNbAuthors(int nbAuthors)
	{
		this.nbAuthors = nbAuthors;
	}

	public Media()
	{
		// TODO Auto-generated constructor stub
	}

	public Date getDate()
	{
		return date;
	}

	public Publisher getPublisher()
	{
		return publisher;
	}

	public void setDate(Date date)
	{
		this.date = date;
	}

	public void setPublisher(Publisher publisher)
	{
		this.publisher = publisher;
	}

	
}
