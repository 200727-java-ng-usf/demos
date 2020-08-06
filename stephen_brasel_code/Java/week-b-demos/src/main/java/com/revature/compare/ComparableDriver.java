package com.revature.compare;

import com.revature.compare.models.Box;
import sun.reflect.generics.tree.Tree;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

/*
    Comparable

        - one method: compareTo(T object)
        - functional interface (one abstract method); can be used with lambdas
        - utility classes such as Arrays and Collections have sorting methods that take in Comparable types
        - uses a parameterized type (generics)
        - returns an int value which is either negative, zero, or positive (by default: lass than equal to, or greater than)

 */
public class ComparableDriver // implements Comparable<ComparableDriver>
{
    public static void main(String[] args) {
//        Comparator<String> comp;
//        TreeSet<String> someSet = new TreeSet<>();
//        Collections.sort(someSet);
        Box myBox = new Box(50.0, "brown");
        Box yourBox = new Box(45.5, "white");

        Box[] ourBoxes = {myBox, new Box(3.5, "red"), new Box(3.5, "blue"), yourBox};

        for(Box box : ourBoxes){
            System.out.println(box);
        }

        System.out.println("+----------------------------------+");

        Arrays.sort(ourBoxes);

        for(Box box : ourBoxes){
            System.out.println(box);
        }
    }
}
