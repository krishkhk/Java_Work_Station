package com.ojas.hibernate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "customer")
public class customer {
	@Id
	@Column(name = "customerId")
	private int customerId;
	@Column(name = "customerName")
	private String customerName;
	@Column(name="customerMobile")
	private long customerMobile;
	@Column(name = "address")
	private String address;

	
	
	public customer(int customerId, String customerName, long customerMobile, String address) {
		
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerMobile = customerMobile;
		this.address = address;
		
	}


	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public long getCustomerMobile() {
		return customerMobile;
	}


	public void setCustomerMobile(long customerMobile) {
		this.customerMobile = customerMobile;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		address = address;
	}
	


	
	
	
	


	@Override
	public String toString() {
		return +customerId+"\t"+customerName+"\t"+customerMobile+"\t"+address;
	}


	customer(){
		
	}

}
