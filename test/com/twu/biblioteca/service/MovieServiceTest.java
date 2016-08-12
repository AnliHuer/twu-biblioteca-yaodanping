package com.twu.biblioteca.service;

import com.twu.biblioteca.TestBase;
import com.twu.biblioteca.bean.Movie;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class MovieServiceTest extends TestBase {

    private ArrayList<Movie> movieArrayList = new ArrayList<>();
    private MovieService movieService = new MovieService(movieArrayList);

    @Before
    public void init() {
        Movie movieOne = new Movie(1, "Hello world", "2013-01-01", "Tom", "1", false);
        Movie movieTwo = new Movie(2, "Hello java", "2013-01-01", "Tom", "10", true);
        Movie movieThree = new Movie(3, "Hello Junit", "2013-01-01", "Tom", "10", true);

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

    @Test
    public void successCheckoutMovieTest(){
        movieService.checkoutMovie("1");
        assertEquals("Thank you! Enjoy the movie.\n", bytes.toString());
    }

    @Test
    public void failCheckoutMovieTest(){
        movieService.checkoutMovie("2");
        assertEquals("The movie is not available.\n", bytes.toString());
    }

    @Test
    public void successReturnMovieTest(){
        movieService.returnMovie("2");
        assertEquals("Thank you for returning the movie.\n", bytes.toString());
    }

    @Test
    public void failReturnMovieTest(){
        movieService.returnMovie("1");
        assertEquals("That is not a valid movie to return.\n", bytes.toString());
    }
}
