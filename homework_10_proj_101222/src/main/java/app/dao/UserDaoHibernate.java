package app.dao;

import app.User;
import app.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;


public class UserDaoHibernate implements UserDao {
    @Override
    public boolean createUser(User user) {
        boolean success = false;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(user);
            transaction.commit();
            success = true;
        } catch (HibernateException ex) {
            ex.printStackTrace();
        }
        return success;
    }

    @Override
    public User findUserByUserName(String username) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            Query query = session.createQuery("FROM User WHERE username = :username");
            query.setParameter("username", username);
            User foundUser = (User) query.uniqueResult();
            transaction.commit();
            return foundUser;
        }
    }

    @Override
    public void updateUser(User user) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.update(user);
            transaction.commit();
        }
    }

    @Override
    public User findUserById(Long id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            User foundUser = session.get(User.class, id);
            transaction.commit();
            return foundUser;
        }
    }

    @Override
    public boolean deleteUserById(Long id) {
        boolean success = false;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            User foundUser = session.get(User.class, id);
            session.delete(foundUser);
            transaction.commit();
            success = true;
        } catch (HibernateException ex) {
            ex.printStackTrace();
        }
        return success;
    }
}
