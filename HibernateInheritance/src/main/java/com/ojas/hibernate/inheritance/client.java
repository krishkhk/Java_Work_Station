package com.ojas.hibernate.inheritance;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.mysql.cj.xdevapi.SessionFactory;

public class client {
	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure();
		org.hibernate.SessionFactory sf = cfg.buildSessionFactory();
		Session s=sf.openSession();
		org.hibernate.Transaction tnx=s.beginTransaction();
		Employee e1=new Employee();
		e1.setName("hari");
		Regular_Employee e2=new Regular_Employee();
		e2.setName("krishna");
		e2.setSalary(15000);
		e2.setBonus(100);
		Contract_Employee e3=new Contract_Employee();
		e3.setName("Jhon");
		e3.setPay_per_hour(120);
		e3.setContract_duration("Ten Hours");
		
		s.persist(e1);

		s.persist(e2);
		s.persist(e3);
		
		tnx.commit();
		
		s.close();
	}
}
