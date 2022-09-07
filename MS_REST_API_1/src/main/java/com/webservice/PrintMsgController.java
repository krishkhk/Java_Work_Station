package com.webservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrintMsgController {
	
	@Autowired(required = true)
	private Helo hello;
	
	@GetMapping("/hello/{name}")
	public String sayHello(@PathVariable String name) {
		
		String himsg="Hi";
		String hellomsg=hello.invokeSayHello(name);
		
		return himsg+"------------"+hellomsg;
	}

	
}
