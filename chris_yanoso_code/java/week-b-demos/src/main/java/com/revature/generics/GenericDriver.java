package com.revature.generics;

import java.util.ArrayList;

public class GenericDriver {

    public static void main(String[] args) {
        ArrayList myList = new ArrayList();
        myList.add("string");
        myList.add(new Integer(4));
        myList.add(new AppUser());

        //works but could be better, have to cast to string
        String myString = (String) myList.get(0);
        System.out.println(myString);
        //String maybeString = (String) myList.get(1); - class cast exception

        ArrayList<String> betterList = new ArrayList<>();
        //type Safety! only strings can be added to betterList
        betterList.add("another string"); // only allows strings as input
        // does not need to be casted
        String definitelyString = betterList.get(0);
        System.out.println(definitelyString);

    }
}
