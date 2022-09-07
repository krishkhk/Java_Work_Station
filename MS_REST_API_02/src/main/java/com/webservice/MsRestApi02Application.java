package com.webservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MsRestApi02Application {

	public static void main(String[] args) {
		SpringApplication.run(MsRestApi02Application.class, args);
	}

}
