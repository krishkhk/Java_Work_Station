package com.ojas.hibernate;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		org.hibernate.Transaction tx=s.beginTransaction();
		
		student s1=new student();
		s1.setStudent_name("Jhon");
		
		Address a1=new Address();
		a1.setAddress_city("hyd");
		a1.setAddress_state("telangana");
		a1.setStudent_id(s1);
		
		s.save(a1);
		s.save(s1);
		tx.commit();
		s.close();
	
		
	}

}
