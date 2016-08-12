package com.twu.biblioteca;

import com.twu.biblioteca.bean.Book;

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
}
