package com.webservice.contorll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webservice.model.Employee;
import com.webservice.service.EmployeServiceImpl;

@RestController
public class Controller {
	@Autowired
	private EmployeServiceImpl empService;
	
	@GetMapping("/Employe")
	public List<Employee> getDetails(){
		
		List<Employee> viewList=empService.viewemployes();
	
		return viewList;
		
	}

}
