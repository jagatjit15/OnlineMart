package com.onlinemart.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onlinemart.model.Customer;


@Repository
public interface CustomerDao extends JpaRepository<Customer, Integer> {

	public Optional<Customer> findByMobileNumber(String mobileNumber) ;
	
}
