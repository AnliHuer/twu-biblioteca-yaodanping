package com.twu.biblioteca.service;

import com.twu.biblioteca.Constant;
import com.twu.biblioteca.TestBase;
import com.twu.biblioteca.bean.Movie;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class MovieServiceTest extends TestBase {

    private ArrayList<Movie> movieArrayList = new ArrayList<>();
    private MovieService movieService = new MovieService(new Constant().getMovieList());

    @Before
    public void init() {
        Movie movieOne = new Movie(1, "Hello world", "2013-01-01", "Tom", "1");
        Movie movieTwo = new Movie(2, "Hello java", "2013-01-01", "Tom", "10");
        Movie movieThree = new Movie(2, "Hello Junit", "2013-01-01", "Tom", "10");

        ArrayList<Movie> list = new ArrayList<>();
        movieArrayList.add(movieOne);
        movieArrayList.add(movieTwo);
        movieArrayList.add(movieThree);
    }

    @Test
    public void showMovieListTest() {
        String movieListString = movieService.showMovieList();

        assertEquals(movieListString + "\n", bytes.toString());
    }

}
