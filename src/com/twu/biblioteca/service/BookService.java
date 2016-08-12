package com.twu.biblioteca.service;

import com.twu.biblioteca.Constant;
import com.twu.biblioteca.bean.Book;

import java.util.ArrayList;
import java.util.Scanner;

public class BookService {
    private ArrayList<Book> bookList;

    public BookService(ArrayList<Book> bookList) {
        this.bookList = bookList;
    }

    public void selectBookOption(String username) {
        String inputOption = new InputService().getInput();

        switch (inputOption) {
            case "0":
                new MenuService().showMenu();
                new StartService().selectAction(username);
                break;
            case "1":
                this.showBookList(new Constant().getBookList());
                new MenuService().showBookOptions();
                this.selectBookOption(username);
                break;
            case "2":
                System.out.println("Please input checkout book id:");

                bookList = this.selectCheckoutBook(bookList, new InputService().getInput());
                this.showBookList(bookList);
                new MenuService().showBookOptions();
                this.selectBookOption(username);
                break;
            case "3":
                System.out.println("Please input return book id: ");

                bookList = this.selectReturnBook(bookList, new InputService().getInput());
                this.showBookList(bookList);
                new MenuService().showBookOptions();
                this.selectBookOption(username);
                break;
            default:
                System.out.println("Please input a valid number");

                new MenuService().showBookOptions();
                this.selectBookOption(username);
                break;
        }
    }

    public String showBookList(ArrayList<Book> bookList) {
        String libraryListString = "ID\tAuthor\tpublicationDate\tisCheckout\n";

        for (int i = 0; i < bookList.size(); i++) {
            Book book = bookList.get(i);
            libraryListString += book.getId() + "\t" + book.getAuthor() + "\t" + book.getPublicationDate() + "\t\t" + book.isCheckout() + "\n";
        }

        System.out.println(libraryListString);
        return libraryListString;
    }

    public ArrayList selectCheckoutBook(ArrayList<Book> bookList, String bookId) {

        for (int i = 0; i < bookList.size(); i++) {
            Book book = (Book) bookList.get(i);

            if(!book.isCheckout() && bookId.equals(String.valueOf(book.getId()))){
                book.setCheckout(true);
                System.out.println("Thank you! Enjoy the book.");
                return bookList;
            }
        }

        System.out.println("The book is not available.");
        return bookList;
    }

    public ArrayList<Book> selectReturnBook(ArrayList<Book> bookList, String bookId){

        for (int i = 0; i < bookList.size(); i++) {
            Book book = (Book) bookList.get(i);

            if(book.isCheckout() && bookId.equals(String.valueOf(book.getId()))){
                book.setCheckout(false);
                System.out.println("Thank you for returning the book.");
                return bookList;
            }
        }

        System.out.println("That is not a valid book to return.");
        return bookList;
    }
}
