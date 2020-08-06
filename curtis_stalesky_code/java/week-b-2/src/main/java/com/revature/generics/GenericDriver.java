package com.revature.generics;

import java.util.ArrayList;

public class GenericDriver {

    public static void main(String[] args) {

        ArrayList myList = new ArrayList();
        myList.add("String");
        myList.add(new Integer(4));
        myList.add(new AppUser());

        // Works, but could be better
        String myString = (String) myList.get(0);
        System.out.println(myString);

        // Throws cast class Exception
        //String maybeString = (String) myList.get(1);

        // Both of the below are fine, but the first has more than is necessary
        //ArrayList<String> betterList = new ArrayList<>();
        ArrayList<String> betterList = new ArrayList<String>(); //Set list to accept strings only
        // defined by the String keyword in the <>

        betterList.add("Another String"); // betterList only accepts strings defined by the <> above.
        String definitelyString = betterList.get(0);

        // ArrayList <> badList
    }
}
