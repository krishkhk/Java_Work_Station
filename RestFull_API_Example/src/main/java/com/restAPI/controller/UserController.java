package com.restAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restAPI.model.User;
import com.restAPI.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userServ;
	
	@GetMapping(value="/users")
	public List<User> getAll(){
		
		List<User> users=userServ.findAll();
		
		return users;
		
		
	}
	
	

}
