package com.example.recipe_web_app.controller;

import com.example.recipe_web_app.dao.impl.MealDaoImpl;
import com.example.recipe_web_app.modal.Meal;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@WebServlet(name = "meal-servlet", value = "/meals")
public class MealServlet extends HttpServlet {
    public MealDaoImpl mealDao ;

    public MealServlet() {
        this.mealDao = new MealDaoImpl(mealDao);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Meal> dbMeals = mealDao.getAllMealsFromDB();
        Collections.sort(dbMeals, Comparator.comparing(meal -> meal.getName()));
        request.setAttribute("meals", dbMeals);
        request.getRequestDispatcher("recipecatalog.jsp").forward(request, response);
    }
}
