package com.webservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Data
@Entity
@Table(name="EMPLOYEE")
public class EmployeeEntity {
	
	@Id
	@GenericGenerator(name="MyGenerator",strategy = "increment")
	@GeneratedValue(generator="increment",strategy=GenerationType.AUTO)
	
	@Column(name="EMPLOYEID")
	private int employeid;
	
	@Column(name="EMPLOYENAME")
	private String employename;
	
	@Column(name="EMPLOYEADDRESS")
	private String employeaddress;
	
	

}
