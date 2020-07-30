package com.revature.strings;

/*
    Topic:
        - Memory management of Strings
        - String API
        - StringBuilder class
        - StringBudder class
*/

public class StringDriver {
    
    public static void main(String[] args) {
        /*
            Note: String class is final!
        */

        String s1 = "North"; 
        String s2 = "North"; // doesn't create new object since string literal is already in heap
        String s3 = new String("North"); // explicitly creates new String object in heap
        String s4 = null;

        /*
            String Pool
                - A special area inside of heap memory that Java leverages to store String objects with unique values (no duplicates!)
                - Not all Strings are stored in the Pool
                    + if you explicitly use "new"
                    + Strings returned from any String method are not in the Pool
                - If you use literal notation with the same value, a single String object will be stored in the pool
        */

        System.out.println(s1 == s2);   // true; points to same object in heap
                                        // literal notation wiht the same value, 
                                        // these strings point to the same object

        System.out.println(s1 == s3);   // false; explicitly used 'new' keyword
                                        // a new String object was created

        System.out.println(s1.equals(s3));  //true; '.equals' method is checking for value equivalence

        /*
            String interning is the act of moving a String object - which exists
            outside of the String Pool - and "interning" or moving it into the 
            String Pool.

            If a String object in the pool already exists with the same value, the
            reference simply points to the existing object. The former object is
            removed by the garbage collector. If no object exists, the a new object
            is created in the Pool, and the former object is kept. If no references 
            point to the former String object it will be garbage collected, if references
            do point to it, then it will not be garbage collected.
        */

        s3 = s3.intern();
        System.out.println(s1 = s3);    //true

        /*
            The Immutability of Strings
                - Strings are immutable (their value cannot be changed once instantiated)
                    + initialization = the creation of a reference (variable) that may or may not have a value
                    + instantiation = the creation of an object in memory
        */

        String s5 = "hello";
        s5.concat(", world");    // doesn't change s6; returns a new String
        System.out.println(s5);

        s5 = s5.concat(", world");   // returns a new String and assigns it to s5
        System.out.println(s5);

        String s6 = "hello, world";
        System.out.println(s5 == s6);   // false; '.concat' method returns a new String object

        String s7 = "hello" + ", world";    // still returns a new String that is outside of the String pool
        System.out.println(s5 == s7);

        //-------------------------------------------------------------------------------------

        System.out.println("+-----------------------------------------------------+");
        /*
            StringBuilder
                - it does NOT extend the String class!
                - mutable
                - cannot be instantiated using String literals
                - not thread-safe

            StringBuffer
                - it does NOT extend the String class!
                - mutable
                - cannot be instantiated using String literals
                - are thread-safe (slower than StringBuilder as a result)
        */

        // StringBuilder sb1 = "Does not work";
        StringBuilder sb2 = new StringBuilder("Hello!");
        StringBuilder sb3 = new StringBuilder("Hello!");
        System.out.println(sb2 == sb3); // false
        System.out.println(sb2.equals(sb3));    //false; does not override '.equals' method from parent Object class

        sb2.append(" How's it going?");
        System.out.println(sb2);    // StringBuilder/Buffer objects are mutable!

        String s8 = sb2.toString();
        System.out.println(s8);

        //---------------------------------------------------------------------------------------

        System.out.println("+-----------------------------------------------------+");

        // On the subject of memory pools... let's talk about Integers (the wrapper class for ints)

        Integer i1 = new Integer(127);
        Integer i2 = new Integer(127);
        System.out.println(i1 == i2);   // explicit use of new makes these separate objects;

        Integer i3 = 125;
        Integer i4 = 125;
        System.out.println(i3 == i4);   // true

        Integer i5 = 128;
        Integer i6 = 128;
        System.out.println(i5 == i6);   // false

        Integer i7 = -129;
        Integer i8 = -129;
        System.out.println(i7 == i8);   // false

        Integer i9 = i7 + 1;
        System.out.println(i7); // Integer objects are immutable, no methods exist to mutate them

        i7 = i7 + 1;    // You can still reassign the reference though
        System.out.println(i7);
        System.out.println(i8);

        /*
            Integer Pool only contains numbers within the byte range (-128 to 127)
        */
    }
}