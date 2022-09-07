package com.spring.security;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.ResponseBody;


@org.springframework.stereotype.Controller
public class Controller {

	@GetMapping("/login")

	public String sayhello() {

		return "welcome to the login page";
	}

}
