package com.hib;

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
	Employee1 e1 =new Employee1();
	e1.setName("Steve");
	Regular_Employee e2 = new Regular_Employee();
	e2.setName("Jhon");
	e2.setSalary(10000);
	e2.setBonus(5000);
	
	Contract_Employee e3 = new Contract_Employee();
	e3.setName("krishna");
	e3.setPay_per_hour(1000);
	e3.setContract_duration("150 Hours");
	
	s.persist(e1);
	s.persist(e2);
	s.persist(e3);
	
	tx.commit();
	s.close();
	
	
	

	}

}
