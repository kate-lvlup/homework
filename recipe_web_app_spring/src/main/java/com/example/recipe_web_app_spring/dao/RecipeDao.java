package com.example.recipe_web_app_spring.dao;

import com.example.recipe_web_app_spring.model.Recipes;

import java.util.List;

public interface RecipeDao {
    List<Recipes> getAllRecipesFromDB();

    List<Recipes> searchRecipesByIngredients(List<String> selectedIngredients);

    List<Recipes> searchRecipesByMeals(List<String> selectedMeals);


}
