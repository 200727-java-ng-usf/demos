package com.revature.arrays;

import java.sql.SQLOutput;
import java.util.Arrays;

public class ArrayDemo {

    String someValue;

    public ArrayDemo(){
        super();
    }
    public ArrayDemo(String value){
        someValue = value;
    }

    public void learningArrays(){

        boolean dontRun = true;
        if(!dontRun) {
            return; // void methods cannot return values, but you can still use the return keyword
            // ends the method early
        }

        /*
            Array declarations
            int[] arr = new int[5];
            int []arr = new int[5[;
            int arr[] = new int[5];
            int[] arr = {0, 0, 0, 0, 0}

            Arrays are of a fixed size, meaning that
            once initialized, (created) their size will
            never change.
        */

        int[] intArray = new int[5];

        //I call System.out.println "sysout" for short
        System.out.println("String representation: " + intArray); //prints pseudorandom semi-memory pointer thingamabob
        /*
        * Accessing and manipulating array values
        *
        * - Java primitive arrays start with an index position of: 0
        *  + An array with 5 values in it, will have index position 0 through 4
        * - use "bracket notation" to access array value by heir index position
        * */

        System.out.println(intArray[0]);
        intArray[0] = 7861;
        System.out.println(intArray[0]);
//        System.out.println(intArray[intArray.length]);
        System.out.println(intArray[intArray.length - 1]);

        //Change last value in array
        intArray[intArray.length - 1] = 42;

        //traditional for loop
        printValues(intArray);

        System.out.println("+------------------------+");

        //for-each loop (aka "enhanced for loop")
        for(int value : intArray){
            System.out.println(value);
        }
        System.out.println("+------------------------+");
        System.out.println(Arrays.stream(intArray));
        System.out.println("+------------------------+");

        String[] myStrings = {"this", "is", "an", "array", new String("Literal")};

        printValues(myStrings);

        //Remember arrays are of a fixed size that cannot be changed,
        //but can be copied into a new array
        //The Arrays class provided by the JRE is a utility class for doing such operations, and others

        int[] otherInts = Arrays.copyOf(intArray, intArray.length + 1);
        System.out.println("intArray length: " + intArray.length);
        System.out.println("otherInts length: " + otherInts.length);

        printValues(otherInts);

        // Example of unboxing (Java automatically converting an Integer Object into a primitive int
        int[] anotherArray = { new Integer(4)};

        //Example of autoboxing (Java automatically converting a primitive int into an Integer object
        Integer[] integerArray = {45, 123};

        //Java is pretty smart, it know what you meant most of hte time
        System.out.println(new Integer(10) + new Integer(5));

        //if, for some reason, you want a heterogeneous array (differing types) declare a higher level type for the array
        Object[] randomArray = {12, "test", false, 4.3};

//        int index0 = randomArray[0]; // Java gets mad because everything in randomArray is an Object
        int index0 = (int)randomArray[0];
        System.out.println(index0);

//        int index1 = (int)randomArray[1]; // throws a ClassCastException

        System.out.println(randomArray[1].getClass());

        //conditionallize the operation
        if(randomArray[3] instanceof String){
            int index1 = Integer.parseInt((String) randomArray[3]);
            System.out.println(index1);
        }
    }

    //Overloaded Methods
    public void printValues(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
            if(i < arr.length - 1){
                System.out.printf(", ");
            }
        }
    }

    /*Method Overloading

            - methods that have hte same name, but differing return types or parameters
                + could have fewer or more parameters
                + could have parameters of different data types

            - compile-time polymorphism
                + compile-time, because the method that you will use can be determined at compile time
     */
    public void printValues(String[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
            if(i < arr.length - 1){
                System.out.printf(", ");
            }
        }
    }

    /* We can reduce the redundancy of having two methods that do the
        same thing by making our printValues method more "generic"
     */
//    private void printValues(Object[] arr){
//        for(int i = 0; i < arr.length; i++){
//            System.out.println(arr[i]);
//        }
//    }
}
