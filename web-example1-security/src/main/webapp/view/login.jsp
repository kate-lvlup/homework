<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Auth page</title>
</head>
<body>
<div class="page">
    <c:if test="${param.error!= null}">
        Invalid username and password.
    </c:if>
    <c:if test="${param.logout!= null}">
        You`ve been logged out.
    </c:if>

    <form action="login" method="POST">
        <div>
            <label for="username">Username:</label>
            <input type="text" id="username" name="username" required>
        </div>
        <div>
            <label for="password">Password:</label>
            <input type="password" id="password" name="password" required>
        </div>
        <button type="submit">Login</button>
    </form>
    <a href="/register">Not register yet?</a>
</div>
</body>
</html>
