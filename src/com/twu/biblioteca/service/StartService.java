package com.twu.biblioteca.service;

import com.twu.biblioteca.Constant;

public class StartService {

    private BookService bookService;
    private MovieService movieService;

    public StartService() {
        this.bookService = new BookService(new Constant().getBookList());
        this.movieService = new MovieService(new Constant().getMovieList());
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
            case "2":
                new MenuService().showMovieOptions();
                movieService.selectMovieOption();
                break;
            default:
                System.out.println("Please input valid number!");
                new MenuService().showMenu();
                new StartService().selectAction();
                break;
        }
    }
}
