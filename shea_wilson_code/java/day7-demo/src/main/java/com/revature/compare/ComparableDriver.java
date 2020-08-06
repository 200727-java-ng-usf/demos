package com.revature.compare;

import com.revature.compare.models.Box;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/*
    Comparable
    - functional interface (one abstract method); can be used with lambdas
    - utility classes such as Arrays and collections have sorting methods that take in comparable types
    - one method: int compareTo(T obj)
    - uses a parameterized type (generics)
    - returns an int vvalue which is eithr negative, zero, or positive (less than, equal to, or greater than)
 */

public class ComparableDriver {

    public static void main(String[] args) {

        Box myBox = new Box(50.0, "brown");
        Box yourBox = new Box(45.5, "white");

        Box[] ourBoxes = {myBox, new Box(3.5,"red"),yourBox};

        for (Box box : ourBoxes){
            System.out.println(box);
        }

        System.out.println("________________________________");

        Arrays.sort(ourBoxes);

        for (Box box : ourBoxes){
            System.out.println(box);
        }
    }
}
