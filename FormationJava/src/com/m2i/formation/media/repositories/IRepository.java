package com.m2i.formation.media.repositories;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.m2i.formation.media.entities.Book;
import com.m2i.formation.media.entities.IEntity;
import com.m2i.formation.media.entities.MediaException;

public interface IRepository <T extends IEntity>
{
	String getUri();
	
	void setUri(String uri);
	
	List<T> getAll() throws IOException, MediaException, SQLException;
	
	T getById(int Id) throws IOException, MediaException, SQLException;
	
	List<T> getByPrice(double price) throws IOException, MediaException;
	
	List <T> getByTitle(String words) throws IOException, MediaException;
}
