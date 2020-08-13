package com.revature;

import com.revature.patterns.Currency;
import com.revature.patterns.EagerSingleton;
import com.revature.patterns.LazySingleton;
import com.revature.util.MoneyFactory;

public class PatternDriver {

    public static void main(String[] args) {

        System.out.println("Main method started.");

        EagerSingleton eagerSingleton1 = EagerSingleton.getInstance();
        EagerSingleton eagerSingleton2 = EagerSingleton.getInstance();
        System.out.println(eagerSingleton1 == eagerSingleton2);

        LazySingleton lazySingleton1 = LazySingleton.getInstance();
        LazySingleton lazySingleton2 = LazySingleton.getInstance();
        System.out.println(lazySingleton1 == lazySingleton2);

        String country = "america";
        Currency usa = MoneyFactory.printMoney(country);
        System.out.println("USA Currency Symbol: " + usa.getSymbol());

        country = "venezuela";
        Currency vnzla = MoneyFactory.printMoney(country);
        System.out.println("Venezuela Currency Symbol: " + vnzla.getSymbol());

        country = "germany";
        Currency deutch = MoneyFactory.printMoney(country);
        System.out.println("Germany Currency Symbol: " + deutch.getSymbol());

        country = "south korea";
        Currency skorea = MoneyFactory.printMoney(country);
        System.out.println("South Korea Currency Symbol: " + skorea.getSymbol());



    }

}
