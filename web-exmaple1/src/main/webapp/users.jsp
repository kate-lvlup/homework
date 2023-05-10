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
<div class="container_header">
    <h1 class="name_h1">User Management</h1>
    <button class="btn" type="button">Add New User</button>
</div>
<table class="table_size">
    <thead>
    <tr>
        <th class="table_header"><span class="name">User</span></th>
        <th class="table_header"><span class="name">Created</span></th>
        <th class="table_header"><span class="name">Status</span></th>
        <th class="table_header"><span class="name">Email</span></th>
        <th class="table_header"></th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${users}" var="user">
        <tr>
            <td class="body_column">
                <div class="first_column_block">
                    <div>
                        <img width="50px" src="IMG\avatar1.png">
                    </div>
                    <div class="first_column_block_inner">
                        <a class="link_name" href="#">${user.username}</a>
                        <span class="name_status">Admin</span>
                    </div>
                </div>
            </td>
            <td class="body_column">${user.date}</td>
            <td class="body_column"><span class="status status_color">Inactive</span>
            </td>
            <td class="body_column"><a href="#">${user.email}</a></td>
            <td>
                <div class="first_column_block">
                    <a class="outer" href="#">
                        <i class="bi bi-search img_icon"></i>
                    </a>
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

<%--<c:forEach items="${users}" var="user">--%>
<%--    <p>--%>
<%--            ${user}--%>
<%--    </p>--%>
<%--</c:forEach>--%>
</body>
</html>
