package com.m2i.formation.tests;


import org.junit.*;

import com.m2i.formation.media.entities.Book;
import com.m2i.formation.media.entities.Cd;
import com.m2i.formation.media.entities.Media;


public class EntitiesTest
{

	@Test
	public void test()
	{
		Book b = new Book();
		b.setId(3);
		Assert.assertEquals(3, b.getId());
	}

	@Test
	public void vatPriceTest()
	{
		Media m = new Cd();
		m.setPrice(10);
		Assert.assertEquals(10.5, m.getVATPrice(), 0.001);
	}

}
