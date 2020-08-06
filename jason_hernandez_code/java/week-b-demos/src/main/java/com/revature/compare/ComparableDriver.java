package com.revature.compare;

import com.revature.compare.models.Box;

import java.util.Arrays;

public class ComparableDriver {
    public static void main(String[] args) {
        Box myBox = new Box(50.0, "Brown");
        Box yourBox = new Box(45.0, "White");

        Box[] ourBoxes = {myBox, new Box(3.5, "Red"), yourBox};

        for (Box box : ourBoxes) {
            System.out.println(box);
        }
        System.out.println("+_______________________+");

        Arrays.sort(ourBoxes);

        for (Box box : ourBoxes) {
            System.out.println(box);
        }
    }
}
