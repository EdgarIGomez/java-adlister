<%--
  Created by IntelliJ IDEA.
  User: edgargomez
  Date: 4/4/22
  Time: 2:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ads</title>
</head>
<body>
    <h1>Here are all the ads!</h1>
    <c:forEach var="ad" items="${ads}">
        <div class="product">
            <h2>${ad.getTitle()}</h2>
            <p>${ad.getDescription()}</p>
        </div>
    </c:forEach>
</body>
</html>
