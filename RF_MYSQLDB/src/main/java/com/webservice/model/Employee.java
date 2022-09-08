package com.webservice.model;

public class Employee {
	
	private int employeid;
	private String employename;
	private String employeaddress;
	
	
	public Employee(){
		
	}


	public Employee(int employeid, String employename, String employeaddress) {
		super();
		this.employeid = employeid;
		this.employename = employename;
		this.employeaddress = employeaddress;
	}


	@Override
	public String toString() {
		return employeid+"\t"+employename+"\t"+employeaddress;
	}
	
	
	
	

}
