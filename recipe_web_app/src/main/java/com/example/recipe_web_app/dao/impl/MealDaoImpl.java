package com.example.recipe_web_app.dao.impl;

import com.example.recipe_web_app.dao.MealDao;
import com.example.recipe_web_app.modal.Meal;
import com.example.recipe_web_app.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

public class MealDaoImpl implements MealDao {

    public final MealDaoImpl mealDao;
    public MealDaoImpl(MealDaoImpl mealDao) {
        this.mealDao = mealDao;
    }

    @Override
    public List<Meal> getAllMealsFromDB() {
        Session session = HibernateUtil.openSession();
        Transaction transaction = session.beginTransaction();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Meal> criteria = builder.createQuery(Meal.class);
        criteria.from(Meal.class);
        List<Meal> mealsList = session.createQuery(criteria).getResultList();
        transaction.commit();
        session.close();
        return mealsList;
    }

}