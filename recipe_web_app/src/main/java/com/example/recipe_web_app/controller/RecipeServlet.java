package com.example.recipe_web_app.controller;

import com.example.recipe_web_app.dao.impl.IngredientDaoImpl;
import com.example.recipe_web_app.dao.impl.RecipeDaoImpl;
import com.example.recipe_web_app.modal.Recipes;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@WebServlet(name = "recipe-servlet", value = "/recipes")
public class RecipeServlet extends HttpServlet {
    public final RecipeDaoImpl recipeDao;

    public RecipeServlet() {
        this.recipeDao = new RecipeDaoImpl();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Recipes> dbRecipes = recipeDao.getAllRecipesFromDB();
        Collections.sort(dbRecipes, Comparator.comparing(recipe -> recipe.getName()));
        request.setAttribute("recipes", dbRecipes);
        request.getRequestDispatcher("recipecatalog.jsp").forward(request, response);

    }
}
