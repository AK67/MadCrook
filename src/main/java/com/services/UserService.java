package com.services;


import com.hibernate.mad.User;



public interface UserService {

	
	public void addUser(User appuser) ;
    public boolean validate(String username, String password);
}
