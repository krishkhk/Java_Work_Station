package com.spring.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import zipkin.server.EnableZipkinServer;





@SpringBootApplication
@EnableZipkinServer
public class SpringBootZipkinApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootZipkinApplication.class, args);
	}

}
