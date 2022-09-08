package com.spring.dao;

import java.util.List;

import com.spring.jdbc.bean.Employee;

public interface employeDAO {
	public int Add(Employee employee);
	public int Update(int employeId,Employee employee);
	public int Delete(int employeId);
	public List AllEmployees();
	
	

}
