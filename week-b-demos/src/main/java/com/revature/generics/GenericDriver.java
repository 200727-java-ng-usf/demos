package com.revature.generics;

import java.util.ArrayList;

public class GenericDriver {
    public static void main(String[] args) {
        ArrayList myList = new ArrayList();
        myList.add("string");
        myList.add(new Integer(4));

        String myString = (String) myList.get(0);
        System.out.println(myString);

        ArrayList<String> betterList = new ArrayList<String>();
        // type safety! only string can be added.
        betterList.add(" only string");
        String betterString = betterList.get(0);  // no casting
        betterList.add("another string");



    }
}
