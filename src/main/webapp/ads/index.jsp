<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Ads Index</title>
</head>
<body>


<c:forEach var="ads" items="${ads}">
    <div class="ads">
        <fieldset>
            <legend>${ads.title} </legend>
            <p>${ads.description}</p>
        </fieldset>
        <br>
    </div>
</c:forEach>

</body>
</html>
