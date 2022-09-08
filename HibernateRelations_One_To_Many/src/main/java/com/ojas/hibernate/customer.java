package com.ojas.hibernate;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.ValueGenerationType;

@Entity
@Table(name="customer")
public class customer {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name="customer_id")
	private int customer_id;
	@Column(name="customer_name")
	private String customer_name;
	@Column(name="customer_city")
	private String customer_city;
	
	@OneToMany(cascade =CascadeType.ALL)
	@JoinColumn(name="customer_id",referencedColumnName = "customer_id")
	private List<Items> itemss;
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getCustomer_city() {
		return customer_city;
	}
	public void setCustomer_city(String customer_city) {
		this.customer_city = customer_city;
		
	}
	public List<Items> getItemss() {
		return itemss;
	}
	public void setItemss(List<Items> itemss) {
		this.itemss = itemss;
	}
	
	
	
	
	

}
