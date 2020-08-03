package com.revature.generics;

public class GenDemo {
    public static void main(String[] args) {

        System.out.println("Integer Example: " + "\n");
        //CREATE A gEN1 rEF for Integers
        Gen1<Integer> i;
        i = new Gen1<Integer>(88);

        //show the type of i
        i.showType();
        //java.lang.Integer == fully qualified classname

        //get the value of i
        int v= i.getOb();
        System.out.println("value: " + v);

        System.out.println("++---------------------------++");
        System.out.println("\n" + "String Example: " + "\n");

        Gen1<String> s = new Gen1<String>("Roll Tide");
        s.showType();
        String str = s.getOb();
        System.out.println("value: " + str);
    }


//  void doStuff(T object1, T object2){
//      object1 += object2;
//  }

}
