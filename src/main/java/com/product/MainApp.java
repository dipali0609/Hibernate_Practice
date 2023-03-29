package com.product;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class MainApp {

	public static void main(String[] args) {
		//step 1
	Configuration configuration = new Configuration();
	configuration.configure("hibernate.cfg.xml");
	configuration.addAnnotatedClass(Product.class);
	configuration.addAnnotatedClass(Customer.class);
	//step 2
	SessionFactory sessionFactory=configuration.buildSessionFactory();
	
	//Step 3
	Session session=sessionFactory.openSession();
	//step
	Transaction transaction =session.beginTransaction();
	
	Product  product=new Product(4,"watch",897.7f);
	session.save(product); //insert commad
	

	Customer customer=new Customer(3,"Dhanu","prasadd@gmail.com","Pune");
	session.save(customer); //insert commad
	
	transaction.commit();
	session.close();
	
	

    
	}

}