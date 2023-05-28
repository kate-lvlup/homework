package com.example.recipe_web_app.dao;

import com.example.recipe_web_app.modal.Ingredient;

import java.util.List;

public interface IngredientDao {
    List<Ingredient> getAllIngredientsByType(String ingredientTypeName);
}
