package com.shopping.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.app.entity.Customer;
import com.shopping.app.repo.CustomerRepo;




@Service
public class CustomerServiceImp implements CustomerService{
	@Autowired
	private CustomerRepo custRepo;
	

	
	public String saveCustomers(Customer customer) {

		String result;
		Customer cust=custRepo.save(customer);
		
		if(cust!=null) {
			result="Data Inserted!!!";
		}else {
			result=" Data Not Inserted !!";
		}
		return result;
	}

	
	public List<Customer> customers() {
		
		List<Customer> allCustomers=custRepo.findAll();
		
		return allCustomers;
	}
	
	/*
	 * public Long isCustomerPresent(Customer customer) {
	 * 
	 * Customer customer1=custRepo.findByemailAndusername(customer.getEmail(),
	 * customer.getUsername());
	 * 
	 * return customer1!=null?customer1.getIdCustomer():null;
	 * 
	 * }
	 */
}
