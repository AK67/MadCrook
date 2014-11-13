<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>New Product </title>
	
	<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap-theme.min.css">
<script src="//ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>

</head>

<body>

	<div class="page-header">
	  <h1>crear nuevo User </h1>
	</div>

	<form:form commandName="user" method="post"  action="" role="form" >
		<div align=center>  Nombre/naame: <form:input class="form-control"  path="username"/> </br>  <form:errors path="username" cssClass="alert alert-warning" /> </div>
		 </br>
		<div align=center> password: <form:input class="form-control" path="password"/> </br>  <form:errors path="password" cssClass="alert alert-warning" /> </div>
		 </br>
		<div align=center> <input class="btn btn-default" type="submit"/> </div>
	</form:form>

     <br>
 
    <div align=center> <a href="/../MadCrook/product.htm" >Show/mostrar/dhrashyati All/sarve/todos Products</a> </div>
  
</body>
</html>