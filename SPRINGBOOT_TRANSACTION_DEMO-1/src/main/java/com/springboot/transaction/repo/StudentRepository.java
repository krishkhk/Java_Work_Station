package com.springboot.transaction.repo;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;


import com.springboot.transcation.model.Student;


@EnableJpaRepositories
public interface StudentRepository extends CrudRepository<Student, Integer> {

}
