package com.spring;




import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class run {

	public static void main(String[] args) {
		
	ApplicationContext ctx=new ClassPathXmlApplicationContext("com\\spring\\sp.xml");
	College cg=(College)ctx.getBean("clg");
	cg.display();
	

	}

}
