package com.webservice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webservice.model.Employee;
import com.webservice.model.EmployeeEntity;
import com.webservice.repo.EmployeRepo;

@Service
public class EmployeServiceImpl implements EmployeService {

	@Autowired
	private EmployeRepo emprepo;
	@Override
	public List<Employee> viewemployes() {
		
		List<EmployeeEntity> findAll = emprepo.findAll();
		List<Employee> viewRecords=new ArrayList<>();
		for(EmployeeEntity e:findAll) {
			
			Employee emp=new Employee();
			BeanUtils.copyProperties(e, emp);
			viewRecords.add(emp);
			
		}
	
		return viewRecords;
		
	}
	
	

}
