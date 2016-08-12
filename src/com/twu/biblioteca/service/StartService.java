package com.twu.biblioteca.service;

import com.twu.biblioteca.Constant;

public class StartService {

    private BookService bookService;
    private MovieService movieService;
    private UserService userService;
    private MenuService menuService;

    public StartService() {
        this.bookService = new BookService(new Constant().getBookList());
        this.movieService = new MovieService(new Constant().getMovieList());
        this.userService = new UserService(new Constant().getUserList());
        this.menuService = new MenuService();
    }

    public void start(){
        menuService.showWelcomeMessage();
        menuService.showUsernameMessage();
        String username = new InputService().getInput();
        menuService.showPasswordMessage();
        String password = new InputService().getInput();
        
        if(this.userService.userLogin(username, password)){

            menuService.showLoginSuccessMessage();
            menuService.showMenu();
            this.selectAction(username);
        }

        menuService.showLoginFailMessage();
    }

    public void selectAction(String username) {
        String menuNumber = new InputService().getInput();

        switch (menuNumber) {
            case "0":
                System.exit(0);
                break;
            case "1":
                menuService.showBookOptions();
                bookService.selectBookOption(username);
                break;
            case "2":
                menuService.showMovieOptions();
                movieService.selectMovieOption(username);
                break;
            case "3":
                userService.userDetail(username);
                menuService.showMenu();
                this.selectAction(username);
                break;
            default:
                System.out.println("Please input valid number!");
                menuService.showMenu();
                new StartService().selectAction(username);
                break;
        }
    }
}
