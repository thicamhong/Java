package com.m2i.formation.media.entities;

import java.util.ArrayList;
import java.util.List;

/*
 * Class to manage the cart
 */
public class Cart implements IEntity
{

	private List<Media> medias = new ArrayList<Media>();
	
	private int id;
	
	public Cart()
	{
		// TODO Auto-generated constructor stub
	}

	/**
	 * Return the VAT price of the cart by polymorphisme
	 * @return
	 */
	public double getVATPrice()
	{
		double vatPrice = 0;
		
		for(Media m:medias)
		{
			vatPrice += m.getVATPrice();
		}
		
		return vatPrice;		
	}
	
	
	public List<Media> getMedias()
	{
		return medias;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}
	
	

}
