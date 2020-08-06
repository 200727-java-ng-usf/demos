package com.revature.compare;

/*
    Comparable
        - functional interface (one abstract method); can be used with lambda expressions
        - utility classes as Arrays, and Collections have methods that take in comparable types
        - one method compareTo(T obj)
        - uses a parameterized type (generics)
        - returns an int value wich is either negative, 0, or positive(less than, equal to, greater than)
 */

import com.revature.compare.models.Box;

import java.util.Arrays;

public class ComparableDrive {
    public static void main(String[] args) {

    Box myBox = new Box(50,"brown");
    Box yourBox = new Box(45.5, "white");

    Box[] ourBoxes = {myBox, new Box(3.5, "red"), yourBox};

    for(Box box: ourBoxes){
        System.out.println(box);
    }


    System.out.println("++------------------++");

    Arrays.sort(ourBoxes);
    for(Box box: ourBoxes){
        System.out.println(box);
    }





    }
}
