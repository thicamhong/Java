package com.m2i.formation.jsf.managedBeans;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

public class Test {


	public static void main(String[] args) throws ServiceException, RemoteException {
		HelloService service = new HelloServiceServiceLocator().getHelloService();
		
		String s = service.getHello();
		System.out.println(s);
		
		System.out.println("/**********Let's have the BookBean**********");
		BookBean book = service.getBook(1, "Orgueil et Prejuges", 5.5);
		System.out.println("Book.id = " + Integer.toString(book.getId()) + "\n");
		System.out.println("Book.titre = " + book.getTitle() + "\n");
		System.out.println("Book.price = " + Double.toString(book.getPrice()) + "\n");
		
		System.out.println("/**********Let's have the BookBean id=6**********");
		BookBean book2 = service.getById(2);
		System.out.println("Book.id = " + Integer.toString(book2.getId()) + "\n");
		System.out.println("Book.titre = " + book2.getTitle() + "\n");
		System.out.println("Book.price = " + Double.toString(book2.getPrice()) + "\n");
		System.out.println("Book.category = " + Integer.toString(book2.getCategory()) + "\n");
		
		

	}

}
