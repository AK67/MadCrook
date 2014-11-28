 <!--                    Author : Anubhav Kaushik	
                         file   : HeaderGlobal.jsp
                         Description : 11/20/2014 Provides with the header of the page and provides the sttings menu to loggedInUser
                                       Just pass the PageSubHeading parameter in your controller to display the subheading of the 
                                       particular view.
                         Instructions : Do not start html, head, body, container, row in the file that includes it. 
 
 
 -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Jason</title>
	<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css">

<link href="resc/css/globalHeader.css" rel="stylesheet">
<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap-theme.min.css">
<script src="//ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>

</head>
<body>

		<table width="100%">
			<tr >
			  <td width="90%">
		 		 <h1>JASON</h1> 
		    	 <small > ${pageSubHeading}</small>
		 	 </td>
		 	 <td width="10%">	 	  
					<c:if test="${username != null}" >  
					<div >
						 <small >  ${username}</small>
						 <div class="btn-group"  >
							  <div class="btn-group">
								    <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown">
								        <span class='glyphicon glyphicon-off'></span>
							
								    </button>
								    <ul class="dropdown-menu" role="menu" >
								      <li><a href="/MadCrook/login/logout.htm">logout</a></li>
								      <li><a href="#">settings</a></li>
								    </ul>
							  </div>
						</div>
					</div>
				     </c:if>
			  </td>   
		     <tr> 
		 </table>     
		     
		
<div class="container">
<div class="row"> 
