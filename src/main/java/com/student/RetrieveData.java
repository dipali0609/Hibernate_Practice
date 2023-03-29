package com.student;



import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class RetrieveData {

	public static void main(String[] args) {
		//step 1
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		configuration.addAnnotatedClass(Student.class);
		
		//step 2
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		
		//Step 3
		Session session=sessionFactory.openSession();
		//step 4
		Transaction transaction =session.beginTransaction();
		//retrieve record
		
		//Query<Student> query=session.createQuery("from Student");
		Query<Student> query=session.createQuery("from Student");

		List<Student> lst=query.list();
		System.out.println(lst);
		
		//iterate using iterator
		Iterator<Student> it=lst.iterator();
		System.out.println("Sid\tsname\tsfees");
		while(it.hasNext()) {
			Student s=it.next();
			
			System.out.println(s.sid+"\t"+s.sname+"\t"+s.fees);
		}

	}

}