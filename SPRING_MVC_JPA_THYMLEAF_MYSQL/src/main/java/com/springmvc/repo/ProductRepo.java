package com.springmvc.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springmvc.model.Product;

@Repository

public interface ProductRepo extends JpaRepository<Product, Long> {
	
	

}
