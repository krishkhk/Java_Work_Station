package com.shopping.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;


import com.shopping.app.entity.Products;

public interface ProductRepo extends JpaRepository<Products	, Integer> {

	
}
