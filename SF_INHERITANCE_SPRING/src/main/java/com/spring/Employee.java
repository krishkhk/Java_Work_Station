package com.spring;

import lombok.Data;

@Data
public class Employee {
	private int employeNo;
	private String empName;
	private double empSal;
	private String empRole;
	private String empCity;
	
	public void display() {
		
		System.out.println(employeNo+"\t"+empName+"\t"+empSal+"\t"+empRole+"\t"+empCity);
	}
	

}
