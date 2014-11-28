                                       /*
                                        *  Author : Anubhav Kaushik 
                                        *  File   : PostDao
                                        *  Description : adds a post in database mapped to logged In user 
                                        * 
                                        */

package com.hibernate.crud;

import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hibernate.mad.Post;
import com.hibernate.mad.User;
import com.services.LoggedInUserservice;
import com.services.UserService;

@Repository
@Transactional
public class PostDao {

	@Autowired
    private SessionFactory sessionFactory;
	@Autowired
	private LoggedInUserservice loggedInUserService;  
	@Autowired
	private UserService userService;
    private static Logger log = Logger.getLogger("PostDao"); 
    
     // add post methods gets the id of logged in user form session scoped class LoggedInUser 
     // then gets the user with that id from userdao and then sets that user for the post.
    
	public void addPost(Post post) {
		 log.debug("add method call to insert Post");
		 log.debug("value of title ::: "+ post.getPostTitle());
		 long id = loggedInUserService.getUserId();
		 User user = userService.getUserbyId(id);		 
		 post.setUser(user);
		 sessionFactory.getCurrentSession().save(post);
	}
	      
	// ordered by time desc
	public List<Post> getPostsByUserId(long iduser)
	{   
		 log.info("Getting posts of user with id::" + iduser);
		 Session session = sessionFactory.getCurrentSession();
		 String hql = "from Post where iduser = "+ iduser+" order by post_time";
		 Query query = session.createQuery(hql);
		 List<Post> posts = query.list();
		 return posts;
		
	}
	
}
