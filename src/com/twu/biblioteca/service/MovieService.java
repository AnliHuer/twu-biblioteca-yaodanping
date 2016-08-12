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
            libraryListString += movie.getId() + "\t" + movie.getName()+ "\t" + movie.getYear()+ "\t" + movie.getDirector()+"\t"+movie.getRate()+ "\n";
        }

        System.out.println(libraryListString);
        return libraryListString;
    }
    
}
