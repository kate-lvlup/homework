package com.example.recipe_web_app_spring.controller;

import com.example.recipe_web_app_spring.model.Ingredient;
import com.example.recipe_web_app_spring.model.IngredientRecipe;
import com.example.recipe_web_app_spring.model.Meal;
import com.example.recipe_web_app_spring.model.Recipes;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.*;

@Controller
@RequestMapping(value = "/addrecipe")
public class RecipeAddController {

    private final SessionFactory sessionFactory;

    public RecipeAddController(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @PostMapping
    public String addRecipe(Model model, HttpServletRequest request) throws JsonProcessingException {
        String name = request.getParameter("nameRecipe");
        String mealTypeName = request.getParameter("mealTypeName");
        Meal meal = null;

        Map<Long, String> mealTypeNames = new TreeMap<>();
        mealTypeNames.put(1L, "Breakfast");
        mealTypeNames.put(2L, "Lunch");
        mealTypeNames.put(3L, "Dinner");
        mealTypeNames.put(4L, "Desserts");
        mealTypeNames.put(5L, "Snacks");

        for(Map.Entry<Long, String> entry: mealTypeNames.entrySet()) {
            if (mealTypeName.equals(entry.getValue())){
                meal = new Meal();
                meal.setId(entry.getKey());
                meal.setName(entry.getValue());
                break;
            }
        }
        String description = request.getParameter("nameDescription");
        String hiddenValue = request.getParameter("selectedValues");
        ObjectMapper objectMapper = new ObjectMapper();
        String[] selectedValues = objectMapper.readValue(hiddenValue, String[].class);
        List<String> selectedIngredientList = Arrays.asList(selectedValues);

        Recipes recipe = Recipes.builder()
                .name(name)
                .description(description)
                .meal(meal)
                .build();

//        SessionFactory sessionFactory = sessionFactory.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(recipe);
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
        return "redirect:/ingredients";
    }
}
