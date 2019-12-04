<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>用户</title>
    <script src="${request.contextPath}/js/jquery.js"></script>
</head>
<body>
跳转成功
<br/>
你好 ${name} 现在是 ${.now?string["hhmmSSsss"]}

<br>
<table border="1">
    <tr>
        <td>id</td>
        <td>名称</td>
        <td>密码</td>
    </tr>

    <#--sort_by("id")?reverse根据ID排序-->
    <#list list?sort_by("id")?reverse as list>
        <tr>
            <td>${list.id}</td>
            <td>${list.name}</td>
            <td>${list.password}</td>
        </tr>

    </#list>
    <#--if-->
    <#if agr<=19>
        青年人
    <#elseif (agr>=19)&&(agr<=50)>
        中年
    <#else>
        老人
    </#if>
</table>
</body>
</html>
    