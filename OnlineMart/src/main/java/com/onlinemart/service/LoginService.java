package com.onlinemart.service;

import com.onlinemart.exceptions.CustomerException;
import com.onlinemart.exceptions.UserException;
import com.onlinemart.login.CurrentUserSession;
import com.onlinemart.login.LoginException;
import com.onlinemart.model.User;

public interface LoginService {

public CurrentUserSession addUser(User user) throws UserException, CustomerException ;
	
	public User removeUser(User user,String key) throws UserException ;
	
	public User validateUser(User user,String key) throws UserException, LoginException ;
	
	public String signOut(String key) throws UserException, LoginException ;
	
}
