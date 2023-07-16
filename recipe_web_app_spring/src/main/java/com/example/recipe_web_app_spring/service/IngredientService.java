package com.example.recipe_web_app_spring.service;

import com.example.recipe_web_app_spring.dao.IngredientDao;
import com.example.recipe_web_app_spring.model.Ingredient;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IngredientService {
    private final IngredientDao ingredientDao;

    public IngredientService(IngredientDao ingredientDao) {
        this.ingredientDao = ingredientDao;
    }

    public List<Ingredient> getAllIngredientsByType(String ingredientTypeName) {
        return ingredientDao.getAllIngredientsByType(ingredientTypeName);
    }

}
