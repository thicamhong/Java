import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;

import com.m2i.formation.media.entities.Author;
import com.m2i.formation.media.entities.Book;
import com.m2i.formation.media.entities.MediaException;
import com.m2i.formation.media.entities.Publisher;

public class TestFile
{

	public TestFile()
	{
		// TODO Auto-generated constructor stub
	}

	public void readFile(String uri) throws IOException
	{
		String title = "";
		String author = "";
		String publisher = "";
		double price = 0.0;
		int nbPage = 0;
		
		BufferedReader br = new BufferedReader(new FileReader(uri));
		
		// Read the 1rst line
		String line = br.readLine();
		
		int id = 0;

		// Loop until we reach the end of the file
		while(line != null)
		{

			// Get the line with the separated key : ";"
			StringTokenizer st = new StringTokenizer(line, ";");
			
			// Get each field : title, price, author, publisher and nbPage
			title = st.nextToken();
			price = Double.parseDouble(st.nextToken().replace(',','.'));
			author = st.nextToken();
			publisher = st.nextToken();
			nbPage = Integer.parseInt(st.nextToken());
			
			id++;
			
			// Display the information on the book
			System.out.println("Information on the book " + title + ":");
			System.out.println("\t Author : " + author);
			System.out.println("\t Price : " + price);
			System.out.println("\t Publisher : " + publisher);
			System.out.println("\t nbPage : " + nbPage);

			// Read the next line
			line = br.readLine();
			
		}
		
		// Close the file
		br.close();
		
	}
	
	
	public List<Book> readBook(String uri) throws IOException, MediaException
	{
		List<Book> listBook = new ArrayList<Book>();
		
		
		BufferedReader bf = new BufferedReader(new FileReader(uri));

		// Read the 1rst line
		String line = bf.readLine();

		// Loop until we reach the end of the file
		while(line != null)
		{
			// Get the line with the separated key : ";"
			StringTokenizer st = new StringTokenizer(line, ";");

			Book b = new Book();
			b.setTitle(st.nextToken());
			b.setPrice(Double.parseDouble(st.nextToken().replace(',','.')));
			Author a = new Author();
			StringTokenizer author = new StringTokenizer(st.nextToken(), "");
			a.setFirstName(author.nextToken());
			a.setLastName(author.nextToken());
			b.addAuthor(a);
			Publisher p = new Publisher();
			p.setName(st.nextToken());
			b.setPublisher(p);
			b.setNbPage(Integer.parseInt(st.nextToken()));
			listBook.add(b);
			// Read the next line
			line = bf.readLine();
		}
		
		// Close the file
		bf.close();
		
		return listBook;
	}
}
