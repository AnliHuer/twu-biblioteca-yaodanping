package com.twu.biblioteca;

import java.util.ArrayList;

class Library {
    private ArrayList<Book> bookList;

    Library(ArrayList<Book> bookList) {
        this.bookList = bookList;
    }

    ArrayList<Book> getLibrary() {
        return bookList;
    }

    void setLibrary(ArrayList<Book> bookList) {
        this.bookList = bookList;
    }

    public String showBookList() {
        String bookListString = "";

        for (Book book : this.bookList) {
            bookListString += book.getId() + "\t" + book.getAuthor() + "\t" + book.getPublicationDate() + "\n";
        }

        return bookListString;
    }

}
