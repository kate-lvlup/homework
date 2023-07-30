package com.example.recipe_web_app_spring.dao.impl;

import com.example.recipe_web_app_spring.dao.IngredientDao;
import com.example.recipe_web_app_spring.model.Ingredient;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;


import java.util.List;
@Repository
public class IngredientDaoImpl implements IngredientDao {
    private final SessionFactory sessionFactory;

    public IngredientDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    @Override
    public List<Ingredient> getAllIngredientsByType(String ingredientTypeName) {
        Session session = sessionFactory.openSession();
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

    @Override
    public List<Ingredient> getAllIngredients() {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Query<Ingredient> ingredientQuery = session.createQuery("""
                SELECT i from Ingredient i
                """, Ingredient.class);
        List<Ingredient> ingredients = ingredientQuery.getResultList();
        transaction.commit();
        session.close();
        return ingredients;
    }

}