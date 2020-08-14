package com.revature.patterns;

public class Dollar implements Currency {

    @Override
    public String getSymbol() {
        return "USD";
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("I'm being deleted! Good bye cruel world!");
    }
}
