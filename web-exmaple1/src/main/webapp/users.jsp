<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Users</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.3/font/bootstrap-icons.css">
    <link rel="stylesheet" href="/css/users.css">
</head>
<body>
<div class="modal" id="modal">
    <div class="modal-form">
        <div class="modal-div">
            <h2 class="title">Add new user</h2>
            <span class="close" id="modal-close">&times;</span>
        </div>
        <form action="/save" method="post">
            <label>Username</label>
            <input class="modal-input" type="text" name="username" placeholder="Username" id="username-input"
                   onblur="usernameValidation()" required>
            <span class="error" id="error-userName">Username is invalid, please enter at least 4 letters or numbers</span>

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

<div class="modal ${errors != null ? 'm-visible' : ''}" id="edit-modal">
    <div class="modal-form">
        <span class="close" id="edit-modal-close">&times;</span>
        <h2 class="title">Update user</h2>
        <form action="update" method="post">
            <input class="modal-input" type="text" id="edit-id" name="id" value="${id !=null ? id : ''}" hidden>

            <label>Username</label>
            <input class="modal-input" type="text" id="edit-username" name="username" value="${username !=null ? username : ''}" placeholder="Username">
            <span class="error ${errors['username'] != null ? 's-visible' : ''}"  id="error-edit-userName">Username is invalid, please enter at least 4 letters or numbers</span>

            <label>First name</label>
            <input class="modal-input" type="text" id="edit-firstName" name="firstName" value="${firstName !=null ? firstName : ''}" placeholder="First name">
            <span class="error ${errors['firstName'] != null ? 's-visible' : ''}"  id="error-edit-firstName">First name must not be empty and contain only letters</span>

            <label>Last name</label>
            <input class="modal-input" type="text" id="edit-lastName" name="lastName" value="${lastName !=null ? lastName : ''}" placeholder="Last name">
            <span class="error ${errors['lastName'] != null ? 's-visible' : ''}"  id="error-edit-lastName">Last name must not be empty and contain only letters</span>

            <label>Birthday</label>
            <input class="modal-input" type="date" id="edit-birthday" name="birthday" value="${birthday !=null ? birthday : ''}" placeholder="Birthday">
            <span class="error ${errors['birthday'] != null ? 's-visible' : ''}"  id="error-edit-birthday">You entered a future date</span>

            <label>Email</label>
            <input class="modal-input" type="email" id="edit-email" name="email" value="${email !=null ? email : ''}" placeholder="example@email.com">
            <span class="error ${errors['email'] != null ? 's-visible' : ''}"  id="error-edit-email">Please enter a valid email address</span>

            <label>Phone number</label>
            <input class="modal-input" type="text" id="edit-phoneNumber" name="phoneNumber" value="${phoneNumber !=null ? phoneNumber : ''}" placeholder="e.g. +123456789012">
            <span class="error ${errors['phoneNumber'] != null ? 's-visible' : ''}"  id="error-edit-phoneNumber">Enter correct phone number starting with a plus sign (+) followed by exactly 12 digits</span>

            <label>Address</label>
            <input class="modal-input address-input" type="text" id="edit-address" name="address" value="${address !=null ? address : ''}" placeholder="Address">
            <span class="error ${errors['address'] != null ? 's-visible' : ''}"  id="error-edit-address">Address shouldn't be empty</span>

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
            <th class="table_header"><span class="name">#</span></th>
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
                <td class="body_column"><span>${user.number}</span></td>
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
                <td>
                    <div class="last_column_block">
                        <a class="outer" href="#"
                           onclick="openEditModal('${user.id}', '${user.username}', '${user.firstName}', '${user.lastName}', '${user.date}', '${user.email}', '${user.phoneNumber}', '${user.address}')">
                            <i class="bi bi-pencil img_icon"></i>
                        </a>
                        <a class="outer" href="delete?id=${user.id}">
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