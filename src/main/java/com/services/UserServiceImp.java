package com.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hibernate.crud.UserDao;
import com.hibernate.mad.User;

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
		public User getUserbyId(long id) {
			return userDao.getUserById(id);
			
		}
}
