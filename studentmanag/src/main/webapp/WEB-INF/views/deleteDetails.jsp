<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include file="navigation.jsp"%>
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

	<p><%=msg%></p>


	<%
	}
	%>
	<%
	if (error != null && !error.isEmpty()) {
	%>

	<p><%=error%></p>


	<%
	}
	%>
	<form action="./delete" method="post">

		<table>
			<tr>
				<td>enter student id to delete</td>
				<td><input type="number" name="sId"></td>
			</tr>
		</table>
		<input type="submit" value="delete">

	</form>
</body>
</html>