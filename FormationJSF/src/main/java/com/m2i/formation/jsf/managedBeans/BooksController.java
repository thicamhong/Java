package com.m2i.formation.jsf.managedBeans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import com.m2i.formation.media.entities.Media;
import com.m2i.formation.media.services.MainService;
import com.m2i.formation.media.services.SpringSingleton;

@ManagedBean(name="booksController")
public class BooksController {

	private List<BookBean> books = new ArrayList<BookBean>();
	
	public BooksController() {
		// TODO Auto-generated constructor stub
	}
	
	
	public List<BookBean> getBooks() {
		return books;
	}


	public void setBooks(List<BookBean> books) {
		this.books = books;
	}


	public String getAllBooks()
	{
		// FAKE DATA
		/*
		BookBean book = new BookBean();
		book.setId(10);
		book.setPrice(16.5);
		book.setTitle("un été avec Coo");
		BookBean book2 = new BookBean();
		book2.setId(11);
		book2.setPrice(6.5);
		book2.setTitle("Entre Terre et Ciel");
		
		books.add(book);
		books.add(book2);
		*/
		
		// On recupere les donnees de la BDD
		MainService service = SpringSingleton.getInstance().getBean("mainService", MainService.class);
		List<Media> medias = service.getMediaRepository().getAll();
		
		// On convertit les données de la BDD en BookBean
		for(Media media:medias)
		{
			BookBean book = new BookBean();
			book.setId(media.getId());
			book.setTitle(media.getTitle());
			book.setPrice(media.getPrice());
			book.setCategory(media.getCategory());
			
			books.add(book);
		}
				
		return BookControllerEnum.showBooks.toString();
	}

}
