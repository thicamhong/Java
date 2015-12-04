package com.m2i.formation.jsf.maxService;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

public class Test {

	public static void main(String[] args) throws ServiceException, RemoteException {
		HelloService maxService = new HelloServiceServiceLocator().getHelloService();
		
		String s = maxService.getHello();
		System.out.println(s);
		
		System.out.println("/**********Let's have the BookBean**********");
		BookTO book = maxService.getBook(1, "Orgueil et Prejuges", 5.5);
		System.out.println("Book.id = " + Integer.toString(book.getId()) + "\n");
		System.out.println("Book.titre = " + book.getTitle() + "\n");
		System.out.println("Book.price = " + Double.toString(book.getPrice()) + "\n");
		
		System.out.println("/**********Let's have the BookBean id=4**********");
		BookTO book2 = maxService.getById(4);
		System.out.println("Book.id = " + Integer.toString(book2.getId()) + "\n");
		System.out.println("Book.titre = " + book2.getTitle() + "\n");
		System.out.println("Book.price = " + Double.toString(book2.getPrice()) + "\n");
		

	}

}
