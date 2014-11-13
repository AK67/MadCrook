package com.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hibernate.crud.ProductDao;
import com.hibernate.crud.UserDao;
import com.hibernate.mad.User;
import com.hibernate.mad.product;

@Service
public class UserServiceImp implements UserService{

	
	    @Autowired
		private UserDao userDao;
	    @Transactional
		public void addUser(User user) {
			userDao.addUser(user);
		}
		public boolean validate(String username, String password) {
			return userDao.validate(username,password);
		}
}
