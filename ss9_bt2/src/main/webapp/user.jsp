<%--
  Created by IntelliJ IDEA.
  User: viennguyenthi
  Date: 2024/07/24
  Time: 9:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>user</title>
</head>
<body>
<h1>Product Discount Calculator</h1>
<form action="userServlet" method="post">
    <div class="control">
        <label for="ID">ID:</label>
        <input type="text" id="ID" name="ID">
    </div>
    <div class="control">
        <label for="name">name:</label>
        <input type="text" id="name" name="name">
    </div>
    <div class="control">
        <label for="email">email:</label>
        <input type="email" id="email" name="email">
    </div>
    <div class="control">
        <label for="age">age:</label>
        <input type="text" id="age" name="age">
    </div>
    <div class="control">
        <input type="submit" value="Result">
    </div>
</form>>
</body>
</html>
