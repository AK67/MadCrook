<%@ include file="Headerglobal.jsp" %> 
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
 
<div class=".col-md-8"></div>
	<form:form commandName="loginUser" method="post"  action="" role="form" >
		<div align=center>  Nombre/naame: <form:input class="form-control"  path="username"/> </br>  <form:errors path="username" cssClass="alert alert-warning" /> </div>
		 </br>
		<div align=center> password: <form:input class="form-control" path="password"/> </br>  <form:errors path="password" cssClass="alert alert-warning" /> </div>
		 </br>
		<div align=center> <input class="btn btn-default" type="submit"/> </div>
	</form:form>


     <br>
                                              <!--  NOTIFY USER OF FAILED LOGIN ATTEMPT -->
          
           <c:if test="${loginResult != null}" >
           			   <div class="alert alert-danger" role="alert" style=" text-align: center">OOPS looks like you entered ${loginResult}</div>			 
		   </c:if> 
       
       </div> <!--  closing div of row --> 
       </div> <!--  closing div of container --> 
</body>
</html>