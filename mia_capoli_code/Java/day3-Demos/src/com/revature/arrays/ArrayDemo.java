package com.revature.arrays;

import java.util.Arrays;

public class ArrayDemo {

    public void learningArrays() {

        /*

            Array declarations

                inr[] arr = new int[5];
                int []arr = new int[5];
                int arr[] = new int[5];
                int[] arr = {0, 0, 0, 0, 0};

            Arrays are of a fixed size. meaning that once initialized
            (created) their size will never change.

         */
        int[] intArray = new int[5];

        //he calls System.out.println(), "sysout" for short shorthand is sout
        System.out.println("String representation:" + intArray); // prints random psuedo-memory address

        /*
            Assign and manip array values

                - Java primitive array start with index pos of 0
                    + an array with 5 values has index pos 0 - 4

                - use "bracket notation" to access array values by their index position
         */
        System.out.println(intArray[0]);
        intArray[0] = 7861;
        System.out.println(intArray[0]);

        // Easy access to last value if you don't know Array length -
        System.out.println(intArray[intArray.length - 1]);

        // See the length of the array (# of items)
        System.out.println(intArray.length);

        //change last value in array
        intArray[intArray.length - 1] = 42;


        // Traditional for loop
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

        System.out.println("+-----------------");

        /* for-each loop (aka "enhanced" for loop)
           don't have access to the location in loop
         */
        for  (int values : intArray) {
            System.out.println(values);
        }

        System.out.println("+-----------------");

        String[] myStrings = {"Hello", "my", "name", "is", "Mia"};

        printValues(myStrings);

        // Remember: arrays are of a fixed size and that cannot be changed, but can be copied into a new array
        // the Arrays class provided by the JRE isa  utility class for doing this and other operations

        int[] otherInts = Arrays.copyOf(intArray, intArray.length + 1);
        System.out.println("intArray length: " + intArray.length);
        System.out.println("otherInts length: " + otherInts.length);

        printValues(otherInts);

        // Example of unboxing (Java automatically converting an integer object into a primitive int)
        int[] anotherArray = {new Integer(4)};
        // Example of autoboxing (Java automatically converting a primitive int into an Integer object
        Integer[] integerArray = { 123 };

        // Java is p smart, it knows what you meant most of the time
        System.out.println(new Integer(10) + new Integer(5));

        //if for some reason you want a heterogeneous array (differing types): declare a higher-level type for the array:
        Object[] randomArray = {12, "test", false, 4.5, "93" };

        // int index0 = randomArray[0]; // Java thinks the int in that array is an
                                    // object
        int index0 = (int) randomArray[0]; //explicitly cast the value at pos zero to an int
        System.out.println(index0);

        //but what if it wasn't an int?
        // int index1 = (int) randomArray[1]; // throws a ClassCastException

//        int index1 = Integer.parseInt((String) randomArray[1]);
//        System.out.println(index1); // Number format exception, "test" can't be int

        // check to see what instance type is
        System.out.println(randomArray[1].getClass());

        // conditionalize the operation
        if ( randomArray[4] instanceof String) {
            int index1 = Integer.parseInt((String)randomArray[4]);
            System.out.println(index1);

        }

    } // <--- closing brace of the "learningArrays" method

    private void printValues(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    /*
        Method overloading

            - Methods that have the same name but differing return types or parameters
                + could have fewer or more parameters
                + could have parameters of different data types

            - compile-time polymorphism (more on that later)
                + complie-time, because the method that you will be determined at compile time
     */
    private void printValues(String[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    // We can reduce the redundancy of having teo methods that do the same
    // thing by making our printValues method more 'generic"
    // doesn't work in the cases of primitive arrays ex:
    // int arrays can't be automatically converted to object array

//    private void printValues(Object[] arr) {
//          for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//    }

}
