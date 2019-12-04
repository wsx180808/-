<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>登陆</title>
</head>
<body>
<div class="col-md-3 col-md-offset-4">
       <#assign contextPath = request.contextPath/>


    <#if er??>${er}<#else>请输入账号密码</#if>
    <form action="${contextPath}/user/logins">
           

        <tr>
                       
            <td>用户名
                           
            </td>
                       
            <td><input type="text" name="username" class="form-control" id="name">
                           
            </td>
                   
        </tr>
               
        <tr>
                       
            <td>密码</td>
                       
            <td><input type="password" name="pwd"   class="form-control" id="password"></td>
                   
        </tr>
               
        <tr>
                       
            <td colspan="2" align="center">
                               
                <button value="登录" class="btn btn-primary" id="button">登录</button>
                           
            </td>
                   
        </tr>
               

               
        </table>
           
    </form>
</div>

</body>
</html>
    