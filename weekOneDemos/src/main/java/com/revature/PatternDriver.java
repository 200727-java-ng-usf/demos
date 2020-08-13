package com.revature;

import com.revature.singleton.Currency;
import com.revature.singleton.EagerSingleton;
import com.revature.singleton.MySingleton;
import com.revature.util.MoneyFactory;

public class PatternDriver {

    public static void main(String[] args) {
//
//        EagerSingleton eagerSingleton1 = EagerSingleton.getOnlyInstance();
//        EagerSingleton eagerSingleton2 = EagerSingleton.getOnlyInstance();
//
//        MySingleton mySingleton1 = MySingleton.getInstance();
//        MySingleton mySingleton2 = MySingleton.getInstance();
//
//        System.out.println((eagerSingleton1 == eagerSingleton2) +"  "+ (mySingleton1 == mySingleton2));
//
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
        System.out.println("South korea Symbol: " + skorea.getSymbol());



    }
}
