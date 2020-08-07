package com.revature.exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsDriver {
    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        try {
//            String input = getInput(reader);
//        }
//        catch (IOException e){
//            System.out.println(e.getStackTrace());
//        }


        Scanner scanner = new Scanner(System.in);

        //the following line has the potentioal to throw an inputmismatchexception
        //but is not required to handle i, because it is unchecked exception

//        try {
//            int someNumber = scanner.nextInt();
//            return;
//        }catch (InputMismatchException ime){
//            /*
//                Try/catch/finally Rules
//                    - a try block cannot exist on its own
//                    - variables declared within a try/catch block are not vis. in any other catch blocks (block scope)
//                    - BRACES DELINEATE SCOPE!!
//             */
//
//            //print a trace of how this exception happened
//            ime.printStackTrace();
//            return;
//        }catch (Exception e){
//            //variables declared within the try or even other cath blocks are
//            //restricted tp those code blocks
//            //more generic / Higher level eXCEPTIONS MUST be declared last
//            e.printStackTrace();
//            return;
//        }
//        //always executes regaurdless of weather or not the try block raises an exception
//        finally {
//            System.out.println("Thanks for playing?");
//        }

        LogInScreen l = new LogInScreen();
        l.printMenu();
    }



    //Adding a throws clause to a method signiture indicates that this method mayy throw the
    //declared exception
    //Unchecked exceptions a never required to bve handled, though it may
    public static String getInput(BufferedReader reader) throws IOException {
        return reader.readLine();
    }
}
