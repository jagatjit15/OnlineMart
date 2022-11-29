package com.onlinemart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.onlinemart.model.Cart;


public interface CartRepo extends JpaRepository<Cart, Integer>{
	
	@Query("select c from Cart c where c.customer.customerId=?1")
	public Cart getCart(Integer custId);

}
