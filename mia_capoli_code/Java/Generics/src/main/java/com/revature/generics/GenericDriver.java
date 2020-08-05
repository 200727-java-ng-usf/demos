package com.revature.generics;

import java.util.ArrayList;

public class GenericDriver {

    public static void main(String[] args) {

        ArrayList myList = new ArrayList();
        myList.add("string");
        myList.add(new Integer(4));
        myList.add(new AppUser());

        String myString = (String) myList.get(0);
        System.out.println(myString);
        //
        // String maybeString = (String) myList.get(1)
    }
}
