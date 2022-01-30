<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
String error = (String) request.getAttribute("error");
String logOutMsg=(String)request.getAttribute("msg");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	if (error != null && !error.isEmpty()) {
	%>
	<h1><%=error%></h1>


	<%
	}
	%>
	
	<%if(logOutMsg!=null && !logOutMsg.isEmpty()){ %>
	    <h1><%=logOutMsg %></h1>
	
	
	<%} %>
	<form action="./login" method="post">
		<table>
			<tr>
				<td>enter your id</td>
				<td><input type="number" name="id"></td>
			</tr>
			<tr>
				<td>enter your password</td>
				<td><input type="password" name="password"></td>
			</tr>



		</table>
		<input type="submit" value="login">
		<a href="./register">Create an account</a>
	</form>

</body>
</html>