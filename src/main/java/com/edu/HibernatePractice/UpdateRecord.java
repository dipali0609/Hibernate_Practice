package com.edu.HibernatePractice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class UpdateRecord {

	public static void main(String[] args) 
	{
		Configuration configuration=new Configuration();
		
		configuration.configure();
		
		configuration.addAnnotatedClass(Employee.class);
		
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		
		Session session=sessionFactory.openSession();
		
		Transaction transaction=session.beginTransaction();
		
		Query<Employee> query=session.createQuery("update Employee set employeeName=:n where employeeId=:i");
		
		query.setParameter("n","Prasad");
		query.setParameter("i",1);
		
		int k=query.executeUpdate();
		if(k>0)
		{
			System.out.println("Record Update");
		}
		else
		{
			System.out.println("Not updated");
		}
		
	}

}
