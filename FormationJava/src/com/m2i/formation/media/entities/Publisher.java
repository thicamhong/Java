package com.m2i.formation.media.entities;

public class Publisher
{
	private String name; 
	private int siret;
	private String webSite;
	private String phoneStandard;
	private String mailStandard;
	
	
	public String toString()
	{
		String myPublisher = "\t Information on the publisher :\n";
		myPublisher += "\t\t Name\t: " + name + "\n";
		myPublisher += "\t\t SIRET\t: " + siret + "\n";
		myPublisher += "\t\t WebSite\t: " + webSite + "\n";
		myPublisher += "\t\t Phone Standard\t: " + phoneStandard + "\n";
		myPublisher +="\t\t Mail Standard\t: " + mailStandard + "\n";
		
		return myPublisher;
	}

	public Publisher()
	{
		// TODO Auto-generated constructor stub
	}

	public String getName()
	{
		return name;
	}

	public int getSiret()
	{
		return siret;
	}

	public String getWebSite()
	{
		return webSite;
	}

	public String getPhoneStandard()
	{
		return phoneStandard;
	}

	public String getMailStandard()
	{
		return mailStandard;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setSiret(int siret)
	{
		this.siret = siret;
	}

	public void setWebSite(String webSite)
	{
		this.webSite = webSite;
	}

	public void setPhoneStandard(String phoneStandard)
	{
		this.phoneStandard = phoneStandard;
	}

	public void setMailStandard(String mailStandard)
	{
		this.mailStandard = mailStandard;
	}

	
}
