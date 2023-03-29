package com.edu.HibernatePractice;

import java.util.Iterator;
import java.util.List;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RetrivedData {

	public static void main(String[] args) 
	{
		
		Configuration configuration=new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(Employee.class);
		
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		
		Session session=sessionFactory.openSession();
		
		Transaction transaction=session.beginTransaction();
		
//        Query<Employee> query=session.createQuery("from Employee");
//        List<Employee> list1=query.list();
//        
//        System.out.println(list1);
        
		//Query<Student> query=session.createQuery("from Student");
				Query<Employee> query=session.createQuery("from Employee");

				List<Employee> lst=query.list();
				System.out.println(lst);
				
				//iterate using iterator
				Iterator<Employee> it=lst.iterator();
				System.out.println("Sid\tsname\tsfees");
				while(it.hasNext()) {
					Employee e=it.next();
					
//					System.out.println(e.employeeId+"\t"+e.employeeName+"\t"+e.employeeSalary);
					System.out.println(e.getEmployeeId()+"\t"+e.getEmployeeName()+"\t"+e.getEmployeeSalary());
					
				}
	}

}
