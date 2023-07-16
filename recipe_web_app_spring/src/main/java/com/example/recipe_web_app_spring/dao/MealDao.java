package com.example.recipe_web_app_spring.dao;

import com.example.recipe_web_app_spring.model.Meal;

import java.util.List;

public interface MealDao {
    List<Meal> getAllMealsFromDB();

}
