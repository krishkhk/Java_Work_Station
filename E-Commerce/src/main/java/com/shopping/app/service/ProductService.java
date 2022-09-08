package com.shopping.app.service;

import java.util.List;

import com.shopping.app.entity.Products;



public interface ProductService {
	
	public String addProduct(Products product);

	public List<Products> products();
	
	public Products getId(Integer idproduct);
	
	public void  updateProduct(Integer idproduct ,Products product);
	
	public void delete(Integer idproduct);
	
	

}
