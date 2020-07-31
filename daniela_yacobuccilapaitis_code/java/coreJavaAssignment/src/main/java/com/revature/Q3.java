package com.revature;
import java.util.Scanner;

//Q3. Reverse a string without using a temporary variable.
// Do NOT use reverse() in the StringBuffer or the StringBuilder APIs.
public class Q3 {

    // needs to actually return String, not array of chars. can use stringbuilder, just not use reverse??
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter a String");
            String inputString = scan.next();

            StringBuilder reversedString = new StringBuilder(inputString.length());
        for(int i = 0, j = inputString.length()-1; i < inputString.length(); i++, j--) {

            reversedString.insert(i, inputString.charAt(j));
        }

        System.out.println("The following is the reversed String " + reversedString.toString());

    }
}
