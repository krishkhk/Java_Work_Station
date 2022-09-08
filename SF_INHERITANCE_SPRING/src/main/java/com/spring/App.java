package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("com\\spring\\sf.xml");

		Employee em = (Employee) ctx.getBean("emp");
		Employee em1 = (Employee) ctx.getBean("emp1");
		Employee em2 = (Employee) ctx.getBean("emp2");
		em.display();
		em1.display();
		em2.display();
		
	}

}
