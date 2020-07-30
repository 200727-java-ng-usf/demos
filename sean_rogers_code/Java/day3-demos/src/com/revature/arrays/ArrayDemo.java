package com.revature.arrays;

import java.util.Arrays;

public class ArrayDemo {

    public void learningArrays() {

        int[] intArray = new int[5];
        System.out.println("String representation: " + intArray);

        System.out.println(intArray[0]);
        intArray[0] = 7861;
        System.out.println(intArray[0]);


        System.out.println(intArray[intArray.length - 1]);

        System.out.println(intArray.length);

        intArray[intArray.length - 1] = 42;

        printValues(intArray);

        System.out.println("+------------------------+");

        for(int value : intArray){
            System.out.println(value);
        }

        System.out.println("+------------------------+");

        String[] myStrings = {"this", "is", "an", "array", new String("literal")};

        printValues(myStrings);

        int[] otherInts = Arrays.copyOf(intArray, intArray.length +1);
        System.out.println("intArray length: " + intArray.length);
        System.out.println("otherInts length: " + otherInts.length);

        printValues(otherInts);

        int[] anotherArray = {new Integer(4)};

        Integer[] integerArray = {123};

        System.out.println(new Integer(10) + new Integer(5));

        Object[] randomArray = {12, "test", false, 4.3, "92"};

        int index0 = (int) randomArray[0];

        System.out.println(index0);

        //int index1 = (int) randomArray[1];
        System.out.println(randomArray[1].getClass());

        if(randomArray[4] instanceof String) {
            int index4 = Integer.parseInt((String) randomArray[4]);
            System.out.println(index4);
        }

    }//end learningArrays()

    private void printValues(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    private void printValues(String[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private void printValues(Object[] arr) {

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
