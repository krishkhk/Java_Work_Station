package com.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class Test {

	public static void main(String[] args) {

		BeanFactory factory = new XmlBeanFactory(new FileSystemResource(
				"C:\\Users\\hk21398\\Documents\\New folder\\SpringFrameWork\\SF_Spring_Core_01\\src\\main\\java\\com\\spring\\config\\config.xml"));
		Object obj = factory.getBean("st");
		Student stu = (Student) obj;
		System.out.println(stu.getStudent_Id());
		System.out.println(stu.getStudent_name());
		System.out.println(stu.getAddress());
	}

}
