package com.example.recipe_web_app.controller;

import com.example.recipe_web_app.dao.impl.MealDaoImpl;
import com.example.recipe_web_app.dao.impl.RecipeDaoImpl;
import com.example.recipe_web_app.modal.Meal;
import com.example.recipe_web_app.modal.Recipes;
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
    public RecipeDaoImpl recipeDao ;
    public MealDaoImpl mealDao ;

    public RecipeServlet() {
        this.recipeDao = new RecipeDaoImpl(recipeDao);
        this.mealDao = new MealDaoImpl(mealDao);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Recipes> dbRecipes = recipeDao.getAllRecipesFromDB();
        Collections.sort(dbRecipes, Comparator.comparing(recipe -> recipe.getName()));
        request.setAttribute("recipes", dbRecipes);

        List<Meal> dbMeals = mealDao.getAllMealsFromDB();
        Collections.sort(dbMeals, Comparator.comparing(meal -> meal.getName()));
        request.setAttribute("meals", dbMeals);

        request.getRequestDispatcher("recipecatalog.jsp").forward(request, response);
    }
}
