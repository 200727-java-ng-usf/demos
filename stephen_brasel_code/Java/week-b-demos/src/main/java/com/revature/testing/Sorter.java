package com.revature.testing;

import java.util.Arrays;

public class Sorter {

	public int[] sort(int[] arr){
		//check foir edge cases
		if(arr == null || arr.length == 0) return new int[]{};
		//make a copy of the original array, this copy will be sorted instead of the original
		int[] copy = Arrays.copyOf(arr, arr.length);
		boolean sorted;
		int i = 0, temp = 0, n = copy.length;
		do {
			sorted = true;
			for (i = 0; i < n - 1; i++) {
				if (copy[i] > copy[i + 1]) {
					//swap
					temp = copy[i];
					copy[i] = copy[i + 1];
					copy[i + 1] = temp;
					//set check
					sorted = false;
				}
			}
		} while (!sorted);
		return copy;
	}
}
