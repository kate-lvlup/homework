package org.example;

import org.example.dao.ItemDao;
import org.example.dao.PersonDao;
import org.example.util.HibernateUtil;


public class Main {
    public static void main(String[] args) {
        PersonDao personDao = new PersonDao();
        ItemDao itemDao = new ItemDao();
        personDao.printListItemsByPersonId(3);
        itemDao.printPersonByItemId(2);
        itemDao.addNewItemForPersonByPersonID("Mouse", 3);
        itemDao.printCreatedNewItemForNewPerson("Alex", 35, "Headphones");
        itemDao.deleteItemsForPersonByPersonId(3);
        personDao.deletePersonByPersonId(2);
        personDao.changeOwnerOfItemByIds(4, 1);
        HibernateUtil.closeSessionFactoryConnection();
    }
}
