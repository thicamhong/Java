package com.m2i.formation.jsf.managedBeans;

import javax.faces.bean.ManagedBean;

import com.m2i.formation.media.entities.Media;
import com.m2i.formation.media.services.MainService;
import com.m2i.formation.media.services.ServiceException;
import com.m2i.formation.media.services.SpringSingleton;

@ManagedBean(name="bookController")
public class BookController {

	// Faire comme Angular sinon book est null
	private BookBean book = new BookBean();
	
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
		
		// Ce code la est plus pour du test, c'est du metier => Dc rien a faire ici
		// Normalement, il devrait faire un acces a la BDD => Repository
		book = new BookBean();
		book.setId(1);
		book.setTitle("Sample");
		book.setPrice(10);
		//
		
		// Evite de retourner "showBook" ==> Evite les fautes d'orthographes
		// En passant les enum, si ce n'est pas bon, cela va souligner en rouge
		return BookControllerEnum.showBook.toString();	
		
	}
	
	
	public String insertBook() throws ServiceException {
		//insert dans la base de donnee
		// Si on y accede, on aura les donnees
		// Acces a la BDD : Appel
		MainService ms = SpringSingleton.getInstance().getBean("mainService", MainService.class);
		
		//Media m = ms.getMediaRepository().getById(book.getId());
		Media m = new Media();
		m.setTitle(book.getTitle());
		m.setPrice((float)book.getPrice());
		
		ms.insertMedia(m);
				
		
		// Evite de retourner "showBook" ==> Evite les fautes d'orthographes
		// En passant les enum, si ce n'est pas bon, cela va souligner en rouge
		return BookControllerEnum.showBook.toString();
		
	}
	
	
	public String getBookById() {
		// Acces a la BDD : Appel
		MainService ms = SpringSingleton.getInstance().getBean("mainService", MainService.class);
		
		
		Media m = ms.getMediaRepository().getById(book.getId());
		
		book.setPrice(m.getPrice());
		book.setTitle(m.getTitle());
		
/*		
		// Fake data car on ne touche pas encore a la BDD
		// On ne renseigne pas l'ID car deja renseigne
		book.setTitle("Sample");
		book.setPrice(10);
		// Si c'etait en Spring, ce sera en 1 ligne
*/		
		return BookControllerEnum.showBook.toString();
	}


	public BookBean getBook() {
		return book;
	}


	public void setBook(BookBean book) {
		this.book = book;
	}

	
}
