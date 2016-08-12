package com.twu.biblioteca.service;

import com.twu.biblioteca.Constant;

import java.util.Scanner;

public class StartService {

    private BookService bookService;

    public StartService() {
        this.bookService = new BookService(new Constant().getBookList());
    }

    public void start(){
        new MenuService().showWelcomeMessage();
        new MenuService().showMenu();
        this.selectAction();
    }

    public void selectAction() {
        String menuNumber = new InputService().getInput();

        switch (menuNumber) {
            case "0":
                System.exit(0);
                break;
            case "1":
                new MenuService().showBookOptions();
                bookService.selectBookOption();
                break;
            default:
                System.out.println("Please input valid number!");
                new MenuService().showMenu();
                new StartService().selectAction();
                break;
        }
    }
}
