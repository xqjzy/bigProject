<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<title>登录</title>
</head>
<body>
	<% String id = session.getId(); 
		out.println(id);
		out.print(session.getAttribute("hh"));
	%>
登录成功！
</body>
</html>