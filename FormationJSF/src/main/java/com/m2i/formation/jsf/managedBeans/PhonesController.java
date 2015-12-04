package com.m2i.formation.jsf.managedBeans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;


@ManagedBean(name="phonesController")
public class PhonesController {

	private List<PhoneBean> phones = new ArrayList<PhoneBean>();
	
	public PhonesController() {
		// TODO Auto-generated constructor stub
	}
	
	
	public List<PhoneBean> getPhones() {
		return phones;
	}


	public void setBooks(List<PhoneBean> phones) {
		this.phones = phones;
	}


	public String getAllPhones()
	{
		// FAKE DATA
		return BookControllerEnum.showBooks.toString();
	}

}
