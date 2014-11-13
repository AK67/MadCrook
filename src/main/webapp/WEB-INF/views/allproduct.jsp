<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>All Products</title>
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
	<h1>estado/status :</h1>
	 </div> 
        
        <c:forEach items="${prodlist}" var="prod" varStatus="count">
        
							        <c:if test="${count.index%2==0}">
							                <c:set value="alert alert-success" var="tablecss"/>
							        </c:if>
									<c:if test="${count.index%2!=0}">
								     	     <c:set value="alert alert-info" var="tablecss"/>
								    </c:if>
			  
		     <table class="${tablecss}">  
			
				    <tr> 
				      <td>  <b> Product ID: <c:out value="${prod.id }"/></b></td>
				    </tr>    
				    <tr>
				        <td>Product Pass: <c:out value="${prod.name}"/></td> 
				    <tr>
				     </tr>
				     <tr>  
				        <td>Product Pass: <c:out value="${prod.price}"/></td>  
				    </tr>
		     </table>
		     	
		  
	     </c:forEach>
          
          <br> 
            <ul class="pagination">
			  <li><a href="#">&laquo;</a></li>
			  <li class="active"><a href="#"><%= request.getParameter("name") %></a></li>
			  <li class="disabled"><a href="#"><%= request.getParameter("pageNum")+1 %></a></li>
			  <li><a href="#"><%= request.getParameter("pageNum")+2 %></a></li>
			  <li><a href="#"><%= request.getParameter("pageNum")+3 %></a></li>
			  <li><a href="#"><%= request.getParameter("pageNum") +4%></a></li>
			  <li><a href="#">&raquo;</a></li>
			</ul>
          <br>
        <a href="product/new.htm" id="newProductReferer" ><h5 > Enter new Product</h5> </a> 
        
</body>
</html>