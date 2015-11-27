package com.m2i.formation.jsf.managedBeans;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="bookController")
public class BookController {

	private BookBean book;
	
	public BookController() {
		// TODO Auto-generated constructor stub
	}
	
	
	// Les get doivent toujours renvoyer des String
	// Cette methode est equivalent d'un getById en DB
	// Mais ce livre sera perdu car declare en local. Mais la methode renvoie un string
	// ATTENTION : Ce string renvoye est le nom de la VUE 
	// 			===>Donc il faut un fichier XHTML qui s'appelle comme ca
	// Ce fichier Vue ne sait lire que les proprietes public du Controller
	//			===> on va declarer un attribut BookBean et enlever la variable local ds la methode
	// ATTENTION : il n'y a pas de parametres input a la methode. Il faut passer par les proprietes du controller
	public String getSampleBook() {
		book = new BookBean();
		book.setId(1);
		book.setTitle("Sample");
		book.setPrice(10);
		return "showBook";
		
	}


	public BookBean getBook() {
		return book;
	}


	public void setBook(BookBean book) {
		this.book = book;
	}

	
}
