package com.jwtsecurity.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.jwtsecurity.model.User;

@EnableJpaRepositories
public interface UserRepo extends JpaRepository<User, Integer> {

}
