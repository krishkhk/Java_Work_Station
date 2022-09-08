package com.ojas.hibernate;



import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg.configure();
	SessionFactory sf=cfg.buildSessionFactory();
	Session s=sf.openSession();
	Transaction tx=s.beginTransaction();
	
	Items i1=new Items();
	i1.setItem_name("books");
	i1.setItem_price(450);
	
	Items i2=new Items();
	i2.setItem_name("Pens");
	i2.setItem_price(500);
	
	List<Items> items = new ArrayList<Items>();
	items.add(i2);
	items.add(i1);
	
	customer c1=new customer();
	c1.setCustomer_name("steve");
	c1.setCustomer_city("HYD");
	c1.setItemss(items);
	
	customer c2=new customer();
	c2.setCustomer_name("jhon");
	c2.setCustomer_city("delhi");
	c2.setItemss(items);
	
	s.save(c1);
	s.save(c2);
	s.save(i2);
	s.save(i1);
	tx.commit();
	s.close();

	
	
	
	
	
	}

}
