package com.revature.compare;

import com.revature.compare.models.Box;

import java.util.Arrays;

public class ComparableDriver {

    /*
    Comparing this instance

    comparator is

    Comparable
    -functional Interface(one abstract method); lambda can be used
    -utility classes such as Arrays and Collections have method that take in Comparable types
    -CompareTo<t> object method
    - uses a parameterized type (generics)
    - returns an int value which is either negative, zero, or positive(<,>,=)

     */

    public static void main(String[] args) {

        Box mybox = new Box(50.0,"cyan");
        Box yourBox = new Box(45.5,"magenta");

        Box[] outBoxes = {mybox, new Box(3.5,"seaFoam"),yourBox};

        for(Box box: outBoxes){
            System.out.println(box);
        }
        System.out.println("+---------------------+");

        Arrays.sort(outBoxes);

        for(Box box: outBoxes){
            System.out.println(box);
        }




    }

}
