<%@page import="java.util.List"%>
<%@page import="com.te.studentmanag.beans.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include file="navigation.jsp"%>

<%
List<Student> studentList = (List<Student>) request.getAttribute("details");
String errorDetailsMsg = (String) request.getAttribute("errorDetails");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">
table {
	border: 2px solid blue;
	margin: auto;
}

td {
	padding: 10px;
	text-align: center;
}

.table-heading {
	color: white;
	background-color: black;
	font-weight: bold;
}
</style>
</head>
<body>

	<%
	if (errorDetailsMsg != null && !errorDetailsMsg.isEmpty()) {
	%>

	<p><%=errorDetailsMsg%>
	</p>




	<%
	}
	%>
	<table>
		<tr class="table-heading">
			<td>id</td>
			<td>name</td>
			<td>email</td>
		</tr>
		<%
		for (Student data : studentList) {
		%>


		<tr>
			<td><%=data.getSId()%></td>
			<td><%=data.getName()%></td>
			<td><%=data.getEmail()%></td>
		</tr>





		<%
		}
		%>
	</table>
</body>
</html>