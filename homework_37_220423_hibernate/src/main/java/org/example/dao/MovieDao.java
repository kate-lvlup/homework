package org.example.dao;

import org.example.entity.Movie;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

public class MovieDao {

    public void saveMovie(Movie movie) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(movie);
            transaction.commit();
            session.close();
            HibernateUtil.getSessionFactory().close();
        }
    }

    public Movie getMovieById(long id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            Movie readMovie = session.get(Movie.class, id);
            transaction.commit();
            session.close();
            HibernateUtil.getSessionFactory().close();
            return readMovie;

        }
    }

    public void updateMovieById(long id, String movieName, Integer releaseYear, String language) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            Movie updatedMovie = session.get(Movie.class, id);
            updatedMovie.setMovieName(movieName);
            updatedMovie.setReleaseYear(releaseYear);
            updatedMovie.setLanguage(language);
            session.update(updatedMovie);
            transaction.commit();
            session.close();
            HibernateUtil.getSessionFactory().close();
        }
    }

    public void updateMovieNameById(long id, String movieName) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            Movie updatedMovie = session.get(Movie.class, id);
            updatedMovie.setMovieName(movieName);
            session.update(updatedMovie);
            transaction.commit();
            session.close();
            HibernateUtil.getSessionFactory().close();
        }
    }

    public void updateMovieReleaseYearById(long id, Integer releaseYear) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            Movie updatedMovie = session.get(Movie.class, id);
            updatedMovie.setReleaseYear(releaseYear);
            session.update(updatedMovie);
            transaction.commit();
            session.close();
            HibernateUtil.getSessionFactory().close();
        }
    }

    public void updateMovieLanguageById(long id, String language) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            Movie updatedMovie = session.get(Movie.class, id);
            updatedMovie.setLanguage(language);
            session.update(updatedMovie);
            transaction.commit();
            session.close();
            HibernateUtil.getSessionFactory().close();
        }
    }

    public void deleteMovieById(long id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            Movie deleteMovie = session.get(Movie.class, id);
            session.delete(deleteMovie);
            transaction.commit();
            session.close();
            HibernateUtil.getSessionFactory().close();
        }
    }



}
