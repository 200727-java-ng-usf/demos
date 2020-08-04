package com.revature.io;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadConsoleDriver {

    public static void main(String[] args) {

        System.out.println("Printing to the console is easy");

        //Reading input from the console using the scanner

        Scanner scanner = new Scanner(System.in); //System.in represents the input stream for the console
        System.out.print("Please enter your username: ");
        String username = scanner.next();
//        System.out.println("The name that you have provided is: "+ username);
        System.out.print("Please enter your password: ");
        String pw = scanner.next();
        System.out.println("Your credentials are " + username+"/"+pw);

       /* System.out.println("Please provide your age");
        int age = scanner.nextInt();

        */

        //int age = 0;

        System.out.println("Please provide your age");

        try{
           int age = scanner.nextInt();
           System.out.println("Your age is: "+age);
        } catch (InputMismatchException e ){
            e.printStackTrace(); //good to print stack trace in development
            System.out.println("Invalid value!");
            main(args);
        }

        System.out.println("-------------------------------------");

        //BufferedReader
//        reading input from the console
//        InputStreamReader inStream = new InputStreamReader(System.in);
//        BufferedReader verboseReader = new BufferedReader(inStream);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));



    }
}
