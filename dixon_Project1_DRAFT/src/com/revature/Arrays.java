package com.revature;

import com.revature.*;

public class Arrays {

    public void bubbledArray(int arr[]){
        int n = arr.length;

        for (int i = 0; i<n-1; i++)
            for (int k=0; i<k-i-1; k++)
                if (arr [k] > arr[k+1]){
                    int number = arr[k];
                    arr[k] = arr[k+1];
                    arr[k+1]= number;
                }
    }

    public void printArr(int arr[]){

        int n = arr.length;
        for (int i=0; i<n; ++i){
            System.out.print(arr[i] + " ");
            System.out.println();
        }
    }

}
