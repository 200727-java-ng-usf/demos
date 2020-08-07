package com.revature.testing;

import java.util.Arrays;

public class Sorter {
    public int[] sort(int[] arr){

//        if (arr == null){
//            int[] blankArray = {};
//            return blankArray;
//        }
        //check for edge cases
        if (arr == null || arr.length == 0){
            return new int[0];
        }


        //make a copy of original array, this copy will be sorted insted of the original
        int[] copy = Arrays.copyOf(arr, arr.length);


        //sort the array
        int n = arr.length;
        for(int i = 0; i < n-1; i++){
            for (int j = 0; j <n -1; j++){
                //determine if the current value is greater or less than next
                if (copy[j] > copy[j+1]){
                    //swap the values
                    int temp = copy[i];
                    copy[j] = copy[j +1];
                    copy[j +1] = temp;
                }
            }
        }


        return copy;
    }
}
