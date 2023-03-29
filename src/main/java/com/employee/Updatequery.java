package com.employee;

import java.util.Iterator;
import java.util.List;

import javax.persistence.Parameter;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Updatequery {

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
				//retrieve record
				
			
				Query<EmployeeEx> query=session.createQuery("update EmployeeEx set ename=:n where id=:i ");
			
				query.setParameter("n", "SUZUKA");
				 query.setParameter("i",2);
				 
				 int status=query.executeUpdate();
				 System.out.println(status);
				 
//				 Query<EmployeeEx> query1=session.createQuery("from EmployeeEx");
//				List<EmployeeEx> lst=query1.list();
//				System.out.println(lst);
//				
//				//iterate using iterator
//				Iterator<EmployeeEx> it=lst.iterator();
//				System.out.println("Sid\tsname\tsfees");
//				while(it.hasNext()) {
//					EmployeeEx s=it.next();
//					System.out.println(s.id+"\t"+s.ename+"\t"+s.salary);
//				}


	}

}
