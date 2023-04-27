package org.example;

import org.example.dao.MovieDao;
import org.example.entity.Movie;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Scary movie1", 1990, "Eng");
        Movie movie2 = new Movie("Scary movie2", 2000, "Italy");
        Movie movie3 = new Movie("Scary movie3", 2005, "Spain");
        Movie movie4 = new Movie("Scary movie4", 2010, "Ukr");
        Movie movie5 = new Movie("Scary movie5", 2020, "China");
        MovieDao movieDao = new MovieDao();
        List<Movie> movies = List.of(movie1, movie2, movie3, movie4, movie5);
        try {
            for (Movie movie : movies) {
                movieDao.saveMovie(movie);
            }
            System.out.println(movieDao.getMovieById(1L));
            movieDao.updateMovieById(1L, "John Weak2", 1992, "Fr");
            movieDao.updateMovieNameById(2L, "Scream2");
            movieDao.updateMovieReleaseYearById(3L, 1974);
            movieDao.updateMovieLanguageById(4L, "Spain1");
            movieDao.deleteMovieById(6L);
        } catch (IllegalStateException illegalStateException) {
            System.out.println("The following exception can be thrown: " + illegalStateException);
        }
    }
}
