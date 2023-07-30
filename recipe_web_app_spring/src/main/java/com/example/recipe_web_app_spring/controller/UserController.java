package com.example.recipe_web_app_spring.controller;


import com.example.recipe_web_app_spring.model.Ingredient;
import com.example.recipe_web_app_spring.model.User;
import com.example.recipe_web_app_spring.model.command.UserCommand;
import com.example.recipe_web_app_spring.service.IngredientService;
import com.example.recipe_web_app_spring.service.UserService;

import com.example.recipe_web_app_spring.util.UserFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;


@Controller
@RequestMapping(value = "/user")
public class UserController {
    private IngredientService ingredientService;

    public UserController(IngredientService ingredientService) {
        this.ingredientService = ingredientService;
    }

    @GetMapping
    public String getAllIngredientsByType(
//            @ModelAttribute("ingredientTypeName") String ingredientTypeName,
            Model model) {
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
            List<Ingredient> dbIngredients = ingredientService.getAllIngredientsByType(ingredientType);
            Collections.sort(dbIngredients, Comparator.comparing(ingredient -> ingredient.getName()));
            ingredientMap.put(ingredientType, dbIngredients);
        }
        model.addAttribute("ingredientMap", ingredientMap);
        return "/ingredients";
    }
}

