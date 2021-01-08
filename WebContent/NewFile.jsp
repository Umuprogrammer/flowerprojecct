<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>">
<meta charset="ISO-8859-1">
<title>signup page</title>
<link rel="stylesheet" href="css/styles.css">
<script type="text/javascript" src="js/jquery-3.5.1.min.js"></script>
<script type="text/javascript" src="js/registration.js"></script>

</head>
<body>
    <div id="warn"> </div>

<label>fullname</label><input type="text" id="fullname" name="fullname" placeholder="fullname" required><br>

<label>gender</label> <label>female</label><input type="radio" name="gender" value="female" checked>
<label>male</label><input type="radio" name="gender" value="male"><br>

<label>birthday</label><input type="date" id="birthday" name="birthday"required><br>
<label>user-name</label><input type="text" id="username" name="username" placeholder="username" required><br>
<label>email</label><input type="email" id="email" name="email" placeholder="email" required><br>
<label>phone number</label><input type="tel" id="phonenumber" name="phonenumber" placeholder="phonenumber" required><br>
<label>password</label><input type="password" name="password" id="password" placeholder="password" required><br>
<label>password</label><input type="password" name="password" id="vpassword" placeholder="re enter password" required><br>

<input type="button" name="submit" value="register" id="signup">



<a href="signup.html"> signin page</a>

</body>
</html>