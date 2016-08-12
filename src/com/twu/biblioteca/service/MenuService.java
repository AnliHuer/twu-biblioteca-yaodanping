package com.twu.biblioteca.service;

public class MenuService {
    public void showWelcomeMessage() {
        System.out.println("-------------------------------");
        System.out.println("Welcome to Binlioteca System.");
    }

    public void showUsernameMessage(){
        System.out.print("Please input username:");
    }

    public void showPasswordMessage(){
        System.out.print("Please input password:");
    }

    public void showLoginSuccessMessage(){
        System.out.println("Login Successfully.");
    }

    public void showLoginFailMessage(){
        System.out.println("Username or password error!");
    }

    public void showMenu() {
        System.out.println("------------------------");
        System.out.println("0. Quit");
        System.out.println("1. Book Service");
        System.out.println("2. Movie Service");
        System.out.println("3. User Detail");
        System.out.println("Please Select service:");
    }

    public void showBookOptions(){
        System.out.println("------------------------");
        System.out.println("0. Quit");
        System.out.println("1. Show Book List");
        System.out.println("2. Checkout Book");
        System.out.println("3. Return Book");
        System.out.print("Please select book option:");
    }

    public void showMovieOptions() {
        System.out.println("------------------------");
        System.out.println("0. Quit");
        System.out.println("1. Show Movie List");
        System.out.println("2. Checkout Movie");
        System.out.println("3. Return Movie");
        System.out.print("Please select movie option:");
    }

    public void showUserOptions() {
        System.out.println("------------------------");
        System.out.println("0. Quit");
        System.out.println("1. Show User Detail");
        System.out.println("2. Login out");
        System.out.print("Please select user option:");
    }
}


