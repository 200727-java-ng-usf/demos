package com.revature.unittesting;

public class Teacup {
    public static void main(String[] args) {

    }

    String material = "plastic";
    Boolean isBroken = false;
    int durability = 30;
    int volume = 12;
    Boolean hasHandle = true;
    String color = "white";

    public void breakTheCup() {
        System.out.println("You dropped the cup.");
        this.durability = durability - 5;
    }

}
