package com.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hibernate.crud.PostDao;
import com.hibernate.mad.Post;
import com.hibernate.mad.User;
@Service
public class PostServiceImpl implements PostService {
	 @Autowired
		private PostDao postdao;
	 @Transactional
	public void addPost(Post post) {
		postdao.addPost(post);		   
	}

}
