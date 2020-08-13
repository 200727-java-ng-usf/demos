package com.revature.exceptions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
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


        // the followinf has the potential to throw an InputMismatchException
        //but is not required to handle it, because it is an unchecked exception.
        try {
            int someNumberHopefully = scanner.nextInt();

        } catch (InputMismatchException ime) {
            System.out.println();
        } catch (Exception e) {

        }
        /*
            Try/ catch / finally rules

                - a try block cannot exist on its own
                - catch blocks must be declared in order of most specific exceptions to the least specific
                - variables declared within a try block are not visible in any of the catch blocks
                - variables declared within a catch block are not visible outside of it
                - finally always executes regardless of whether or not the try block raises an exception
         */
    }

    //Adding the throws clause to a method signature indicates that this method may throw
    // the declared exceptions. if any checked exceptions are declared, then anywhere this method is invoked
    //they must be handled or further propagated. unckecked exceptions are never required to be handled.
    static public String getInput(BufferedReader reader) throws IOException, NullPointerException {

        String input = reader.readLine();
        return input;
    }
}
