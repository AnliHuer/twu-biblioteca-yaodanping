package com.twu.biblioteca.service;

import com.twu.biblioteca.TestBase;
import com.twu.biblioteca.bean.User;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class UserServiceTest extends TestBase{
    private ArrayList<User> userArrayList = new ArrayList<>();
    private UserService userService = new UserService(userArrayList);

    @Before
    public void init(){
        User userOne = new User("Tony", "12345", "1@qq.com","13112341234");
        User userTwo = new User("Andy", "00000", "2@qq.com","13112341234");
        User userThree = new User("Alice", "11111", "3@qq.com","13112341234");

        userArrayList.add(userOne);
        userArrayList.add(userTwo);
        userArrayList.add(userThree);
    }

    @Test
    public void userDetailTest(){
        userService.userDetail("Andy");

        assertEquals("Andy\t2@qq.com\t13112341234\n\n", bytes.toString());
    }

    @Test
    public void successUserLoginTest(){
        assertEquals(userService.userLogin("Tony", "12345"), true);
    }

    @Test
    public void failUserLoginTest(){
        assertEquals(userService.userLogin("Tony", "00000"), false);
    }
}
