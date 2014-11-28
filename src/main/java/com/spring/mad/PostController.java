package com.spring.mad;

import java.util.List;

import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hibernate.mad.Post;
import com.hibernate.mad.User;
import com.services.LoggedInUserservice;
import com.services.PostService;
import com.services.UserService;
@Controller
@RequestMapping("/post")
public class PostController {
	 
	private static Logger log = Logger.getLogger("PostController");
	@Autowired
	private PostService postservice;
	@Autowired
	private LoggedInUserservice loggedInUserService;
	
	////////////////////////post request for new Post////////////////////////////////////
	@RequestMapping(value="/new",method = RequestMethod.POST)
	public String addPost(@Valid Post post,BindingResult result,ModelMap modelMap)
	{   if (result.hasErrors()) {
		    log.debug("form errors");
		    return "newPost";		    		
		}
		else
		{	 
			postservice.addPost(post);
			log.debug("no form error ,pushed!");
			return null;
		}
	
	} 




/////////////////////// Get Request for new user /////////////////////////
	@RequestMapping(value="/new",method = RequestMethod.GET)
	public String newPost(Model model)
	{
		model.addAttribute("post", new Post());
		return "newPost";
	
	}
	/////////////////////////show post of a user by id ///////////////////////
	@RequestMapping(value="/show",method = RequestMethod.GET)
	public String showPosts(Model model)
	{   
		long loggedInUserId = loggedInUserService.getUserId();
		List<Post> posts = postservice.getPostsByUserId(loggedInUserId);
		model.addAttribute("posts", posts);
		model.addAttribute("pageSubHeading", "POSTS");
		return "showPosts";
	
	}
	
}
