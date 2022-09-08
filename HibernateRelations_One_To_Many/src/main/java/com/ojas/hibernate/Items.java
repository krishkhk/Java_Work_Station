package com.ojas.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Items")
public class Items {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name="Item_id")
	private int Item_id;
	@Column(name="Item_name")
	private String Item_name;
	@Column(name="Item_price")
	private double Item_price;
	public int getItem_id() {
		return Item_id;
	}
	public void setItem_id(int item_id) {
		Item_id = item_id;
	}
	public String getItem_name() {
		return Item_name;
	}
	public void setItem_name(String item_name) {
		Item_name = item_name;
	}
	public double getItem_price() {
		return Item_price;
	}
	public void setItem_price(double item_price) {
		Item_price = item_price;
	}
	
	

}
