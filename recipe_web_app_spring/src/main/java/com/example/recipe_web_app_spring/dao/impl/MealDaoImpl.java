package com.example.recipe_web_app_spring.dao.impl;

import com.example.recipe_web_app_spring.dao.MealDao;
import com.example.recipe_web_app_spring.model.Meal;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

@Repository
public class MealDaoImpl implements MealDao {

    private final SessionFactory sessionFactory;

    public MealDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Meal> getAllMealsFromDB() {
        Session session = sessionFactory.openSession();
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