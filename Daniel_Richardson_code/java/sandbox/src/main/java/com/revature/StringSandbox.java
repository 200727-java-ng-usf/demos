package com.revature;

public class StringSandbox {
    String s1 = "North";
    String s2 = "North"; //points to same object(String) location
    String s3 = new String("North"); //force making a new string
    String s4 = "Hello";
    String s5 = null;

    public StringSandbox() {

        //== checks to see if address is the same
        System.out.println(this.s1 == this.s2); //address the same, both point to same string object in heap (T)
        System.out.println(this.s1 == this.s3); //address not the same (F)
        System.out.println(this.s1.equals(this.s3)); //equals() checks end value, not address (T)
        s3 = s3.intern(); //forces it into string pool
        System.out.println(s1 == s3); //since its in string pool, now they're both the same
        s5 = s4.concat(", world!"); //will put new string in heap (NOT string jail)
        System.out.println(s5);
        System.out.println("---------------");
        /*------
        String Builder, String Buffer
            -not extending string class
            -mutable
            -can't be instantiated using string literals (" ")
            -builder is thread-safe
            -buffer is NOT thread-safe
        ------*/
        StringBuilder sb2 = new StringBuilder("Hello!");
        StringBuilder sb3 = new StringBuilder("Hello!");

        System.out.println(sb2==sb3);
        System.out.println(sb2.equals(sb3));
        String s9 = sb2.toString();
        System.out.println("---------------");
        ////////
        StringBuilder revo = new StringBuilder("Forwards");
        System.out.println(revo);
        revo.reverse();
        System.out.println(revo);

    }
}
