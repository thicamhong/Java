package com.mi2.formation.media;

import java.util.Date;

public class Cd extends Media
{

	private int nbTrack;
	private Author[] singers = new Author[10];
	private int nbSingers = 0;
	private Author[] authors = new Author[10];
	private int nbAuthors = 0;
	private BookCategory category;
	private String[]nameTrack;

	public Cd()
	{
		// TODO Auto-generated constructor stub
	}

	public double getVATPrice()
	{
		return getPrice()*1.15;
	}

	
	public int getNbTrack()
	{
		return nbTrack;
	}

	public Author[] getSingers()
	{
		return singers;
	}

	public int getNbSingers()
	{
		return nbSingers;
	}

	public Author[] getAuthors()
	{
		return authors;
	}

	public int getNbAuthors()
	{
		return nbAuthors;
	}

	public BookCategory getCategory()
	{
		return category;
	}

	public void setNbTrack(int nbTrack)
	{
		this.nbTrack = nbTrack;
	}


	public void setSingers(Author[] singers)
	{
		this.singers = singers;
	}

	public void setNbSingers(int nbSingers)
	{
		this.nbSingers = nbSingers;
	}

	public void setAuthors(Author[] authors)
	{
		this.authors = authors;
	}

	public void setNbAuthors(int nbAuthors)
	{
		this.nbAuthors = nbAuthors;
	}

	public void setCategory(BookCategory category)
	{
		this.category = category;
	}
	
	
	

}
