package com.example.recipe_web_app_spring.service;

import com.example.recipe_web_app_spring.dao.MealDao;
import com.example.recipe_web_app_spring.dao.RecipeDao;
import com.example.recipe_web_app_spring.model.Recipes;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeService {

    private final RecipeDao recipeDao;


    public RecipeService(RecipeDao recipeDao) {
        this.recipeDao = recipeDao;
    }

    public List<Recipes> getAllRecipesFromDB() {
        return recipeDao.getAllRecipesFromDB();
    }

    public List<Recipes> searchRecipesByIngredients(List<String> selectedIngredients) {
        return recipeDao.searchRecipesByIngredients(selectedIngredients);
    }

    public List<Recipes> searchRecipesByMeals(List<String> selectedMeals) {
        return recipeDao.searchRecipesByMeals(selectedMeals);
    }
}
