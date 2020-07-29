package com.revature.arrays;

import java.util.Arrays;

public class ArrayDemo {

    public void learningArrays(){

        // Array declarations
        int[] intArray = new int[5];
        System.out.println("String representation: " + intArray);


        intArray[intArray.length -1] = 42;

        String[] strArray = {"This", "is", "a", "string", "list"};

        /*for (int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }

        System.out.println("+---------------------------");

        //enhanced for loop (for-each loop)
        for (int value: intArray){
            System.out.println(value);
        } */

        printValues(intArray);
        printValues(strArray);

        //arrays are a fixed size, can not be changed, but can be copied into new, bigger/smaller array

        int[] otherInts = Arrays.copyOf(intArray, intArray.length +1);
        System.out.println("intArray length: " + intArray.length);
        System.out.println("otherInts length: " + otherInts.length);

        printValues(otherInts);

        //example of unboxing, converting an integer obj into a primitive int
        int[] anotherArray = {new Integer(4)};

        //example of autoboxing, JAVA auto converting a primitive int into an Integer obj
        Integer[] integerArray = {123};

        System.out.println(new Integer(10) + new Integer(5));

        //heterogenous array: declare a higher-level array
        Object[] randomArray = {12, "test", true, 90.43};

        //Java does not like int index0 = randomArray[0]; because randomArray is not an int, its an obj
        int index0 = (int) randomArray[0];
        //(int) is casting, turning 12 into an int from an obj
        System.out.println(index0);
        //can not turn non-number strings into int, can turn ints into strings
    }

    private void printValues(int[] arr) {
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    private void printValues(String[] arr) {
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

}
