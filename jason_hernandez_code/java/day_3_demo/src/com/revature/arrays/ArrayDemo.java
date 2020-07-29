package com.revature.arrays;

public class ArrayDemo {
    public void learningArrays() {
        int[] intArray = new int[5];

        intArray[intArray[0]] = 7654;
        intArray[intArray.length - 1] = 43;

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
        System.out.println("+--------------------------------+");

        String[] myStrings = {"This", "is", "an", "array", "lteral"};
        printValues(myStrings);
    }

    private void printValues(Object[] array) {
        for (int i = 0; i < array.length; i++) System.out.println(array[i]);
    }
}