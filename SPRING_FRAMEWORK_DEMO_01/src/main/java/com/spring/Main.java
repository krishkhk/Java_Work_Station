package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	
	public static void main (String[] args){
		
		
	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
	
	User user=(User) context.getBean("getit");
	
	user.getName();
	user.getAge();
	user.getMobile();
	user.getAddress();
	
		
	}

}
