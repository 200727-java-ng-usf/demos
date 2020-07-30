package com.revature;

public class Question1 {

    public static int[] bubbleSort(int[] arr){
        int[] arr2 = arr;
        int temp;
        boolean done = false;
        while (!done){
            done=true;
            for (int i =0; i < arr2.length-1; i++) {
                if(arr2[i] > arr2[i+1]){ //if the cuurent index is larger than the next:

                    //set temp value to the current value
                    temp = arr2[i];
                    //move the next digit to the current position, since its smaller
                    arr2[i] = arr2[i+1];
                    //bubble the current number up to the next slot
                    arr2[i+1] = temp;
                    //since we had to do this, we are not done
                    done = false;
                }
            }
        }
        return arr2;
    }

}
