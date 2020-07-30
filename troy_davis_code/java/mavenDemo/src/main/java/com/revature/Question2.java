package com.revature;

public class Question2 {
    public static int[] getFebNumber(){
        //integer to hold the array of numbers, 25 long
        int[] febNumber = new int[25];
        //variables to hold the first two numbers of the Feb sequesnce
        int n1 = 0;
        int n2 = 1;

        //variable to hold the third number of the feb sequence
        int n3;

        //set them up in the febNumber array
        febNumber[0] = n1;
        febNumber[1] = n2;

        //iterate through the Feb sequence array
        for(int i = 2; i < febNumber.length; i++){
            febNumber[i] += (febNumber[i-1] + febNumber[i-2]);
        }
        return febNumber;
    }
}
