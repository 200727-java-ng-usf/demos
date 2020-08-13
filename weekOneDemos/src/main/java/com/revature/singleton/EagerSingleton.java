package com.revature.singleton;

// Thread safe !

public class EagerSingleton {

    private static EagerSingleton onlyInstance = new EagerSingleton();

    public EagerSingleton() {
    }

    public static EagerSingleton getOnlyInstance() {
        return onlyInstance;
    }
}
