package com.spring.mad;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.services.LoggedInUserservice;

@ControllerAdvice
public class globalController {
   
	 private static Logger log = Logger.getLogger("globalController");
	 
	 
	 @Autowired
	 private LoggedInUserservice loggedInUserService;
     private String username;
     
       @ModelAttribute("username")
	   public String setLoggedInUser(Model model)
	   { 
		    log.debug("i am runnnnninnggggggggggg!!!!!!!!!!");
		 
		username =loggedInUserService.getusername();
		
		return username;
	   } 
	
}
