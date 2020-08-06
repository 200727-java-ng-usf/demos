package com.revature.strings;
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

        String s6 = "hello";
        s6.concat(",world!");
        System.out.println(s6);

        s6 = s6.concat(", world!");
        System.out.println(s6);

        String s7 = "hello, world!";
        System.out.println(s6 == s7);

        String s8 = "hello" + ", world!";// C++ has operator overloading, + it is one, it
        //concatenate, "hello" + ", world!" stills returns a new string that is outside
        // the string Pool
        System.out.println(s6 == s8);
        // only literals are in the pool

        //------------------------------------------------------

        /* String builder
            - it does not extend the String class, since String class is final
            - mutable
            - cannot use double quotes: cannot be instantiated using
                String literals
            - not thread-safe

            Sttring Buffer
             - it does not extend the String class, since String class is final
            - mutable
            - cannot use double quotes: cannot be instantiated using
                String literals
             -are thread-safe (slower than StringBuilder as a result
         Why no use only this? has more overhead to make it thread safe, so is slightly
         slower which is something to consider

         */

    //    StringBuilder b1 = "Does not work";
        StringBuilder sb2 = new StringBuilder("Hello");
        StringBuilder sb3 = new StringBuilder("Does not work");

      // On the sunject of memory pools... lets talk about Integers (the wrapper class for ints)

      Integer i1 = new Integer(127);
      Integer i2 = new Integer(127);
      System.out.println(i1 = i2); // explicit use of new makes this separate objects

        Integer i3 = 125;
        Integer i4 = 125;
        System.out.println(i3 == i4); // true

        StringBuilder str = new StringBuilder("abc");
        str.reverse();
        System.out.println(str);

    }



}