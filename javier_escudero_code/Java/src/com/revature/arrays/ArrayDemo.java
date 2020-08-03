package com.revature.arrays;

public class ArrayDemo {
    public void learningArrays() {
        /*
         Array declarations
        int[] arr = new int[5];
        int []arr = new int[5];
        int arr[] = new int[5];
    Arrays are of a fixed size, meaning that once initialized (created) their size will never () -> change
                */
        int[] intArray = new int[5];

        intArray[intArray.length - 1] = 43;

        for (int i = 0; i < intArray.length; i++) {
            System.out.printf("String representation:" + intArray);
            // prints random pseudo-memory add
        }
    }
}