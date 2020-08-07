package com.revature.testing;

import java.util.Arrays;

public class Sorting {

    public int[] sort(int[] arr) {
        // Check for edge cases
        if (arr == null || arr.length == 0) {
            return new int[0];
        }
        // Copy original array
        int[] copy = Arrays.copyOf(arr, arr.length);

        // Sort array
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (copy[j] > copy[j + 1]) {
                    int temp = copy[j];
                    copy[j] = copy[j + 1];
                    copy[j + 1] = temp;
                }
            }
        }
        return copy;
    }
}
