<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
  <style type="text/css">
  
  .logout{
      float: right;
  }
  
  .navbar{
      background-color: black;
      color: white;
      font-weight: bold;
  
  }
    
      a{
       color:white;
       font-weight:bold;
        text-decoration: none;
      }
      li {
	   padding: 10px;
	   display: inline-block;
	   text-decoration: none;
	   
}
a:hover {
   background-color: white;
   color: black;
   padding: 10px;
   
}
  
  </style>

</head>
<body>
  
  <div class="navbar">
     <ul>
        <li>
          <a href="./update">Update Student</a>
        </li>
         <li>
          <a href="./add">Add Student</a>
        </li>
         <li>
          <a href="./delete">Delete Student</a>
        </li>
         <li>
          <a href="./showAll">ShowAll Student</a>
        </li>
         <li>
          <a href="./logOut" id="logout">Log out</a>
        </li>
     </ul>
     
  
  </div>

</body>
</html>