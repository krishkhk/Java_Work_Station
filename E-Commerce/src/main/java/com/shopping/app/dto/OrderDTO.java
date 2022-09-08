package com.shopping.app.dto;

import java.util.List;

import com.shopping.app.entity.Carts;

public class OrderDTO {
	
	private String orderDescription;
	private List<Carts> cartItems;
	private String email;
	private String fisrtname;
	
	public OrderDTO() {
		
	}

	public OrderDTO(String orderDescription, List<Carts> cartItems, String email, String fisrtname) {
		super();
		this.orderDescription = orderDescription;
		this.cartItems = cartItems;
		this.email = email;
		this.fisrtname = fisrtname;
	}

	public String getOrderDescription() {
		return orderDescription;
	}

	public void setOrderDescription(String orderDescription) {
		this.orderDescription = orderDescription;
	}

	public List<Carts> getCartItems() {
		return cartItems;
	}

	public void setCartItems(List<Carts> cartItems) {
		this.cartItems = cartItems;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFisrtname() {
		return fisrtname;
	}

	public void setFisrtname(String fisrtname) {
		this.fisrtname = fisrtname;
	}
	
	

}
