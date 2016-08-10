package com.twu.biblioteca;

class Book {
    private int id;
    private String author;
    private String publicationDate;
    private boolean isCheckout;

    Book(int id, String author, String publicationDate) {
        this.id = id;
        this.author = author;
        this.publicationDate = publicationDate;
        this.isCheckout = false;
    }

    int getId() {
        return id;
    }

    void setId(int id) {
        this.id = id;
    }

    String getAuthor() {
        return author;
    }

    void setAuthor(String author) {
        this.author = author;
    }

    String getPublicationDate() {
        return publicationDate;
    }

    boolean isCheckout() {
        return isCheckout;
    }

    void setCheckout(boolean checkout) {
        isCheckout = checkout;
    }

    void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }
}
