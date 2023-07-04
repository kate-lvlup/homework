package com.example.recipe_web_app.dao;

import com.example.recipe_web_app.modal.Recipes;

import java.util.List;

public interface RecipeDao {
    List<Recipes> getAllRecipesFromDB();

    public List<Recipes> searchRecipesByIngredients(List<String> selectedIngredients);
}