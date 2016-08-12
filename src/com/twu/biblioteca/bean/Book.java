package com.twu.biblioteca.bean;

public class Book {
    private int id;
    private String author;
    private String publicationDate;
    private boolean isCheckout;

    public Book(int id, String author, String publicationDate, boolean isCheckout) {
        this.id = id;
        this.author = author;
        this.publicationDate = publicationDate;
        this.isCheckout = isCheckout;
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
