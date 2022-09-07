package com.restAPI.model;

public class User {
	
	private Integer id;
	private String name;
	private Integer Mobile;
	private String Address;
	
	public User() {
		
	}

	public User(Integer id, String name, Integer mobile, String address) {
		super();
		this.id = id;
		this.name = name;
		Mobile = mobile;
		Address = address;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getMobile() {
		return Mobile;
	}

	public void setMobile(Integer mobile) {
		Mobile = mobile;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}
	
	

}
