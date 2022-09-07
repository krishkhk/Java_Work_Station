package com.jwtsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={
		"com.jwtsecurity.util.JwtUtil"})
public class SecurityJwtMySqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityJwtMySqlApplication.class, args);
	}

}
