<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Login</title>
    <%@ include file="partials/head.jsp"%>
</head>
<body>
<%@ include file="partials/navbar.jsp"%>

<form action="/login" method="POST">
    <label for="login">User Login</label>
    <input type="text" id="login" name="login" placeholder="username">
    <label for="password">Password</label>
    <input type="password" id="password" name="password" placeholder="password">
    <button>Submit</button>
</form>    </div>
</body>
</html>


