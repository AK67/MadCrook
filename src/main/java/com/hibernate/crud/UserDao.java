package com.hibernate.crud;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hibernate.mad.User;
import com.services.LoggedInUserservice;
@Transactional
@Repository
public class UserDao {
	@Autowired
    private SessionFactory sessionFactory;
    

    @Autowired
	private LoggedInUserservice loggedInUserService;
   
  
    private static Logger log = Logger.getLogger("UserDao");
	public void addUser(User user) {
		
		
		sessionFactory.getCurrentSession().save(user);
	}
	public boolean validate(String username, String password) {
		log.debug("validate on user login called");
		
		Session session = sessionFactory.getCurrentSession();
		String hql = " FROM User  WHERE username = '"+username+"'";
		Query query = session.createQuery(hql);
		List<User> results = query.list();
		User user = results.get(0);
		String d_password = user.getPassword();
		log.debug("password from database is" + d_password);
		if (password.equals(d_password))
		{// nlm.provideLogedinUser().setTestunit("berzerk");
		loggedInUserService.setUsername("jack");
		log.debug("set username is "+loggedInUserService.getusername());
		 return true;
		}
		else
		{
		 return false;
		}
		
	}


}
