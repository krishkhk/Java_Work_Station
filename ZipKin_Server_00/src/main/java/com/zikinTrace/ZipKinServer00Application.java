package com.zikinTrace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import zipkin2.server.internal.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class ZipKinServer00Application {

	public static void main(String[] args) {
		SpringApplication.run(ZipKinServer00Application.class, args);
	}

}
