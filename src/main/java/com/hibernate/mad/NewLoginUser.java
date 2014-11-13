package com.hibernate.mad;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("session")
public class NewLoginUser {
 
	private String testunit;

	public String getTestunit() {
		return testunit;
	}

	public void setTestunit(String testunit) {
		this.testunit = testunit;
	}
	 
	
}
