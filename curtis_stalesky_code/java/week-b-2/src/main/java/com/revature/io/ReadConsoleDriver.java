package com.revature.io;

import jdk.nashorn.internal.runtime.ECMAException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadConsoleDriver {

    public static void main(String[] args) {

        System.out.println("Printing to the console is easy enough");

        // Reading input from the console using the Scanner class

        //System.in represents the console
        //Much like how System.out represents the output stream for the console
        Scanner scanner = new Scanner(System.in);

        //System.out.print("Please enter your username: ");
        //String username = scanner.next();
        //System.out.print("Please enter your password ");
        String password = scanner.next();
        //System.out.println("The credentials that you provided where" + username + "/" + password);

        //System.out.print("Please provide your age: ");
        //int age = scanner.nextInt(); //Can throw input mismatch exception when given bad data
        // or data that doesn't match the input type (data that is not an int)

        // If an unhandeled exception is thrown on the a
        //System.out.println("Your age is: " + age);*/



        try{

            int age = scanner.nextInt(); // code in a try block is commonly called "risky" logic
            System.out.println("Your age is: " + age);

            // catch blocks are used to handle thrown exception
            // also
            // System.in represents the input stream for the console;
        } catch (InputMismatchException e){
            e.printStackTrace(); // Good idea to print the stack trace in development for logging purposes
            System.out.println("Invalid value"); //Prints if the user gives bad data
            main(args); // recursive solution to restart menu; not necessarily the
                        // best way due to memory overhead
        }
        System.out.println("+---------------------------------------------------+");

        // Reading input from the console using BufferedReader

        //InputStreamReader inStream = new InputStreamReader(System.in);
        //BufferedReader verboseReader = new BufferedReader(inStream);

        // the below code has the exact same functionality as the above line
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try{
            System.out.println("Please enter your name: ");
           String name = reader.readLine();
            System.out.println("Your name is: " + name);
            System.out.println("Provide your age again: ");
            String stringAge = reader.readLine();
            int age = Integer.parseInt(stringAge); // Potentially throws NumberFormatException
            System.out.println("Your age is: " + age);


        }
        //Can declare multiple exceptions in 1 catch block using the bitwise or "|"
        catch (IOException e){
            e.printStackTrace();
        }
        catch (NumberFormatException fe)
        {
            System.out.println("That was not a number");
        }
        catch (Exception e) {}// Highest level exception available (Most generic)

        // Note that catch blocks must be declared in order
        // of the most specific exception to the most generic or least specific

    }
}
