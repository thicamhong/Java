package com.m2i.formation.media.repositories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.m2i.formation.media.entities.Book;
import com.m2i.formation.media.entities.BookCategory;
import com.m2i.formation.media.entities.MediaException;


public class BookDBRepository implements IRepository<Book>
{
	private Properties properties = null;
	
	private String uri = null;
	private String driverDB = null;
	private String loginDB = null;
	private String pwdDB = null;
	
	private Connection cnx = null;
	private Statement stmt = null;
	
	
	public BookDBRepository() throws ClassNotFoundException, SQLException, FileNotFoundException, IOException
	{
		
		properties = new Properties();
			
		properties.load(new FileInputStream("src/config.properties"));
			
		driverDB = properties.getProperty("driverDB");
		uri = properties.getProperty("uriToDB") + properties.getProperty("DB") ;
		loginDB = properties.getProperty("loginDB");
		pwdDB = properties.getProperty("pwdDB");
			
		Class.forName(driverDB);
			
		cnx = DriverManager.getConnection(uri,loginDB,pwdDB);

	}

	

	@Override
	public String getUri()
	{
		return uri;
	}

	@Override
	public void setUri(String uri)
	{
		this.uri = uri;
		
	}
	
	

	
	@Override
	public List<Book> getAll() throws IOException, MediaException, SQLException
	{
		List<Book> books = new ArrayList<Book>();
		
		stmt =cnx.createStatement();
		
		// Select only the book in the media table (type = 0)
		String strSql = "SELECT ";
		strSql += "id,title,price,nbPage,isbn,category,publicationDate,language ";
		strSql += "from media ";
		strSql += "where type=0;";
		
		ResultSet rs = stmt.executeQuery(strSql);
		
		while (rs.next()) {
			Book book = new Book();
			book.setId(rs.getInt("id"));
			book.setTitle(rs.getString("title"));
			book.setPrice(rs.getDouble("price"));
			book.setNbPage(rs.getInt("nbPage"));
			book.setIsbn(rs.getString("isbn"));
			
			switch(rs.getInt("category"))
			{
				case 0 : book.setCategory(BookCategory.SF);
						break;
				
				case 1 : book.setCategory(BookCategory.Computer);
							break;
							
				case 2 : book.setCategory(BookCategory.Database);
							break;
							
				default : book.setCategory(BookCategory.Manga);
							break;
			}
			
			book.setDate(rs.getDate("publicationDate"));
			book.setLanguage(rs.getString("language"));
			
			books.add(book);
         }
         
         rs.close();
         stmt.close();
		
		return books;
	}

	@Override
	public Book getById(int Id) throws IOException, MediaException, SQLException
	{
		Book book = new Book();
		
		stmt =cnx.createStatement();
		
		// Select only the book in the media table (type = 0)
		String strSql = "SELECT ";
		strSql += "id,title,price,nbPage,isbn,category,publicationDate,language ";
		strSql += "FROM media ";
		strSql += "WHERE type=0 ";
		strSql += "AND id=" + Id + ";";
		
		ResultSet rs = stmt.executeQuery(strSql);
		
		while (rs.next()) {
			book.setId(rs.getInt("id"));
			book.setTitle(rs.getString("title"));
			book.setPrice(rs.getDouble("price"));
			book.setNbPage(rs.getInt("nbPage"));
			book.setIsbn(rs.getString("isbn"));
			
			switch(rs.getInt("category"))
			{
				case 0 : book.setCategory(BookCategory.SF);
						break;
				
				case 1 : book.setCategory(BookCategory.Computer);
							break;
							
				case 2 : book.setCategory(BookCategory.Database);
							break;
							
				default : book.setCategory(BookCategory.Manga);
							break;
			}
			
			book.setDate(rs.getDate("publicationDate"));
			book.setLanguage(rs.getString("language"));
			
		}
         
         rs.close();
         stmt.close();
		
		
		
		
		return book;
	}

	@Override
	public List<Book> getByPrice(double price) throws IOException, MediaException
	{
		
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getByTitle(String words) throws IOException, MediaException
	{
		// TODO Auto-generated method stub
		return null;
	}

}
