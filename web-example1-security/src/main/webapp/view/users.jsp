<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@taglib prefix="c" uri="jakarta.tags.core" %>--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width =device-width, initial-scale=1.0">
    <title>Users</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.3/font/bootstrap-icons.css">
    <link rel="stylesheet" href="/css/users.css" rel="stylesheet" media="screen">
</head>
<body>
<a href="/logout">Logout button</a>
<div class="modal" id="modal">
    <div class="modal-form">
        <div class="modal-div">
            <h2 class="title">Add new user</h2>
            <span class="close" id="modal-close">&times;</span>
        </div>
        <form action="users/save" method="post">
            <label>Username</label>
            <input class="modal-input" type="text" name="username" placeholder="Username" id="username-input"
                   onblur="usernameValidation()" required>
            <span class="error"
                  id="error-userName">Username is invalid, please enter at least 4 letters or numbers</span>
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
            <button class="modal-input btn btn-primary" type="submit">Save</button>
        </form>
    </div>
</div>

<div class="modal" id="edit-modal">
    <div class="modal-form">
        <span class="close" id="edit-modal-close">&times;</span>
        <h2 class="title">Update user</h2>
        <form action="users/update" method="post">
            <input class="modal-input" type="text" id="edit-id" name="id" hidden>

            <label>Username</label>
            <input class="modal-input" type="text" id="edit-username" name="username" placeholder="Username"
                   onblur="usernameValidation()" required>
            <span class="error" id="error-username_update">Username is invalid, please enter at least 4 letters or numbers</span>

            <label>First name</label>
            <input class="modal-input" type="text" id="edit-firstName" name="firstName" placeholder="First name"
                   onblur="firstNameValidation()" required>
            <span class="error"
                  id="error-firstName_update">First name must not be empty and should contain only letters</span>

            <label>Last name</label>
            <input class="modal-input" type="text" id="edit-lastName" name="lastName" placeholder="Last name"
                   onblur=" lastNameValidation()" required>
            <span class="error"
                  id="error-lastName_update">Last name must not be empty and should contain only letters</span>

            <label>Birthday</label>
            <input class="modal-input" type="date" id="edit-birthday" name="date" placeholder="Birthday"
                   onblur="birthdayValidation()" required>
            <span class="error" id="error-birthday_update">You entered a future date</span>

            <label>Email</label>
            <input class="modal-input" type="email" id="edit-email" name="email" placeholder="example@email.com"
                   onblur="emailValidation()" required>
            <span class="error" id="error-email_update">Please enter a valid email address</span>

            <label>Phone number</label>
            <input class="modal-input" type="text" id="edit-phoneNumber" name="phoneNumber"
                   placeholder="e.g. +123456789012" onblur="phoneNumberValidation()" required>
            <span class="error" id="error-phoneNumber_update">Enter a correct phone number starting with a plus sign (+) followed by exactly 12 digits</span>

            <label>Address</label>
            <input class="modal-input address-input" type="text" id="edit-address" name="address" placeholder="Address"
                   onblur="addressValidation()" required>
            <span class="error" id="error-address_update">Address should not be empty</span>
            <button class="modal-input btn btn-primary" type="submit">Update</button>
        </form>
    </div>
</div>

<div class="container">
    <div class="block">
        <h1 class="block_name">Users list</h1>
        <button class="btn btn-primary" id="add-btn" type="button">Add user</button>
    </div>
    <table class="table table-bordered">
        <thead>
        <tr>
            <th class="table_header"><span class="name">Username</span></th>
            <th class="table_header"><span class="name">First Name</span></th>
            <th class="table_header"><span class="name">Last Name</span></th>
            <th class="table_header"><span class="name">Birthday</span></th>
            <th class="table_header"><span class="name">Email</span></th>
            <th class="table_header"><span class="name">Phone number</span></th>
            <th class="table_header"><span class="name">Address</span></th>
            <%--            <th class="table_header"><span class="name">Status</span></th>--%>
            <th class="table_header"><span class="name">Actions</span></th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${users}" var="user">
            <tr class="table_row">
                <td class="body_column">
                    <div class="first_column_block">
                        <i class="bi bi-person-circle img_profile"></i>
                        <span>${user.username}</span>
                    </div>
                </td>
                <td class="body_column"><span>${user.firstName}</span></td>
                <td class="body_column"><span>${user.lastName}</span></td>
                <td class="body_column"><span>${user.date}</span></td>
                <td class="body_column"><span>${user.email}</span></td>
                <td class="body_column"><span>${user.phoneNumber}</span></td>
                <td class="body_column"><span>${user.address}</span></td>
                    <%--                <td class="body_column"><span>${user.isAvailable}</span></td>--%>
                <td>
                    <div class="last_column_block">
                        <a class="outer" href="#"
                           onclick="openEditModal('${user.id}', '${user.username}', '${user.firstName}', '${user.lastName}', '${user.date}', '${user.email}', '${user.phoneNumber}', '${user.address}')">
                            <i class="bi bi-pencil img_icon"></i>
                        </a>
                        <a class="outer" href="users/delete?id=${user.id}">
                            <i class="bi bi-trash img_icon img_color"></i>
                        </a>
                    </div>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

<script src="/js/users.js"></script>

</body>
</html>
