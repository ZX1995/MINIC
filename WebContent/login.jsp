<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>login</title>
	<meta charset="utf-8">
	<script src="js/jquery-1.8.0.min.js"></script>
	<link rel="stylesheet" type="text/css" href="css/login.css">
	 <link rel="stylesheet" type="text/css" href="css/sy.css">
</head>
<body >
   
      <div id="output" class="container">
        <div class="container1">
          <h1>Welcome</h1>
          <form action="/login" method="post">
          <input class="in" type="text" name="username" value="${requestScope.username }" reqiored/>
          <br/>
	       <input class="in" type="password" name="password" value="${requestScope.password }" required/>
	       <div class="role-group">
		       <input type="radio" name="role" value="student" required>学生
		       <input type="radio" name="role" value="teacher" >老师
		       <input type="radio" name="role" value="admin" >管理员
	       </div>
	       <script>
	       $("input[value=${requestScope.role}]").attr("checked","true");
	       </script>
	       <p style="color:red;">${msg }</p>
	       <input class="title" type="submit" value="login"/>
	       </form>
         <br><br><br><br>
        <a class="return" href="home.jsp">< Home</a>
        <br><br><br><br><br>
        <p class="foot">@大连理工大学软件学院</p>
        </div>
         
      </div> 
   
</body>
</html>
