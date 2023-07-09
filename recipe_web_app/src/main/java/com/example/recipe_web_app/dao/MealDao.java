package com.example.recipe_web_app.dao;

import com.example.recipe_web_app.modal.Meal;

import java.util.List;

public interface MealDao {
    List<Meal> getAllMealsFromDB();

}
