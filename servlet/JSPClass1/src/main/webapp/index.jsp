<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP tutorial one </title>
</head>
<body>
	<h1>Hello world</h1>
	
	<h3> Delcaration tag here below  </h3>
	
	<%! int a = 10; String name = "Ram Kumar"; %>
	
	<h3>Expresssion tag here </h3>
	
	 <h3>Name is <%= name %>  </h3>
	
	<h3>My Roll number is  <%= a %> </h3>
	
	<%  
		out.println(10 + 20);
		out.println(20 - 10);
		out.println(20 * 10);
		out.println(20 / 3);
	
	%>
	
</body>
</html>