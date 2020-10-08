package com.aula.prog.interfaces;

import java.io.Serializable;
import java.util.List;

public interface IGenericDao<T extends Serializable> {
	 
	T findOne(final long id);
	 
	List<T> findAll();
	 
	void save(final T entity);
	 
	void update(final T entity);
	 
	void delete(final T entity);
}