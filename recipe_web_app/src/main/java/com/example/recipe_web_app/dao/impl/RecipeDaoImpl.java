package com.example.recipe_web_app.dao.impl;

import com.example.recipe_web_app.dao.RecipeDao;
import com.example.recipe_web_app.modal.Recipes;
import com.example.recipe_web_app.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class RecipeDaoImpl implements RecipeDao {

    @Override
    public List<Recipes> getAllRecipesFromDB() {
        Session session = HibernateUtil.openSession();
        Transaction transaction = session.beginTransaction();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Recipes> criteria = builder.createQuery(Recipes.class);
        criteria.from(Recipes.class);
        List<Recipes> recipesList = session.createQuery(criteria).getResultList();
        transaction.commit();
        session.close();
        return recipesList;
    }

}
