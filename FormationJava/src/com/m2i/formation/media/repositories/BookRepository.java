package com.m2i.formation.media.repositories;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.m2i.formation.media.entities.Author;
import com.m2i.formation.media.entities.Book;
import com.m2i.formation.media.entities.MediaException;
import com.m2i.formation.media.entities.Publisher;

public class BookRepository implements IRepository<Book>
{

	private String uri;
	
	private  List<Book> cache = null;
	
	public BookRepository()
	{
		// TODO Auto-generated constructor stub
	}
	
	private  List<Book> getCache() throws IOException, MediaException
	{
		if (cache == null)
		{
			cache = cacheFactory();
		}
		
		return cache;
	}

	@Override
	public String getUri()
	{
		return this.uri;
	}

	@Override
	public void setUri(String uri)
	{
		this.uri = uri;

	}

	private List<Book> cacheFactory() throws IOException, MediaException
	{
		List<Book> booksList = new ArrayList<Book>();
		
		BufferedReader bf = new BufferedReader(new FileReader(uri));

		// Read the 1rst and second line
		String line = bf.readLine();
		line = bf.readLine();
		
		// Loop until we reach the end of the file
		while(line != null)
		{
			// Get the line with the separated key : ";"
			StringTokenizer st = new StringTokenizer(line, ";");

			Book b = new Book();
			String authorStr = st.nextToken();
			StringTokenizer author = new StringTokenizer(authorStr, " ");
			Author a = new Author();
			a.setFirstName(author.nextToken());
			a.setLastName(author.nextToken());
			b.addAuthor(a);

			b.setTitle(st.nextToken());

			Publisher p = new Publisher();
			p.setName(st.nextToken());
			b.setPublisher(p);

			b.setPrice(Double.parseDouble(st.nextToken().replace(',','.')));
			
			b.setId(Integer.parseInt(st.nextToken()));
			
			booksList.add(b);
			// Read the next line
			line = bf.readLine();
		}
		
		// Close the file
		bf.close();
		
		return booksList;
	}

	@Override
	public List<Book> getAll() throws IOException, MediaException
	{
		return cacheFactory();
	}
	
	@Override
	public Book getById(int id) throws IOException, MediaException
	{
//		Book b = new Book();
//		
//		BufferedReader bf = new BufferedReader(new FileReader(uri));
//
//		// Read the 1rst and second line
//		String line = bf.readLine();
//		line = bf.readLine();
//		Boolean isStop = false;
//		
//		// Loop until we reach the end of the file
//		while((line != null) && (isStop!=true))
//		{
//			// Get the line with the separated key : ";"
//			StringTokenizer st = new StringTokenizer(line, ";");
//
//			b.addAuthor(getAuthorInToken(st.nextToken()));
//
//			b.setTitle(st.nextToken());
//
//			b.setPublisher(getPublisherInToken(st.nextToken()));
//
//			b.setPrice(Double.parseDouble(st.nextToken().replace(',','.')));
//			
//			b.setId(Integer.parseInt(st.nextToken()));
//			
//			if(b.getId()== Id)
//			{
//				isStop = true;
//			}
//			
//			//listBook.add(b);
//			// Read the next line
//			line = bf.readLine();
//		}
//		
//		// Close the file
//		bf.close();
		
		/**** OU VERSION OPTIMISEE *****/
		Book b = null;
		
		for(Book b2 : getCache())
		{
			if(b2.getId() == id)
			{
				b = b2;
			}
		}
		/******************************/
		
		return b;
	}

	@Override
	public List<Book> getByPrice(double price) throws IOException, MediaException
	{
//		List<Book> booksList = new ArrayList<Book>();
//		
//		BufferedReader bf = new BufferedReader(new FileReader(uri));
//
//		// Read the 1rst and second line
//		String line = bf.readLine();
//		line = bf.readLine();
//		
//		// Loop until we reach the end of the file
//		while(line != null)
//		{
//			Book b = new Book();
//			
//			// Get the line with the separated key : ";"
//			StringTokenizer st = new StringTokenizer(line, ";");
//
//			b.addAuthor(getAuthorInToken(st.nextToken()));
//
//			b.setTitle(st.nextToken());
//			
//			b.setPublisher(getPublisherInToken(st.nextToken()));
//
//			b.setPrice(Double.parseDouble(st.nextToken().replace(',','.')));
//			
//			if(b.getPrice()<=price)
//			{
//				booksList.add(b);
//			}
//			
//			b.setId(Integer.parseInt(st.nextToken()));
//			
//			
//			// Read the next line
//			line = bf.readLine();
//		}
//		
//		// Close the file
//		bf.close();
//		
//		return booksList;
		
		/**** OU VERSION OPTIMISEE *****/
		List<Book> booksList = new ArrayList<Book>();
		for(Book b:getCache())
		{
		 		if(b.getPrice()<=price)
		 		{
					booksList.add(b);
				}
		}
		return booksList;		 
		/******************************/

	}

	@Override
	public List<Book> getByTitle(String words) throws IOException, MediaException
	{
//		List<Book> booksList = new ArrayList<Book>();
//		
//		BufferedReader bf = new BufferedReader(new FileReader(uri));
//
//		// Read the 1rst and second line
//		String line = bf.readLine();
//		line = bf.readLine();
//		
//		// Loop until we reach the end of the file
//		while(line != null)
//		{
//			Book b = new Book();
//			
//			// Get the line with the separated key : ";"
//			StringTokenizer st = new StringTokenizer(line, ";");
//
//			b.addAuthor(getAuthorInToken(st.nextToken()));
//
//			String title = st.nextToken();
//			b.setTitle(title);
//			
//			b.setPublisher(getPublisherInToken(st.nextToken()));
//
//			b.setPrice(Double.parseDouble(st.nextToken().replace(',','.')));
//					
//			b.setId(Integer.parseInt(st.nextToken()));
//			
//			// Create a Pattern object
//		    Pattern r = Pattern.compile(words.toUpperCase());
//		    // Now create matcher object.
//		    Matcher m = r.matcher(title.toUpperCase());
//		    if(m.find())
//		    {
//				booksList.add(b);
//			}
//		    	
//			
//			
//			// Read the next line
//			line = bf.readLine();
//		}
//		
//		// Close the file
//		bf.close();
//		
//		return booksList;
		
		
		/**** OU VERSION OPTIMISEE *****/
		List<Book> booksList = new ArrayList<Book>();
		for(Book b:getCache())
		{
		 		if(b.getTitle().toUpperCase().contains(words.toUpperCase()))
		 		{
		 			booksList.add(b);
		 		}
		}
		
		return booksList;		 
		/******************************/
		 
	}

	
	private Author getAuthorInToken(String s)
	{
		Author author = new Author();

		StringTokenizer authorStr = new StringTokenizer(s, " ");
		author.setFirstName(authorStr.nextToken());
		author.setLastName(authorStr.nextToken());
		
		return author;
	}

	private Publisher getPublisherInToken(String s)
	{
		Publisher publisher = new Publisher();

		publisher.setName(s);
				
		return publisher;
	}
}
