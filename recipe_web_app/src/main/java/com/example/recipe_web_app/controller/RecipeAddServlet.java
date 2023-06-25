package com.example.recipe_web_app.controller;

import com.example.recipe_web_app.modal.Ingredient;
import com.example.recipe_web_app.modal.IngredientRecipe;
import com.example.recipe_web_app.modal.IngredientType;
import com.example.recipe_web_app.modal.Recipes;
import com.example.recipe_web_app.util.HibernateUtil;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@WebServlet(name = "recipe-add-servlet", value = "/addrecipe")
public class RecipeAddServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name = request.getParameter("nameRecipe");
        String description = request.getParameter("nameDescription");
        String hiddenValue = request.getParameter("selectedValues");
        ObjectMapper objectMapper = new ObjectMapper();
        String[] selectedValues = objectMapper.readValue(hiddenValue, String[].class);
        List<String> selectedIngredientList = Arrays.asList(selectedValues);

        Recipes recipe = Recipes.builder()
                .name(name)
                .description(description)
                .build();

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(recipe);
//        Long recipeId = recipe.getId();

        for (String el : selectedIngredientList) {
            Query<Long> ingredientQuery = session.createQuery("""
                SELECT i.id FROM Ingredient i
                WHERE i.name = :el
                """, Long.class);
            ingredientQuery.setParameter("el", el);
            List<Long> ingredients = ingredientQuery.getResultList();

            for (Long ingredientId : ingredients) {
                Ingredient ingredient = session.get(Ingredient.class, ingredientId);
                IngredientRecipe ingredientRecipe = new IngredientRecipe();
                ingredientRecipe.setIngredientId(ingredient);
                ingredientRecipe.setRecipeId(recipe);
                session.save(ingredientRecipe);
            }
        }

        transaction.commit();
        session.close();
        response.sendRedirect("ingredients");
    }
}
