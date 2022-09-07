package com.webservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient("SERVICE-02")
public interface Helo {
	
	@GetMapping("/hi/{name}")
	public String invokeSayHello(@PathVariable("name") String name) ;
	

}
