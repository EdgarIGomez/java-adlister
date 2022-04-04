<%--
  Created by IntelliJ IDEA.
  User: edgargomez
  Date: 3/31/22
  Time: 1:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
  <%@ include file="partials/navbar.jsp" %>
  <form method="post" action = "/login.jsp">
    <label for="username">Username</label>
    <input type="text" id="username" name="username"><br><br>
    <label for="password">Password</label>
    <input type="text" id="password" name="password"><br><br>
    <button type="submit" value="submit">Login</button>
  </form>

  <%
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    if(username != null){
      if(username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("password")){
        response.sendRedirect("/profile.jsp");
//        loggedIn = true;

      } else {
        response.sendRedirect("/login.jsp");
      }
    }

  %>

  <%--    <c:choose>--%>
  <%--        <c:when test="${username.includesIgnores}">--%>
  <%--            <p>boolean_expression_1 was true</p>--%>
  <%--        </c:when>--%>
  <%--        <c:otherwise>--%>
  <%--            <p>none of the above tests were true</p>--%>
  <%--        </c:otherwise>--%>
  <%--    </c:choose>--%>
</body>
</html>
