package com.revature.generics;

import java.util.ArrayList;

public class GenericDriver {

    public static void main(String[] args) {

        ArrayList myList = new ArrayList();
        myList.add("String");
        myList.add(new Integer(4));
        myList.add(new AddUser());

        String myString = (String)myList.get(0);
        System.out.println();

//        ArrayList<String> betterList = new ArrayList<String>();
        ArrayList<String> betterList = new ArrayList();

//        type safety! -
//        betterList.add(new AddUser());

        betterList.add("another string");
        String definitelyString = betterList.get(0);




    }
}
