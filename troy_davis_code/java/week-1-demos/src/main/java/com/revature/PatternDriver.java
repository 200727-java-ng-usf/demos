package com.revature;

import com.revature.patterns.Currency;
import com.revature.patterns.EagerSingleton;
import com.revature.patterns.MySingleton;
import com.revature.util.MoneyFactory;

public class PatternDriver {
    public static void main(String[] args) {
        System.out.println("[LOG] - main method started");

        EagerSingleton es1 =  EagerSingleton.getEagerSingleton();
        EagerSingleton es2 =  EagerSingleton.getEagerSingleton();
        System.out.println(es1 == es2);

        MySingleton ms1 = MySingleton.getOnlyInstance();
        MySingleton ms2 = MySingleton.getOnlyInstance();

        System.out.println(ms1 == ms2);

        String country = "usa";
        Currency usa = MoneyFactory.printMoney(country);
        System.out.println("USA Currency symbol " + usa.getSymbol());

        country = "venezuela";
        Currency vnzla = MoneyFactory.printMoney(country);
        System.out.println("Venezuela country symbol " + vnzla.getSymbol());

        country = "south korea";
        Currency sk = MoneyFactory.printMoney(country);
        System.out.println("South Korea symbol" + sk.getSymbol());
    }
}
