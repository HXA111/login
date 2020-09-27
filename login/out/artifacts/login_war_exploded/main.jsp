<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/9/26
  Time: 18:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>主页</title>
    <link rel="stylesheet" href="css/main.css">
</head>
<body>
  <img src="images/mainHead.png" alt="1">
  <span class="user">欢迎您：<%=session.getAttribute("username")%> <a href="servlet/Invalidate">【安全退出】</a></span>
  <ul>
    <li><a href="main.jsp">首页</a></li>
    <li>|</li>
    <li><a href="getDownloadList.do">下载</a></li>
    <li>|</li>
  </ul>
  <img src="images/main.jpg" alt="2" class="main">
</body>
</html>
