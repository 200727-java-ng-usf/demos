package com.revature.strings;

public class StringDriver {
    public static void main(String[] args) {
        String s1 = "North";
        String s2 = "North";
        String s3 = new String("North");
        String s4 = null;

        System.out.println(s1 == s2); // Prints True
        System.out.println(s1 == s3); // Prints False
        System.out.println(s1.equals(s3)); // Prints True

        s3 = s3.intern();
        System.out.println(s1 == s3); // Now prints True

        String s6 = "Hello";
        s6.concat(", world!");
        System.out.println(s6); // Prints "Hello"

        s6 = s6.concat(", world!");
        System.out.println(s6); // Now prints "Hello, world!"

        String s7 = "Hello, world!";
        System.out.println(s6 == s7); // Returns False

        String s8 = "Hello" + ", world!";
        System.out.println(s6 == s8); // Returns False

        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("Hello");
        System.out.println(sb1 == sb2); // Prints False
        System.out.println(sb1.equals(sb2)); // Also False: these do not override .equals

        sb2.append(" How's it going?");
        System.out.println(sb2); // Prints "Hello How's it going?"
    }

}
