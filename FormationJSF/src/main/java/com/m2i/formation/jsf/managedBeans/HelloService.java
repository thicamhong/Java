/**
 * HelloService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.m2i.formation.jsf.managedBeans;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface HelloService extends java.rmi.Remote {
	@WebMethod
    public java.lang.String getHello() throws java.rmi.RemoteException;
	@WebMethod
    public com.m2i.formation.jsf.managedBeans.BookBean getById(int id) throws java.rmi.RemoteException;
	@WebMethod
    public com.m2i.formation.jsf.managedBeans.BookBean getBook(int id, java.lang.String title, double price) throws java.rmi.RemoteException;
}
