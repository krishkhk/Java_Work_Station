package com.spring.jdbc.bean;

import org.springframework.beans.factory.annotation.Autowired;


public class Employee {
	
	
	private int employeId;
	private String employeName;
	private double employeSal;

	public Employee(int employeId, String employeName, double employeSal) {
		super();
		this.employeId = employeId;
		this.employeName = employeName;
		this.employeSal = employeSal;
	}
	public int getEmployeId() {
		return employeId;
	}
	public void setEmployeId(int employeId) {
		this.employeId = employeId;
	}
	public String getEmployeName() {
		return employeName;
	}
	public void setEmployeName(String employeName) {
		this.employeName = employeName;
	}
	public double getEmployeSal() {
		return employeSal;
	}
	public void setEmployeSal(double employeSal) {
		this.employeSal = employeSal;
	}
	

}
