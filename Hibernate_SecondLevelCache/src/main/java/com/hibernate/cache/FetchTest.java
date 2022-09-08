package com.hibernate.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.dialect.identity.SybaseAnywhereIdentityColumnSupport;

public class FetchTest {
	
	 StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
	    Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();  
	      
	    SessionFactory factory=meta.getSessionFactoryBuilder().build();  
	        
	    Session session1=factory.openSession();    
	    Employee emp1=(Employee)session1.load(Employee.class,121); 
	    
	  
	    
	      
	  
	    session1.close();   
	        
	    Session session2=factory.openSession();    
	    Employee emp2=(Employee)session2.load(Employee.class,121);    
	    System.out.print(emp2.getId()+" "+emp2.getName()+" "+emp2.getSalary());    
	    session2.close();    

}
