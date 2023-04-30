package org.example.dao;

import org.example.model.Item;
import org.example.model.Person;
import org.example.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ItemDao {
    public void printPersonByItemId(int id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            Item item = session.get(Item.class, id);
            Person owner = item.getOwner();
            System.out.println(owner);
            transaction.commit();
        }
    }

    public void addNewItemForPersonByPersonID(String newItemName, int id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            Person person = session.get(Person.class, id);
            Item newItem = new Item(newItemName, person);
            person.getItems().add(newItem);
            session.save(newItem);
            transaction.commit();
        }
    }

    public void printCreatedNewItemForNewPerson(String personName, int personAge, String itemName) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            Person person = new Person(personName, personAge);
            Item newItem = new Item(itemName, person);
            person.setItems(new ArrayList<>(Collections.singletonList(newItem)));
            session.save(person);
            session.save(newItem);
            System.out.println(person);
            System.out.println(newItem);
            transaction.commit();
        }
    }

    public void deleteItemsForPersonByPersonId(int personId) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            Person person = session.get(Person.class, personId);
            List<Item> items = person.getItems();
            for (Item item : items) {
                session.remove(item);
            }
            person.getItems().clear(); //for update hibernate cash
            transaction.commit();
        }
    }
}
