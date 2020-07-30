package com.revature.string;

/* Topic
    -Memory management of Strings
    -String API (the public behaviors exposed be the String class)
    -StringBuild
    -StringBuffer
 */

public class StringDriver {

    public static void main(String[] args){
        String s1= "North";
        String s2= "North";
        String s3 = new String("North");
        String s4 = null;

        /*
                String pool
                -A special area inside of Heap memory that Java leverages to store String objects
                with unique values (no duplicates!)
                -Not all Strings are stored in the pool.
                    + if you explicitly use "new"
                    + Strings returned from any String
         */

        System.out.println(s1==s2); //true; since creating two Strings with same
                                    // literal value, these references point
                                    //to the same object
        System.out.println(s2==s3);//false;

        /*
                The Immutability of Strings

                -Strings are immutable (their value cannot be changed once instantiated)
                    +implicitly thread safe
                    * btw
                    -initialization =  the creation of a reference (variable) that may or may not have a value
                    -instantiation = the creation of an object in memory
         */

        String s6 = "Hello";
        s6.concat(" , world!"); // all string API methods
        System.out.println(s6);

        s6 = s6.concat(", world!");
        System.out.println(s6);

        //--------------------------------------------------------------

        /*
                StringBuilder
                -it does NOT extend the String class4
                -mutable
                -cannot be instantiated used String literals
                -not thread safe

                StringBuffer
                 -it does NOT extend the String class4
                -mutable
                -cannot be instantiated used String literals
                -is thread safe (slower that StringBuilder as a result)
         */

//        StringBuilder sb1 = "Does not work";
        StringBuilder sb2 = new StringBuilder("yo ");
        StringBuilder sb3 = new StringBuilder("yo ");

        System.out.println(sb2==sb3); // false
        System.out.println(sb2.equals(sb3));//false ; bc StringBuilder/BUffer does not override .equals

        sb2.append("What it do ");
        System.out.println(sb2);

        //_____________________________________________________________________

        // Integer(Wrapper class for int)

        Integer i1 = new Integer(127);
        Integer i2 = new Integer(127);
        System.out.println( i1 == i2); // false; explicit use of new makes them separate objects

        Integer i3 = 125;
        Integer i4 = 125;
        System.out.println(i3 == i4);



    }

}
