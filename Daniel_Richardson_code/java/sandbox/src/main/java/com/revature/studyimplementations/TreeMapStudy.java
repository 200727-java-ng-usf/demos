package com.revature.studyimplementations;

import sun.reflect.generics.tree.Tree;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapStudy {

    //tree map default sorts numerically or alphabetically

    public TreeMap treeMapCreate() {

        //generics: integer and Skittle object (K, V)
        TreeMap<Integer, Skittle> map = new TreeMap<>();
        int limit = 20;
        for (Integer i = 0; i < limit; i++) {
            //using i as key, using same i as printed number
            map.put(i, new Skittle(true, i));
        }
        System.out.println("TreeMap generated");
        return map;
    }

}
