package com.shopping.app.entity;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name="orders")
public class Orders {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idorder")
	private Integer idorder;
	
	
	@Column(name = "ordered_on")
	@UpdateTimestamp
	private LocalDate orderon;
	
	@Column(name = "status")
	private String status;
	
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name="idcustomer",referencedColumnName ="idorder" )
	private Customer customer;
	
	
	@OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL,targetEntity =Carts.class )
	@JoinColumn(name="idorder",referencedColumnName = "idorder")
	private List<Carts> cartItems;
	
	
	public Orders() {
		
	}

	public Orders(Integer idorder, Date ordered, String status, Customer customer, List<Carts> cartItems) {
	
		this.idorder = idorder;
		this.orderon = orderon;
		this.status = status;
		this.customer = customer;
		this.cartItems = cartItems;
	}

	public Integer getIdorder() {
		return idorder;
	}

	public void setIdorder(Integer idorder) {
		this.idorder = idorder;
	}

	public LocalDate getOrderon() {
		return orderon;
	}

	public void setOrdered(Date ordered) {
		this.orderon = orderon;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<Carts> getCartItems() {
		return cartItems;
	}

	public void setCartItems(List<Carts> cartItems) {
		this.cartItems = cartItems;
	}
	
	
	
	
	
	
	
	

}
