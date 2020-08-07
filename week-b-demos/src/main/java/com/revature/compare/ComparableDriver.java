package com.revature.compare;

import com.revature.compare.models.Box;

import java.sql.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

public class ComparableDriver {
    public static void main(String[] args) {
        Box myBox = new Box(50,"black");
        Box youBox = new Box(45.5,"white");
        Box[] ourBox = {myBox,new Box(3.5,"red"),youBox};

        for(Box box: ourBox){
            System.out.println(box);
        }

        System.out.println("--------------------------");

        Arrays.sort(ourBox);
        for(Box box: ourBox){
            System.out.println(box);
        }


    }
}
