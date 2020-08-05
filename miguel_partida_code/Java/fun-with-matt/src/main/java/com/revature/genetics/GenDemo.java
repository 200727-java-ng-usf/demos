package com.revature.genetics;

import scopes.Human;

import java.util.ArrayList;

public class GenDemo {

    public static void main(String[] args) {
        //Create a Gen1 Reference for Integers
//        Gen1<Integer> i;
//        i = new Gen1<Integer>(88);
//
//        //show the type of i
//        i.showType();
//
//        //get the value of i
//        int v = i.getOb();
//
//        System.out.println("Value: " + v );
//        //Fully qualified class name i.e: java.lang.Integer
//
//        Gen1<String > s = new Gen1<String>("Roll Tide");
//        s.showType();
//        String str = s.ob;
//        System.out.println("Value: " + str);
//
//
//     }
//     //void doStuff(T object1 T object2)
//    //object1 + object2;

        ArrayList myList = new ArrayList();
        myList.add("string");
        myList.add(new Integer(4));
        myList.add(new Human());

        String myString = (String) myList.get(0);
        System.out.println(myString);

        //        ArrayList<String> betterList = new ArrayList<>(); thiws is fine as well
        ArrayList<String> betterList = new ArrayList<String>();

        //type saftey
     //   betterList.add(new Human());

        betterList.add("New String");//only allows strings as input
        String otherString  = betterList.get(0);

    }
}
