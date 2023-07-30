<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width =device-width, initial-scale=1.0">
    <title>Register user</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.3/font/bootstrap-icons.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/login.css">
</head>

<body>
<div class="container" id="register">
    <form action="register" method="post" class="signin-form">
        <a href="/login">Back</a>
        <h2>Please Register</h2>
        <label>Username</label>
        <input class="modal-input" type="text" name="username" placeholder="Username" id="username-input"
               onblur="usernameValidation()" required>
        <span class="error"
              id="error-userName">Username is invalid, please enter at least 4 letters or numbers</span>
        <label>Password</label>
        <input class="modal-input" type="password" name="password" placeholder="Password" id="password-input"
               onblur="passwordValidation()" required>
        <span class="error"
              id="error-password">Password is invalid,please enter at least 4 letters or numbers
                with special symbols: !, @, #, $, %
            </span>
        <label>First name</label>
        <input class="modal-input" type="text" name="firstName" placeholder="First name" id="firstName-input"
               onblur="firstNameValidation()" required>
        <span class="error" id="error-firstName">First name must not be empty and contain only letters</span>
        <label>Last name</label>
        <input class="modal-input" type="text" name="lastName" placeholder="Last name" id="lastName-input"
               onblur="lastNameValidation()" required>
        <span class="error" id="error-lastName">Last name must not be empty and contain only letters</span>
        <label>Birthday</label>
        <input class="modal-input" type="date" name="birthday" pattern="\d{4}-\d{2}-\d{2}" placeholder="Birthday" id="birthday-input"
               onblur="birthdayValidation()" required>
        <span class="error" id="error-birthday">Birthday must not be empty (Future Date Selection Restricted)</span>
        <label>Email</label>
        <input class="modal-input" type="email" name="email" placeholder="example@email.com" id="email-input"
               onblur="emailValidation()" required>
        <span class="error" id="error-email">Please enter a valid email address</span>
        <label>Phone number</label>
        <input class="modal-input" type="text" name="phoneNumber" placeholder="e.g. +123456789012"
               id="phoneNumber-input"
               onblur="phoneNumberValidation()" required>
        <span class="error" id="error-phoneNumber">Enter correct phone number starting with a plus sign (+) followed by exactly 12 digits</span>
        <label>Address</label>
        <input class="modal-input address-input" type="text" name="address" placeholder="Address" id="address-input"
               onblur="addressValidation()" required>
        <span class="error" id="error-address">Address shouldn't be empty</span>
        <button type="submit">Register</button>
    </form>
</div>

<script src="/js/login.js"></script>
</body>
</html>
