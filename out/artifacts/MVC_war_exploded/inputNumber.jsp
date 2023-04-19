<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2023/4/19
  Time: 17:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Calculator</h2>
<form method="post" action="HandleComputer">
    <label for="operand1">Operand 1:</label>
    <input type="number" name="operand1" id="operand1">
    <br><br>
    <label for="operator">Operator:</label>
    <select name="operator" id="operator">
        <option value="+">+</option>
        <option value="-">-</option>
        <option value="*">*</option>
        <option value="/">/</option>
    </select>
    <br><br>
    <label for="operand2">Operand 2:</label>
    <input type="number" name="operand2" id="operand2">
    <br><br>
    <input type="submit" value="Calculate">
</form>
</body>
</html>
