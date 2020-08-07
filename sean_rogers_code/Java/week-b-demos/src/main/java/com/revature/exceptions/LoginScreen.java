package com.revature.exceptions;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LoginScreen {

    public void printMenu() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Welcome to our app!\nPlease sign in.");

        System.out.println("Username: ");
        String username = reader.readLine();

        System.out.println("Password: ");
        String password = reader.readLine();

        if(!username.trim().equals("") && !password.trim().equals("")) {
            if(username.equals("admin") && password.equals("password")) {
                System.out.println("Welcome, " + username + "! Navigating you to your dashboard.");
            } else {
                throw new AuthenticationException(username);
            }
        } else {
            throw new BadRequestException();
        }
    }
}
