<%--
  Created by IntelliJ IDEA.
  User: z
  Date: 2019/6/10
  Time: 20:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="account/FinadAll?user=吴世祥">测试</a>
<br>
<h3>测试</h3>
<form action="account/save" method="post">
    id <input type="text" name="id"><br>
    名称<input type="text" name="name"><br>
    金额<input type="text" name="money"><br>
    <input type="submit" value="保存">
</form>
</body>
</html>
