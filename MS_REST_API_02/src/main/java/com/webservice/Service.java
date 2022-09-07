package com.webservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service {
	
	@GetMapping("/hi/{name}")
	public String serviceHi(@PathVariable String name) {
		
		
		return "This is Microservice" +name;
		
	}

}
