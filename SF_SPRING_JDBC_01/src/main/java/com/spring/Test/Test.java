package com.spring.Test;

import java.util.List;

import java.util.Map;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.dao.employeeDaoImpl;
import com.spring.jdbc.bean.Employee;

public class Test {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter empid");
		int empid=sc.nextInt();
		System.out.println("enter empname");
		String empname=sc.next();
		System.out.println("enter empsal");
		int empsal=sc.nextInt();
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com\\spring\\config\\spring.xml");
	employeeDaoImpl emp=(employeeDaoImpl)ctx.getBean("empdao");
	 
	//Insert Values 
 
	/*
	 * System.out.println("Enter Employe ID"); int employeId =sc.nextInt();
	 * System.out.println("Empolye name"); String employeName=sc.next();
	 * System.out.println(" Employe Sal"); double employeSal =sc.nextInt();
	 */
   
  Employee em = new Employee(empid,empname,empsal);
       em.setEmployeId(empid);
       em.setEmployeName("empname");
       em.setEmployeSal(empsal);
       int count=emp.Add(em);
       if(count!=0) {
    	   System.out.println("Data inserted Successfully!!");
    	
       }else {
    	   System.out.println("Data Not Inserted");
       }
       System.out.println("-----After Inserting------- ");
       
     //List all Employees
		 
		  List<Map>AllEmployees1=emp.AllEmployees();
		  for(Map m: AllEmployees1) {
		  System.out.println(m.get("employeId")+"\t"+m.get("employeName")+"\t"+m.get(
		  "employeSal")); }
    
		
		//delete Employee using Id 
       
		 int op=emp.Delete(1012);
		 if(op!=0) {
			 System.out.println("Deleted Successfully!!");
		 }else {
			 System.out.println("Not deleted");
		 }
		 
		 System.out.println("-------after Delete------");
		 //List all Employees
		 
		  List<Map>AllEmployees=emp.AllEmployees();
		  for(Map m: AllEmployees) {
		  System.out.println(m.get("employeId")+"\t"+m.get("employeName")+"\t"+m.get(
		  "employeSal")); }
		/*
		 * Employee em1 = new Employee(); em1.setEmployeId(21398);
		 * em1.setEmployeName("jh"); em1.setEmployeSal(10000);
		 * 
		 * int up=emp.Update(21398,em1); if(up!=0) { System.out.println("updated");
		 * }else { System.out.println("Not updated"); }
		 */
       
	}
	
	

}
