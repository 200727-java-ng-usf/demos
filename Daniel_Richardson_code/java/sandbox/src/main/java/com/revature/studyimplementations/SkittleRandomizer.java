package com.revature.studyimplementations;

import java.util.Random;

public class SkittleRandomizer {

    static String colorMaker(){
        String color = "Null";
        int randNum = (int) ((Math.random() * (6 - 0)) + 0);

        switch(randNum){
            case 0: color = "Red"; break;
            case 1: color = "Blue"; break;
            case 2: color = "Yellow"; break;
            case 3: color = "Purple"; break;
            case 4: color = "White"; break;
            case 5: color = "Green"; break;
            case 6: color = "Black"; break;
        }

        return color;
    }
    static String flavorMaker(){
        String flavor = "Null";
        int randNum = (int) ((Math.random() * (6 - 0)) + 0);
        switch(randNum){
            case 0: flavor = "Cherry"; break;
            case 1: flavor = "Blueberry"; break;
            case 2: flavor = "Banana";break;
            case 3: flavor = "Grape";break;
            case 4: flavor = "Water";break;
            case 5: flavor = "Lime";break;
            case 6: flavor = "Licorice";break;
        }

        return flavor;
    }
    static int numberPrinter(){
        int randNum = (int) ((Math.random() * (6 - 0)) + 0);
        return randNum;
    }


}
