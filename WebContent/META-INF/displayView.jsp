<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>homepage</title>
</head>
<body>
<% 
if(session.getAttribute("username")!=null){
	
	out.println(session.getAttribute("username")+" is logged in");
	
}

%>>
</body>
</html>