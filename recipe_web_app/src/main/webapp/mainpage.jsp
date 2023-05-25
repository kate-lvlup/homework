<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Recipes Book</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css">
    <%--    <link rel="stylesheet" href="/css/mainpage.css">--%>
    <link rel="stylesheet" href="<c:url value="/css/mainpage.css"/>">
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
    <div class="container">
        <div class="product-block" style="background-image: url('/img/broccoli.png');">
            <div class="product-type">Vegetables</div>
            <ul class="product-list">
                <li><input type="checkbox" id="eggplant"><label for="eggplant">Eggplant</label></li>
                <li><input type="checkbox" id="tomato"><label for="tomato">Tomato</label></li>
                <li><input type="checkbox" id="cucumber"><label for="cucumber">Cucumber</label></li>
                <li><input type="checkbox" id="potato"><label for="potato">Potato</label></li>
                <li><input type="checkbox" id="onion"><label for="onion">Onion</label></li>
                <li><input type="checkbox" id="carrot"><label for="carrot">Carrot</label></li>
                <li><input type="checkbox" id="cabbage"><label for="cabbage">Cabbage</label></li>
                <li><input type="checkbox" id="broccoli"><label for="broccoli">Broccoli</label></li>
                <li><input type="checkbox" id="bell-pepper"><label for="bell-pepper">Bell Pepper</label></li>
                <li><input type="checkbox" id="zucchini"><label for="zucchini">Zucchini</label></li>
                <li><input type="checkbox" id="spinach"><label for="spinach">Spinach</label></li>
                <li><input type="checkbox" id="cauliflower"><label for="cauliflower">Cauliflower</label></li>
                <li><input type="checkbox" id="lettuce"><label for="lettuce">Lettuce</label></li>
                <li><input type="checkbox" id="radish"><label for="radish">Radish</label></li>
                <li><input type="checkbox" id="asparagus"><label for="asparagus">Asparagus</label></li>
            </ul>
        </div>

        <div class="product-block" style="background-image: url('/img/peach.png');">
            <div class="product-type">Fruits</div>
            <ul class="product-list">
                <li><input type="checkbox" id="apricot"><label for="apricot">Apricot</label></li>
                <li><input type="checkbox" id="pear"><label for="pear">Pear</label></li>
                <li><input type="checkbox" id="apple"><label for="apple">Apple</label></li>
                <li><input type="checkbox" id="grape"><label for="grape">Grape</label></li>
                <li><input type="checkbox" id="orange"><label for="orange">Orange</label></li>
                <li><input type="checkbox" id="banana"><label for="banana">Banana</label></li>
                <li><input type="checkbox" id="strawberry"><label for="strawberry">Strawberry</label></li>
                <li><input type="checkbox" id="kiwi"><label for="kiwi">Kiwi</label></li>
                <li><input type="checkbox" id="pineapple"><label for="pineapple">Pineapple</label></li>
                <li><input type="checkbox" id="mango"><label for="mango">Mango</label></li>
                <li><input type="checkbox" id="watermelon"><label for="watermelon">Watermelon</label></li>
                <li><input type="checkbox" id="cherry"><label for="cherry">Cherry</label></li>
                <li><input type="checkbox" id="plum"><label for="plum">Plum</label></li>
                <li><input type="checkbox" id="peach"><label for="peach">Peach</label></li>
                <li><input type="checkbox" id="blueberry"><label for="blueberry">Blueberry</label></li>
            </ul>
        </div>

        <div class="product-block" style="background-image: url('/img/cheese.png');">
            <div class="product-type">Dairy products</div>
            <ul class="product-list">
                <li><input type="checkbox" id="milk"><label for="milk">Milk</label></li>
                <li><input type="checkbox" id="sour-cream"><label for="sour-cream">Sour cream</label></li>
                <li><input type="checkbox" id="cheese"><label for="cheese">Cheese</label></li>
                <li><input type="checkbox" id="cream"><label for="cream">Cream</label></li>
                <li><input type="checkbox" id="butter"><label for="butter">Butter</label></li>
                <li><input type="checkbox" id="yogurt"><label for="yogurt">Yogurt</label></li>
                <li><input type="checkbox" id="cottage-cheese"><label for="cottage-cheese">Cottage Cheese</label></li>
                <li><input type="checkbox" id="whipped-cream"><label for="whipped-cream">Whipped Cream</label></li>
                <li><input type="checkbox" id="condensed-milk"><label for="condensed-milk">Condensed Milk</label></li>
                <li><input type="checkbox" id="ice-cream"><label for="ice-cream">Ice Cream</label></li>
                <li><input type="checkbox" id="feta-cheese"><label for="feta-cheese">Feta Cheese</label></li>
                <li><input type="checkbox" id="cream-cheese"><label for="cream-cheese">Cream Cheese</label></li>
                <li><input type="checkbox" id="mozzarella"><label for="mozzarella">Mozzarella</label></li>
                <li><input type="checkbox" id="provolone"><label for="provolone">Provolone</label></li>
                <li><input type="checkbox" id="gouda"><label for="gouda">Gouda</label></li>
            </ul>
        </div>

        <div class="product-block" style="background-image: url('/img/meat.png');">
            <div class="product-type">Meat products</div>
            <ul class="product-list">
                <li><input type="checkbox" id="pork"><label for="pork">Pork</label></li>
                <li><input type="checkbox" id="veal"><label for="veal">Veal</label></li>
                <li><input type="checkbox" id="chicken"><label for="chicken">Chicken</label></li>
                <li><input type="checkbox" id="beef"><label for="beef">Beef</label></li>
                <li><input type="checkbox" id="lamb"><label for="lamb">Lamb</label></li>
                <li><input type="checkbox" id="turkey"><label for="turkey">Turkey</label></li>
                <li><input type="checkbox" id="duck"><label for="duck">Duck</label></li>
                <li><input type="checkbox" id="salami"><label for="salami">Salami</label></li>
                <li><input type="checkbox" id="sausage"><label for="sausage">Sausage</label></li>
                <li><input type="checkbox" id="bacon"><label for="bacon">Bacon</label></li>
                <li><input type="checkbox" id="ham"><label for="ham">Ham</label></li>
                <li><input type="checkbox" id="pepperoni"><label for="pepperoni">Pepperoni</label></li>
                <li><input type="checkbox" id="chorizo"><label for="chorizo">Chorizo</label></li>
                <li><input type="checkbox" id="pastrami"><label for="pastrami">Pastrami</label></li>
                <li><input type="checkbox" id="ground-beef"><label for="ground-beef">Ground Beef</label></li>
            </ul>
        </div>
        <div class="product-block" style="background-image: url('/img/fish.png');">
            <div class="product-type">Seafood</div>
            <ul class="product-list">
                <li><input type="checkbox" id="anchovies"><label for="anchovies">Anchovies</label></li>
                <li><input type="checkbox" id="caviar"><label for="caviar">Caviar</label></li>
                <li><input type="checkbox" id="crab-sticks"><label for="crab-sticks">Crab sticks</label></li>
                <li><input type="checkbox" id="shrimps"><label for="shrimps">Shrimps</label></li>
                <li><input type="checkbox" id="mussels"><label for="mussels">Mussels</label></li>
                <li><input type="checkbox" id="fish"><label for="fish">Fish</label></li>
                <li><input type="checkbox" id="oysters"><label for="oysters">Oysters</label></li>
            </ul>
        </div>

        <div class="product-block" style="background-image: url('/img/wheat.png');">
            <div class="product-type">Cereals</div>
            <ul class="product-list">
                <li><input type="checkbox" id="hercules"><label for="hercules">Hercules</label></li>
                <li><input type="checkbox" id="buckwheat"><label for="buckwheat">Buckwheat</label></li>
                <li><input type="checkbox" id="semolina"><label for="semolina">Semolina</label></li>
                <li><input type="checkbox" id="pearl-barley"><label for="pearl-barley">Pearl barley</label></li>
                <li><input type="checkbox" id="barley-groats"><label for="barley-groats">Barley groats</label></li>
                <li><input type="checkbox" id="millet"><label for="millet">Millet</label></li>
                <li><input type="checkbox" id="rice"><label for="rice">Rice</label></li>
                <li><input type="checkbox" id="sago"><label for="sago">Sago</label></li>
                <li><input type="checkbox" id="lentils"><label for="lentils">Lentils</label></li>
            </ul>
        </div>

        <div class="product-block" style="background-image: url('/main/webapp/img/bread.png');">
            <div class="product-type">Flour</div>
            <ul class="product-list">
                <li><input type="checkbox" id="noodles"><label for="noodles">Noodles</label></li>
                <li><input type="checkbox" id="pasta"><label for="pasta">Pasta</label></li>
                <li><input type="checkbox" id="potato-flour"><label for="potato-flour">Potato flour</label></li>
                <li><input type="checkbox" id="wheat-flour"><label for="wheat-flour">Wheat flour</label></li>
                <li><input type="checkbox" id="bread"><label for="bread">Bread</label></li>
            </ul>
        </div>

        <div class="product-block" style="background-image: url('/img/drinks.png');">
            <div class="product-type">Drinks</div>
            <ul class="product-list">
                <li><input type="checkbox" id="wine"><label for="wine">Wine</label></li>
                <li><input type="checkbox" id="vodka"><label for="vodka">Vodka</label></li>
                <li><input type="checkbox" id="cognac"><label for="cognac">Cognac</label></li>
                <li><input type="checkbox" id="liquor"><label for="liquor">Liquor</label></li>
                <li><input type="checkbox" id="beer"><label for="beer">Beer</label></li>

            </ul>
        </div>

        <div class="product-block" style="background-image: url('/img/mushroom.png');">
            <div class="product-type">Other</div>
            <ul class="product-list">
                <li><input type="checkbox" id="mushrooms"><label for="mushrooms">Mushrooms</label></li>
                <li><input type="checkbox" id="yeast"><label for="yeast">Yeast</label></li>
                <li><input type="checkbox" id="cocoa"><label for="cocoa">Cocoa</label></li>
                <li><input type="checkbox" id="coffee"><label for="coffee">Coffee</label></li>
                <li><input type="checkbox" id="poppy"><label for="poppy">Poppy</label></li>
                <li><input type="checkbox" id="vegetable-oil"><label for="vegetable-oil">Vegetable oil</label></li>
                <li><input type="checkbox" id="honey"><label for="honey">Honey</label></li>
                <li><input type="checkbox" id="sugar"><label for="sugar">Sugar</label></li>
                <li><input type="checkbox" id="soda"><label for="soda">Soda</label></li>
                <li><input type="checkbox" id="tea"><label for="tea">Tea</label></li>
                <li><input type="checkbox" id="chocolate"><label for="chocolate">Chocolate</label></li>
                <li><input type="checkbox" id="eggs"><label for="eggs">Eggs</label></li>
            </ul>
        </div>
        <button type="button" class="btn btn-success">Search recipes</button>
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

<script src="/main/webapp/js/addProductModal.js"></script>
</body>
</html>
