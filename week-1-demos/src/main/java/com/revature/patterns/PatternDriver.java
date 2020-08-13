package com.revature.patterns;

import com.revature.currency.MoneyFactory;

public class PatternDriver {

    public static void main(String[] args) {


        String country = "america";
        Currency usa = MoneyFactory.printMoney(country);
        System.out.println("The US Dollar symbol is "+ usa.getSymbol());


    }
}
