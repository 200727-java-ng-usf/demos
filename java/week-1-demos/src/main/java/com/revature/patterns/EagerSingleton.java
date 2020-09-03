package com.revature.patterns;

public class EagerSingleton {

    // eager singleton (pre-instantiated); inherently thread-safe
    private static EagerSingleton onlyInstance = new EagerSingleton();

    private EagerSingleton() {
        super();
        System.out.println("EagerSingleton.new invoked!");
    }

    public static EagerSingleton getInstance() {
        return onlyInstance;
    }
}
