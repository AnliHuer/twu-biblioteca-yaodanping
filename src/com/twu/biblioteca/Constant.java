package com.twu.biblioteca;

import com.twu.biblioteca.bean.Book;
import com.twu.biblioteca.bean.Movie;
import com.twu.biblioteca.bean.User;

import java.util.ArrayList;

public class Constant {

    public ArrayList getBookList() {
        Book bookOne = new Book(1, "Andy", "2012-01-01", false);
        Book bookTwo = new Book(2, "Cindy", "2013-01-01", false);
        Book bookThree = new Book(3, "Alice", "2014-01-01", false);
        ArrayList list = new ArrayList();
        list.add(bookOne);
        list.add(bookTwo);
        list.add(bookThree);

        return list;
    }

    public ArrayList<Movie> getMovieList() {
        Movie movieOne = new Movie(1, "Hello world", "2013-01-01", "Tom", "1", false);
        Movie movieTwo = new Movie(2, "Hello java", "2013-01-01", "Tom", "10", false);
        Movie movieThree = new Movie(2, "Hello Junit", "2013-01-01", "Tom", "10", false);

        ArrayList<Movie> list = new ArrayList<>();
        list.add(movieOne);
        list.add(movieTwo);
        list.add(movieThree);

        return list;
    }

    public ArrayList<User> getUserList(){
        User userOne = new User("Tony", "12345", "1@qq.com","13112341234");
        User userTwo = new User("Andy", "00000", "2@qq.com","13112341234");
        User userThree = new User("Alice", "11111", "3@qq.com","13112341234");

        ArrayList<User> userList = new ArrayList<>();
        userList.add(userOne);
        userList.add(userTwo);
        userList.add(userThree);

        return userList;
    }
}
