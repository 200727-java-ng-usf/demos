package com.revature.strings;

public class StringDriver {

    public static void main(String[] args) {

        String s1 = "North";
        String s2 = "North";
        String s3 = new String("North");
        String s4 = null;

        System.out.println(s1 == s2); //T. String Pool
        System.out.println(s1 == s3); //F
        System.out.println(s1.equals(s3));

        s3 = s3.intern();

        System.out.println(s1 == s3);   //F

    }
}
