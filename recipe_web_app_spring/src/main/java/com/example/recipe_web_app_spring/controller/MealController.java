package com.example.recipe_web_app_spring.controller;

import com.example.recipe_web_app_spring.model.Meal;
import com.example.recipe_web_app_spring.service.MealService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Controller
@RequestMapping(value = "/meals")
public class MealController {

    private MealService mealService;

    public MealController(MealService mealService) {
        this.mealService = mealService;
    }

    @GetMapping
    public String getAllMealsFromDB(Model model) {
        List<Meal> dbMeals = mealService.getAllMealsFromDB();
        Collections.sort(dbMeals, Comparator.comparing(meal -> meal.getName()));
        model.addAttribute("meals", dbMeals);
        return "/recipecatalog";
    }

}
