<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
大家好，我是处理登录的页面！
<%
String username = request.getParameter("username");
String password = request.getParameter("password");
System.out.println(username+":"+password);

PrintWriter writer = response.getWriter();
writer.println("printWriter");
%>
</body>
</html>