package com.jwtsecurity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jwtsecurity.model.User;
import com.jwtsecurity.service.UserServiceImpl;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserServiceImpl service;
	
	@PostMapping("/save")
	public ResponseEntity<String> saveUser(@RequestBody User user) {

		Integer id = service.saveUser(user);

		String body = "User" + id + "saved!!!";

		// return new ResponseEntity<String>(body,HttpStatus.OK);

		return ResponseEntity.ok(body);

	}

}
