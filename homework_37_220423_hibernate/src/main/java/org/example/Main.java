package org.example;

import org.example.entity.Movie;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure();
        try (SessionFactory sessionFactory = configuration.buildSessionFactory();
             Session session = sessionFactory.openSession()) {
//            CREATE
            session.beginTransaction();
            Movie movie1 = new Movie("Scary movie1", 1990, "Eng");
            Movie movie2 = new Movie("Scary movie2", 2000, "Italy");
            Movie movie3 = new Movie("Scary movie3", 2005, "Spain");
            Movie movie4 = new Movie("Scary movie4", 2010, "Ukr");
            Movie movie5 = new Movie("Scary movie5", 2020, "China");
            session.save(movie1);
            session.save(movie2);
            session.save(movie3);
            session.save(movie4);
            session.save(movie5);
            session.getTransaction().commit();

//            READ
            session.beginTransaction();
            session.get(Movie.class, 1L);
            session.get(Movie.class, 2L);
            session.get(Movie.class, 3L);
            session.get(Movie.class, 4L);
            session.get(Movie.class, 5L);
            session.getTransaction().commit();

//            UPDATE
            session.beginTransaction();
            session.get(Movie.class, 1L).setMovieName("Test name1");
            session.get(Movie.class, 2L).setMovieName("Test name2");
            session.get(Movie.class, 3L).setLanguage("German");
            session.get(Movie.class, 4L).setLanguage("France");
            session.get(Movie.class, 5L).setReleaseYear(2022);
            session.getTransaction().commit();

//            DELETE
            session.beginTransaction();
            session.delete(session.get(Movie.class, 1L));
            session.delete(session.get(Movie.class, 2L));
            Movie movieId3 = session.get(Movie.class, 3L);
            session.delete(movieId3);
            session.getTransaction().commit();

        }
    }

}
