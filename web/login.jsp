<%--
  Created by IntelliJ IDEA.
  User: 85304
  Date: 2020/9/7
  Time: 22:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/loginServlet" method="post">
    <div>
        用户：<input type="text" name="name">
        密码：<input type="password" name="pwd">
        <input type="submit" value="登录">
        消息提示:${msg}
    </div>
</form>
</body>
</html>
