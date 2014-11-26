                              /*
                               *  Author : Anubhav Kaushik	
                               *  File : LoginUser.java 
                               *  Description: this is just for defining validation while login ,this is not actually 
                               *  have any entry to database
                               */
                            		
    
package com.hibernate.mad;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;

@Component
public class LoginUser {
  
	@NotEmpty
	String username;
	@NotEmpty
	String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
