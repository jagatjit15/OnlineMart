package com.onlinemart.service;

import java.util.List;

import com.onlinemart.exceptions.ProductException;
import com.onlinemart.model.Product;



public interface ProductService {
	
	public List<Product> viewAllProducts() throws ProductException;
		
	public Product addProduct(Product product) throws ProductException;
	public Product updateProduct(Product product) throws ProductException;
	public Product viewProduct(Integer id) throws ProductException;
	public List<Product> viewProductByCategory(String cname) throws ProductException;
	public Product removeProduct(Integer pid)throws ProductException;

}
