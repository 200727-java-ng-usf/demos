package com.revature.strings;

import java.util.Scanner;

/*
    Topics:
        - Memory management of Strings
        - String API (the public behaviors exposed by the String class)
        - StringBuilder class
        - StringBuffer class
 */
public class StringDriver {
    public static void main(String[] args) {
        String s1 = "North";
        String s2 = "North";
        String s3 = new String("North");
        String s4 = null;
        /*
            String Pool
                - A special area inside of Heap memory that Java leverages to store String objects
                  with unique values (no duplicates!)
                - Not all Strings are stored in the Pool
                   + if you explicitly use "new"
                   + Strings returned from any String method are not in the Pool
                - If you use literal notation with the same value, a single String object
                  will be stored in the Pool
         */
        System.out.println(s1 == s2); // true; since we created two Strings using
        // literal notation with the same value, these
        // references point to the same object
        System.out.println(s1 == s3); // false; since we explicitly used the "new" keyword
        // a new String object was created
        System.out.println(s1.equals(s3)); // true; because .equals (in this case) is checking for value equivalence
        /*
            String interning is the act of moving a String object - which exists
            outside of the String pool - and "interning" or moving it into the
            String Pool.
            If a String object in the pool already exists with the same value, the
            reference simply points to that existing object. The former object is
            removed by the garbage collector. If no object exists, the a new object
            is created in the Pool, and the former object is kept. If no references
            point to the former String object it will be garbage collected, if references
            do point to it, then it will not be garbage.
         */
        String s5 = s3.intern();
        System.out.println(s1 == s3);
        System.out.println(s2 == s3);
        System.out.println(s1 == s5);

        /*
            The immutibility of strings
                -implicitly threadsafe a s a result of immutability
                - Strings are immutable (their value cannot be changed once instantiated)
                    - initialization - creation of a ref. variable that may or may not have a value
                    - instantiation - the creation of an objerct in memory
                -
         */
        String s6 = "hello";
        s6.concat(", world");
        System.out.println(s6);

        s6 = s6.concat(", world!"); //all string API METHODS return a NEW string
        System.out.println(s6);
        String s7 = "hello world!";

        System.out.println(s6 == s7);

        String s8 = "hello" + ", world";//still returns a new string from concat
        System.out.println(s6 == s8);

        //-----------------------------------------------------------------------
        System.out.println("++-----------------------------++");
        /*
            StringBuilder
                - does not extend the string class!
                - mutable
                -cannot be instantiated using String literals
                -not thread-safe - not safe for multithreading

            StringBuffer
                -does NOT extend the String Class
                -mutable
                -cannot be instantiated using String literals
                -thread-safe (slower than StringBuilder as a result)

         */
        //StringBuilder SB1 = "Des not work";
        StringBuilder sb2 = new StringBuilder("Hello");
        StringBuilder sb3 = new StringBuilder("Hello");

        System.out.println(sb2 == sb3);
        System.out.println(sb2.equals(sb3)); //false becasue String Builder does not override it
        sb2.append("Whats good");
        System.out.println(sb2);// StringBuilder/Buffer objects are mutable

        String s9 = sb2.toString();
        System.out.println(s9);
        //---------------------------------------------

        // on the subject of memory pools, lets talk about int
        System.out.println("++-------------------------++");
        Integer i1 = new Integer(127);
        Integer i2 = new Integer(127);
        System.out.println(i1 == i2); //explicit use of new makes these seperate objects

        Integer i3 = new Integer(125);
        Integer i4 = new Integer(125);
        System.out.println(i3 == i4);

        Integer i5 = new Integer(128);
        Integer i6 = new Integer(128);
        System.out.println(i5 == i6);

        Integer i7 = new Integer(-127);
        Integer i8 = new Integer(-127);
        System.out.println(i7 == i8);
        //primitives stores in the stack
        //objects are stored in the heap

        StringBuilder str = new StringBuilder("argument");
        str.reverse();
        System.out.println(str);

    }
}