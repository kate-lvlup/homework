package com.example.recipe_web_app_spring.controller;

import com.example.recipe_web_app_spring.dao.IngredientDao;
import com.example.recipe_web_app_spring.dao.impl.IngredientDaoImpl;
import com.example.recipe_web_app_spring.model.Ingredient;
import com.example.recipe_web_app_spring.model.IngredientType;
import com.example.recipe_web_app_spring.service.RecipeService;
import com.example.recipe_web_app_spring.util.IngredientValidator;
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

    private final IngredientDao ingredientDao;

    public ProductAddController(RecipeService recipeService, SessionFactory sessionFactory, IngredientDao ingredientDao) {
        this.recipeService = recipeService;
        this.sessionFactory = sessionFactory;
        this.ingredientDao = ingredientDao;
    }


    @PostMapping
    public String addProductByMeal(HttpServletRequest request) {
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

        IngredientValidator ingredientValidator = new IngredientValidator(ingredientDao);
        Map<String, String> errors = ingredientValidator.validateIngredient(name);
        if (errors.size() > 0) {
            request.getSession().setAttribute("errors", errors);
            request.getSession().setAttribute("name", name);
            return "redirect:/ingredients";

        }
        request.getSession().setAttribute("errors", null);
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(ingredient);
        transaction.commit();
        session.close();
        return "redirect:/ingredients";
    }

}
