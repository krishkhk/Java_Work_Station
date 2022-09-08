package com.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Run {

	public static void main(String[] args) {
	BeanFactory factory=new XmlBeanFactory(new ClassPathResource("com\\spring\\configFile\\config.xml"));
	Student1 stu=(Student1)factory.getBean("st");
	stu.disply();
	

	}

}
