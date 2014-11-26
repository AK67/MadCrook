package com.spring.mad;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.services.LoggedInUserservice;

@Controller
@RequestMapping("/welcome")
public class welcomeController {
	@Autowired
	private LoggedInUserservice loggedInUserService;
	private static Logger log = Logger.getLogger("welcomeController");
	
	     @RequestMapping(method = RequestMethod.GET)
		 public String welcome( Model model) {   
	    	 String username = loggedInUserService.getusername();
	    	 log.debug("username of scope session is ::"+username);
				model.addAttribute("loggedInUser", username);
				model.addAttribute("pageSubHeading", "Your Space");
				return "welcomeUser";
				
				
	 }
		
	     
}
