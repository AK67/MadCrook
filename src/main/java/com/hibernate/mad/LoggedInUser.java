/*         Author : ANUBHAV KAUSHIK
 *         File : LoggeddInUser.java
 *         Descirption: 
 *         11/20/2014 : session level class to hold user info who  logged In.
 *         
 *         
 */

package com.hibernate.mad;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.ScopedProxyMode;
@Component
@Scope(value="session", proxyMode=ScopedProxyMode.TARGET_CLASS)
public class LoggedInUser {
	
	String username;
    long Id ;
	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}
