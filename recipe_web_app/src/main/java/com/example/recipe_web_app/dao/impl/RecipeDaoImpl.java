package com.example.recipe_web_app.dao.impl;

import com.example.recipe_web_app.dao.RecipeDao;
import com.example.recipe_web_app.modal.Ingredient;
import com.example.recipe_web_app.modal.Recipes;
import com.example.recipe_web_app.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.ArrayList;
import java.util.List;

public class RecipeDaoImpl implements RecipeDao {

    public final RecipeDaoImpl recipeDao;
    public final IngredientDaoImpl ingredientDao;

    public RecipeDaoImpl(RecipeDaoImpl recipeDao) {
        this.recipeDao = recipeDao;
        this.ingredientDao = new IngredientDaoImpl();
    }

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

//    @Override
//    public List<Recipes> searchRecipesByIngredients(String[] ingredientIds) {
//        List<Recipes> matchingRecipes = new ArrayList<>();
//        for (String ingredientId : ingredientIds) {
//            Ingredient ingredient = ingredientDao.getIngredientById(ingredientId);
//
//            if (ingredient != null) {
//                List<Recipes> ingredientRecipes = ingredientDao.getIngredientRecipes(Long.valueOf(ingredientId));
//
//                for (Recipes ingredientRecipe : ingredientRecipes) {
//                    Recipes recipe = recipeDao.getRecipe(ingredientRecipe.getId());
//
//                    if (!matchingRecipes.contains(recipe)) {
//                        matchingRecipes.add(recipe);
//                    }
//                }
//            }
//        }
//
//        return matchingRecipes;
//    }

    public List<Recipes> searchRecipesByIngredients(List<String> selectedIngredients) {
        Session session = HibernateUtil.openSession();
        Transaction transaction = session.beginTransaction();
            Query<Recipes> recipesQuery = session.createQuery(""" 
                    SELECT r  
                    FROM Recipes r  
                    JOIN IngredientRecipe.recipeId 
                    JOIN Ingredient.id  
                    WHERE r.name IN (:selectedIngredientList)  
                    """, Recipes.class);
            recipesQuery.setParameter("selectedIngredientList", selectedIngredients);
            List<Recipes> recipesList = recipesQuery.getResultList();
            transaction.commit();
            session.close();
            return recipesList;
        }


    public Recipes getRecipe(Long recipeId) {
        Recipes recipe = null;
        try (Session session = HibernateUtil.openSession()) {
            recipe = session.get(Recipes.class, recipeId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return recipe;
    }

}
