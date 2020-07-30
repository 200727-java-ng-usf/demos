package com.revature.arrays;

public class Arrays {
    public int[] bubbledArray(int[] arr){
        int n = arr.length;

        for (int i = 0; i<n-1; i++)
            for (int k=0; k<n -1-i; k++)
                if (arr [k] > arr[k+1]){
                    int number = arr[k];
                    arr[k] = arr[k+1];
                    arr[k+1]= number;
                }
        return arr;
    }

    public void printArr(int arr[]){

        int n = arr.length;
        for (int i=0; i<n; ++i){
            System.out.print(arr[i] + " ");
            System.out.println();
        }
    }

}
