<%--
  Created by IntelliJ IDEA.
  User: DoromvQAQ
  Date: 2022/3/7
  Time: 8:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>登入页面</h1>
<form action="${pageContext.request.contextPath}/user/login" method="post">
    用户名：<input type="text" name="username"></br>
    密码：&nbsp;&nbsp;<input type="password" name="password"></br>
    <input type="submit" value="提交">
</form>
</body>
</html>
