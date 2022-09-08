package com.shopping.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.shopping.app.entity.Carts;
import com.shopping.app.entity.Orders;
import com.shopping.app.entity.Products;
import com.shopping.app.repo.OrderRepo;
import com.shopping.app.repo.ProductRepo;

public class OrderService {
	
	@Autowired
	private OrderRepo orderRepo;
	
	@Autowired
	private ProductRepo productRepo;

	
	public OrderService(OrderRepo orderRepo,ProductRepo productRepo) {
		this.orderRepo=orderRepo;
		this.productRepo=productRepo;
	}
	
	public Orders getOrderDeatil(int idorder) {
		Optional<Orders> orders=this.orderRepo.findById(idorder);
		return orders.isPresent()? orders.get():null;
	}
	
	public float getCartAmount(List<Carts> shoppingcartlist) {
		

        float totalCartAmount = 0f;
        float singleCartAmount = 0f;
        int availableQuantity = 0;
        
        for(Carts cart:shoppingcartlist) {
        	
        	int  productId=cart.getProductId();
        	Optional<Products> product=productRepo.findById(productId);
        	
        	if(product.isPresent()) {
        		Products products1=product.get();
        		if(products1.getAvailableQuantity()<cart.getQuantity()) {
        			
        			singleCartAmount=products1.getPrice()*products1.getAvailableQuantity();
        			cart.setQuantity(products1.getAvailableQuantity());
        		}else {
        			singleCartAmount=cart.getQuantity()*products1.getPrice();
        			availableQuantity=products1.getAvailableQuantity()-cart.getQuantity();
        		}
        		totalCartAmount=totalCartAmount+singleCartAmount;
        		products1.setAvailableQuantity(availableQuantity);
        		availableQuantity=0;
        		cart.setProductName(products1.getName());
        		
        		cart.setAmount(singleCartAmount);
        	
        		productRepo.save(products1);
        	}
        	
        }
        
        return totalCartAmount;
        
        
	}
	
	
	public Orders saveOrder(Orders order) {
		
		return orderRepo.save(order);
	}
	
}
