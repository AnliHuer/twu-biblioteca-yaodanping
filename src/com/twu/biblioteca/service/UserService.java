package com.twu.biblioteca.service;

import com.twu.biblioteca.bean.User;

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
                return true;
            }
        }

        return false;
    }
}
