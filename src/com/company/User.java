package com.company;

import java.util.Scanner;

public class User {
    private String user;

    public String getUser() {
        return user;
    }

    public void setUser() {
         Scanner user_input = new Scanner(System.in);

        System.out.println("Podaj nazwę użytkownika: ");
        this.user = user_input.nextLine();
        System.out.println(user);
    }



}


