package com.m2i.formation.media.entities;

/**
 * 
 */

/**
 * @author adminlocal
 *
 */
public class Book extends Media
{

	private int nbPage;
	private String isbn;
	private BookCategory category;

	
	
	@Override
	public double getVATPrice()
	{
		return getPrice()*1.05;
	}
	


	public String toString()
	{
		String myBook = "\n\nInformation on the book :\n";
		myBook += "\t Title\t: " + getTitle() + "\n";
		myBook += "\t ID\t: " + getId() + "\n";
		//myBook += "\t date:\t" + );
		myBook += "\t nbPage\t: " + nbPage + "\n";
		myBook += "\t ISBN\t: " + isbn + "\n";
		myBook += "\t Price\t: " + getPrice() + "\n";
		myBook += "\t Language\t: " + getLanguage() + "\n";
		
		
		Author[] authors = getAuthors();
		//if( getNbAuthors()>=2 )
		//{
			//myBook += "\t Authors number\t: " + getNbAuthors() + "\n";
		
			// Display the authors
			for(int i=0; i<getNbAuthors(); i++)
			{
				myBook += authors[i].toString();
			}
		//}
		//else
		//{
		//	myBook += authors[0].toString();
		//}
/*		
		String bookCategory ="";
		switch(category)
		{
			case SF :  bookCategory = "Science Fiction";
						break;
			case Computer :  bookCategory = "Computer";
							break;
			case Database :  bookCategory = "Database";
							break;
			default : bookCategory = "Manga";
			break;
		}
		
		myBook += "\t Book category\t: " + bookCategory + "\n";
		myBook += getPublisher().toString();
	*/	
		return myBook;
	}
	
	
	

	public int getNbPage()
	{
		return nbPage;
	}
	
	
	public String getIsbn()
	{
		return isbn;
	}
	
	
	public BookCategory getCategory()
	{
		return category;
	}


	
	public void setNbPage(int nbPage)
	{
		this.nbPage = nbPage;
	}
	
	
	public void setIsbn(String isbn)
	{
		this.isbn = isbn;
	}
	
	
		public void setCategory(BookCategory category)
	{
		this.category = category;
	}


	// The addAuthor method will increment this data
/*
	public void setNbAuthors(int nbAuthors)
	{
		this.nbAuthors = nbAuthors;
	}
*/

	
}
