<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Please guess!</title>
</head>
<body>


<form method="POST" action="/guess">

    <h1>Guess between 1 and 3</h1>
    <input type="number" name="guess"/>

    <button type="submit">Submit Guess!</button>

</form>

</body>
</html>