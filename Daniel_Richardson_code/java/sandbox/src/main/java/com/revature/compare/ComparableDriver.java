package com.revature.compare;


import com.revature.compare.models.Box;

import java.util.Arrays;

//
//functional interface, single abstract method
//can be used with lamdas
//utility classes such as Arrays and collections have sorting methods for comparable types
//compareTo; one method
//uses paramterized type(generics)
//returns int value which is either negative, zero, or positive,
// indicating: <, >, =
public class ComparableDriver {

    public static void main(String[] args) {

        Box myBox = new Box(50, "brown");
        Box yourBox = new Box(40, "red");

        Box[] ourBoxes = {myBox, new Box(3.5, "black"), yourBox};

        for(Box box : ourBoxes){
            System.out.println(box);
        }
        System.out.println("---");

        //arrays.Sort : the objects sorted MUST implement comparable interface
        //and it uses the comparable methods to define sorting (asc, descending

        Arrays.sort(ourBoxes);
        for(Box box : ourBoxes){
            System.out.println(box);
        }



    }

}


