package br.com.codes.dao;

import java.io.Serializable;
import java.util.List;

public interface GenericInterfaceDAO <T, Id extends Serializable> {

	
	public void beginTransaction();
	
	public void commitTransaction();
	
	public void save(T entity);

	public void update(T entity);

	public T findById(Id id);

	public void delete(T entity);

	public List<T> findAll();

	public void deleteAll();


}
