package com.spring.mad;

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
import com.services.PostService;
import com.services.UserService;

@Controller
@RequestMapping("/user")
public class AppUserController { 
	 
	private static Logger log = Logger.getLogger("appUserController");
	
	@Autowired
	private UserService userService;
	
	 
////////////////////////post request for new user////////////////////////////////////
	@RequestMapping(value="/new",method = RequestMethod.POST)
	   public String addUser(@Valid User user,BindingResult result,ModelMap modelMap)
	   {	
			if (result.hasErrors()) {
				return "newUser";
			} else {	 
			    userService.addUser(user);
				return "userCreated";
			}	
	   } 
	   

/////////////////////// Get Request for new user /////////////////////////
	@RequestMapping(value="/new",method = RequestMethod.GET)
	   public String newUser(Model model)
	   {
		    model.addAttribute("user", new User());
		    
		return "newUser";
		   
	   }
	
	
	
}
