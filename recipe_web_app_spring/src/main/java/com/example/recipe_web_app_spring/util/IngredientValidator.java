package com.example.recipe_web_app_spring.util;

import com.example.recipe_web_app_spring.dao.IngredientDao;
import com.example.recipe_web_app_spring.model.Ingredient;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class IngredientValidator {
    private final IngredientDao ingredientDao;

    public IngredientValidator(IngredientDao ingredientDao) {
        this.ingredientDao = ingredientDao;
    }


    public Map<String, String> validateIngredient(String name) {
        Map<String, String> errors = new HashMap<>();
        if(!validateIngredientName(name)){
            errors.put("error1", "Ingredient name must not be empty and contain at least 2 letters");
        }
        if (validateIngredientNameExistInDB(name)) {
            errors.put("error2", "Ingredient is already exist");
        }
        return errors;
    }

    private static boolean validateIngredientName(String ingredientName) {
        return ingredientName.matches("[a-zA-Z]{2,}");
    }

    public boolean validateIngredientNameExistInDB(String ingredientName) {
        List<Ingredient> allIngredients = ingredientDao.getAllIngredients();
        for (Ingredient i : allIngredients) {
            if (i.getName().equals(ingredientName)) {
                return true;
            }
        }
        return false;
    }


}
