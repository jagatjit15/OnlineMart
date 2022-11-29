package com.onlinemart.controller;

import javax.validation.Valid;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.onlinemart.exceptions.CustomerException;
import com.onlinemart.exceptions.UserException;
import com.onlinemart.login.CurrentUserSession;
import com.onlinemart.login.LoginException;
import com.onlinemart.model.User;
import com.onlinemart.service.LoginService;



@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/users")
public class LoginController {
	
	
	@Autowired
	private LoginService loginService;
	
	@PostMapping("/login")
	public ResponseEntity<CurrentUserSession> addUser(@Valid @RequestBody User user) throws UserException, CustomerException {

		CurrentUserSession currentSession = loginService.addUser(user);
				
		return new ResponseEntity<CurrentUserSession>(currentSession,HttpStatus.CREATED) ;
	}
	
	@DeleteMapping("/logout")
	public ResponseEntity<String> logoutUser(@RequestParam String key) throws UserException, LoginException {

		String response = loginService.signOut(key);
		
		return new ResponseEntity<String>(response,HttpStatus.OK) ;
		
	}
	
	
}












