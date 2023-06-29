<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width =device-width, initial-scale=1.0">
    <title>Register user</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.3/font/bootstrap-icons.css">
    <link rel="stylesheet" href="/css/register.css" rel="stylesheet" media="screen">
</head>

<body>
<div class="page">
        <div class="modal-div">
            <h2 class="title">Welcome to registration page</h2>
        </div>
        <form action="register" method="post">
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
            <input class="modal-input" type="date" name="birthday" placeholder="Birthday" id="birthday-input"
                   onblur="birthdayValidation()" required>
            <span class="error" id="error-birthday">You entered a future date</span>
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
            <button class="modal-input btn btn-primary" type="submit">Register</button>
        </form>
</div>

<script src="/js/users.js"></script>
</body>
</html>
