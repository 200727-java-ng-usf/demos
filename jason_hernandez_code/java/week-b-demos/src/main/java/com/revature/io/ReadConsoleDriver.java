package com.revature.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadConsoleDriver {
    public static void main(String[] args) {
        System.out.println("Printing to the console is easy");

        // Reading input from the console using Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your username ");
        String username = scanner.next();
        System.out.println("The name that you provided is: " + username);
        System.out.print("Please enter your password ");
        String password = scanner.next();
        System.out.println("The password that you provided is: " + password);

        // If the user gives wrong data type
        System.out.print("Please enter your age ");

        try {
            int age = scanner.nextInt();
        }
        catch(InputMismatchException e) {
            System.out.println("Invalid value");
            main(args);
        }

        System.out.println("your age is: " + username);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter your first name");

        try {
            String name = reader.readLine();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
