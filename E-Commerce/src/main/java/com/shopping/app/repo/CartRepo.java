package com.shopping.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopping.app.entity.Carts;

public interface CartRepo extends JpaRepository<Carts, Integer> {

}
