package com.onlinemart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onlinemart.model.Cart;



public interface CartRepository extends JpaRepository<Cart, Integer>{

    //List<Cart> findAllByUserOrderByCreatedDataDesc(User user);
}
