                      /*
                       *    Author      : Anubhav 
                       *    file        : User.java 
                       *    description : User entity having one to many relation with Post entity
                       */


package com.hibernate.mad;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.hibernate.mad.Post;

import org.hibernate.annotations.IndexColumn;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "user")
public class User {
	 /*     
	  *     @var posts : set of posts entity connected through iduser  column	       
	  */
	 @Id @GeneratedValue 
	 private long iduser;
	 
	 @NotEmpty @Column(unique = true)
	 String username; 
	 
     @NotEmpty
	 String password;
     
     @OneToMany(mappedBy = "user")  
     private List<Post> posts;  
     
     /////////////////////////////////////// GETTER SETTERS //////////////////////////////////////
     
    public long getIduser() {
 		return iduser;
 	}
 	public void setIduser(long iduser) {
 		this.iduser = iduser;
 	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
    public List<Post>  getPosts() {
		return posts;
	}
	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}
	
	
	
	@Override
	public String toString() {
	return "userController [username=" + username  + ", password=" + password + "]";
	}
  
}