package com.shopping.app.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.app.entity.Products;
import com.shopping.app.service.ProductService;
import com.shopping.app.service.ProductServiceImpl;

//GET PRODUCTS        -->  http://localhost:8080/product/getProducts
//POST CREATE PRODUCT -->  http://localhost:8080/product/addProduct
//PUT Update By ID    -->  http://localhost:8080/product/update/7
//GET PRODUCT BY ID   -->  http://localhost:8080/product/getProduct/8
//DELETE DELET ID     -->  http://localhost:8080/product/delete/12


@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private ProductServiceImpl productImpl;
	
	@PostMapping("/addProduct")
	public String addProduct(@RequestBody Products product) {
		
		String s=productImpl.addProduct(product);
		
		return s;
	
	}
	
	
	@GetMapping("/getProducts")
	public ResponseEntity<List<Products>> getAllProducts() {
		
		List<Products> productList=productImpl.products();
		
		return ResponseEntity.ok(productList);
		
	}
	
	@GetMapping("/getProduct/{idproduct}")
	public ResponseEntity<Products> getProduct(@PathVariable Integer idproduct){
		
		try {
			Products product=productImpl.getId(idproduct);
			
			return new ResponseEntity<Products>(product,HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<Products>(HttpStatus.NO_CONTENT);
		}
		
	}
	
	
	@PutMapping("/update/{idproduct}")
	public ResponseEntity<Products> updateProduct(@PathVariable("idproduct") Integer idproduct,@RequestBody Products products){
		productService.updateProduct(idproduct, products);
		
		return new ResponseEntity<>(productService.getId(idproduct),HttpStatus.OK);
	}
	
	
	@DeleteMapping("/delete/{idproduct}")
	public void  delete(@PathVariable Integer idproduct) {
		
		productService.delete(idproduct);
		
	}

}
