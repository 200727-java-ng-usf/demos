package com.revature.exceptions;

import javax.security.sasl.AuthenticationException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class LogInScreen {

    public void printMenu() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Welcome to our app! \n please sign nin.");
        System.out.println("Username: ");


        String username = reader.readLine();
        System.out.println("Password: ");
        String password = reader.readLine();

        //String.trim() removes white from beginning and end
        if(!username.trim().equals("") && !password.trim().equals("")){

            if (username.equals("admin") && password.equals("password")){
                System.out.println("Welcome, " + username + "Navigating to your dashboardo..");
            } else{
                //use custom acception
                throw new AuthenticationException(username);
            }

        }else {
            throw new BadRequestException();
        }
    }

//    public static void main(String[] args) {
//        LogInScreen l = new LogInScreen();
//        l.printMenu();
//    }

}
