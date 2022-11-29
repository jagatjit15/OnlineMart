package com.onlinemart.service;

import com.onlinemart.login.CurrentUserSession;
import com.onlinemart.login.LoginException;
import com.onlinemart.model.Customer;

public interface CurrentUserSessionService {

	public CurrentUserSession getCurrentUserSession(String key) throws LoginException;
	
	public Integer getCurrentUserCustomerId(String key) throws LoginException;
	
	public Customer getCustomerDetails(String key) throws LoginException;
	
}
