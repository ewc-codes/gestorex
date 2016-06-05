/**
 * 
 */
package br.com.codes.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;

/**
 * @author Michael
 *
 */
public abstract class GenericDAO<T, Id extends Serializable> implements
		GenericInterfaceDAO<T, Serializable> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2963531302960594069L;

	private Class<T> persistentClass;

	public GenericDAO(Class persistentClass) {
		super();
		this.persistentClass = persistentClass;
	}

	@Override
	public void beginTransaction() {
		HibernateUtil.beginTransaction();
	}

	@Override
	public void commitTransaction() {
		HibernateUtil.commitTransaction();
	}

	@Override
	public void save(T entity) {
		HibernateUtil.getSession().saveOrUpdate(entity);
	}

	@Override
	public void delete(T entity) {
		HibernateUtil.getSession().delete(entity);
	}

	@Override
	public List<T> findAll() {
		HibernateUtil.beginTransaction();
		Criteria criteria = HibernateUtil.getSession().createCriteria(
				persistentClass);
		return criteria.list();
	}

	public Class<T> getPersistentClass() {
		return persistentClass;
	}

	public void setPersistentClass(Class<T> persistentClass) {
		this.persistentClass = persistentClass;
	}

}
