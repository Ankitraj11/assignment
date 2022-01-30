<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	 <%@include file="navigation.jsp" %>   

<%
String msg = (String) request.getAttribute("msg");
String error = (String) request.getAttribute("error");
   
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

    
	<%
	if (msg != null && !msg.isEmpty()) {
	%>

	<h1><%=msg%></h1>

	<%
	}
	%>
	<%
	if (error != null && !error.isEmpty()) {
	%>

	<h1><%=error%></h1>

	<%
	}
	%>


	<form action="./add" method="post">

		<table>
			<tr>
				<td>enter your  name</td>
				<td><input type="text" name="name"></td>

			</tr>
			<tr>
				<td>enter your email</td>
				<td><input type="email" name="email"></td>

			</tr>
			<tr>
				<td>enter your password</td>
				<td><input type="password" name="password"></td>

			</tr>

		</table>
		<input type="submit" value="add student">
	</form>
    
</body>
</html>