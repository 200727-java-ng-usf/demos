package com.revature.strings;
/*
Topic:
    - Memory management of Strings
    - String API (the public behaviors exposed by the String class)
    - StringBuild class
    - StringBuffer class
 */
public class driver {
    public static void main (String[] args){
        String s1 = "North";
        String s2 = "North";
        String s3 = new String("North");
        String s4 = null;

        /*
        String Pool :  a special are inside o fHeap memory that Java leverages to store String objects with unique values(no duplicates!)

        ---NOT ALL STRINGS ARE STORED IN THE POOL
        ------if you explicitly use "new /  Strings returned from String method are not in the Pool
        --If you use literal notation with the same value, a single String object will be stored in the Pool

         */

        System.out.println(s1==s2);//true; since we created 2 strings using literal notation with the same value, these references point to the same object
        System.out.println(s1==s3);//false; since we explicitly used the "new" keyword a new String object was created
        System.out.println(s1.equals(s3));//true, because .equals (in this case) is checking for value equivalence

        s3= s3.intern();// act of moving a string object which exists outside of the String Pool and "interning or moving it into the String Pool. If a String object in the pool already exists with the same value, the reference simply points to that existing object. the former object is removed by the garbage collector. If no object exists, the new object is created in the Pool and the former object is kept. If no references point to the former String it will be garbage collected, if references do point to it, then it will not be garbage.
        System.out.println(s1==s3);


        /*
        IMMUTABILILITY OF STRINGS
            -Strings are immutable (their value cannot be changed once instantiated)
                *btw: initialization is the creation of a reference variable that may or may not have a value
                     instantiation is the creation of an object in memory

         */

        String s6 = "hello";
        s6.concat(", world"); // all String API methods return a New String outside of the Pool
        System.out.println(s6);
        s6= s6.concat(", world");
        System.out.println(s6);

        String s7 = "hello, world";
        System.out.println(s6==s7);

        String s8= "hello"+ ", world";//still returns a new string that is outside of the String Pool
        System.out.println(s6 == s8);


        /*
        StringBuilder
        -does not extend String class
        -mutable
        -cannot be instantiated using String literals
        - not thread-safe

        StringBuffer
           -does not extend string Class
           -mutable
        -cannot be instantiated using String literals
        - are thread-safe (slower than StringBuilder as a result)

        **ANYTHING THAT IS IMMUTABLE IS IMPLICITLY THREAD-SAFE**

         */
        System.out.println("+--------------------------+");


       // StringBuilder sb1 = "Does not work";
        StringBuilder sb2 = new StringBuilder("Hello!");
        StringBuilder sb3 = new StringBuilder("Hello!");

        System.out.println(sb2==sb3);//false
        System.out.println(sb2.equals(sb3));//false; because for some reason StringBuilder/Buffer does not override .equals

        sb2.append("How's it going");
        System.out.println(sb2); //SB objects are mutable

        String s9 = sb2.toString();
        System.out.println(s9);


        System.out.println("+---------------------------------------+");


        // Integers in memory (the wrapper class for ints

        Integer i1= new Integer(127);
        Integer i2 = new Integer( 127);
        System.out.println(i1 == i2);// explicit use of the new makes these separate objects

        Integer i3 = 127;
        Integer i4 =127;
        System.out.println(i3 ==i4);//true

        Integer i5 =128;
        Integer i6 = 128;
        System.out.println(i5==i6);

        Integer i7 = 127;
        Integer i8 = 127;
        System.out.println(i7==i8);

    }

}
