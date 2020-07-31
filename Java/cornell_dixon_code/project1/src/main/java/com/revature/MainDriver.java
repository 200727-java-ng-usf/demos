package com.revature;

import com.revature.arrays.Arrays;
import com.revature.fibonacci.Fib_Sequence;

public class MainDriver {
    public static void  main(String args[]) {

        Arrays obj= new Arrays(); //instantiates the new array
        int[] arr = {1,0,5,6,3,2,3,7,9,8,4}; //sets the arrays values, which we were given
        obj.bubbledArray(arr); //calls the method we used to sort from the Arrays class
        System.out.println("Sorted");
        obj.printArr(arr); // displays the bubble sorted array

        System.out.println("+--------------------------------------------+");

        System.out.print("0 1 ");
        Fib_Sequence.Sequence(0,1,25,2);

    }
}
