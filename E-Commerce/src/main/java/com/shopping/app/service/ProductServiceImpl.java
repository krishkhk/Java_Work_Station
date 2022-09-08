package com.shopping.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.app.entity.Products;
import com.shopping.app.repo.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepo productRepo;
	
	
	
	public ProductServiceImpl(ProductRepo productRepo) {
		this.productRepo=productRepo;
	}
	
	

	@Override
	public List<Products> products() {
		
		return this.productRepo.findAll();
	}

	@Override
	public String addProduct(Products product) {
		String result;
		Products productss=productRepo.save(product);
		
		if(productss!=null) {
			result="Data Inserted!!!";
		}else {
			result=" Data Not Inserted !!";
		}
		return result;
	}



	@Override
	public Products getId(Integer idproduct) {
		return productRepo.findById(idproduct).get();
	}

	
	
	public void delete(Integer idproduct) {
		
		 productRepo.deleteById(idproduct);
		
	}



	@Override
	public void updateProduct(Integer idproduct, Products product) {
	
		Products prd=productRepo.findById(idproduct).get();
		
		prd.setName(product.getName());
		prd.setDescription(product.getDescription());
		prd.setPrice(product.getPrice());
		prd.setProductName(product.getProductName());
		prd.setAvailableQuantity(product.getAvailableQuantity());
		
		productRepo.save(prd);
		
	}



	



	

	
	

}
