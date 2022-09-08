package com.shopping.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopping.app.entity.Orders;

public interface OrderRepo extends JpaRepository<Orders, Integer> {

}
