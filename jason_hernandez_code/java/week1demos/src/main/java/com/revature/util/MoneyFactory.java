package com.revature.util;

import com.revature.patterns.*;

public class MoneyFactory {

    public static Currency printMoney (String country) {

        switch (country.toLowerCase()) {
            case "usa":
            case "america":
                return new Dollar();
            case "france":
            case "belgium":
            case "germany":
                return new Euro();
            case "venezuela":
                return new Bolivar();

        }
        return new BitCoin();
    }
}
