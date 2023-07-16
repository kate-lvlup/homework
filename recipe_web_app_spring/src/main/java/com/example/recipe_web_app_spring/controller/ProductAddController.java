package com.example.recipe_web_app_spring.controller;

import com.example.recipe_web_app_spring.model.Ingredient;
import com.example.recipe_web_app_spring.model.IngredientType;
import com.example.recipe_web_app_spring.service.RecipeService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

@Controller
@RequestMapping(value = "/addproduct")
public class ProductAddController {

    private RecipeService recipeService;
    private final SessionFactory sessionFactory;

    public ProductAddController(RecipeService recipeService, SessionFactory sessionFactory) {
        this.recipeService = recipeService;
        this.sessionFactory = sessionFactory;
    }


    @PostMapping
    public String searchRecipesByMeals(HttpServletRequest request) {
        String name = request.getParameter("name");
        String ingredientTypeName = request.getParameter("ingredientTypeName");
        IngredientType ingredientType = null;

        Map<Long, String> ingredientTypeNames = new TreeMap<>();
        ingredientTypeNames.put(1L, "Vegetables");
        ingredientTypeNames.put(2L, "Fruits");
        ingredientTypeNames.put(3L, "Dairy");
        ingredientTypeNames.put(4L, "Meat");
        ingredientTypeNames.put(5L, "Seafood");
        ingredientTypeNames.put(6L, "Cereals");
        ingredientTypeNames.put(7L, "Flour");
        ingredientTypeNames.put(8L, "Drinks");
        ingredientTypeNames.put(9L, "Other");

        for (Map.Entry<Long, String> entry : ingredientTypeNames.entrySet()) {
            if (ingredientTypeName.equals(entry.getValue())) {
                ingredientType = new IngredientType();
                ingredientType.setId(entry.getKey());
                ingredientType.setName(entry.getValue());
                break;
            }
        }

        Ingredient ingredient = Ingredient.builder()
                .name(name)
                .ingredientTypeId(ingredientType)
                .build();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(ingredient);
        transaction.commit();
        session.close();
        return "redirect:/ingredients";
    }

}
