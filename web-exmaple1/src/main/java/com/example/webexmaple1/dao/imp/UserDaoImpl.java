package com.example.webexmaple1.dao.imp;

import com.example.webexmaple1.dao.UserDao;
import com.example.webexmaple1.model.User;
import com.example.webexmaple1.model.command.UserUpdateCommand;
import com.example.webexmaple1.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

public class UserDaoImpl implements UserDao {
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
