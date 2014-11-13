package com.spring.mad;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hibernate.mad.product;
import com.services.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
       private static Logger log = Logger.getLogger("deadpool");
	@Autowired
    private ProductService prodService;
	private List <product> pageinatedList;
	
	
	 @RequestMapping(method = RequestMethod.GET)
	 public String AllProducts(Model model,HttpServletRequest request)
	 {    int pageNum =0;
		  String pageNumString = request.getParameter("pageNum");
		  if(!pageNumString.isEmpty())
		  {
			  pageNum=Integer.parseInt(pageNumString) ;
		  }		  
	      List <product> prodlist =   prodService.allProducts();
	      pageinatedList =new ArrayList<product>();
	      for(int i=pageNum ; i<pageNum+5;i++)
	      {   log.debug(pageNum);
	          log.debug(prodlist.get(pageNum).getName());
	          product p = prodlist.get(pageNum);
	    	  pageinatedList.add(p);	    	  
	      }
	      model.addAttribute("prodlist", pageinatedList);	      
		  return "allproduct";
	 }	  
	 //////////////////              GET REQUEST                  ///////////////////
	  @RequestMapping(value="/new",method = RequestMethod.GET)
	public String addProducts (Model model)
	{         log.debug("sad");
	  model.addAttribute("prod", new product());
	  return "newProduct";	
	}	  
	///////////////                 POST REQUEST         //////////////////////////
	  @RequestMapping( value = "/new", method = RequestMethod.POST)
		public String insertProducts (@Valid product prod,BindingResult result,ModelMap modelMap)
		{        
		   log.debug(prod.getName());
		    
		  if (result.hasErrors()) {
			    log.debug("Error occured during insertion of product through hibernate");
			    modelMap.put(BindingResult.class.getName() + ".prod", result);
			
				return "newProduct";
			} else {	 
				 log.debug("post called in newProduct");
			   //  prodService.addProduct(prod);
				return "allproduct";
			}		       
		}  
}
