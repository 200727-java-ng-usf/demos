package com.revature.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadConsoleDriver {

    public static void main(String[] args) {

        System.out.println("Printing to the console is easy enough");

        //Reading input from the console using the scanner class
        Scanner scanner = new Scanner(System.in); //system.in is the console
        System.out.print("Please enter your username: ");
        String username = scanner.next();
        System.out.println("Please enter your password: ");
        String password = scanner.next();
        System.out.println("The credentials that you provided was: " + username + "/" + password);

        System.out.print("Please provide your age: ");
        try { //trying something, if error happens code will not execute
            int age = 0;
            age = scanner.nextInt(); //can throw InputMismatchException if given bad data (aka bad type)
            System.out.println("Your age is: " + age);
        } catch (InputMismatchException e) { //e can be any value, generally use e for error
            System.out.println("Invalid Value!"); // prints if user gives bad data
            // can recursively call method again to restart
        }

        System.out.println("+--------------------------------------+");

        // Reading input from the console using BufferedReader

        //InputStreamReader inStream = new InputStreamReader(System.in);
        //BufferedReader reader = new BufferedReader(inStream);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please enter your first name: ");


        try {
            String firstName = reader.readLine();
            System.out.println("Your name is: " + firstName);
        } catch (IOException e){ //bufferedReader doesn't know where its reading yet and is worried it doesn't exist
            // catch blocks must catch most specific exceptions to general exceptions
            // this way the more specific exceptions can be addressed specifically instead of generally
            // general exception = (Exception e)
            e.printStackTrace();
        }
    }
}
