<%--
  Created by IntelliJ IDEA.
  User: edgargomez
  Date: 4/7/22
  Time: 2:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
    <jsp:include page="/WEB-INF/partials/head.jsp"></jsp:include>
</head>
<body>
    <div class="container">
        <h1>Register as a new User</h1>
        <form action="/register" method="POST">
            <div class="form-group">
                <label for="username">Username</label>
                <input name="username" id="username" type="text" class="form-group">
            </div>
            <div class="form-group">
                <label for="email">Email</label>
                <input name="email" id="email" type="text" class="form-group">
            </div>
            <div class="form-group">
                <label for="password">Password</label>
                <input name="password" id="password" type="text" class="form-group">
            </div>
            <input type="submit" class="btn btn-block btn-primary">
        </form>
    </div>
</body>
</html>
