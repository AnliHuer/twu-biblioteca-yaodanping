package com.twu.biblioteca;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> bookList;

    public Library(ArrayList<Book> bookList) {
        this.bookList = bookList;
    }

    public ArrayList<Book> getBookList() {
        return bookList;
    }

    public void setBookList(ArrayList<Book> bookList) {
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
