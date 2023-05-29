package com.example.recipe_web_app.dao.impl;

import com.example.recipe_web_app.dao.IngredientDao;
import com.example.recipe_web_app.modal.Ingredient;
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

}