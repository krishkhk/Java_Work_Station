package com.webservice.dao;

import java.util.List;

import com.webservice.model.Employee;

public interface EmployeeDao {
	
	public String AddDetails(int employeeid,String employename,String employeeaddress);
	public Employee findById(int employeeid);
	public List<Employee> findAll();
	public String update(int employeeid,String employename,String employeeaddress );
	
	public String delete(int employeeid);
	
	
	

}
