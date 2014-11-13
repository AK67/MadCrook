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

<link href="/css/custom.css " rel="stylesheet">
<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap-theme.min.css">
<script src="//ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>

</head>
<body>

		<div class="custom-page-header" ><h1>JASON</h1> 
			  <small > ${pageSubHeading}</small>
			  
			<c:if test="${username != null}" >  
			<div style="float:right; margin-right: 4%;" >
			 <small >  ${username}</small>
			 <div class="btn-group" >
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
		      
		 </div>
<div class="container">
<div class="row"> 
