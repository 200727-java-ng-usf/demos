package com.revature.assignment1;

public class Q1BubbleSort {



    public static void main(String[] args) {

        int[] myArray = {1, 0, 5, 6, 3, 2, 3, 7, 9, 8, 4}; //Creating a new array that holds the specified values

        for(int i = 0; i < myArray.length; i++ ) {// Prints the Array before the Sort
            System.out.print(" " + myArray[i]);
        }
        System.out.println("");
        System.out.println("+-------------------------------------------------+");




        for(int a = 0; a < myArray.length; a++)
        System.out.print(myArray[a]);

    } // Ends main method


}

 /*boolean sort = false;

        // A do-while loop that iterate through the array sort the numbers while the boolean condition is false
        while (sort == false) {

           // Initial iteration of the myArray
           for(int i = 0; i < myArray.length - 1; i++)
           {
               int temp;
               if (myArray[i] > myArray[i + 1]) {
                   // Then 1 is placed in temp
                   temp = myArray[i];
                   // 0 [i+1] is placed in the 1's place
                   myArray[i] = myArray[i + 1];
                   // Then 1 is placed in the 0's place
                   myArray[i + 1] = temp;

                   System.out.println(myArray[i]);
               }

           }

        }*/


/*
        int temp; // temp variable holds the next item in the array
        int aNum;

        //For loop that begins the sort
        for(int i = 0; i < myArray.length - 1; i++){
            // For loop that begins to swap the numbers in the Array
            for(int j = 0; j < myArray.length - 1 - i; j++){

                // If statement that begins to sort the array
                if (myArray[j] > myArray[j +1]){
                    temp = myArray[j];
                    myArray[j] = myArray[j + 1]; // Sets the previous array item to the one after it
                    myArray[j + 1] = temp; // Inserts the temp variable into the spot where the swap happens.

                }

                for(int b = 0; b < myArray.length; b++ ) {// Prints the Array after the Sort
                    System.out.print(" " + myArray[b]);
                } // Ends final for loop that prints the array
                */