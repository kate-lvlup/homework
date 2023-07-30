package com.example.recipe_web_app_spring.dao;

import com.example.recipe_web_app_spring.model.Ingredient;

import java.util.List;

public interface IngredientDao {
    List<Ingredient> getAllIngredientsByType(String ingredientTypeName);

    List<Ingredient> getAllIngredients();

}
