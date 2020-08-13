package com.revature;

import com.revature.patterns.Currency;
import com.revature.patterns.EagerSingleton;
import com.revature.patterns.LazySingleton;
import com.revature.util.MoneyFactory;

public class PatternDriver {

    public static void main(String[] args) {

        System.out.println("Main method Started.");

        EagerSingleton eagerSingleton1 = EagerSingleton.getInstance();
        EagerSingleton eagerSingleton2 = EagerSingleton.getInstance();

        System.out.println(eagerSingleton1 == eagerSingleton2);

        LazySingleton lazySingleton1 = LazySingleton.getInstance();
        LazySingleton lazySingleton2 = LazySingleton.getInstance();

        System.out.println(lazySingleton1 == lazySingleton2);

        String country = "america";
        Currency usa = MoneyFactory.printMoney(country);
        System.out.println("USA currency symbol: " + usa.getSymbol());

        country = "venezuela";
        Currency vnzla = MoneyFactory.printMoney(country);
        System.out.println("Venezuela currency symbol: " + vnzla.getSymbol());

        country = "germany";
        Currency germany = MoneyFactory.printMoney(country);
        System.out.println("German currency symbol: " + germany.getSymbol());

        country = "south korea";
        Currency southKorea = MoneyFactory.printMoney(country);
        System.out.println("Korean currency symbol: " + southKorea.getSymbol());

    }
}
