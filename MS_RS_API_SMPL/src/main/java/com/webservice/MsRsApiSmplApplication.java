package com.webservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MsRsApiSmplApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsRsApiSmplApplication.class, args);
	}

}
