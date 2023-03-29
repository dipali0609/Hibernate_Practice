package com.employee;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class MainApp {

	public static void main(String[] args) {
		//step 1
	Configuration configuration = new Configuration();
	configuration.configure("hibernate.cfg.xml");
	configuration.addAnnotatedClass(EmployeeEx.class);
	
	//step 2
	SessionFactory sessionFactory=configuration.buildSessionFactory();
	
	//Step 3
	Session session=sessionFactory.openSession();
	//step
	Transaction transaction =session.beginTransaction();
	
	EmployeeEx student=new EmployeeEx(7, "Ruchita",9874.7f);
	session.save(student); //insert commad
	transaction.commit();//permantely save
	
	
	
	session.close();//close
	
	

    
	}

}