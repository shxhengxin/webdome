<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/9/7
  Time: 8:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
    <head>
        <title>$Title$</title>
    </head>
    <body>
        <div>小滴课堂</div>
        <form action="/userServlet/login" method="post">
            <div>用户名: <input type="text" name="userName" /></div>
            <div>密码: <input type="password" name="pwd" /></div>
            <div><input type="submit" value="登录" /></div>
        </form>
    </body>
</html>
