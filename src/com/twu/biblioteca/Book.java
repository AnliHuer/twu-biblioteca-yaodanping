package com.twu.biblioteca;

import org.junit.Before;

import java.util.Date;

public class Book {
    private int id;
    private String author;
    private String publicationDate;
    private boolean isCheckout;

    public Book(int id, String author, String publicationDate) {
        this.id = id;
        this.author = author;
        this.publicationDate = publicationDate;
        this.isCheckout = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public boolean isCheckout() {
        return isCheckout;
    }

    public void setCheckout(boolean checkout) {
        isCheckout = checkout;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }
}
