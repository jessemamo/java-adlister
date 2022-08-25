<%--
  Created by IntelliJ IDEA.
  User: jm
  Date: 8/25/22
  Time: 7:50 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Register Here"/>
    </jsp:include>
</head>
<body>
<jsp:include page="/WEB-INF/partials/navbar.jsp"/>
<div class="container">
    <h1>Register Here</h1>
    <form action="/register" method="post">
        <div>
            <label for="username">Create Username</label>
            <input type="text" name="username" class="form-control" id="username" placeholder="username">
        </div>
        <div>
            <label for="email">Enter Email</label>
            <input type="text" name="email" class="form-control" id="email" placeholder="email">
        </div>
        <div>
            <label for="password">Create Password</label>
            <input type="password" name="password" class="form-control" id="password" placeholder="password">
        </div>
        <br>
        <input type="submit" class="btn btn-primary btn-block" value="Submit">
    </form>
</div>

</body>
</html>