package br.com.codes.dao;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4022162753923779776L;

	private static SessionFactory sessionFactory = new Configuration()
			.configure().buildSessionFactory();
	private static ThreadLocal<Session> threadLocal = new ThreadLocal<Session>();

	public static Session getSession() {
		Session session = threadLocal.get();
		if (session == null) {
			session = sessionFactory.openSession();
			threadLocal.set(session);
		}
		return session;
	}

	public static void beginTransaction() {
		getSession().beginTransaction();
	}

	public static void commitTransaction() {
		getSession().getTransaction().commit();
	}

	public static void rollBackTransaction() {
		getSession().getTransaction().rollback();
	}

	public static void closeSession() {
		getSession().close();
	}
}
