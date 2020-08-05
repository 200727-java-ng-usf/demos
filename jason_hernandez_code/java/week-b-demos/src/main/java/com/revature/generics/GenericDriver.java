package com.revature.generics;

import java.util.ArrayList;

public class GenericDriver {
    public static void main(String[] args) {
        ArrayList myList = new ArrayList();
        myList.add("string");
        myList.add(new Integer(4));

        String myString = (String) myList.get(0);
        // String maybeString = (String) myList.get(1); throws exception

        ArrayList<String> betterList = new ArrayList<>();
        betterList.add("string2");
        // betterList.add(new Integer(6)); -- does not work, because it only takes strings
        String definitelyString = betterList.get(0);

        System.out.println(myString);
        System.out.println(definitelyString);
    }
}
