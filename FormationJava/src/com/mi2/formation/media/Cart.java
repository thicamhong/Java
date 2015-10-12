package com.mi2.formation.media;

import java.util.ArrayList;
import java.util.List;

/*
 * Class to manage the cart
 */
public class Cart
{

	private List<Media> medias = new ArrayList<Media>();
	
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
	
	

}
