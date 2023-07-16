package com.example.recipe_web_app_spring.dao.impl;

import com.example.recipe_web_app_spring.dao.RecipeDao;
import com.example.recipe_web_app_spring.model.Recipes;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

@Repository
public class RecipeDaoImpl implements RecipeDao {
    private final SessionFactory sessionFactory;

    public RecipeDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Recipes> getAllRecipesFromDB() {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Recipes> criteria = builder.createQuery(Recipes.class);
        criteria.from(Recipes.class);
        List<Recipes> recipesList = session.createQuery(criteria).getResultList();
        transaction.commit();
        session.close();
        return recipesList;
    }

    @Override
    public List<Recipes> searchRecipesByIngredients(List<String> selectedIngredients) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Query<Recipes> recipesQuery = session.createQuery("""
                    SELECT DISTINCT r
                    FROM Recipes r
                    JOIN IngredientRecipe ir ON r.id = ir.recipeId
                    JOIN Ingredient i ON i.id = ir.ingredientId
                    WHERE i.name IN (:selectedIngredients)
                """, Recipes.class);
        recipesQuery.setParameter("selectedIngredients", selectedIngredients);
        List<Recipes> recipesList = recipesQuery.getResultList();
        transaction.commit();
        session.close();
        return recipesList;
    }

    @Override
    public List<Recipes> searchRecipesByMeals(List<String> selectedMeals) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Query<Recipes> recipesQuery = session.createQuery("""
                    SELECT r
                    FROM Recipes r
                    JOIN Meal m ON r.meal.id = m.id
                    WHERE m.name IN (:selectedMeals)
                """, Recipes.class);
        recipesQuery.setParameter("selectedMeals", selectedMeals);
        List<Recipes> recipesList = recipesQuery.getResultList();
        transaction.commit();
        session.close();
        return recipesList;
    }

}
