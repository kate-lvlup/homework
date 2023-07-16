package com.example.recipe_web_app_spring.controller;

import com.example.recipe_web_app_spring.dao.impl.RecipeDaoImpl;
import com.example.recipe_web_app_spring.model.Recipes;
import com.example.recipe_web_app_spring.service.RecipeService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Controller
@RequestMapping(value = "/searchRecipeByMeal")
public class RecipeSearchByMealsController {
    private RecipeService recipeService;

    public RecipeSearchByMealsController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @PostMapping
    public String searchRecipesByMeals(Model model, HttpServletRequest request) throws JsonProcessingException {
        String hiddenValue = request.getParameter("selectedValues");
        ObjectMapper objectMapper = new ObjectMapper();
        String[] selectedValues = objectMapper.readValue(hiddenValue, String[].class);
        List<String> selectedMealList = Arrays.asList(selectedValues);
        List<Recipes> recipes = recipeService.searchRecipesByMeals(selectedMealList);
        Collections.sort(recipes, Comparator.comparing(recipe -> recipe.getName()));
        model.addAttribute("searchRecipes", recipes);
        return "/searchResults";
    }
}
