package com.example.recipe_web_app.dao.impl;

import com.example.recipe_web_app.dao.IngredientDao;
import com.example.recipe_web_app.modal.Ingredient;
import com.example.recipe_web_app.modal.Recipes;
import com.example.recipe_web_app.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;


import java.util.List;

public class IngredientDaoImpl implements IngredientDao {
    @Override
    public List<Ingredient> getAllIngredientsByType(String ingredientTypeName) {
        Session session = HibernateUtil.openSession();
        Transaction transaction = session.beginTransaction();
        Query<Ingredient> ingredientQuery = session.createQuery("""
                SELECT i from Ingredient i
                where i.ingredientTypeId.name = :typeName
                """, Ingredient.class);
        ingredientQuery.setParameter("typeName", ingredientTypeName);
        List<Ingredient> ingredients = ingredientQuery.getResultList();
        transaction.commit();
        session.close();
        return ingredients;
    }

    public Ingredient getIngredientById(String ingredientId) {
        IngredientDaoImpl ingredientDao = new IngredientDaoImpl();
        try {
            Long id = Long.parseLong(ingredientId);
            return ingredientDao.findById(id);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return null;
        }
    }

    public Ingredient findById(Long id) {
            Ingredient ingredient = null;
            try (Session session = HibernateUtil.openSession()) {
                ingredient = session.get(Ingredient.class, id);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return ingredient;
        }

    public List<Recipes> getIngredientRecipes(Long ingredientId) {
        List<Recipes> recipes = null;
        try (Session session = HibernateUtil.openSession()) {
            Ingredient ingredient = session.get(Ingredient.class, ingredientId);

            if (ingredient != null) {
                Query<Recipes> query = session.createQuery(
                        "SELECT ir.recipe FROM IngredientRecipe ir WHERE ir.ingredient.id = :ingredientId",
                        Recipes.class
                );
                query.setParameter("ingredientId", ingredientId);
                recipes = query.getResultList();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return recipes;
    }




}