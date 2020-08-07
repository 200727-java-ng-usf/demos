package com.revature.exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LoginScreen {
    public void printMenu() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("welcome to our app ! \n Please sign in. ");

        System.out.println("Username: ");
        String userName = reader.readLine();

        System.out.println("password: ");
        String password  = reader.readLine();

        if(!userName.trim().equals("") && !password.trim().equals("")){

            if(userName.equals("admin") && password.equals("password")){
                System.out.println("Welcome !");
            }else {
                throw new AuthenticationException(userName);
            }
        }    else {
            throw new BadRequestException();
        }
    }
}
