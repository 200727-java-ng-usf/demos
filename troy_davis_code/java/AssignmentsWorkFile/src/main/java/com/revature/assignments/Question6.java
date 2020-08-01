package com.revature.assignments;
/*
    Q6. Write a program to determine if an integer is even without using the modulus operator (%)
*/

public class Question6 {

    public boolean findIfEven(int number){
        int n = number;
        //TODO: fix the method so that is does the thing!
        if(n/2 == 0){
            System.out.println(n + " appears to be even");
            return true;
        }else
            System.out.println(n + " appears to be odd");
            return false;
    }

}


