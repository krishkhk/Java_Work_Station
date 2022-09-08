package com.springboot.unitTest.Service;

import java.util.List;
import java.util.Optional;

import com.springboot.unitTest.Entity.Employee;

public interface EmployeService {
	
	
	 Employee saveEmployee(Employee employee);
	    List<Employee> getAllEmployees();
	    Optional<Employee> getEmployeeById(long id);
	    Employee updateEmployee(Employee updatedEmployee);
	    void deleteEmployee(long id);

}
