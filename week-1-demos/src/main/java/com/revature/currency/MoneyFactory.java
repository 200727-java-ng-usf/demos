package com.revature.currency;

import com.revature.patterns.*;

public class MoneyFactory {

    public static Currency printMoney(String country){

        switch (country.toLowerCase()){
            case"usa":
            case "america":
                return new Dollar();
            case "germany":
            case "france":
            case "belgium":
                return new Euro();
            case "venezuela":
                return new Bolivar();
            default:
                return new Bitcoin();
        }
    }


}
