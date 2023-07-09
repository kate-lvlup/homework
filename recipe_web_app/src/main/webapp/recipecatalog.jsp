<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Recipe Catalog</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/recipecatalog.css">
</head>
<body>
<div class="header">
    <a href="ingredients"><i class="bi bi-house-door"></i>Main page</a>
    <a href="recipes"><i class="bi bi-journal-check"></i>Recipe catalog</a>
    <a href="#"><i class="bi bi-box-arrow-in-right me-2"></i>Login</a>
</div>

<form id="myForm3" action="${pageContext.request.contextPath}/searchRecipeByMeal" method="post">
    <div class="container_recipe">

        <div class="container_modal">
            <c:forEach var="meal" items="${meals}">
                <div class="form-check form-check-inline">
                    <input class="form-check-input" type="checkbox" name="checkbox" id="${meal.name}"
                           value="${meal.name}" onclick="handleCheckboxClick3('${meal.name}', 'inputField3')" checked>
                    <label class="form-check-label" for="${meal.name}">${meal.name}</label>
                </div>
            </c:forEach>
            <input type="hidden" id="inputField3" readonly>

            <button type="submit" class="btn btn-primary" onclick="submitForm3()">Apply</button>
        </div>

        <div class="recipe-list">
            <h3>Recipes:</h3>
            <ul>
                <c:forEach var="recipe" items="${recipes}">
                    <li>
                        <div class="recipe-item">
                            <div class="recipe-item-header">
                                <h5>${recipe.name}</h5>
                                <h6>${recipe.meal.name}</h6>
                            </div>
                            <p>${recipe.description}</p>
                        </div>
                    </li>
                </c:forEach>
            </ul>
        </div>

    </div>
</form>

<script src="${pageContext.request.contextPath}/js/addProductModal.js"></script>
</body>
</html>
