package com.student;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Aggregatefunction {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		configuration.addAnnotatedClass(Student.class);
		
		//step 2
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		
		//Step 3
		Session session=sessionFactory.openSession();
		//step
		Transaction transaction =session.beginTransaction();
		//retrieve record
		
//	    Query<Student> q=session.createQuery("select sum(fees) from Student");
//	    List<Student> list=q.list();
//	    System.out.println(list.get(0));
	    
//	    Query<Student> q=session.createQuery("select MAX(fees) from Student");
//	    List<Student> list=q.list();
//	    System.out.println(list.get(0));
	    

//	    Query<Student> q=session.createQuery("select MIN(fees) from Student");
//	    List<Student> list=q.list();
//	    System.out.println(list.get(0));
	    

	    Query<Student> q=session.createQuery("select COUNT(sid) from Student");
	    List<Student> list=q.list();
	    System.out.println(list.get(0));

	}

}
