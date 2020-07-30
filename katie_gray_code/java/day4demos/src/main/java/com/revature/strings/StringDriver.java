package com.revature.strings;


import java.net.Inet4Address;

/*
    Topic:
        - Memory Management of Strings
        - String API (THe public behaviors exposed by the String class
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
                - a special area inside of Heap memory that Java Leverages to store String Objects
                with unique values (no duplicates!)
                - not all strings are stored in the pool
                    + if you explicitly use "new"
                    + strings returned from any string method are not in the pool
                - if you use literal notation with the same value, a single string object
                will be stored in the pool
         */

        System.out.println(s1 == s2); //true; since we crated two strings using literal
        // notation with the same value, these references point to the same object
        System.out.println(s1 == s3);//false; with the creation with the new string for
        // s3, a new string object was created at a different reference point within the
        // string pool
        System.out.println(s1.equals(s3)); // true; because .equals() is looking at the
        //value equivalence instead of the reference point in the Heap

        /*
            String interning is the act if moving a string object - which
            exists the string pool - and "interning" or moving it into the string pool

            if a string in the pool already exists with the same value, the reference
            simply points to the existing object. the former object is removed by the
            garbage collector. if no object exists , the new object is created in the
            pool and the former object is kept if no references point to the former
            string object it will be garbage collected, if references do point to it,
            then it will not be garbage.
         */
        s3 = s3.intern();
        System.out.println(s1 == s3);//true; intern brings the string into the heap and it now
        //points to the same object as s1 because they are the same when using .equals()

        /*
            the immutability of Strings
                - Strings are immutable (their value cannot be changed once instantiated
                - any thing that is immutable is implicitly thread-safe
                - strings are thread-safe
                    +btw:
                        - initialization = the creation of a reference variable that may or may not have a value
                        - instantiation = the creation of an object in memory
         */

        String s6 = "hello";
        s6.concat(", world!");
        System.out.println(s6);

        s6 = s6.concat(", world");
        System.out.println(s6);

        String s7 = "hello world";
        System.out.println(s7 == s6);

        String s8 = "hello" + "world"; //treating it like a concat, still returns a new string that is still outside the string pool
        System.out.println(s6 == s8);


        //-------------------------------------------------------------


        /*
            StringBuilder:
                - it does NOT extend the String class
                - mutable
                - cannot be instantiated using string literals
                - not thread-safe

            StringBuffer:
                - it does NOT extend the String Class
                - mutable
                - cannot be instantiated using string literals
                - thread safe (slower than StringBuilder as a result)
         */

        System.out.println("+---------------------+");
//        StringBuilder sb1 = "Does not work";
        StringBuilder sb2 = new StringBuilder("Hello!");
        StringBuilder sb3 = new StringBuilder("Hello!");

        System.out.println(sb2 == sb3); // false
        System.out.println(sb2.equals(sb3));//false; do not override the .equals() method in the object class
        //StringBulider/StringBuffer does not override .equals()

        sb2.append(" Hows it going?");
        System.out.println(sb2);

        String s9 = sb2.toString();
        System.out.println(s9);

        //---------------------------------------

        System.out.println("+---------------------+");

        //on the subject of memory pools.... let's talk about Integers (the wrapper class for ints)
        // integer objects are immutable, no methods exist to mutate them

        Integer i1 = new Integer(127);
        Integer i2 = new Integer(127);
        System.out.println(i1 ==i2); // explicit use of new makes these separate objects

        Integer i3 = 125;
        Integer i4 = 125;
        System.out.println(i3 == i4); //true

        Integer i5 = 128;
        Integer i6 = 128;
        System.out.println(i5 == i6);

        int x  = 128;
        int y = 128;
        System.out.println(x ==y);

    }
}
