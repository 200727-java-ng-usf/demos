package com.revature.util;

import com.revature.patterns.*;
import sun.misc.FloatingDecimal;

public class MoneyFactory {

    public static Currency printMoney(String country) {
        switch (country.toLowerCase()) {
            case "usa":
            case "america":
                return new Dollar();
            case "germany":
            case "france":
            case "belgium":
            case "italy":
                return new Euro();
            case "venezuela":
                return new Bolivar();
            default:
                return new Bitcoin();

        }
    }
}