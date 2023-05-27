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
    <a href="mainpage.jsp"><i class="bi bi-house-door"></i>Main page</a>
    <a href="#" onclick="showModalAddProduct()"><i class="bi bi-send-plus"></i>Add product</a>
    <a href="#" onclick="showModalAddRecipe()"><i class="bi bi-send-plus"></i>Add recipe</a>
    <a href="recipecatalog.jsp"><i class="bi bi-journal-check"></i>Recipe catalog</a>
    <a href="#"><i class="bi bi-box-arrow-in-right me-2"></i>Login</a>
</div>
<form>
    <div class="container_recipe">
        <div class="form-row">
            <div class="form-check form-check-inline">
                <input class="form-check-input" type="checkbox" id="breakfast" value="breakfast" checked>
                <label class="form-check-label" for="breakfast">Breakfast<i class="bi bi-cup-hot icon-meal"></i></label>
            </div>
            <div class="form-check form-check-inline">
                <input class="form-check-input" type="checkbox" id="lunch" value="lunch" checked>
                <label class="form-check-label" for="lunch">Lunch<i class="bi bi-egg-fried icon-meal"></i></label>
            </div>
            <div class="form-check form-check-inline">
                <input class="form-check-input" type="checkbox" id="dinner" value="dinner" checked>
                <label class="form-check-label" for="dinner">Dinner<i class="bi bi-moon-stars icon-meal"></i></i>
                </label>
            </div>
            <div class="form-check form-check-inline">
                <input class="form-check-input" type="checkbox" id="desserts" value="desserts" checked>
                <label class="form-check-label" for="desserts">Desserts<i class="bi bi-hypnotize icon-meal"></i></label>
            </div>
            <div class="form-check form-check-inline">
                <input class="form-check-input" type="checkbox" id="snacks" value="snacks" checked>
                <label class="form-check-label" for="snacks">Snacks <i class="bi bi-palette icon-meal"></i></label>
            </div>
            <button type="button" class="btn btn-success" id="applyBtn">Apply</button>
        </div>


        <div class="recipe-list">
            <h3>Recipes:</h3>
            <ul>
                <li>
                    <div class="recipe-item">
                        <h5>Lemon Herb Grilled</h5>
                        <p>Assorted Vegetables such as Bell Peppers, Zucchini, Eggplant, and Asparagus marinated in a
                            tangy Lemon-Herb dressing, then grilled to perfection. A flavorful and healthy side
                            dish.</p>
                    </div>
                </li>
                <li>
                    <div class="recipe-item">
                        <h5>Lemon Herb Grilled</h5>
                        <p>Assorted Vegetables such as Bell Peppers, Zucchini, Eggplant, and Asparagus marinated in a
                            tangy Lemon-Herb dressing, then grilled to perfection. A flavorful and healthy side
                            dish.</p>
                    </div>
                </li>
                <li>
                    <div class="recipe-item">
                        <h5>Lemon Herb Grilled</h5>
                        <p>Assorted Vegetables such as Bell Peppers, Zucchini, Eggplant, and Asparagus marinated in a
                            tangy Lemon-Herb dressing, then grilled to perfection. A flavorful and healthy side
                            dish.</p>
                    </div>
                </li>
                <li>
                    <div class="recipe-item">
                        <h5>Lemon Herb Grilled</h5>
                        <p>Assorted Vegetables such as Bell Peppers, Zucchini, Eggplant, and Asparagus marinated in a
                            tangy Lemon-Herb dressing, then grilled to perfection. A flavorful and healthy side
                            dish.</p>
                    </div>
                </li>
                <li>
                    <div class="recipe-item">
                        <h5>Lemon Herb Grilled</h5>
                        <p>Assorted Vegetables such as Bell Peppers, Zucchini, Eggplant, and Asparagus marinated in a
                            tangy Lemon-Herb dressing, then grilled to perfection. A flavorful and healthy side
                            dish.</p>
                    </div>
                </li>
                <li>
                    <div class="recipe-item">
                        <h5>Lemon Herb Grilled</h5>
                        <p>Assorted Vegetables such as Bell Peppers, Zucchini, Eggplant, and Asparagus marinated in a
                            tangy Lemon-Herb dressing, then grilled to perfection. A flavorful and healthy side
                            dish.</p>
                    </div>
                </li>
                <li>
                    <div class="recipe-item">
                        <h5>Lemon Herb Grilled</h5>
                        <p>Assorted Vegetables such as Bell Peppers, Zucchini, Eggplant, and Asparagus marinated in a
                            tangy Lemon-Herb dressing, then grilled to perfection. A flavorful and healthy side
                            dish.</p>
                    </div>
                </li>
                <li>
                    <div class="recipe-item">
                        <h5>Lemon Herb Grilled</h5>
                        <p>Assorted Vegetables such as Bell Peppers, Zucchini, Eggplant, and Asparagus marinated in a
                            tangy Lemon-Herb dressing, then grilled to perfection. A flavorful and healthy side
                            dish.</p>
                    </div>
                </li>
                <li>
                    <div class="recipe-item">
                        <h5>Lemon Herb Grilled</h5>
                        <p>Assorted Vegetables such as Bell Peppers, Zucchini, Eggplant, and Asparagus marinated in a
                            tangy Lemon-Herb dressing, then grilled to perfection. A flavorful and healthy side
                            dish.</p>
                    </div>
                </li>
                <li>
                    <div class="recipe-item">
                        <h5>Lemon Herb Grilled</h5>
                        <p>Assorted Vegetables such as Bell Peppers, Zucchini, Eggplant, and Asparagus marinated in a
                            tangy Lemon-Herb dressing, then grilled to perfection. A flavorful and healthy side
                            dish.</p>
                    </div>
                </li>
                <li>
                    <div class="recipe-item">
                        <h5>Lemon Herb Grilled</h5>
                        <p>Assorted Vegetables such as Bell Peppers, Zucchini, Eggplant, and Asparagus marinated in a
                            tangy Lemon-Herb dressing, then grilled to perfection. A flavorful and healthy side
                            dish.</p>
                    </div>
                </li>
                <li>
                    <div class="recipe-item">
                        <h5>Lemon Herb Grilled</h5>
                        <p>Assorted Vegetables such as Bell Peppers, Zucchini, Eggplant, and Asparagus marinated in a
                            tangy Lemon-Herb dressing, then grilled to perfection. A flavorful and healthy side
                            dish.</p>
                    </div>
                </li>
                <li>
                    <div class="recipe-item">
                        <h5>Lemon Herb Grilled</h5>
                        <p>Assorted Vegetables such as Bell Peppers, Zucchini, Eggplant, and Asparagus marinated in a
                            tangy Lemon-Herb dressing, then grilled to perfection. A flavorful and healthy side
                            dish.</p>
                    </div>
                </li>
                <li>
                    <div class="recipe-item">
                        <h5>Lemon Herb Grilled</h5>
                        <p>Assorted Vegetables such as Bell Peppers, Zucchini, Eggplant, and Asparagus marinated in a
                            tangy Lemon-Herb dressing, then grilled to perfection. A flavorful and healthy side
                            dish.</p>
                    </div>
                </li>
                <li>
                    <div class="recipe-item">
                        <h5>Lemon Herb Grilled</h5>
                        <p>Assorted Vegetables such as Bell Peppers, Zucchini, Eggplant, and Asparagus marinated in a
                            tangy Lemon-Herb dressing, then grilled to perfection. A flavorful and healthy side
                            dish.</p>
                    </div>
                </li>
                <li>
                    <div class="recipe-item">
                        <h5>Lemon Herb Grilled</h5>
                        <p>Assorted Vegetables such as Bell Peppers, Zucchini, Eggplant, and Asparagus marinated in a
                            tangy Lemon-Herb dressing, then grilled to perfection. A flavorful and healthy side
                            dish.</p>
                    </div>
                </li>
                <li>
                    <div class="recipe-item">
                        <h5>Lemon Herb Grilled</h5>
                        <p>Assorted Vegetables such as Bell Peppers, Zucchini, Eggplant, and Asparagus marinated in a
                            tangy Lemon-Herb dressing, then grilled to perfection. A flavorful and healthy side
                            dish.</p>
                    </div>
                </li>
                <li>
                    <div class="recipe-item">
                        <h5>Lemon Herb Grilled</h5>
                        <p>Assorted Vegetables such as Bell Peppers, Zucchini, Eggplant, and Asparagus marinated in a
                            tangy Lemon-Herb dressing, then grilled to perfection. A flavorful and healthy side
                            dish.</p>
                    </div>
                </li>
                <li>
                    <div class="recipe-item">
                        <h5>Lemon Herb Grilled</h5>
                        <p>Assorted Vegetables such as Bell Peppers, Zucchini, Eggplant, and Asparagus marinated in a
                            tangy Lemon-Herb dressing, then grilled to perfection. A flavorful and healthy side
                            dish.</p>
                    </div>
                </li>
                <li>
                    <div class="recipe-item">
                        <h5>Lemon Herb Grilled</h5>
                        <p>Assorted Vegetables such as Bell Peppers, Zucchini, Eggplant, and Asparagus marinated in a
                            tangy Lemon-Herb dressing, then grilled to perfection. A flavorful and healthy side
                            dish.</p>
                    </div>
                </li>
                <li>
                    <div class="recipe-item">
                        <h5>Lemon Herb Grilled</h5>
                        <p>Assorted Vegetables such as Bell Peppers, Zucchini, Eggplant, and Asparagus marinated in a
                            tangy Lemon-Herb dressing, then grilled to perfection. A flavorful and healthy side
                            dish.</p>
                    </div>
                </li>
            </ul>
        </div>


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

<script src="addProductModal.js"></script>
</body>
</html>
