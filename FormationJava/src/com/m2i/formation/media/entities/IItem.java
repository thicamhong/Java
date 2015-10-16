package com.m2i.formation.media.entities;

public interface IItem extends IEntity
{


	double getPrice();

	String getTitle();

	void setTitle(String title);

	void setPrice(double price);

}