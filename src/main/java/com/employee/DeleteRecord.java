package com.employee;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class DeleteRecord {
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
				
			
				Query<EmployeeEx> query=session.createQuery("delete from EmployeeEx where id=:i ");
				 query.setParameter("i",6);
				 
				 int k=query.executeUpdate();
				 System.out.println(k);
				 if(k>0)
				 {
					 System.out.println("Record Is deleted");
				 }
				 else
				 {
					 System.out.println("Not deleted");
				 }
				 
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
