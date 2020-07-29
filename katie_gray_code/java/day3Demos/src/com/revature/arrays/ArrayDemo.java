package com.revature.arrays;


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
    }

    //method overloading, these are methods that have the same name but
    //have different data types or parameters and number of arguments
    //also known as compile-type polymorphism

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
}
