package com.revature.patterns;

import com.revature.util.MoneyFactory;

public class PatternDriver {

    public static void main(String[] args) {
        EagerSingleton eagerSingleton = EagerSingleton.getInstance();

        LazySingleton lazySingleton = LazySingleton.getInstance();

        String country = "america";
        Currency usa = MoneyFactory.printMoney(country);
        System.out.println("USA currency symbol: " + usa.getSymbol());

        String country2 = "belgium";
        Currency belge = MoneyFactory.printMoney(country);
        System.out.println("Belgium currency symbol: " + belge.getSymbol());

        String country3 = "venezuela";
        Currency vnzla = MoneyFactory.printMoney(country);
        System.out.println("Venezuela currency symbol: " + vnzla.getSymbol());
    }
}
