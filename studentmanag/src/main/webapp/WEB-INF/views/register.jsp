<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
	<%String msg=(String)request.getAttribute("msg");
	   String error=(String)request.getAttribute("error");
	   
	%>
	 <%@include file="navigation.jsp" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
   <%if(error!=null && !error.isEmpty()){ %>
        <h1><%=error %></h1>

     <%} %>
    <%if(msg!=null && !msg.isEmpty()){ %> 
     <h1><%=msg %></h1>
     
     <%} %>
	<form action="./register" method="post">
		<table>
			<tr>
				<td>enter your email</td>
				<td>
				<input type="email"	name="email">
					
          
          </td>
          
          </tr>
          <tr>
				<td>enter your password</td>
				<td>
				<input type="password" name="password">
					
          
          </td>
          
          </tr>
      
      
      </table>
       <input type="submit"  value="Create an account">
        <a href="./sendToLogin">Login</a>
   </form>

</body>
</html>