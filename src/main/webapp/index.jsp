<%--
  Created by IntelliJ IDEA.
  User: edgargomez
  Date: 3/30/22
  Time: 11:00 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%! int counter = 0; %>
<% counter += 1; %>
<% request.setAttribute("favoriteBooksAndStories", new String[] {"Dao De Ching", "A Good Man is Hard to Find", "Franny and Zooey", "Cat's Cradle"}); %>
<html>
<head>
  <title>Title</title>
</head>
<body>

<h1>The current count is <%= counter %>.</h1>

<h3>My favorite food is: ${param.fav_food}</h3>

<ul>
  <c:forEach items="${favoriteBooksAndStories}" var="element">
    <li>${element}</li>
    <c:if test="${element.equalsIgnoreCase('Franny and Zooey')}">
      <h5>Was written by J.D. Salinger :D</h5>
    </c:if>
  </c:forEach>
</ul>

View the page source!

<%-- this is a JSP comment, you will *not* see this in the html --%>

<!-- this is an HTML comment, you *will* see this in the html -->
</body>
</html>
