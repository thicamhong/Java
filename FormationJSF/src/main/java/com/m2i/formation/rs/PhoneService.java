package com.m2i.formation.rs;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.m2i.formation.jsf.managedBeans.PhoneBean;


@Path("/phones")
public class PhoneService {

	@GET
	@Path("/hello")
	@Produces(MediaType.TEXT_PLAIN)
	public String getHello()
	{
		return "yahooooooo";
	}

	
	@GET
	@Path("/all")
	@Produces(MediaType.APPLICATION_JSON)
	public List<PhoneBean> getAll()
	{
		List<PhoneBean> phones = new ArrayList<PhoneBean>();
		
		//FAKE DATA : prises dans phones.json d'ANGULAR
		PhoneBean phone = new PhoneBean();
		phone.setAge(1);
		phone.setId("motorola-xoom-with-wi-fi");
		phone.setImageUrl("img/phones/motorola-xoom-with-wi-fi.0.jpg");
		phone.setName("Motorola XOOM\u2122 with Wi-Fi");
		phone.setSnippet("The Next, Next Generation\r\n\r\nExperience the future with Motorola XOOM with Wi-Fi, the world's first tablet powered by Android 3.0 (Honeycomb).");
		phones.add(phone);
		
		PhoneBean phone2 = new PhoneBean();
		phone2.setAge(2);
		phone2.setId("motorola-xoom");
		phone2.setImageUrl("img/phones/motorola-xoom.0.jpg");
		phone.setName("MOTOROLA XOOM\u2122");
		phone2.setSnippet("The Next, Next Generation\n\nExperience the future with MOTOROLA XOOM, the world's first tablet powered by Android 3.0 (Honeycomb).");
		phones.add(phone2);

		PhoneBean phone3 = new PhoneBean();
		phone3.setAge(3);
		phone3.setId("motorola-atrix-4g");
		phone3.setImageUrl("img/phones/motorola-atrix-4g.0.jpg");
		phone.setName("MOTOROLA ATRIX\u2122 4G");
		phone3.setSnippet("MOTOROLA ATRIX 4G the world's most powerful smartphone.");
		phones.add(phone3);

		PhoneBean phone4 = new PhoneBean();
		phone4.setAge(4);
		phone4.setId("dell-streak-7");
		phone3.setImageUrl("img/phones/dell-streak-7.0.jpg");
		phone.setName("Dell Streak 7");
		phone3.setSnippet("Introducing Dell\u2122 Streak 7. Share photos, videos and movies together. It\u2019s small enough to carry around, big enough to gather around.");
		phones.add(phone4);
		
		return phones;
	}

	
}
