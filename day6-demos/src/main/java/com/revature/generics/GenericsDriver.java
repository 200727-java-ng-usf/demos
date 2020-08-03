package com.revature.generics;


import com.revature.generics.Gen1;

public class GenericsDriver {
    public static void main(String[] args) {

    Gen1<Integer> i;

    i = new Gen1<Integer>(88);

    i.showType();

    int v = i.getOb();
        System.out.println("value: " + v);

        Gen1<String> s = new Gen1<String>("Roll Tide");
        s.showType();
        String str = s.getOb();
        System.out.println("value: " + str);

    }




}
