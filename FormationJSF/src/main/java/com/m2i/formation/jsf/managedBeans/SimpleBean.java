package com.m2i.formation.jsf.managedBeans;

import javax.faces.bean.ManagedBean;

// Avec @ManagedBean, on sous-traite a JSF la factory de cette classe cad que JSF va instancier cette classe
// Qd cela sera instanciee, le nom de l'instance ce sera name
// Qd on a fait ca, on a un controlleur. CAD que tout ce qui est public sera visible dans la VUE
// Ca rappelle furieusement ANGULAR : il ne voit que ce qui est this mais pas private
@ManagedBean(name="simpleBean")
public class SimpleBean {
	
	private int myInt;
	private String myString;
	

	public SimpleBean() {
		myInt = 3;
		myString = "Hello";
	}


	public int getMyInt() {
		return myInt;
	}


	public void setMyInt(int myInt) {
		this.myInt = myInt;
	}


	public String getMyString() {
		return myString;
	}


	public void setMyString(String myString) {
		this.myString = myString;
	}

	
	
}
