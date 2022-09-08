package com.spring.scopes;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class client {

	public static void main(String[] args) {
	BeanFactory factory=new XmlBeanFactory(new FileSystemResource("C:\\Users\\hk21398\\eclipse-workspace4\\SF_SPRING_SCOPES\\src\\main\\resources\\spring.xml"));
	springBean obj1=(springBean)factory.getBean("sb");
	springBean obj2=(springBean)factory.getBean("sb");
	System.out.println(obj1);
	System.out.println(obj2);

	}

}
