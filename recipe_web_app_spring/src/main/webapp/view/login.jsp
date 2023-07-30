<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@taglib prefix="c" uri="jakarta.tags.core" %>--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Recipes Book</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/login.css">
</head>
<body>
<div class="container">

    <form action="login" method="POST" class="signin-form">
        <h2>Sign In</h2>
        <input class="modal-input" type="text" name="username" placeholder="Username" id="username-input"
               onblur="usernameValidation()" required>
        <span class="error"
              id="error-userName">Username is invalid, please enter at least 4 letters or numbers</span>
        <input class="modal-input" type="password" name="password" placeholder="Password" id="password-input"
               onblur="passwordValidation()" required>
        <span class="error"
              id="error-password">Password is invalid,please enter at least 4 letters or numbers
                with special symbols: !, @, #, $, %</span>
        <button type="submit">Sign In</button>
        <a href="/register">Not register yet?</a>
        <c:if test="${param.error!= null}">
            <span class="invalid">Invalid username and password</span>
        </c:if>
        <c:if test="${param.logout!= null}">
            <br>
            <span class="invalid">You`ve been logged out</span>
        </c:if>
    </form>

</div>

<script src="/js/login.js"></script>
</body>
</html>
