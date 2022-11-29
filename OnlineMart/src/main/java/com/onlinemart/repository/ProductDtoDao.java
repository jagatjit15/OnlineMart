package com.onlinemart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onlinemart.dto.ProductDto;


public interface ProductDtoDao extends JpaRepository<ProductDto, Integer> {

	
	
}
