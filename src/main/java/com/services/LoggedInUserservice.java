package com.services;

import org.springframework.context.annotation.Scope;

import com.hibernate.mad.LoggedInUser;


public interface LoggedInUserservice   {
	    
	    String getusername();	  
	    void setUsername (String username);
	    long getUserId();
	    void serUserId(long id);
	    
}
