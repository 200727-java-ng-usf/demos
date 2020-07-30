package com.revature.arrays;

public class Arrays {
    public int[] bubbledArray(int[] arr){
        int n = arr.length;

        for (int i = 0; i<n-1; i++) //loops the array
            for (int k=0; k<n -1-i; k++) //loops within the loop
                if (arr [k] > arr[k+1]){  //checks the 1st against 2nd, 3rd against 4th etc
                    int number = arr[k];   // line 10 -13 is what swaps the numbers
                    arr[k] = arr[k+1];
                    arr[k+1]= number;
                }
        return arr;
    }

    public void printArr(int arr[]){ //this is the method that allows for the driver to string the bubblesorted array

        int n = arr.length;
        for (int i=0; i<n; ++i){
            System.out.print(arr[i] + " ");
            System.out.println();
        }
    }

}
