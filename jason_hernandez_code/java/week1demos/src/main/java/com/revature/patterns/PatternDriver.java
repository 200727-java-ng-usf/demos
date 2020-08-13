package com.revature.patterns;

import com.revature.util.MoneyFactory;

public class PatternDriver {

    public static void main(String[] args) {
        EagerSingleton eagerSingleton = EagerSingleton.getInstance();

        LazySingleton lazySingleton = LazySingleton.getInstance();

        String country = "america";
        Currency usa = MoneyFactory.printMoney(country);
        System.out.println("USA currency symbol: " + usa.getSymbol());
    }
}
