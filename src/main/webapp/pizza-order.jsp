<%--
  Created by IntelliJ IDEA.
  User: edgargomez
  Date: 4/1/22
  Time: 9:40 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pizza Order</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/pizza-order" method="POST" name="pizza-form">
    <label for="crust">Crust Type</label>
    <select name="crust" id="crust">
        <option value="regular">Regular</option>
        <option value="thin">Thin</option>
        <option value="stuffed">Stuffed</option>
    </select>

    <label for="sauce">Crust Type</label>
    <select name="sauce" id="sauce">
        <option value="tomato">Tomato</option>
        <option value="pesto">Pesto</option>
        <option value="none">None</option>
    </select>

    <label for="size">Crust Type</label>
    <select name="size" id="size">
        <option value="large">Large</option>
        <option value="medium">Medium</option>
        <option value="small">Small</option>
    </select>
    <br>
    <p>Toppings</p>
    <input type="checkbox" id="pepperoni" name="toppings" value="pepperoni">
    <label for="pepperoni">Pepperoni</label>
    <br>
    <input type="checkbox" id="sausage" name="toppings" value="sausage">
    <label for="sausage">Sausage</label>
    <br>
    <input type="checkbox" id="mushrooms" name="toppings" value="mushrooms">
    <label for="mushrooms">Mushrooms</label>
    <br>
    <input type="checkbox" id="spinach" name="toppings" value="spinach">
    <label for="spinach">Spinach</label>
    <br>
    <label for="address">Delivery Address</label>
    <input type="text" id="address" name="address">
    <br>
    <button type="submit" value="submit">Order Pizza</button>
</form>

</body>
</html>
