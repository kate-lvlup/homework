<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Users</title>
    <link rel="stylesheet" href="/css/users.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.3/font/bootstrap-icons.css">
</head>
<body>
<div class="container">
    <div class="block">
        <h1 class="block_name">Users list</h1>
        <button class="btn btn-primary add_user_btn" type="button">Add New User</button>
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
            <th class="table_header"><span class="name">Status</span></th>
            <th class="table_header"><span class="name">Actions</span></th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${users}" var="user">
            <tr>
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
                <td class="body_column"><span>${user.isAvailable}</span></td>
                <td>
                    <div class="last_column_block">
                        <a class="outer" href="#">
                            <i class="bi bi-pencil img_icon"></i>
                        </a>
                        <a class="outer" href="#">
                            <i class="bi bi-trash img_icon img_color"></i>
                        </a>
                    </div>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</body>
</html>
