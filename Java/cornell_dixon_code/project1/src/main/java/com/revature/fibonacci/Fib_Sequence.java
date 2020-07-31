package com.revature.fibonacci;

public class Fib_Sequence {
/*
RECURSION

 */
    public static void Sequence(int n1, int n2, int index, int count){
            if (count< index){  //starts loop

                int number = n1 +n2; //adds first two numbers to creat new 3rd number
                System.out.print(number + " "); //holds that new number

                Sequence(n2, number, index, ++count); // recursion

            }

    }
}
