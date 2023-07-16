package com.example.recipe_web_app_spring.controller;

import com.example.recipe_web_app_spring.model.Meal;
import com.example.recipe_web_app_spring.model.Recipes;
import com.example.recipe_web_app_spring.service.MealService;
import com.example.recipe_web_app_spring.service.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Controller
@RequestMapping(value = "/recipes")
public class RecipeController {

    private RecipeService recipeService;
    private MealService mealService;

    public RecipeController(RecipeService recipeService, MealService mealService){
        this.recipeService = recipeService;
        this.mealService = mealService;
    }

    @GetMapping
    public String getAllRecipesFromDB(Model model){
        List<Recipes> dbRecipes = recipeService.getAllRecipesFromDB();
        Collections.sort(dbRecipes, Comparator.comparing(recipe -> recipe.getName()));
        model.addAttribute("recipes", dbRecipes);

        List<Meal> dbMeals = mealService.getAllMealsFromDB();
        Collections.sort(dbMeals, Comparator.comparing(meal -> meal.getName()));
        model.addAttribute("meals", dbMeals);
        return "/recipecatalog";
    }
}
