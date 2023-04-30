package org.example.dao;

import org.example.model.Item;
import org.example.model.Person;
import org.example.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class PersonDao {
    public void printListItemsByPersonId(int id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            Person person = session.get(Person.class, id);
            List<Item> items = person.getItems();
            System.out.println(items);
            transaction.commit();
        }
    }

    public void deletePersonByPersonId(int personId) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            Person person = session.get(Person.class, personId);
            session.remove(person);
            person.getItems().forEach(item -> item.setOwner(null)); // for update hibernate cash
            transaction.commit();
        }
    }

    public void changeOwnerOfItemByIds(int personId, int itemId) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            Person person = session.get(Person.class, personId);
            Item item = session.get(Item.class, itemId);
            item.getOwner().getItems().remove(item);
            item.setOwner(person);
            person.getItems().add(item);
            transaction.commit();
        }
    }
}
