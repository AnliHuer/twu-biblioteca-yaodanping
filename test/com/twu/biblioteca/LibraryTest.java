package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class LibraryTest {
    private Library library;

    @Before
    public void initLibrary() {
        Book bookOne = new Book(1, "Andy", "1999-01-01");
        Book bookTwo = new Book(2, "Alice", "1999-01-01");

        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(bookOne);
        bookList.add(bookTwo);

        library = new Library(bookList);
    }

    @Test
    public void getLibrary() throws Exception {
        assertEquals(2, library.getBookList().size());
    }

    @Test
    public void setLibrary() throws Exception {
        Book book = new Book(1, "Andy", "1999-01-01");

        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(book);

        library.setBookList(bookList);
        assertEquals(1, library.getBookList().size());
    }

    @Test
    public void showBookList() throws Exception {
        String bookListString = "";

        ArrayList<Book> list = library.getBookList();
        for (Book book : list) {
            bookListString += book.getId() + "\t" + book.getAuthor() + "\t" + book.getPublicationDate() + "\n";
        }

        String expectedString = "1\tAndy\t1999-01-01\n2\tAlice\t1999-01-01\n";
        assertEquals(expectedString, bookListString);
    }
}