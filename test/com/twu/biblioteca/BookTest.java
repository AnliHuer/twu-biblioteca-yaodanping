package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {
    private Book book;

    @Before
    public void initBook() {
        book = new Book(1, "Cindy", "2012-01-01");
    }

    @Test
    public void getId() throws Exception {
        assertEquals(1, book.getId());
    }

    @Test
    public void setId() throws Exception {
        book.setId(2);
        assertEquals(2, book.getId());
    }

    @Test
    public void getAuthor() throws Exception {
        assertEquals("Cindy", book.getAuthor());
    }

    @Test
    public void setAuthor() throws Exception {
        book.setAuthor("Tom");
        assertEquals("Tom", book.getAuthor());
    }

    @Test
    public void getPublicationDate() throws Exception {
        assertEquals("2012-01-01", book.getPublicationDate());
    }

    @Test
    public void setPublicationDate() throws Exception {
        book.setPublicationDate("2016-01-01");
        assertEquals("2016-01-01", book.getPublicationDate());
    }

    @Test
    public void isCheckoutTest(){
        assertEquals(false, book.isCheckout());
    }

    @Test
    public void setCheckoutTest(){
        book.setCheckout(true);
        assertEquals(true, book.isCheckout());
    }
}