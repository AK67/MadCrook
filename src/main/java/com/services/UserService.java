package com.services;


import com.hibernate.mad.User;



public interface UserService {

	
	public void addUser(User appuser) ;
	public User getUserbyId(long id);
    public boolean validate(String username, String password);
}
