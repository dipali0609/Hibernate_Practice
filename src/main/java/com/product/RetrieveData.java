package com.product;
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
		configuration.addAnnotatedClass(Product.class);
		
		//step 2
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		
		//Step 3
		Session session=sessionFactory.openSession();
		//step
		Transaction transaction =session.beginTransaction();
		//retrieve record
		
		Query<Product> query=session.createQuery("from Product");
		List<Product> lst=query.list();
		System.out.println(lst);
		
		//iterate using iterator
		Iterator<Product> it=lst.iterator();
		System.out.println("pid\tProductName\tsfees");
		while(it.hasNext()) {
			Product p=it.next();
			System.out.println(p.pid+"\t"+p.Pname+"\t"+p.Price);
		}

	}

}
