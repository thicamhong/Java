package com.mi2.formation.media;

public class Dvd extends Media
{
	private int region;

	public Dvd()
	{
		// TODO Auto-generated constructor stub
	}


	public double getVATPrice()
	{
		return getPrice()*1.25;
	}

	
	public int getRegion()
	{
		return region;
	}

	public void setRegion(int region)
	{
		this.region = region;
	}
	
	

}
