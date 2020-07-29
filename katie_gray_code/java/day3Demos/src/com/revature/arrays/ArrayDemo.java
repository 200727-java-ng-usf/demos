package com.revature.arrays;


import java.util.Arrays;

public class ArrayDemo {

    public void leaningArrays(){

        int [] intArray = new int[5];
        for(int i = 0; i < intArray.length; i++){
            intArray[i] = i;
        }
        intArray[intArray.length -1] = 42;
        System.out.println("String representation: "+ intArray);

        System.out.println(intArray[0]);
        System.out.println(intArray.length - 1);
        //traditional loop
        for( int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }
        //for-each loop ("enhanced" for loop)
        //no access to index position value
        for (int value : intArray){
            System.out.println(value);
        }

        String[] myStrings = {"this", "is", "an","array", new String("literal")};
        System.out.println(myStrings[4]);

        printValues(myStrings);
        printValues(intArray);

        int[] otherints = Arrays.copyOf(intArray, intArray.length+1);
        System.out.println("intArray length: "+ intArray.length);
        System.out.println("otherInts length: "+ otherints.length);

        //unboxing
        int[] arr = {new Integer(4)};
        //autoboxing
        Integer[] integerArray = { 123 };

        // you want a heterogeneous array (with different types, you need to declare a higher level object like Object
        Object[] randomArray = { 12, "test", false, "4.3"};

    }

    //method overloading, these are methods that have the same name but
    //have different data types or parameters and number of arguments
    //also known as compile-time polymorphism

    private void printValues(int[] array){
        for( int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
    private void printValues(String[] arr){ // overloaded method
        for( int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    //we can reduce the redundancy of having two methods that do the same thing
    //by making out printValues method more "generic"
    //does not work in the cases of primitive type arrays (ex: int[] cannot be converted to Object[]

//    private void printValues(Object[] arr){
//        for( int i = 0; i < arr.length; i++){
//            System.out.println(arr[i]);
//        }
//    }
}

//arrays are of a fixed size and they cannot be changed but they can be copied into a new array
//the arrays class provided by the JRE is a utility class for doing such an operation