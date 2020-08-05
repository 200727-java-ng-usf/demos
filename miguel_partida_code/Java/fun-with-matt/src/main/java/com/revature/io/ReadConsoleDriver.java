package com.revature.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadConsoleDriver {

    public static void main(String[] args) {
        System.out.println("Printing to the console is easy enough");

        //Reading input form the cosole using scanner class

        Scanner scanner = new Scanner(System.in);//System.in represents the console
        System.out.println("Please enter your username: ");
        String username = scanner.next();
        System.out.println("Please enter your password: ");
        String password = scanner.next();
        System.out.println("Username: " + username + "Password: "+ password);

//
//        System.out.println("Age: ");
//        int age = scanner.nextInt();
//        System.out.println("Age: " + age);

        System.out.println("Age: ");
        try{
            int age = scanner.nextInt();
            System.out.println("Age: " + age);

            //catch block are used to handle thrown exceptions
            //InputMismatchException is an unchecked exception
        } catch (InputMismatchException e){
            e.printStackTrace();// always a good idea to print stack trace
            System.out.println("Invalid Value!");
            main(args);//recursive solution to restart menu; not the best way, very memory intensive
        }

        System.out.println("+--------------------+");

        //BufferedReader-reading input from the console

//        InputStreamReader inStream = new InputStreamReader(System.in);
//        BufferedReader verbosereader = new BufferedReader(inStream);
//both of these do the same thing
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));



        try{
            System.out.println("Your name: ");
           String name = reader.readLine();
            System.out.println("Your name: "+ name);
            System.out.println("Age: ");
            String stringAge = reader.readLine();
            int age = Integer.parseInt(stringAge); // potentially throw NumberFormatException
            System.out.println("Age: "+age);
        }catch (IOException e){
            e.printStackTrace();
        }catch (NumberFormatException nfe){// you can declare multiple exceptions in one catch. use bitwise operator
            System.out.println("That was not a number");

        }catch (Exception e){
            System.out.println("oops");
        }

        //Note that catch blocks must be declared in order of most specificness
        //String firstname = "";

    }
}
