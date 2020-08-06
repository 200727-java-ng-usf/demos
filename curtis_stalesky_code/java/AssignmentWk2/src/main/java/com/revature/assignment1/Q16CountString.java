package com.revature.assignment1;

import java.util.Scanner;

public class Q16CountString {

    /*
    Nex step is to assign the scanner to the String field and then use a method using the atChar() to
    count the number of Chars in the string that was entered using the scanner.
    * */
    public static void main(String[] args)
    {

        CountString();

    }

    // The CountString method will be used to Calculate the number of Chars of
    // the inputString.
    static int CountString ()
    {
        System.out.print("Type something here: ");
        String inputString; // String will be used to store the input
        // This creates a new Scanner object that will take in an input from the User
        Scanner inputScanner = new Scanner(System.in);
        int stringCount; // This will store the string count from the CountString Method
        int counter = 0;
        inputString = inputScanner.nextLine();
        stringCount = Character.charCount(counter);
        // Need to insert a for loop to iterate through the given string


        System.out.println("Number of characters is: " + stringCount);

        return stringCount;
    }
    /*public int charAt()
    {
        
    } return;*/



}
