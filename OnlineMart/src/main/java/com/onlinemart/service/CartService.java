package com.onlinemart.service;

import java.util.List;

import com.onlinemart.dto.ProductDto;
import com.onlinemart.exceptions.CartException;
import com.onlinemart.exceptions.ProductException;
import com.onlinemart.login.LoginException;
import com.onlinemart.model.Cart;



public interface CartService {

	
	public Cart addProductToCart(Integer productId, int quantity,String key) throws CartException, LoginException, ProductException ;
	
	public List<ProductDto> removeProductFromCart(Integer productId,String key) throws CartException, ProductException, LoginException  ;
	
	public List<ProductDto> updateProductQuantity(Integer productId,Integer quantity,String key) throws CartException, LoginException, ProductException ;
	
	public Cart removeAllProducts(String key) throws CartException, LoginException ;
	
	public List<ProductDto> viewAllProducts(String key)  throws CartException, LoginException;
 
	

}
