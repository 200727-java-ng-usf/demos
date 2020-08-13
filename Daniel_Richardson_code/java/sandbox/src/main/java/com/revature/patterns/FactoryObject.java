package com.revature.patterns;

public class FactoryObject {

    public static Currency printMoney(String country){
        switch(country.toLowerCase()){
            case "usa":
            case "america":
                return new Dollar();
            case "germany":
            case "eu":
            case "britain":
            case "belgium":
            case "italy":
                return new Euro();
            case "japan":
                return new Yen();
            default:
                return new Bitcoin();
        }
    }

}
