package com.example.recipe_web_app_spring.controller;

import com.example.recipe_web_app_spring.dao.impl.RecipeDaoImpl;
import com.example.recipe_web_app_spring.model.Recipes;
import com.example.recipe_web_app_spring.service.RecipeService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Controller
@RequestMapping(value = "/searchRecipe")
public class RecipeSearchController {
    private RecipeService recipeService;

    public RecipeSearchController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @PostMapping
    public String searchRecipesByIngredients(Model model, HttpServletRequest request) throws JsonProcessingException {
        String hiddenValue = request.getParameter("selectedValues");
        ObjectMapper objectMapper = new ObjectMapper();
        String[] selectedValues = objectMapper.readValue(hiddenValue, String[].class);
        List<String> selectedIngredientList = Arrays.asList(selectedValues);
        List<Recipes> recipes = recipeService.searchRecipesByIngredients(selectedIngredientList);
        Collections.sort(recipes, Comparator.comparing(recipe -> recipe.getName()));
        model.addAttribute("searchRecipes", recipes);
        return "/searchResults";
    }

}
