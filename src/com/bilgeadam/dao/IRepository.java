package com.bilgeadam.dao;

import org.hibernate.Session;

import com.bilgeadam.util.HibernateUtil;

public interface IRepository <T>{
	
	public void create(T entity);
	public void update(long id,T entity);
	public void delete(long id);
	
	public T find(long id);
	
	default Session databaseConnection() {
		
		return HibernateUtil.getSessionFactory().openSession();
	}
		
		
	}


