package com.m2i.formation.tests;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.*;

import org.junit.Test;

import com.m2i.formation.media.entities.Book;
import com.m2i.formation.media.entities.MediaException;
import com.m2i.formation.media.repositories.BookDBRepository;
import com.m2i.formation.media.repositories.BookRepository;

public class RepositoriesTest
{
	private BookRepository br = new BookRepository();

	@Test
	public void test()
	{
		int i = 1;
		i++;
		Assert.assertEquals(2, i);
	}
	
	@Test
	public void uriTest()
	{	
		br.setUri("C:\\Users\\adminlocal\\Documents\\ctran\\BookList.txt");
		
		Assert.assertEquals("C:\\Users\\adminlocal\\Documents\\ctran\\BookList.txt", br.getUri());
	}
	
	
	@Test
	public void sizeBooksTest() throws IOException, MediaException
	{
		br.setUri("C:\\Users\\adminlocal\\Documents\\ctran\\BookList.txt");

		List <Book> booksList = new ArrayList<Book>();
		
		booksList = br.getAll();
		
		Assert.assertEquals(9, booksList.size());
	}
	
	
	@Test
	public void getByIdTest() throws IOException, MediaException
	{
		br.setUri("C:\\Users\\adminlocal\\Documents\\ctran\\BookList.txt");

		Book book = br.getById(2);
	/*	
		Book bookToHave = new Book();
		bookToHave.setId(2);
		bookToHave.setTitle("La couleur de la nuit Gauguin");
		bookToHave.setPrice(58.99);
		Author author = new Author();
		author.setFirstName("KÉRILLIS");
		author.setLastName("Hélène");
		bookToHave.addAuthor(author);
	*/	
		Assert.assertEquals(2, book.getId());
	}
	
	@Test
	public void getByIdPrice() throws IOException, MediaException
	{
		br.setUri("C:\\Users\\adminlocal\\Documents\\ctran\\BookList.txt");

		List<Book> booksList = new ArrayList<Book>();
		booksList = br.getByPrice(10);
		Assert.assertEquals(1, booksList.size());
	}
	
	@Test
	public void getByIdTitle() throws IOException, MediaException
	{
		br.setUri("C:\\Users\\adminlocal\\Documents\\ctran\\BookList.txt");

		List<Book> booksList = new ArrayList<Book>();
		booksList = br.getByTitle("loukoum");
		Assert.assertEquals(1, booksList.size());
	}
	
/*	
	@Test
	public void insertBookTest() throws IOException, MediaException
	{
		Book b = new Book();
		b.setTitle("Java");
		b.setPrice(9.99);
		BookRepository br = new BookRepository();
		br.setUri("C:\\Users\\adminlocal\\Documents\\ctran\\BookList.txt");
		int nbBook = br.getAll().size();
		br.insert(b);
		Assert.assertEquals(nbBook+1, br.getAll().size());
	}
*/	
	
	@Test
	public void getAllDBTest() throws SQLException, IOException, MediaException, ClassNotFoundException
	{
		BookDBRepository repo = new BookDBRepository();
		List<Book> bookList = repo.getAll();
		Assert.assertTrue(bookList.size()>0);
		
	}

/*	
	@Test
	public void getByIdDBTest() throws SQLException, IOException, MediaException
	{
		BookDBRepository repo = new BookDBRepository();
		Book book = repo.getById();
		Assert.assertTrue(bookList.size()>0);
		
	}
*/
}
