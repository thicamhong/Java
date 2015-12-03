package com.m2i.formation.jsf.managedBeans;

import java.awt.print.Book;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.m2i.formation.media.entities.Media;
import com.m2i.formation.media.services.MainService;
import com.m2i.formation.media.services.SpringSingleton;


// Un Service est une classe comme une autre qui prend des input param et retourne des output param
@WebService
public class HelloService {

	// On met cette annotation a toutes les methodes que l'on souhaite
	@WebMethod
	public String getHello()
	{
		return "Hello HONG";
	}

	
	@WebMethod
	public BookBean getBook(int id, String title, double price)
	{
		BookBean book = new BookBean();
		book.setId(id);
		book.setPrice(price);
		book.setTitle(title);
		
		return book;
	}
	
	
	@WebMethod
	public BookBean getById(int id)
	{
		MainService ms = SpringSingleton.getInstance().getBean("mainService", MainService.class);
		
		Media media = ms.getMediaRepository().getById(6);
		
		BookBean book = new BookBean();
		book.setId(media.getId());
		book.setPrice(media.getPrice());
		book.setTitle(media.getTitle());
		
		return book;
	}
}
