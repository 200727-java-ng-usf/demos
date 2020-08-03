package com.revature.string;

public class StringDriver {
    public static void main(String[] args) {
        String s1 = "North";
        String s2 = "North";
        String s3 = new String("North");
        String s4 = null;

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);

        System.out.println(s1.equals(s3));

        s3 = s3.intern();
        System.out.println(s1 == s3);

        System.out.println("---------------------");

        String s6 = "hello";
        s6.concat(", world!");
        System.out.println(s6);
        s6 = s6.concat(", world!");
        System.out.println(s6);

        String s7 = "hello, world!";
        System.out.println(s6 == s7);

        String s8 = "hello" + "world";
        System.out.println(s7 == s8);

        System.out.println("-------------------------------------");

        // StringBuilder
        StringBuilder sb2 = new StringBuilder("Hello!");
        StringBuilder sb3 = new StringBuilder("Hello!");

        System.out.println(sb2 == sb3); //false
        System.out.println(sb2.equals(sb3)); //false!

        sb2.append(" world!!");
        System.out.println(sb2);

        String s9 = sb2.toString();
        System.out.println(s9);

        System.out.println("-------------------------------------");

        Integer i1 = new Integer(127);
        Integer i2 = new Integer(127);

        //Integer pool is -128 ~ 127

        Integer i3 =10;
        Integer i4 =10;  // i3 and i4 are in the same pool but when the number greater than 127 System when new a object.

        System.out.println();


    }
}
