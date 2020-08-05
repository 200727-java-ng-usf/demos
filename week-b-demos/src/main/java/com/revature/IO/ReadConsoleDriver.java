package com.revature.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadConsoleDriver {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in); //System.in represents console for input stream

        System.out.print("Please Enter your name: ");
        String userName = scanner.next();
        System.out.print("Please Enter your password: ");
        String password = scanner.next();

        System.out.println("your name is " + userName + "  .password: "+ password);


        System.out.print("Please Enter your age: ");

        try {
            int age = scanner.nextByte();
            System.out.println("your age is " + age);
        }catch (InputMismatchException e){
            e.printStackTrace();
            System.out.println(" Invalid value ");

          //  main(args);  // recursive solution to restart menu; not necessarily the best way due to memory
        }
        finally {
            System.out.println("Thank you for your input");
        }

        System.out.println("-----------------------------------------------------------------");

        //BufferReader
        InputStreamReader inStream = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inStream);
        // easy version
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please Enter you name: ");
        try {
            String name = reader.readLine();
            System.out.println("your name is " + name);
        }
        catch (IOException | ClassCastException | NullPointerException e){
            e.printStackTrace();
        }


    }
}
