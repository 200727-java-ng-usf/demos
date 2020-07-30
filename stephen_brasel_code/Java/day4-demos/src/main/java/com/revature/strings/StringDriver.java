package com.revature.strings;

/*
    Topic:
        - Memory management of Strings
        - String API (the public behaviors exposed by the String class)
        - StringBuilder class
        - StringBuffer class
 */
/*
    intern
    public String intern()
    Returns a canonical representation for the string object.
    A pool of strings, initially empty, is maintained privately by the class String.
    When the intern method is invoked, if the pool already contains a string equal to this String object as determined by the equals(Object) method, then the string from the pool is returned. Otherwise, this String object is added to the pool and a reference to this String object is returned.
    It follows that for any two strings s and t, s.intern() == t.intern() is true if and only if s.equals(t) is true.
    All literal strings and string-valued constant expressions are interned. String literals are defined in section 3.10.5 of the The Java™ Language Specification.
    Returns:
    a string that has the same contents as this string, but is guaranteed to be from a pool of unique strings.
 */
public class StringDriver {

    public static void main(String[] args) {
        String s1 = "North";
        String s2 = "North";
        String s3 = new String("North");
        String s4 = null;

        /*
            String pool

                - A special area inside of Heap memory that Java leverages to store String objects
                    with unique values (no duplicates!)

                - Not all Strings are stores in the Pool
                    + if you explicitly use "new"
                    + Strings returned from any String method are not in the Pool

                - If you use literal notation "" , String objects with the same value, a single String Object
                    will be stored in the Pool.
         */
        System.out.println(s1 == s2);   // true; since we created two string using
                                        // literal notation with the same value,
                                        // these references point to the same object.
        System.out.println(s1 == s3);   // false; since we explicitly used the "new" keyword
                                        // a new String object was created

        System.out.println(s1.equals(s3));  //true; because .equals (in this case) is checking for value equivalence

        /*
            String interning is the act of moving a String object - which exists
            outside of hte String pool - and "interning" or moving it into the String Pool

            If a String object in the pool already exists with the same value, the
            referncer simply poiunts to that existing object. The former object is
            remove3d by the garbage collector. If no object exists, then a new object
            is created in the Pool, and the former object os kept. If no references
            point to the former String object it will be garbage collected, if references
            do point to it, then it will not be garbage collected.
         */
        String s5 = s3.intern();
//        s3 = s3.intern();
        System.out.println(s1 == s3);
        System.out.println(s2 == s3);
        System.out.println(s1 == s5);

        String s6 = "hello";
        s6.concat(", world!");
        System.out.println(s6);

        s6 = s6.concat(", world!");         //
        System.out.println(s6);

        String s7 = "hello, world!";
        System.out.println(s6 == s7);
//        s6 = s6.intern();
//        System.out.println(s6 == s7);

        String s8 = "hello" + ", world"; // still returns a new String that is outside of the String pool;
        System.out.println(s6 == s8);

        // ---------------------------------------------------------------
        System.out.println("+------------------------------------------+");
        /*
            StringBuilder
                - it does NOT extend the String class!
                - mutable
                - cannot ve instantiated using String literals
                * NOT thread-safe

            StringBuffer
                - it does not extend the String class!
                - mutable
                - cannot ve instantiated using String literals
                * ARE thread-safe (slower than StringBuilder as a result)

         */
//        StringBuilder sb1 = "Does ot work";
        StringBuilder sb2 = new StringBuilder("Hello!");
        StringBuilder sb3 = new StringBuilder("Hello!");
        System.out.println(sb2 == sb3);
        System.out.println(sb2.equals(sb3));    // false; because, for some reason,
                                                // StringBuildeer/Buffer does not override .equals()
        System.out.println(sb2.toString().equals(sb3.toString()));
        sb2.append(" How's it going?");
        System.out.println(sb2);

        String s9 = sb2.toString();
        System.out.println(s9);
        // ---------------------------------------------------------------

        /*
            On the subject of memory pools, let's talk about Integers (the wrapper class for ints)
            The Integer pool.
         */
        System.out.println("+------------------------------------------+");

        Integer i1 = new Integer(127);
        Integer i2 = new Integer(127);
        System.out.println(i1 == i2); //explicit use of new makes these separate objects
        System.out.println(i1.equals(i2));

        Integer i3 = 127;
        Integer i4 = 127;
        System.out.println(i3 == i4);   //true!
        System.out.println(i3.equals(i4));

        Integer i5 = 128;
        Integer i6 = 128;
        System.out.println(i5 == i6);
        System.out.println(i5.equals(i6));

        Integer i7 = -128;
        Integer i8 = -128;
        System.out.println(i7 == i8);
        System.out.println(i7.equals(i8));

        Integer i9 = -129;
        Integer i10 = -129;
        System.out.println(i9 == i10);
        System.out.println(i9.equals(i10));

//        i7 += 1;
        Integer i11 = i7 +1;
        System.out.println(i7);

        i7 = i7 + 1;
        System.out.println(i7);
        System.out.println(i8);


    }

}
