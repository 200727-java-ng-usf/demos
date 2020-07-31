package com.revature.arrays;


import java.util.Arrays;

public class ArrayDemo {

    public void learningArrays(){

        int[] intArray = new int[5];
        int[] otherInts = Arrays.copyOf(intArray, intArray.length+1);
        int[] anotherArray = {new Integer(4)}; //unboxing example
        String[] arrayString = {"Hello", "Friendo", "Boop"};

        System.out.println("String representation:"+ intArray);
        System.out.println("First Element: " + intArray[0]);
        System.out.println("Array Length: " + intArray.length);
        System.out.println("otherInts length: "+ otherInts.length);

        intArray[intArray.length-1]=42;
//        printValues(intArray);
        printValues(arrayString);
        //unboxing example
        Integer[] integerArray = { 123 };



    }
    //learning arrays




    /*
    private void printValues(int[] intArray){
        for(int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }
    private void printValues(String[] arrayString){
        System.out.println("---------");
        for(String value : arrayString){
            System.out.println(value);
        }
    }
    */
    private void printValues(Object[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

}
