import java.util.Date;

/**
 * 
 */

/**
 * @author adminlocal
 *
 */
public class Book
{

	private String title;
	private int id;
	private Date date;
	private int nbPage;
	private String isbn;
	private double price;
	private String language;
	private Publisher publisher;
	private Author[] authors = new Author[10];
	private int nbAuthors = 0;
	
	
	
	public Author[] getAuthors()
	{
		return authors;
	}


	public int getNbAuthors()
	{
		return nbAuthors;
	}


	public void setAuthors(Author[] authors)
	{
		this.authors = authors;
	}

	// The addAuthor method will increment this data
/*
	public void setNbAuthors(int nbAuthors)
	{
		this.nbAuthors = nbAuthors;
	}
*/

	public void display()
	{
		System.out.println("\n\nInformation on the book :");
		System.out.println("\t Title\t: " + title);
		System.out.println("\t ID\t: " + id);
		//System.out.println("\t date:\t" + );
		System.out.println("\t nbPage\t: " + nbPage);
		System.out.println("\t ISBN\t: " + isbn);
		System.out.println("\t Price\t: " + price);
		System.out.println("\t Language\t: " + language);
		
		if( nbAuthors>=2 )
		{
			System.out.println("\t Authors number\t: " + nbAuthors);
		
			// Display the authors
			for(int i=0; i<nbAuthors; i++)
			{
				System.out.println(authors[i].toString());
			}
		}
		else
		{
			System.out.println(authors[0].toString());
		}
		publisher.display();
	}
	
	
	public void addAuthor(Author newAuthor)
	{
		if(nbAuthors<authors.length)
		{
			//authors[nbAuthors] = new Author();
			authors[nbAuthors] = newAuthor;
			
			nbAuthors += 1;
			
			// OU
			//authors[nbAuthors++] = newAuthor;
		}
	}
	
	public Publisher getPublisher()
	{
		return publisher;
	}


	public void setPublisher(Publisher publisher)
	{
		this.publisher = publisher;
	}


	public String getTitle()
	{
		return title;
	}
	
	
	public int getId()
	{
		return id;
	}
	
	
	public Date getDate()
	{
		return date;
	}
	
	
	public int getNbPage()
	{
		return nbPage;
	}
	
	
	public String getIsbn()
	{
		return isbn;
	}
	
	
	public double getPrice()
	{
		return price;
	}
	
	
	public String getLanguage()
	{
		return language;
	}
	
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	
	public void setDate(Date date)
	{
		this.date = date;
	}
	
	
	public void setNbPage(int nbPage)
	{
		this.nbPage = nbPage;
	}
	
	
	public void setIsbn(String isbn)
	{
		this.isbn = isbn;
	}
	
	
	public void setPrice(double price)
	{
		this.price = price;
	}
	
	
	public void setLanguage(String language)
	{
		this.language = language;
	}	

	
	

	
}
