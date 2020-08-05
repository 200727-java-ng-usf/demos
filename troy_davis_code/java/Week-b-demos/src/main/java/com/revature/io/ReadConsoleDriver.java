package com.revature.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadConsoleDriver {
    public static void main(String[] args) {
        System.out.println("Pringting to console is easy enough");

        //Reading input from console using scanner class
        //System.in represents the console i.e. command line
        //much like System,out rep the output of the console

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your username: ");
        String username = scanner.next();
        System.out.print("please enter your password: ");
        String password = scanner.next();
        System.out.println("the credentials that you provided was " + username +" " + password);

        System.out.print("please provide age");

        try {
            int age = scanner.nextInt(); //code in a try block is commonly called "risky" logic
            //can throw input mismatch exception if given bad data (that cannot be parsed)
        }catch (InputMismatchException e){ //unchecked exception: dont have to handle
            //print stack trace;
            //ALWAYS a good idea for development
            e.printStackTrace();
            //prints if bad data
            System.out.println("please provide a real age");

            //use recursion to run again
            //not best idea, can lead to memory issues as new stack are created they use more and more memory
            main(args);

        }

        System.out.println("++---------------------------++");

        //reading input from console using
        //BufferReader - best if data always treated as strings (login, username, etc.)


        //very verbose
        InputStreamReader inStream = new InputStreamReader(System.in);
        BufferedReader VerboseReader = new BufferedReader(inStream);

        //Much more clean!!
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        String s = "";
        try {
            System.out.println("please enter your first name: ");
            String name = reader.readLine();

            System.out.println("Your name is: " + name);
            System.out.println("please provide a real age");
            String stringAge = reader.readLine();
            int age = Integer.parseInt(stringAge); //potentially throws NumberFormatExeption / Runtime exeptions

        }
        //you can declare multiple exeptions in one catch just use the bitwise OR operator |
        catch (NumberFormatException | ClassCastException nfe){
            System.out.println("That was not a number!");
        } catch (IOException e){
            e.printStackTrace();
        }

        //Note that catch blocks must be declared in order of the most specific exception to the most generic

    }
}
