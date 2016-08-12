package com.twu.biblioteca.service;

import com.twu.biblioteca.bean.User;

import java.util.AbstractList;
import java.util.ArrayList;

public class UserService {
    private ArrayList<User> userArrayList = new ArrayList<>();

    public UserService(ArrayList<User> userArrayList) {
        this.userArrayList = userArrayList;
    }

    public void userDetail(String username) {
        for (int i = 0; i < this.userArrayList.size(); i++) {
            User user = this.userArrayList.get(i);

            if (username.equals(user.getUsername())) {
                System.out.println(user.getUsername() + "\t" + user.getEmail() + "\t" + user.getPhoneNumber() + "\n");
                return;
            }
        }

        System.out.println("Please input valid username.");
    }

    public boolean userLogin(String username, String password){
        for (int i = 0; i < this.userArrayList.size(); i++) {
            User user = this.userArrayList.get(i);

            if (username.equals(user.getUsername()) && password.equals(user.getPassword())) {
                System.out.println("Login Successful.");
                return true;
            }
        }

//        System.out.println("Username or password error!");
        return false;
    }

    public void selectUserOptions() {
        String inputOption = new InputService().getInput();

        switch (inputOption) {
            case "0":
                new MenuService().showMenu();
                new StartService().selectAction();
                break;
            case "1":
                System.out.println("Please input user id:");

                this.userDetail(new InputService().getInput());
                this.selectUserOptions();
                break;
            case "2":
                System.exit(0);
                break;
            default:
                System.out.println("Please input a valid number");

                new MenuService().showBookOptions();
                this.selectUserOptions();
                break;
        }
    }
}
