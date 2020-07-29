package com.revature.arrays;

import java.util.Arrays;

public class ArrayDemo {
    String name;
    int count;
    public ArrayDemo(){
        super();
    }

    public void learninGaRRAYS(){
        /*
            Array Declarations
            int []arr = new int[5];
            int arr[] = new int[5];
            int[] arr = {0, 0, 0, 0, 0}  array literal notation

            Arrays are of a fixed size, so once created their size will never change

         */
        int[] intArray = new int[5];
        System.out.println("String representation"+ "" + intArray[0]);
        intArray[0] = 6345;
        System.out.println("new "+ "\n" + intArray[0]);
        //print last position
        System.out.println(intArray[intArray.length-1]);
        //changed last value
        intArray[intArray.length-1] = 42;
        //print each value in traditional for loop
        for (int i=0; i< intArray.length; i++){
            System.out.println(intArray[i]);
        }
        System.out.println("++-------------------------------++");
        //for each loop (aka enhanced for loop)
        //Note: no access to index positions
        for (int value : intArray){
            System.out.println(value);
        }
        System.out.println("++-----------------------------++");

        String[] myStrings = {"this", "is", "a", "new", "String", "Araay", new String("literal")};
        printValues(myStrings);
        //printValues(intArray);
        int[] otherInts = Arrays.copyOf(intArray, intArray.length+1);
        printValues(intArray);
        //Example of unboxing obj to prim int
        int[] anotherArray = { new Integer(4)};

        //ex. of autoboxing prim. int to obj
        Integer[] integerArray = {new Integer(45), 123};

        //If for some reason you want a heterogeneous aray (differing types): declare a higher-level
        Object[] randomArray = {12, "test", false, 4.3f, this};
        //int index0 = randomArray[0]; // Java gets mad, because everything in the array is an object
        //fixed
        int index0 = (int) randomArray[0];
        System.out.println(index0);

        int index1 = (int) randomArray[1]; // throws class cast exception
        System.out.println(randomArray[1].getClass());
        if (randomArray[1] instanceof String){
            int inde1 = Integer.parseInt((String) randomArray[4]);
            System.out.println(index1);
        }
     }

    private void printValues(int[] arr){
        for (int value : arr){
            System.out.println(value);
        }
    }
    //overloading
//    private void printValues(String[] str){
//        for (String s : str) {
//            System.out.println(s);
//        }
//    }
    private void printValues(Object[] obj){
        for(Object o: obj){
            System.out.println(o);
        }
    }


}
