package com.edu.HibernatePractice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertQuery {

	public static void main(String[] args) 
	{
		Configuration configuration=new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(Employee.class);
		
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		
		Session session=sessionFactory.openSession();
		
		Transaction transaction=session.beginTransaction();
		
		Employee employee=new Employee();
		employee.setEmployeeName("Dipali");
		employee.setEmployeeSalary(7896);
		
		session.save(employee);
		transaction.commit();
		session.close();
		
	}

}
