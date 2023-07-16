package com.example.recipe_web_app_spring.service;

import com.example.recipe_web_app_spring.dao.MealDao;
import com.example.recipe_web_app_spring.model.Meal;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MealService {
    private final MealDao mealDao;

    public MealService(MealDao mealDao) {
        this.mealDao = mealDao;
    }

    public List<Meal> getAllMealsFromDB() {
        return mealDao.getAllMealsFromDB();
    }
}
