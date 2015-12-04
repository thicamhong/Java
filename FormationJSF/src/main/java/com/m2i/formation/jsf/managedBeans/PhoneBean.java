package com.m2i.formation.jsf.managedBeans;

import javax.annotation.Generated;
import javax.faces.bean.ManagedBean;

@Generated("org.jsonschema2pojo")
@ManagedBean(name="phoneBean")
public class PhoneBean implements java.io.Serializable 
{
	private int age;
	private String id;
	private String imageUrl;
	private String name;
	private String snippet;

	/**
	 * 
	 * @return The age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * 
	 * @param age
	 *            The age
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * 
	 * @return The id
	 */
	public String getId() {
		return id;
	}

	/**
	 * 
	 * @param id
	 *            The id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * 
	 * @return The imageUrl
	 */
	public String getImageUrl() {
		return imageUrl;
	}

	/**
	 * 
	 * @param imageUrl
	 *            The imageUrl
	 */
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	/**
	 * 
	 * @return The name
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param name
	 *            The name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @return The snippet
	 */
	public String getSnippet() {
		return snippet;
	}

	/**
	 * 
	 * @param snippet
	 *            The snippet
	 */
	public void setSnippet(String snippet) {
		this.snippet = snippet;
	}

}
