package com.twu.biblioteca.service;

import java.util.Scanner;

public class InputService {
    public String getInput(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
