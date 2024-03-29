package com.example.recipe_web_app.controller;

import com.example.recipe_web_app.dao.impl.IngredientDaoImpl;
import com.example.recipe_web_app.modal.Ingredient;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

@WebServlet(name = "main-page-servlet", value = "/ingredients")
public class IngredientsServlet extends HttpServlet {

    public final IngredientDaoImpl ingredientDao;

    public IngredientsServlet() {
        this.ingredientDao = new IngredientDaoImpl();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<String> ingredientTypeNames = new ArrayList<>();
        ingredientTypeNames.add("Vegetables");
        ingredientTypeNames.add("Fruits");
        ingredientTypeNames.add("Dairy");
        ingredientTypeNames.add("Meat");
        ingredientTypeNames.add("Seafood");
        ingredientTypeNames.add("Cereals");
        ingredientTypeNames.add("Flour");
        ingredientTypeNames.add("Drinks");
        ingredientTypeNames.add("Other");

        Map<String, List<Ingredient>> ingredientMap = new TreeMap<>();

        for (String ingredientType : ingredientTypeNames) {
            List<Ingredient> dbIngredients = ingredientDao.getAllIngredientsByType(ingredientType);
            Collections.sort(dbIngredients, Comparator.comparing(ingredient -> ingredient.getName()));
            ingredientMap.put(ingredientType, dbIngredients);
        }
        request.setAttribute("ingredientMap", ingredientMap);
        request.getRequestDispatcher("ingredients.jsp").forward(request, response);
    }

}
