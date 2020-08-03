package com.revature.generics;

public class GenDemo {
    
    public static void main(String[] args) {
        
        // Create a Gen1 reference for Integers
        Gen1<Integer> i = new Gen1<>(88);

        // show the type of i
        i.showType();

        // get the value of i
        int value = i.getObj();
        System.out.println("Value: " + value);

        Gen1<String> s = new Gen1<>("Roll Tide");
        s.showType();
        String str = s.getObj();
        System.out.println("Value: " + str);
    }
}