package com.shopping.app.service;

import java.util.List;

import com.shopping.app.entity.Customer;

public interface CustomerService {
	
	public String saveCustomers(Customer customer);
	public List<Customer> customers();

}
