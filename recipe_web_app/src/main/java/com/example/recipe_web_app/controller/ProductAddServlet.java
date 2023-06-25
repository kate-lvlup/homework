package com.example.recipe_web_app.controller;

import com.example.recipe_web_app.modal.Ingredient;
import com.example.recipe_web_app.modal.IngredientType;
import com.example.recipe_web_app.util.HibernateUtil;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

@WebServlet(name = "product-add-servlet", value = "/addproduct")
public class ProductAddServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name = request.getParameter("name");
        String ingredientTypeName = request.getParameter("ingredientTypeName");
        IngredientType ingredientType = null;

        Map<Long, String> ingredientTypeNames = new TreeMap<>();
        ingredientTypeNames.put(1L, "Vegetables");
        ingredientTypeNames.put(2L, "Fruits");
        ingredientTypeNames.put(3L, "Dairy");
        ingredientTypeNames.put(4L, "Meat");
        ingredientTypeNames.put(5L, "Seafood");
        ingredientTypeNames.put(6L, "Cereals");
        ingredientTypeNames.put(7L, "Flour");
        ingredientTypeNames.put(8L, "Drinks");
        ingredientTypeNames.put(9L, "Other");

        for(Map.Entry<Long, String> entry: ingredientTypeNames.entrySet()) {
            if (ingredientTypeName.equals(entry.getValue())){
                ingredientType = new IngredientType();
                ingredientType.setId(entry.getKey());
                ingredientType.setName(entry.getValue());
                break;
            }
        }

        Ingredient ingredient = Ingredient.builder()
                .name(name)
                .ingredientTypeId(ingredientType)
                .build();

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(ingredient);
        transaction.commit();
        session.close();
        response.sendRedirect("ingredients");
    }
}
