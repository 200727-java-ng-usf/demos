package com.revature;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleSandbox {

    public static void consoleStuff(){
        System.out.println("Printing out");

        Scanner scanC = new Scanner(System.in);
        System.out.print("Enter value: ");
        String value = scanC.next();
        System.out.println("value: "+value);



        try{
            System.out.println("Enter int: ");
            int valueIn = scanC.nextInt();
        }
        catch (InputMismatchException e){
            e.printStackTrace(); //debug log
            System.out.println("Nope");
            //enter recursive // throw back in primary method
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try{
            System.out.println("Enter name: ");
            String name = reader.readLine(); //needed to add IOException on the catch
            System.out.println("Name: "+name);

        }
        catch (InputMismatchException | IOException e){
            e.printStackTrace(); //debug log
            System.out.println("Nope");
            //enter recursive // throw back in primary method
        }

        //can also use:
        // ClassCastException , NullPointerException NumberFormatException


    }

}
