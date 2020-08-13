package com.revature.test;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        int firstDiagonal = 0;
        int secondDiagonal = 0;
        int counter = 0;
        int negativeCounter = 0;

        for (int i = 0; i < arr.size(); i++ ) {
            counter = i;
            for(int j = 0; j < arr.size(); j++) {
                firstDiagonal += arr.get(counter).get(counter);
            }
        }

        for (int i = arr.size(); i > arr.size(); i-- ) {
            negativeCounter = i;
            for(int j = arr.size(); j > arr.size(); j--) {
                secondDiagonal += arr.get(negativeCounter).get(negativeCounter);
            }
        }

        if (firstDiagonal > secondDiagonal) {
            return firstDiagonal - secondDiagonal;
        } else {
            return secondDiagonal - firstDiagonal;
        }
    }

}

//public class Solution {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int n = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<List<Integer>> arr = new ArrayList<>();
//
//        for (int i = 0; i < n; i++) {
//            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//            List<Integer> arrRowItems = new ArrayList<>();
//
//            for (int j = 0; j < n; j++) {
//                int arrItem = Integer.parseInt(arrRowTempItems[j]);
//                arrRowItems.add(arrItem);
//            }
//
//            arr.add(arrRowItems);
//        }
//
//        int result = Result.diagonalDifference(arr);
//
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
//    }
//}
//
