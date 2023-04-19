<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2023/4/19
  Time: 17:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>计算结果</title>
</head>
<body>
<%  request.setCharacterEncoding("UTF-8");%>
<h1>计算结果：</h1>
<jsp:useBean id="computer" class="Com.Computer" scope="request"/>
<jsp:getProperty name="computer" property="result"/>

</body>
</html>

