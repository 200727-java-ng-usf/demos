package com.revature.assignment1;

import java.util.Scanner;

/* Question 10 Complete */
public class Q10TernaryOperators {

    public static void main(String[] args) {

        LowestNumber(); // calls the method for the lowest number
    }
    /* Method to take in 2 ints and determine the lowest of the 2 ints*/
    public static void LowestNumber ()
    {
        // Starting variables
        int num1;
        int num2;
        int lowestNum;
        // Creates a new Scanner object
        Scanner numberScan = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        num1 = numberScan.nextInt(); // Asks for the first number input

        System.out.print("Please enter another number: ");
        num2 = numberScan.nextInt(); // Asks for the second number input

        // Uses the ternary operator to determine which number is the lowest
        lowestNum = (num1 < num2) ? num1:num2;


        System.out.println("The lowest number is: " + lowestNum); // prints the result

    }
}
