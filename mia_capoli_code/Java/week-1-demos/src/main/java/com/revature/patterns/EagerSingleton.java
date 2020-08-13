package com.revature.patterns;

public class EagerSingleton {

    // eager singleton (pre-instantiated) inherently threadsafe
    private static EagerSingleton onlyInstance = new EagerSingleton();

    // Private constructor, so that others cant access it
    private EagerSingleton() {
        super();
    }

    public static EagerSingleton getInstance() {
        return onlyInstance;
    }
}

