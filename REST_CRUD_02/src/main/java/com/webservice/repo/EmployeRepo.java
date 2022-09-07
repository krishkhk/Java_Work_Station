package com.webservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webservice.model.EmployeeEntity;


@Repository
public interface EmployeRepo extends JpaRepository<EmployeeEntity, Integer> {
	

}
