package com.hibernate.crud;

import com.hibernate.mad.User;
import com.hibernate.mad.product;

public interface UserDaoInterface {
	public void addUser(User user);
	public void validate(String username,String password);
}
