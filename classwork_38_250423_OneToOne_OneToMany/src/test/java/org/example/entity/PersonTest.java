package org.example.entity;

import org.example.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.jupiter.api.Test;

class PersonTest {

    @Test
    public void initTest() {
        try (SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
             Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            Person person = new Person();
            person.setName("John2");
            person.setPassport(new Passport("1235"));
            session.save(person);
            transaction.commit();
        }
    }

    @Test
    public void getPersonTest() {
        try (SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
             Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            Person person = session.get(Person.class, 2L);
            System.out.println(person);
            transaction.commit();
        }
    }

}