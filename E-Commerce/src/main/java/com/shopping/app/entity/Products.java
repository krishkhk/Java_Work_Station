package com.shopping.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="products",catalog = "shopping_cart_db")
public class Products {

	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="idproduct")
	private Integer idproduct;
	
	@Column(name="productName")
	private String productName;
	
	@Column(name="description")
	private String description;
	
	
	
	@Column(name="availableQuantity")
	private int availableQuantity;
	
	@Column(name="price")
	private float price;
	
	
	public Products() {
	}
	
	

	public Products(Integer idproduct, String description, String productName, int availableQuantity, float price) {
	
		this.idproduct = idproduct;
		this.description = description;
		this.productName = productName;
		this.availableQuantity = availableQuantity;
		this.price = price;
	}



	public int getId() {
		return idproduct;
	}

	public void setId(int id) {
		this.idproduct = id;
	}

	public String getName() {
		return description;
	}

	public void setName(String name) {
		this.description = name;
	}

	public int getAvailableQuantity() {
		return availableQuantity;
	}

	public void setAvailableQuantity(int availableQuantity) {
		this.availableQuantity = availableQuantity;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}


	
	
	public String getProductName() {
		return productName;
	}



	public void setProductName(String productName) {
		this.productName = productName;
	}

	


	public Integer getIdproduct() {
		return idproduct;
	}



	public void setIdproduct(Integer idproduct) {
		this.idproduct = idproduct;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	@Override
	public String toString() {
		return "Products [idproduct=" + idproduct + ", productName=" + productName + ", description=" + description
				+ ", availableQuantity=" + availableQuantity + ", price=" + price + "]";
	}



	public Products orElseThrow(Object object) {
		// TODO Auto-generated method stub
		return null;
	}



	
	
}
