package com.revature.io;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadConsoleDriver {
    public static void main(String[] args) {
        System.out.println("Printing to console is easy enough");

        Scanner scanner = new Scanner(System.in); // System.in represents the input stream for the console
        System.out.print("Please enter your username: ");
        String username = scanner.next();
        System.out.print("Please enter your password ");
        String password = scanner.next();
        System.out.println("The credentials you provided were: " + username + "/" + password);

        /*
        System.out.println("Please provide your age: ");
        int age = scanner.nextInt(); // can throw InputMismatchException is given bad data(data that is not a int)

        //InputMismatchException is an unchecked exception

        System.out.println("Your age is: " + age);
        */


        try{
            int age = scanner.nextInt();
            System.out.println("Your age is: " + age);
        } catch (InputMismatchException e ) {
            System.out.println("Invalid value!");
        }

        System.out.println("+---------------------------------------+");

        // Reading input from the console using BufferedReader

        InputStreamReader inStream = new InputStreamReader(System.in);
        BufferedReader reader1 = new BufferedReader(inStream);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));





        try{
            System.out.println("Please enter your name: ");
            String name = reader.readLine();
            System.out.println("Your name is: " + name);

            System.out.println("Provide your age: ");
            String stringAge = reader.readLine();
            int age = Integer.parseInt(stringAge); // potentially throws NumberFormatException
            System.out.println("Your age is: " + age);

        } catch (NumberFormatException nfe) {
            System.out.println("That was not a number");
        }
        // you can declare multiple exceptions in one catch using the bitwise OR operator: '|'
        catch (IOException | ClassCastException e) {
            e.printStackTrace();
        } catch(Exception e) {
            System.out.println("Something went wrong...");
        }

        // use Scanner if you want to parse text rather than just read it

    }
}
