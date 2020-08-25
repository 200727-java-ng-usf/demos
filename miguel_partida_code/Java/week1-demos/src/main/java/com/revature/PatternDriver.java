package com.revature;

import com.revature.patterns.Currency;
import com.revature.util.MoneyFactory;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class PatternDriver {
    public static void main(String[] args) {


        String country = "america";
        Currency usa = MoneyFactory.printMoney(country);
        System.out.println("USA currency symbol: " + usa.getSympol());

        country = "venezuela";
        Currency vnzla = MoneyFactory.printMoney(country);
        System.out.println("Venezuela currnecy symbol: "+ vnzla.getSympol());

        country = "germany";
        Currency deutch = MoneyFactory.printMoney(country);
        System.out.println("Germany currency symbol: "+ deutch.getSympol());

        country = "south korea";
        Currency skorea = MoneyFactory.printMoney(country);
        System.out.println("South Korea Currency Symbol: "+ skorea.getSympol());
    }
}