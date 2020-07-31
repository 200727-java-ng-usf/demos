package com.revature.Arrays;

import java.util.Arrays;

public class ArrayDemo {


    public void learningArrays() {
        //array declarations
        int[] intArray = new int[5];
        System.out.println("String representations: " + intArray);
        System.out.println(intArray[0]);
        intArray[0] = 7861;
        System.out.println(intArray[0]);
        //throws a ArrayIndexOutOfBoundsException
        //Eas
        System.out.println(intArray[intArray.length - 1]);
        // see the length of the array
        System.out.println(intArray.length);


        //chage last value in array
        intArray[intArray.length - 1] = 42;

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
        //for each loop (aka "enhanced" for loop)
        //NO acces to index position value
        for (int value : intArray) {
            System.out.println(value);
        }

        System.out.println("+--------------------+");

        String[] myStrings = {"this", "is", "an", "array", new String("literal")};

        printValues(myStrings);

        int[] otherInts = Arrays.copyOf(intArray, intArray.length + 1);
        System.out.println("intArray length: " + intArray.length);
        System.out.println("otherInts length: " + otherInts.length);
        printValues(otherInts);

        //example of  unboxing
        int[] anotherArray = {new Integer(4)};

        // example of autoboxing
        //Java auto converts a primitive int into
        //an integer object
        Integer[] integerArray = {123};

        //java knows what you mean
        System.out.println(new Integer(10) + new Integer(5));

        //if you want a heterogenous array(different types)
        Object[] randomArray = {12, "test", false, 4.3};

        int index0 = (int) randomArray[0];
        System.out.println(index0);

//        int index1 = Integer.parseInt((String) randomArray[1]);
//        System.out.println(index1);

        //Checks what instance type
        System.out.println(randomArray[1].getClass());

        //conditionalize the operation
        if (randomArray[4] instanceof String) {
            int index1 = Integer.parseInt((String) randomArray[4]);
            System.out.println(index1);
        }
    }


    private void printValues(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }//Method Overloading
//
//    private void printValues(String[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//    }

    //we can reduce the redundancy of having
    //two methods that do the same thing by
    //making our printValues method more generic
    private void printValues(Object[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
