package com.student;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class MainApp {

	public static void main(String[] args) {
		//step 1
	Configuration configuration = new Configuration();
	configuration.configure("hibernate.cfg.xml");
	configuration.addAnnotatedClass(Student.class);
	
	//step 2
	SessionFactory sessionFactory=configuration.buildSessionFactory();
	
	//Step 3
	Session session=sessionFactory.openSession();
	//step
	Transaction transaction =session.beginTransaction();
	
	Student student=new Student();//Transient
	//session.save(student);//persistent state
	
	session.save(student); //insert command
	//session.delete(student);//removed state
   	transaction.commit();
	
//	session.evict(student);//detach
     //student.setFees(9876);
	session.close();
	
	

    
	}

}