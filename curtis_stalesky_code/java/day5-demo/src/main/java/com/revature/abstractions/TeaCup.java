package com.revature.abstractions;

public class TeaCup {

    String material = "Plastic";
     // int durability = 100;
    boolean isBroken = false;
    int volume = 12;
    boolean hasHandle = true;
    String cupColor = "Yellow";
    public static int durability =100;


    public void BreakTheCup(String material,int durability ){
        System.out.println(material + "You dropped the cup");
        this.durability -=15;


    }

    //public static void main(String[] args) {    }



}
