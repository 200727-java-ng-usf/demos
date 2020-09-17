package com.revature.exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDriver {


    public static void main(String[] args) {

//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//        try {
//            String input = getInput(reader);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        Scanner scanner = new Scanner(System.in);

        // the following line has the potential to throw an InputMismatchException
        // but is not required to handle it, because it is an unchecked exception.
        try {
            int someNumberHopefully = scanner.nextInt();
        } catch (InputMismatchException ime) {
            ime.printStackTrace(); // prints a trace of how this exception occurred
        }

        // catch blocks with more generic (higher-level) exceptions must be declared last
        catch (Exception e) {
            // variables declared within the try or even other catch blocks are
            // restricted to those code blocks
//            System.out.println(someNumberHopefully); // not visible!

        }

        // always executes regardless of whether or not the try block raises an exception
        finally {
            scanner.equals(null); // Scanner is visible here
            System.out.println("I will always print!");
        }

        /*
            Try/catch/finally Rules

                - a try block cannot exist on its own (must be paired with at least one catch or a finally)
                - catch blocks must be declared in order of most specific exceptions to the least specific
                - variables declared within a try block are not visible in any of the catch blocks
                - variables declared within a catch block are not visible outside of it
                -
         */

        LoginScreen loginScreen = new LoginScreen();


        try {
            loginScreen.printMenu();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    // Adding a throws clause to a method signature indicates that this method may
    // throw the declared exception(s). If any checked exceptions are declared, then
    // anywhere this method is invoked, they must be handled (either caught or further
    // propagated. Unchecked exceptions are never required to be handled, though it may
    // be prudent to do so in many cases.
    public static String getInput(BufferedReader reader) throws IOException, NullPointerException {
        return reader.readLine();
    }

}
