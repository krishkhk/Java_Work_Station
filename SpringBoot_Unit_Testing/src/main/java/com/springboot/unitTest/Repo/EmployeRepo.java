package com.springboot.unitTest.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.unitTest.Entity.Employee;

public interface EmployeRepo extends JpaRepository<Employee, Long> {

}
