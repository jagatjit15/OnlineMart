package com.onlinemart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onlinemart.model.Cart;
import com.onlinemart.model.Customer;



public interface CartDao extends JpaRepository<Cart, Integer> {

	public Cart findByCustomer(Customer customer);
	
}
