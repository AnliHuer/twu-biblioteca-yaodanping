package com.twu.biblioteca.service;

import com.twu.biblioteca.Constant;
import com.twu.biblioteca.TestBase;
import com.twu.biblioteca.bean.Book;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BookServiceTest extends TestBase{
    private ArrayList<Book> bookArrayList = new ArrayList<>();
    private BookService bookService = new BookService(new Constant().getBookList());

    @Before
    public void init() {
        Book bookOne = new Book(1, "Andy", "2000-01-01", true);
        Book bookTwo = new Book(2, "Andy", "2000-01-01", false);
        bookArrayList.add(bookOne);
        bookArrayList.add(bookTwo);
    }

    @Test
    public void showBookListTest() throws Exception {
        String bookListString = bookService.showBookList(bookArrayList);
        assertEquals(bookListString + "\n", bytes.toString());
    }

    @Test
    public void successCheckoutBookTest() {
        String bookId = "2";
        ArrayList<Book> bookList = bookService.selectCheckoutBook(bookArrayList, bookId);

        assertEquals(bytes.toString(), "Thank you! Enjoy the book.\n");
        assertTrue(bookList.get(0).isCheckout());
    }

    @Test
    public void failCheckoutBookTest() {
        String bookId = "1";
        ArrayList<Book> bookList = bookService.selectCheckoutBook(bookArrayList, bookId);

        assertEquals(bytes.toString(), "The book is not available.\n");
    }

    @Test
    public void successReturnBookTest() {
        String bookId = "1";
        ArrayList<Book> bookList = bookService.selectReturnBook(bookArrayList,bookId);

        assertEquals(bytes.toString(), "Thank you for returning the book.\n");
        assertTrue(!bookList.get(0).isCheckout());
    }

    @Test
    public void failReturnBookTest() {
        String bookId = "2";
        ArrayList<Book> bookList = bookService.selectReturnBook(bookArrayList,bookId);

        assertEquals(bytes.toString(), "That is not a valid book to return.\n");
        assertTrue(bookList.get(0).isCheckout());
    }

}