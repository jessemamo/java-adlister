<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Order a Pizza</title>
</head>
<body>
<form method="post" action="pizza-order">
    <label for="crust">Crust:</label>
    <select name="crust" id="crust">
        <option value="thin">Crispy Thin</option>
        <option value="pan">Pan</option>
        <option value="deep-dish">Deep Dish</option>
    </select>
    <br><br>
    <label for="sauce">Sauce:</label>
    <select name="sauce" id="sauce">
        <option value="original">Original Red Sauce</option>
        <option value="pesto">Pesto Sauce</option>
        <option value="alfredo">Alfredo Sauce</option>
    </select>
    <br><br>
    <label for="size">Pizza Size:</label>
    <select name="size" id="size">
        <option value="personal">Personal</option>
        <option value="medium">Medium</option>
        <option value="large">Large</option>
    </select>
    <br><br>
    <fieldset>
        <legend>Toppings</legend>
        <label for="pepperoni">Pepperoni</label>
        <input type="checkbox" id="pepperoni" name="toppings" value="pepperoni">
        <br>
        <label for="sausage">Italian Sausage</label>
        <input type="checkbox" id="sausage" name="toppings" value="sausage">
        <br>
        <label for="pineapple">Pineapple</label>
        <input type="checkbox" id="pineapple" name="toppings" value="pineapple">
    </fieldset>
    <br><br>
    <label for="address">Delivery Address:</label>
    <input type="text" name="address" id="address">
    <input type="submit" value="Submit Order">
</form>
</body>
</html>