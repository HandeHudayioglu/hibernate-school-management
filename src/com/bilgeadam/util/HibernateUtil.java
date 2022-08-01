package com.bilgeadam.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.bilgeadam.entity.Course;
import com.bilgeadam.entity.CourseMaterial;
import com.bilgeadam.entity.Student;
import com.bilgeadam.entity.Teacher;

public class HibernateUtil {
	
	private static SessionFactory sessionFactory = SessionFactory();

	private static SessionFactory SessionFactory() {
		
		Configuration configuration = new Configuration();
		
		configuration.addAnnotatedClass(Student.class);
		configuration.addAnnotatedClass(Teacher.class);
		configuration.addAnnotatedClass(Course.class);
		configuration.addAnnotatedClass(CourseMaterial.class);
		
		
        SessionFactory factory = configuration.configure("hibernate.cfg.xml").buildSessionFactory();
		
		return factory;
	}
	
	public static SessionFactory getSessionFactory() {
		
		return sessionFactory;
	}
	

}
