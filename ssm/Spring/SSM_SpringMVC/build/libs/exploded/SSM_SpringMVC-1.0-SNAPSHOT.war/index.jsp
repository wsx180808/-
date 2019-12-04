<%--
  Created by IntelliJ IDEA.
  User: z
  Date: 2019/5/20
  Time: 20:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
    <script src="js/jquery.min.js"></script>

    <script>
        // 页面加载，绑定单击事件
        $(function(){
            $("#btn").click(function(){
                 alert("hello btn");
                // 发送ajax请求
                $.ajax({
                    // 编写json格式，设置属性和值
                    url:"hallo/testajax",
                    contentType:"application/json;charset=UTF-8",
                    data:'{"name":"hehe","password":"123","moder":30.3}',
                    dataType:"json",
                    type:"post",
                    success:function(user){
                        // data服务器端响应的json的数据，进行解析
                        alert(user);
                        alert(user.name);
                        alert(user.password);
                        alert(user.moder);
                    }
                });

            });
        });

    </script>

</head>
<body>
$END$
<h3>SpringMVC入门</h3>
<a href="hallo/hallo">入门程序</a>
<br/>
<br/>

<a href="hallo/hallotest1?canshu=canshu">测试携带参数</a>
<br/>
<br/>

<form action="hallo/hallotest2" method="post">
    名称： <input type="text" name="name"><br/>
    密码： <input type="password" name="password"><br/>
    金额：<input type="text" name="moder"><br/>
    爱好：<input type="text" name="user2.aihao">
    测试：<input type="text" name="user2.aa">
    <input type="submit" value="提交">
</form>
<br/>
<br/>

<form action="hallo/hallotest3" method="post">
    名称： <input type="text" name="name"><br/>
    密码： <input type="password" name="password"><br/>
    金额：<input type="text" name="moder"><br/>
    <%--list--%>
    爱好：<input type="text" name="list[0].aihao">
    测试：<input type="text" name="list[0].aa">
    <%--map--%>
    爱好：<input type="text" name="map['one'].aihao">
    测试：<input type="text" name="map['one'].aa">
    <input type="submit" value="提交">
</form>
<br/>
<br/>
方法一
<form action="hallo/hallotest4" method="post">
    名称： <input type="text" name="data"><br/>
    <input type="submit" value="提交">
</form>
<br/>
<br/>
方法二
<form action="hallo/hallotest5" method="post">
    名称： <input type="text" name="data"><br/>
    <input type="submit" value="提交">
</form>
<br/>
<br/>
<br/>
<br/>
常用的注解

<a href="hallo/testRequestParam?name=哈哈">RequestParam</a>

<br>

<form action="hallo/testRequestBody" method="post">
    用户姓名：<input type="text" name="name" /><br/>
    用户年龄：<input type="text" name="moder" /><br/>
    <input type="submit" value="提交" />
</form>

<a href="hallo/testPathVariable/10">testPathVariable</a>

<br>

<a href="hallo/testRequestHeader">RequestHeader</a>

<br>

<a href="hallo/testCookieValue">CookieValue</a>

<br>

<form action="hallo/testModelAttribute" method="post">
    用户姓名：<input type="text" name="name" /><br/>
    用户年龄：<input type="text" name="moder" /><br/>
    <input type="submit" value="提交" />
</form>

<br>


<a href="hallo/testSessionAttributes">testSessionAttributes</a>
<a href="hallo/getSessionAttributes">getSessionAttributes</a>
<a href="hallo/delSessionAttributes">delSessionAttributes</a>


<br/>
<button id="btn">ajax求</button>
</body>
</html>
