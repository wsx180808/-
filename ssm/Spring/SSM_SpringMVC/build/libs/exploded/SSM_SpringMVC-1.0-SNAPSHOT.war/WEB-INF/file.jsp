<%--
  Created by IntelliJ IDEA.
  User: z
  Date: 2019/6/3
  Time: 18:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>



    <script type="text/javascript"  language="javascript" src="<%=request.getContextPath()%>/js/jquery.min.js"> </script>

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
<button id="btn">ajax请求</button>
<br/>
<br/>
<br/>
<h3>文件上传</h3>
<form action="hallo/testfiles" method="post" enctype="multipart/form-data">
    选择文件<input type="file" name="flie"><br/>
    <input type="submit" value="上传">
</form>
</body>
</html>
