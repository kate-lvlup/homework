package com.example.recipe_web_app.dao;

import com.example.recipe_web_app.modal.Ingredient;
import com.example.recipe_web_app.modal.Recipes;

import java.util.List;

public interface IngredientDao {
    List<Ingredient> getAllIngredientsByType(String ingredientTypeName);
    Ingredient getIngredientById(String ingredientId);
    Ingredient findById(Long id);
    List<Recipes> getIngredientRecipes(Long ingredientId);
}
