package com.example.webexmaple1.dao.imp;

import com.example.webexmaple1.dao.UserDao;
import com.example.webexmaple1.model.User;
import com.example.webexmaple1.model.command.UserUpdateCommand;
import com.example.webexmaple1.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;


import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;
import java.util.Optional;

public class UserDaoImpl implements UserDao {
    @Override
    public Optional<User> getUserById(long id) {
        Session session = HibernateUtil.openSession();
        Transaction transaction = session.beginTransaction();
        User user = session.get(User.class, id);
        transaction.commit();
        session.close();
        return Optional.ofNullable(user);
    }

    @Override
    public void createUser(User user) {
        Session session = HibernateUtil.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(user);
        transaction.commit();
        session.close();
    }

    @Override
    public List<User> getAllUsers() {
        Session session = HibernateUtil.openSession();
        Transaction transaction = session.beginTransaction();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<User> criteria = builder.createQuery(User.class);
        criteria.from(User.class);
        List<User> users = session.createQuery(criteria).getResultList();
        transaction.commit();
        session.close();
        return users;
    }

    public List<User> findUsersByUserName(String username) {
        Session session = HibernateUtil.openSession();
        Transaction transaction = session.beginTransaction();
        Query<User> query = session.createNamedQuery("User.findByUserName", User.class);
        query.setParameter("username",username);
        List<User> usernames = query.getResultList();
        transaction.commit();
        session.close();
        return usernames;
    }

    @Override
    public void deleteUserById(Long id) {
        Session session = HibernateUtil.openSession();
        Transaction transaction = session.beginTransaction();
        User user = session.get(User.class, id);
        session.remove(user);
        transaction.commit();
        session.close();
    }

    @Override
    public void updateUserById(Long id, UserUpdateCommand command) {
        Session session = HibernateUtil.openSession();
        Transaction transaction = session.beginTransaction();
        User user = session.get(User.class, id);
        user.setUsername(command.getUsername());
        user.setFirstName(command.getFirstName());
        user.setLastName(command.getLastName());
        user.setDate(command.getDate());
        user.setEmail(command.getEmail());
        user.setPhoneNumber(command.getPhoneNumber());
        user.setAddress(command.getAddress());
        session.update(user);
        transaction.commit();
        session.close();

    }
}
