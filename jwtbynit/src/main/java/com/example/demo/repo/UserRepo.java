package com.example.demo.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Repository;

import com.example.demo.usermodal.UserModal;
@Repository
@EnableJpaRepositories
public interface UserRepo extends JpaRepository<UserModal, Integer> {
//OPtional user may be there may not be there
	Optional<UserModal> findByusername(String name);
}
