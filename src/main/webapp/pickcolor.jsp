<%--
  Created by IntelliJ IDEA.
  User: edgargomez
  Date: 4/1/22
  Time: 1:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pick Color</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/viewcolor" method="POST">
        <label for="color">Type in a color</label>
        <input type="text" name="color" id="color">
        <button type="submit" value="submit">View Color</button>
    </form>
</body>
</html>
