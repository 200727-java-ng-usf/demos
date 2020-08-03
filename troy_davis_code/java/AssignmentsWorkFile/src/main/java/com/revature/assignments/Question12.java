/*
    Q12. Write a program to store numbers from 1 to 100 in an array.
         Print out all the even numbers from the array.
         Use the enhanced FOR loop for printing out the numbers.
 */

package com.revature.assignments;

import java.util.Arrays;

public class Question12 {
    public int[] intArray;
    public int[] evenOnlyArray;

    //no args constructor which creates an array of size 100 and finds the even numbers
    public Question12(){
        this.intArray = fillIntArrayFromSize(100);
        this.evenOnlyArray = findEvenNumbers(intArray);
    }
    public Question12(int arraySize){
        this.intArray = fillIntArrayFromSize(arraySize);
        this.evenOnlyArray = findEvenNumbers(intArray);
    }
    private int[] findEvenNumbers(int[] someIntArray){
        int [] temp = new int[someIntArray.length];
        for(int i : someIntArray){
            if(someIntArray[i]%2 == 0){
                temp[i] = someIntArray[i];
            }
        }
        //remove zeros
        for(int j : someIntArray){
            if(someIntArray[j] == 0){
                int tempInt = someIntArray[j+1];
                someIntArray[j] = tempInt;

            }
        }
        return temp;
    }
    private int[] fillIntArrayFromSize(int arraySize){
        int size = arraySize;
        int[] returnArray = new int[arraySize];
        for(int i =1; i < returnArray.length-1; i++){
            returnArray[i] = i;
        }
        return returnArray;
    }

    public int[] getIntArray() {
        return intArray;
    }

    public void setIntArray(int[] intArray) {
        this.intArray = intArray;
    }

    public int[] getEvenOnlyArray() {
        return evenOnlyArray;
    }

    public void setEvenOnlyArray(int[] evenOnlyArray) {
        this.evenOnlyArray = evenOnlyArray;
    }

    @Override
    public String toString() {
        return "Question12{" +
                "intArray=" + Arrays.toString(intArray) +
                ", evenOnlyArray=" + Arrays.toString(evenOnlyArray) +
                '}';
    }
}
