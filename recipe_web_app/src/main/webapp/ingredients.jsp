<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Recipes Book</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/ingredients.css">
</head>
<body>
<div class="header">
    <a href="ingredients"><i class="bi bi-house-door"></i>Main page</a>
    <a href="#" onclick="showModalAddProduct()"><i class="bi bi-send-plus"></i>Add product</a>
    <a href="#" onclick="showModalAddRecipe()"><i class="bi bi-send-plus"></i>Add recipe</a>
    <a href="recipes"><i class="bi bi-journal-check"></i>Recipe catalog</a>
    <a href="#"><i class="bi bi-box-arrow-in-right me-2"></i>Login</a>
</div>
<form id="myForm" action="${pageContext.request.contextPath}/searchRecipe" method="post">
    <div class="container">

        <c:forEach var="ingredientType" items="${ingredientMap}">
            <div class="product-block"
                 style="background-image: url(${pageContext.request.contextPath}/img/${ingredientType.key.toLowerCase()}.png);">
                <div class="product-type">${ingredientType.key}</div>
                <ul class="product-list">
                    <c:forEach var="ingredient" items="${ingredientType.value}">
                        <li>
                            <label>
                                <input type="checkbox" name="checkbox" value="${ingredient.name}"
                                       onclick="handleCheckboxClick('${ingredient.name}', 'inputField')">${ingredient.name}
                            </label>
                        </li>
                    </c:forEach>
                </ul>
            </div>
        </c:forEach>
        <input type="hidden" id="inputField" readonly>
        <a class="btn btn-success" onclick="submitForm()">Search recipes</a>
    </div>
</form>


<div id="addProductModal" class="modal">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title">Add Product</h5>
                <button type="button" class="btn-close" onclick="hideModalAddProduct()"></button>
            </div>
            <div class="modal-body">
                <form>
                    <div class="mb-3">
                        <label for="productName" class="form-label">Product Name</label>
                        <input type="text" class="form-control" id="productName" required>
                    </div>
                    <div class="mb-3">
                        <label for="productType" class="form-label">Product Type</label>
                        <select class="form-select" id="productType" required>
                            <option value="">Select a product type...</option>
                            <option value="vegetables">Vegetables</option>
                            <option value="fruits">Fruits</option>
                            <option value="dairy-products">Dairy products</option>
                            <option value="meat-products">Meat products</option>
                            <option value="seafood">Seafood</option>
                            <option value="cereals">Cereals</option>
                            <option value="flour">Flour</option>
                            <option value="drinks">Drinks</option>
                            <option value="other">Other</option>
                        </select>
                    </div>
                    <button type="submit" class="btn btn-primary">Add</button>
                </form>
            </div>
        </div>
    </div>
</div>

<div id="addRecipeModal" class="modal">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title">Add Recipe</h5>
                <button type="button" class="btn-close" onclick="hideModalAddRecipe()"></button>
            </div>
            <div class="modal-body">
                <form>
                    <div class="mb-3">
                        <label for="recipeName" class="form-label">Recipe Name</label>
                        <input type="text" class="form-control" id="recipeName" required>
                    </div>
                    <div class="mb-3">
                        <label for="description-text" class="col-form-label">Description:</label>
                        <textarea class="form-control" id="description-text" required></textarea>
                    </div>
                    <button type="submit" class="btn btn-primary">Add</button>
                </form>
            </div>
        </div>
    </div>
</div>

<script src="${pageContext.request.contextPath}/js/addProductModal.js"></script>
</body>
</html>
