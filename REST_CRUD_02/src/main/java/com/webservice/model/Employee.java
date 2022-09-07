package com.webservice.model;

import lombok.Data;

@Data
public class Employee {
	
	private int employeid;
	private String employename;
	private String employeaddress;
	public int getEmployeid() {
		return employeid;
	}
	public void setEmployeid(int employeid) {
		this.employeid = employeid;
	}
	public String getEmployename() {
		return employename;
	}
	public void setEmployename(String employename) {
		this.employename = employename;
	}
	public String getEmployeaddress() {
		return employeaddress;
	}
	public void setEmployeaddress(String employeaddress) {
		this.employeaddress = employeaddress;
	}
	
	

}
