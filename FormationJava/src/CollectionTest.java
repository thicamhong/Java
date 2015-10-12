import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.mi2.formation.media.Author;
import com.mi2.formation.media.Book;
import com.mi2.formation.media.MediaException;

public class CollectionTest
{

	
	public CollectionTest()
	{
		// TODO Auto-generated constructor stub
	}

	
	public List <Book> listTest() throws MediaException
	{
		List <Book> listBook = new ArrayList<Book>();
		
		// Add 3 book
		Book b1 = new Book();
		b1.setId(1);
		b1.setIsbn("57213546874DGHG");
		b1.setTitle("Hayao Miyazaki");
		Author newAuthor1 = new Author();
		newAuthor1.setFirstName("author1");
		newAuthor1.setLastName("AUTHOR1");
		b1.addAuthor(newAuthor1);

		Book b2 = new Book();
		b2.setId(2);
		b2.setIsbn("542135465THSERFG");
		b2.setTitle("Mononoke Hime");
		Author newAuthor2 = new Author();
		newAuthor2.setFirstName("author2");
		newAuthor2.setLastName("AUTHOR2");
		b2.addAuthor(newAuthor2);

		Book b3 = new Book();
		b3.setId(3);
		b3.setIsbn("8976354213DFGHDF");
		b3.setTitle("Totoro");
		Author newAuthor3 = new Author();
		newAuthor3.setFirstName("author3");
		newAuthor3.setLastName("AUTHOR3");
		b3.addAuthor(newAuthor3);
		
		listBook.add(b1);
		listBook.add(b2);
		listBook.add(b3);
		
		
		// Insert a new book a index 1
		Book b4 = new Book();
		b4.setId(4);
		b4.setIsbn("7684321SDGFSER");
		b4.setTitle("Le chateau dans le ciel");
		
		listBook.add(1,b4);
		
		
		// Remove a book at index 2
		listBook.remove(2);	
		
		return listBook;
	}
	
	
	public Set <Book> setTest()
	{
		Set <Book> setBook = new HashSet<Book>();

		// Add 2 same books
		Book b1 = new Book();
		b1.setId(1);
		b1.setIsbn("132465SDSD");
		b1.setTitle("Joe Hisashi");
		
/*
		Book b2 = new Book();
		b2.setId(2);
		b2.setIsbn("465487SRTGSERGF");
		b2.setTitle("Nausicaa dans la vallée du vent");

		Book b3 = new Book();
		b3.setId(3);
		b3.setIsbn("468734SGQ58421");
		b3.setTitle("Ponyo");
*/		
		setBook.add(b1);
		setBook.add(b1);
		
		
		
		
		return setBook;
		
	}
	
	
	public Map <Integer, Book> mapTest()
	{
		Map <Integer, Book> mapBook = new HashMap<Integer, Book>();
		
		// Add 3 book
		Book b1 = new Book();
		b1.setId(1);
		b1.setIsbn("46513SFGETH4786463");
		b1.setTitle("Ghibli");

		Book b2 = new Book();
		b2.setId(2);
		b2.setIsbn("6573221ERYET4357DFH");
		b2.setTitle("Le tombeau des lucioles");

		Book b3 = new Book();
		b3.setId(3);
		b3.setIsbn("98313SGRzg28421");
		b3.setTitle("Pompoko");
		
		// Add in the map
		// The key is duplicate : in the map and in the book => fast for performance
		mapBook.put(b1.getId(), b1);
		mapBook.put(b2.getId(), b2);
		mapBook.put(b3.getId(), b3);
		
		return mapBook;
		
	}
}
