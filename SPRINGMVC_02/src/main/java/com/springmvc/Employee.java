package com.springmvc;

import lombok.Data;

@Data
public class Employee {
	private int employeId;
	private String employeName;
	private String employeAdd;
	private String gender;
	private String fromAdress;
	private String toAddress;
	private String[] departments;

}
