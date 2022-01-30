<%@page import="com.te.studentmanag.beans.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%Student student=(Student)request.getAttribute("data"); %>
   <%@include file="navigation.jsp" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

   
    

    <%if(student!=null){ %>
       <h1>welcome <%=student.getEmail() %></h1>
        

  <%} %>
</body>
</html>