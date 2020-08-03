package com.revature;

import com.revature.generics.Gen1;

public class AppDriver {
    public static void main(String[] args) {

        //Create an Gen1 Reference for Integers
        Gen1<Integer> i;
        i = new Gen1<Integer>(88);

        i.showType();

        //get the value of i
        int v = i.getOb();
        System.out.println("value: " + v);

        Gen1<String> s = new Gen1<String>("Role Tide");
        s.showType();
        String str = s.getOb();
        System.out.println("value: " + str);
    }
}
