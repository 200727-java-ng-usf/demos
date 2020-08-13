package com.revature.patterns;

public class PatternDriver {

    public static void main(String[] args) {

        System.out.println("Main started");

        SingletonObject singleton = SingletonObject.getInstance();
        SingletonObject singleton2 = SingletonObject.getInstance();

        System.out.println(singleton==singleton2); //checks to see if references are the same
        //since singleton can't be made more than once, both vars point to same reference

        //=====================================================================================

        String country = "japan";
        Currency money = FactoryObject.printMoney(country);
        System.out.println(country+" currency symbol: "+ money.getSymbol());
        country = "usa";
        money = FactoryObject.printMoney(country);
        System.out.println(country+" currency symbol: "+ money.getSymbol());
        country = "ITALY";
        money = FactoryObject.printMoney(country);
        System.out.println(country+" currency symbol: "+ money.getSymbol());



    }

}
