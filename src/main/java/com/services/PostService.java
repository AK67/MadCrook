package com.services;

import java.util.List;

import com.hibernate.mad.Post;

public interface PostService {

	public void addPost(Post post) ;
	// returns list of posts order by time 
	public List<Post> getPostsByUserId(Long id );
}
