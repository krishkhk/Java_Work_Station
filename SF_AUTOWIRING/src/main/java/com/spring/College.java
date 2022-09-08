package com.spring;

import lombok.Data;
import lombok.Setter;

@Data
public class College {
	private String name;
	private Student student;
	
	
	public void display() {
		System.out.println("CollgeName     :"+name);
		System.out.println(student.getSno()+"\t"+student.getSname()+"\t"+student.getSadd());
	}

}
