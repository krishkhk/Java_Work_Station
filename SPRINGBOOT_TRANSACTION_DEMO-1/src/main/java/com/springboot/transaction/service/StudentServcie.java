package com.springboot.transaction.service;

import java.util.List;

import com.springboot.transcation.model.Student;

public interface StudentServcie {

	public List<Student> retrieve();
	public String insert(Student student);
	public String delete(int StudentId);
}
