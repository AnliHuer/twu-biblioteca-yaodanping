package com.twu.biblioteca.service;

import com.twu.biblioteca.bean.Movie;

import java.util.ArrayList;

public class MovieService {

    private final ArrayList<Movie> movieList;

    public MovieService(ArrayList<Movie> movieList) {
        this.movieList = movieList;
    }

    public String showMovieList() {
        String libraryListString = "ID\tname\tyear\tdirector\trate\n";

        for (int i = 0; i < movieList.size(); i++) {
            Movie movie = movieList.get(i);
            libraryListString += movie.getId() + "\t" + movie.getName() + "\t" + movie.getYear() + "\t" + movie.getDirector() + "\t" + movie.getRate() + "\n";
        }

        System.out.println(libraryListString);
        return libraryListString;
    }

    public void checkoutMovie(String movieId) {
        for (int i = 0; i < this.movieList.size(); i++) {
            Movie movie = this.movieList.get(i);

            movie.isCheckout();

            if (!movie.isCheckout() && movieId.equals(String.valueOf(movie.getId()))) {
                movie.setCheckout(true);
                System.out.println("Thank you! Enjoy the movie.");
                return;
            }
        }

        System.out.println("The movie is not available.");
    }

    public void returnMovie(String movieId) {
        for (int i = 0; i < this.movieList.size(); i++) {
            Movie movie = (Movie) this.movieList.get(i);

            if (movie.isCheckout() && movieId.equals(String.valueOf(movie.getId()))) {
                movie.setCheckout(false);
                System.out.println("Thank you for returning the movie.");
                return;
            }
        }

        System.out.println("That is not a valid movie to return.");
    }
}
