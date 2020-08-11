package com.revature.exceptions;

import javax.security.sasl.AuthenticationException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LoginScreen {
    public void printMenu() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Welcome.");
        System.out.print("Username: ");
        String username = reader.readLine();
        System.out.println();
        System.out.print("Password: ");
        String password = reader.readLine();

        if(!username.trim().equals(" ") && !password.trim().equals(" ")){


            if(username.equals("admin") && password.equals("password")){
                System.out.println("Welcome"+username+"!"+" Moving to dashboard...");
            }else{
                throw new AuthenticationException(username);
            }

        } //else bad request exception


    }
}
