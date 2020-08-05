package com.revature.generics;

import java.util.ArrayList;

public class GenericDriver {
    public static void main(String[] args) {
        ArrayList myList = new ArrayList();
        myList.add("string");
        myList.add(new Integer(4));
        myList.add(new AppUser());


        //works but could be better
        String myString = (String) myList.get(0);
        System.out.println(myString);

        //throws class cast exception
        String maybeString = (String) myList.get(1); //

                                                    //Dont need to put string at the end
        // ArrayList<String> betterList = new ArrayList<String>();
        //same as
        ArrayList<String> betterList = new ArrayList<>();

        //betterList.add(new AppUser()); no-no! betterList can only accept strings
        betterList.add("another String");
        String definitelyString = betterList.get(0);
    }

}
