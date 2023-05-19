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
        <span class="close" id="modal-close">&times;</span>
        <h2 class="title">Create new user for organization</h2>
        <form action="/save" method="post">
            <br>
            <input class="modal-input" type="text" name="username" placeholder="Username" required>
            <br>
            <input class="modal-input" type="text" name="firstName" placeholder="First name" required>
            <br>
            <input class="modal-input" type="text" name="lastName" placeholder="Last name" required>
            <br>
            <input class="modal-input" type="date" name="birthday" placeholder="Birthday" required>
            <br>
            <input class="modal-input" type="email" name="email" placeholder="Email" required>
            <br>
            <input class="modal-input" type="text" name="phoneNumber" placeholder="Phone number" required>
            <br>
            <input class="modal-input" type="text" name="address" placeholder="Address" required>
            <br>
            <br>
            <button class="modal-input btn btn-primary" type="submit">Save</button>
        </form>
    </div>
</div>


<div class="modal" id="edit-modal">
    <div class="modal-form">
        <span class="close" id="edit-modal-close">&times;</span>
        <h2 class="title">Update user</h2>
        <form action="/update" method="post">
            <input class="modal-input" type="text" id="edit-id" name="id" hidden>
            <br>
            <input class="modal-input" type="text" id="edit-username" name="username" placeholder="Username" required>
            <br>
            <input class="modal-input" type="text" id="edit-firstName" name="firstName" placeholder="First name"
                   required>
            <br>
            <input class="modal-input" type="text" id="edit-lastName" name="lastName" placeholder="Last name" required>
            <br>
            <input class="modal-input" type="date" id="edit-birthday" name="birthday" placeholder="Birthday" required>
            <br>
            <input class="modal-input" type="email" id="edit-email" name="email" placeholder="Email" required>
            <br>
            <input class="modal-input" type="text" id="edit-phoneNumber" name="phoneNumber" placeholder="Phone number"
                   required>
            <br>
            <input class="modal-input" type="text" id="edit-address" name="address" placeholder="Address" required>
            <br>
            <br>
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
                    <%--                <td class="body_column"><span>${user.isAvailable}</span></td>--%>
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
