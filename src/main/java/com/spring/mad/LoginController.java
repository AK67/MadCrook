package com.spring.mad;

import java.util.Enumeration;
import java.util.Iterator;

import javax.annotation.PreDestroy;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hibernate.mad.LoginUser;
import com.services.LoggedInUserservice;
import com.services.UserService;

@Controller
@RequestMapping("/login")

public class LoginController {
    

    private static Logger log = Logger.getLogger("loginController");
	@Autowired
	private UserService userService;
	@Autowired
	private LoggedInUserservice loggedInUserService;
    
	/////////////////////////////////////////    GET REQUEST /////////////////////////////////////
	 @RequestMapping(method = RequestMethod.GET)
	public String login(Model model)
	{     // check if user is already logged In
		   if(loggedInUserService.getusername()==null)
		   {        log.debug("get request");
		            log.debug("user not logged in");
					 model.addAttribute("pageSubHeading", "Login");
					 model.addAttribute("loginUser", new LoginUser());
					 
					 return "userLogin";
		   }
		   else
		   {  log.debug("user is logged in");
		      
			   return "welcomeUser";
		   }
	}
/////////////////////////////////////////    POST REQUEST /////////////////////////////////////
	 @RequestMapping(method = RequestMethod.POST)
		public String login(@Valid LoginUser loginuser,BindingResult result,Model model)
		{     
		  
		    
			if (result.hasErrors()) {
				return "userLogin";
			} else {	 
			    String username = loginuser.getUsername();
			    String password = loginuser.getPassword();
			   if(userService.validate(username, password)==true)
			   { return "redirect:welcome.htm";
			   }
			    
			   else
			   {model.addAttribute("pageSubHeading", "Login");
				   model.addAttribute("loginResult", "Wrong password");
			      
				   return "userLogin";
			   }
			  
			}
		
			 
		}
	 
	 @RequestMapping("/logout")
		public String logout(Model model,HttpServletRequest request)
		{    
		
		 request.getSession().invalidate();  
		 log.debug(loggedInUserService.getusername());
		 
		 return "hello";
		}
	 
	 @RequestMapping("/ni")
		public String land(Model model,HttpServletRequest request)
		{    
		
		 return "landingPage";
		}
}
