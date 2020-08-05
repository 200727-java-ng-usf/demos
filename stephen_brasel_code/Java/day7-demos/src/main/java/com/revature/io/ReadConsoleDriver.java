package com.revature.io;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadConsoleDriver {

    public static void main(String[] args) {

        System.out.println("Printing to the console is easy enough");

        // Reading input from the console using the Scanner class
        // System.out represents the output stream of the console.
        // System.in represents the input stream of the console
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your username");
        String username = scanner.next();
        System.out.print("Please enter your password:");
        String password = scanner.next();
        System.out.println("The credentials that you provided were: " + username + " / " + password);
        System.out.println("Please enter your age: ");
//
//        int age = scanner.nextInt(); // can throw InputMismatchException is given bad data (data that is not an int)
//
//        //is an unhandled exception is thrown on the above line, this line will not execute
//        System.out.println("Your age is: " + age);

        try{
            int age = scanner.nextInt(); // code in a try block is commonly called "risky" logic
            System.out.println("Your age is: " + age);
        }
        // catch blocks are used to handle thrown exceptions
        // (btw: InputMismatchException is a type of unhandled exception (the complier is not checking to see if it's handled)
        catch(InputMismatchException e){
            e.printStackTrace(); // good idea to print stack trace in development for logging purposes
            System.out.println("Invalid value!"); // prints if the user gives bad data
            main(args); // recursive solution to restart menu; not necessarily the best way due to memory overhead
        }

        System.out.println("+--------------------------------+");

        // Reading input from the console using BufferedReader

//        InputStreamReader inStream = new InputStreamReader(System.in);
//        BufferedReader verboseReader = new BufferedReader(inStream);

        // the below code has the exact same functionality as the above lines
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        try {
            System.out.println("Please enter your first name: ");
            String name = reader.readLine();
            System.out.println("Your name is: " + name);
            System.out.println("Provide your age: ");
            String stringAge = reader.readLine();
            int age = Integer.parseInt(stringAge); //potentially throws NumberFormatExeption
            //uncheck exceptions, like NumberFormatException, are also called runtime exception
        }
        // you can declare multiple exceptions in one catch, Just use the bitwise OR operator: |
        catch(IOException | ClassCastException | NullPointerException e){
            e.printStackTrace();
        } catch(NumberFormatException nfe){
            System.out.println("That was not a number!");
        } catch(Exception e){
            System.out.println("Something has gone wrong... ");
        }

        // Note that catch blocks must be declared in order of the most specific exception to the most generic
    }

}
