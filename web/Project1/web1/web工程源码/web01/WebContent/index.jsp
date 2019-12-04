<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
欢迎你!
<%
String str= "www.sikiedu.com";
%>
<%-- <%! int count = 0; %> --%>

<%
// 	int number = 0;
// 	count++;
// 	number++;

// 	out.println("number:"+number);
// 	out.println("count:"+count);
// 	out.println("当前登录用户：SiKi");
// 	out.println(new Date());
// 	List l = new ArrayList();
// 	//可以任意书写java代码
	
// 	// System.out.println("")
// 	System.out.println(new Date());
//--%>

<%
out.println(str);

String username = request.getParameter("username");
System.out.println(username);
String password = request.getParameter("password");
System.out.println(password);
//request response
%>
<%=str %>

<br/>
登录
<form action="login.jsp" method="post" >
<input type="text" name="username"/>
<input type="password" name="password"/>
<input type="submit"/>
</form>

</body>
</html>