package com.AdminServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class MicroserviceAdminServer00Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceAdminServer00Application.class, args);
	}

}
