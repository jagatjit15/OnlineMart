package com.onlinemart.service;

import java.time.LocalDate;
import java.util.List;

import com.onlinemart.exceptions.AddressException;
import com.onlinemart.exceptions.CartException;
import com.onlinemart.exceptions.OrderException;
import com.onlinemart.login.LoginException;
import com.onlinemart.model.Orders;



public interface OrderService {

	
		public Orders addOrder(Orders order, String key) throws OrderException, CartException, LoginException;
		public Orders updateOrder(Orders order, String key) throws OrderException, LoginException;
		public Orders removeOrder(Integer oriderId, String key) throws OrderException;
		public Orders viewOrder(Integer orderId) throws OrderException;
		public List<Orders> viewAllOrdersByDate(LocalDate date) throws OrderException;
		public List<Orders> viewAllOrdersByLocation(String city) throws OrderException, AddressException;
		public List<Orders> viewAllOrdersByUserId(String userid) throws OrderException;

	
}
