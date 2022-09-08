package com.hiberbate;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Execute {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		Answers a1=new Answers();
		a1.setAnswer("Java is high level programming language");
		a1.setPostedby("suresh");

		Answers a2=new Answers();
		a2.setAnswer("Java is object oriented programming language");
		a2.setPostedby("Ramesh");
		
		Answers a3=new Answers();
		a3.setAnswer("Servlet is server side");
		a3.setPostedby("Rajesh");
		
		Answers a4=new Answers();
		a4.setAnswer("servlet is a interface");
		a4.setPostedby("jhon");
		ArrayList<Answers> list1=new ArrayList<Answers>();
		list1.add(a1);
		list1.add(a2);
		ArrayList<Answers> list2=new ArrayList<Answers>();
		list2.add(a3);
		list2.add(a4);
		questions q=new questions();
		q.setQuestion("what is java ?");
		q.setAnswers(list1);
		
		questions q1=new questions();
		q1.setQuestion("what is Servelet?");
		q1.setAnswers(list2);
		
		s.save(q);
		s.save(q1);
		tx.commit();

		s.close();
		
	}

}
