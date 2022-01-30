<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%Integer id=(Integer)request.getAttribute("id");
       String msg=(String)request.getAttribute("msg");
       String errorMsg=(String)request.getAttribute("error");%>
        <%@include file="navigation.jsp" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <%if(msg!=null && !msg.isEmpty()){ %>
      
      <h1><%=msg %></h1>

<%} %>
     <%if(errorMsg!=null && !errorMsg.isEmpty()){ %>
     
        <h1><%=errorMsg %></h1>
     <%} %>

  <form action="./update" method="post">
  <table>
  
     <tr>
     
       <td>
         enter your id
       </td>
        <td>
        <input type="number" value="<%=id %>" >
        </td>
     </tr>
      <tr>
     
       <td>
         enter your name
       </td>
        <td>
        <input type="name" name="name" >
        </td>
     </tr>
      <tr>
     
       <td>
         enter your email
       </td>
        <td>
        <input type="email" name="email" >
        </td>
     </tr>
   <tr>
     
       <td>
         enter your password
       </td>
        <td>
        <input type="password" name="password" >
        </td>
     </tr>
  
  </table>
      <input type="submit" value="update your details">
  </form>


</body>
</html>