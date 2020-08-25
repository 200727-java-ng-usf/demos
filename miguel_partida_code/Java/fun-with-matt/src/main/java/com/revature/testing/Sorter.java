package com.revature.testing;

import java.util.Arrays;

public class Sorter {

    public int[] sort(int[] arr) {

        // check for the edge cases
        if (arr == null || arr.length == 0) {
            return new int[0];
        }

        // make a copy of the original array, this copy will be sorted instead of the original
        int[] copy = Arrays.copyOf(arr, arr.length);

        // sort the array
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - 1; j++) {

                // determine if the current value is > the next value
                if (copy[j] > copy[j + 1]) {
                    // swap the values
                    int temp = copy[j];
                    copy[j] = copy[j + 1];
                    copy[j + 1] = temp;
                }

            }

        }

        return copy;

    }

}