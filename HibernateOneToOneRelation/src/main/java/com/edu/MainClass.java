package com.edu;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class MainClass {

	public static void main(String[] args) {
		Laptop lob= new Laptop();
		lob.setLid(1);
		lob.setLname("Samsung");
		lob.setLprice(10000);
		
		Student sob= new Student();
		sob.setSid(1);
		sob.setSname("Shipra");
	      sob.setLp(lob);
		
		   Configuration conn=new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);	
	        ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(conn.getProperties()).buildServiceRegistry();
	        SessionFactory sf=conn.buildSessionFactory(reg);
	        Session sess=sf.openSession();
	       Transaction tx=sess.beginTransaction();
	        
	        sess.save(sob);
	        sess.save(lob);
	        tx.commit();
		
	}

}
