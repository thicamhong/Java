package com.m2i.formation.media.entities;

public interface IItem
{

	int getId();

	double getPrice();

	String getTitle();

	void setTitle(String title);

	void setId(int id);

	void setPrice(double price);

}