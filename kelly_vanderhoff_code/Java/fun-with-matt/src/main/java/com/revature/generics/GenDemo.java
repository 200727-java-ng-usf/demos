package com.revature.generics;

public class GenDemo {

    public static void main(String[] args) {

        // Create a Gen1 Reference for Integers
        Gen1<Integer> intObj;
        intObj = new Gen1<Integer>(88);

        // show the type of i
        intObj.showType();

        // get value of i
        int v = intObj.getObj();
        System.out.println("Value: " + v);


        // Create a Gen1 Reference for Strings
        Gen1<String> stringObj = new Gen1<String>("Roll Tide");
        stringObj.showType();
        String str = stringObj.getObj();
        System.out.println("Value: " + str);


    }

    // public void doStuff(T object1 T object2) {
    // ...do some stuff with object1 and object2
}
