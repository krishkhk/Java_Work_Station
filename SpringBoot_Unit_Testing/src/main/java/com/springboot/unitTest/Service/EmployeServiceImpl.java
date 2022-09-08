package com.springboot.unitTest.Service;

import java.util.List;
import java.util.Optional;

import javax.management.AttributeNotFoundException;
import javax.management.relation.RoleInfoNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;

import com.springboot.unitTest.Entity.Employee;
import com.springboot.unitTest.Repo.EmployeRepo;

public class EmployeServiceImpl implements EmployeService {
	
	@Autowired
	private EmployeRepo empRepo;
	
	
	 public EmployeServiceImpl(EmployeRepo empRepo) {
	
		this.empRepo=empRepo;
	}
	 

	@Override
	public Employee saveEmployee(Employee employee) {
		
		Optional<Employee> savedEmployee = empRepo.findById(employee.getId());
		
		try {
			if(savedEmployee.isPresent()) {
				throw new AttributeNotFoundException("Employe Alreday exists with id " +employee.getId());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return empRepo.save(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		
	
		 
		
		return empRepo.findAll();
	}
	
	

	@Override
	public Optional<Employee> getEmployeeById(long id) {
		
		
		return empRepo.findById(id);
	}

	@Override
	public Employee updateEmployee(Employee updatedEmployee) {
		
		return  empRepo.save(updatedEmployee);
	}

	@Override
	public void deleteEmployee(long id) {
		
		empRepo.deleteById(id);
		
	}

}
