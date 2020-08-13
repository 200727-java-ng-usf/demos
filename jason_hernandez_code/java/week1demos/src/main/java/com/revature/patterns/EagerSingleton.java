package com.revature.patterns;

public class EagerSingleton {

    private static EagerSingleton onlyInstance = new EagerSingleton();

    private EagerSingleton() {
        super();
    }

    public static EagerSingleton getInstance() {
        return onlyInstance;
    }
}
