			                      /*
			                       *    Author      : Anubhav 
			                       *    file        : User.java 
			                       *    description : User entity having one to many relation with Post entity
			                       */

package com.hibernate.mad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.IndexColumn;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;



@Entity
@Table(name = "posts")
public class Post {

	
	@Id 
	@GeneratedValue
	@Column(name="post_id")
	private long post_id;
	
	@NotEmpty
	@Column(name="post_title")
	@Length(min = 5)
	private String postTitle;
	
	@NotEmpty
	@Column(name="post_content")
	@Length(min = 5)
	private String post_content;
	
	@ManyToOne
    @JoinColumn(name="iduser")
    private User user;
	
	public long getPost_id() {
		return post_id;
	}

	public void setPost_id(long post_id) {
		this.post_id = post_id;
	}
	
	public String getPostTitle() {
		return postTitle;
	}

	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}

	public String getPost_content() {
		return post_content;
	}

	public void setPost_content(String post_content) {
		this.post_content = post_content;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}


	
}
