package com.example.recipe_web_app.controller;

import com.example.recipe_web_app.dao.impl.RecipeDaoImpl;
import com.example.recipe_web_app.modal.Recipes;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@WebServlet(name = "recipe-search-servlet", value = "/searchRecipe")
public class RecipeSearchServlet extends HttpServlet {
    public RecipeDaoImpl recipeDao;

    public RecipeSearchServlet() {
        this.recipeDao = new RecipeDaoImpl(recipeDao);
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String hiddenValue = request.getParameter("selectedValues");
        ObjectMapper objectMapper = new ObjectMapper();
        String[] selectedValues = objectMapper.readValue(hiddenValue, String[].class);
        List<String> selectedIngredientList = Arrays.asList(selectedValues);
        List<Recipes> recipes = recipeDao.searchRecipesByIngredients(selectedIngredientList);
        Collections.sort(recipes, Comparator.comparing(recipe -> recipe.getName()));
        request.setAttribute("searchRecipes", recipes);
        request.getRequestDispatcher("searchResults.jsp").forward(request, response);
    }

}
