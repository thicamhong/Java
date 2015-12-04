package com.m2i.formation.rs;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.*;

import javax.ws.rs.core.MediaType;

import com.m2i.formation.jsf.managedBeans.BookBean;
import com.m2i.formation.media.entities.Media;
import com.m2i.formation.media.services.MainService;
import com.m2i.formation.media.services.SpringSingleton;


@Path("/item")
public class MyService {
	
	// Un service REST tout simple
	// Quand on tapera l'URL avec a la fin "/hello", cela affichera "GOOD MORNING"
	// MediaType.TEXT_PLAIN : Le fichier produit est que du text
	// Pour lancer le service : taper l'URL http://localhost:8080/FormationJSF/rs/item/hello
	@GET
	@Path("/hello")
	@Produces(MediaType.TEXT_PLAIN)
	public String getHello()
	{
		return "GOOD MORNING";
	}

	
	@GET
	@Path("/hello/{param}")
	@Produces(MediaType.TEXT_PLAIN)
	public String getHello (@PathParam("param") String param)
	{
		return "GOOD MORNING " + param;
	}
	
	
	// On va renvoyer un objet serialiser en JSON
	// Si c'etait un List<BookBean>, cela aurait marcher aussi. Il se serait debrouiller pour renvoyer une liste
	// Pour que cela marche, il faut rajouter les jar pour le JSON
	@GET
	@Path("/bookSample")
	@Produces(MediaType.APPLICATION_JSON)
	public BookBean getBookSample()
	{
		BookBean b = new BookBean();
		b.setId(1);
		b.setPrice(12.4);
		b.setTitle("REST pour les NULLs");
		
		return b;
	}
	
	
	@GET
	@Path("/all")
	@Produces(MediaType.APPLICATION_JSON)
	public List<BookBean> getAll()
	{
		// On recupere la liste des medias dans le repository
		MainService service = SpringSingleton.getInstance().getBean("mainService", MainService.class);
		List<Media> medias = service.getMediaRepository().getAll();
		
		List<BookBean> books = new ArrayList<BookBean>();
		
		// On convertit les medias en books et on les ajoute a la liste des books
		for(Media media:medias)
		{
			BookBean b = new BookBean();
			b.setId(media.getId());
			b.setPrice(media.getPrice());
			b.setTitle(media.getTitle());
			b.setCategory(media.getCategory());
			
			books.add(b);
		}
		
		return books;
	}
	
	
	@GET
	@Path("/{paramId}")
	@Produces(MediaType.APPLICATION_JSON)
	public BookBean getById(@PathParam("paramId") int id)
	{
		// On recupere la liste des medias dans le repository
		MainService service = SpringSingleton.getInstance().getBean("mainService", MainService.class);
		Media media = service.getMediaRepository().getById(id);
		
		// On convertit le medias en book
		BookBean book = new BookBean();
		book.setId(media.getId());
		book.setPrice(media.getPrice());
		book.setTitle(media.getTitle());
		book.setCategory(media.getCategory());
 
		return book;
	}
	
	
}
