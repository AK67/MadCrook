package com.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.hibernate.mad.LoggedInUser;
@Service
public class LoggedInUserImp implements LoggedInUserservice {
	@Autowired
	private LoggedInUser loggedInUser ;
	

	public String getusername() {
	 return loggedInUser.getUsername();

	}

	public void setUsername(String username) {
		
		loggedInUser.setUsername(username);
	}


	
	
	

}
