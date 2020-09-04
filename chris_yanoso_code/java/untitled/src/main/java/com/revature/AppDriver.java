package com.revature;

public class AppDriver {

    public static void main(String[] args) {
        String a = "hello";
        String b = new String("hello");
        compareStrings compareStrings = new compareStrings();
        System.out.println(compareStrings.compareStrings(a, b));
        ArraySum arraySum = new ArraySum();
        System.out.println(arraySum.IterateAndSum(null));
    }
}
