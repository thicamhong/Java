/**
 * HelloServiceSoapBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.m2i.formation.jsf.managedBeans;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.m2i.formation.media.entities.Media;
import com.m2i.formation.media.services.MainService;
import com.m2i.formation.media.services.SpringSingleton;

// Les annotations peuvent etre mis dans l'interface ou non. Cote client, cela marche quand meme
//@WebService
public class HelloServiceSoapBindingImpl implements com.m2i.formation.jsf.managedBeans.HelloService{
	 //@WebMethod
	public java.lang.String getHello() throws java.rmi.RemoteException {
        return "WAZAAAAA";
    }

    //@WebMethod
    public com.m2i.formation.jsf.managedBeans.BookBean getById(int id) throws java.rmi.RemoteException {
    	MainService service = SpringSingleton.getInstance().getBean("mainService", MainService.class);
    	
    	Media m = service.getMediaRepository().getById(id);
    	
    	BookBean book = new BookBean();
    	book.setId(m.getId());
    	book.setPrice(m.getPrice());
    	book.setTitle(m.getTitle());
    	book.setCategory(m.getCategory());
    	
        return book;
    }

    //@WebMethod
    public com.m2i.formation.jsf.managedBeans.BookBean getBook(int id, java.lang.String title, double price) throws java.rmi.RemoteException {
    	BookBean book = new BookBean();
    	book.setId(id);
    	book.setTitle(title);
    	book.setPrice(price);
    	
        return book;
    }

}
