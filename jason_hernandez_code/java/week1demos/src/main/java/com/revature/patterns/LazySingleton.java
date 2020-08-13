package com.revature.patterns;

public class LazySingleton {

    private static LazySingleton onlyInstance;

    private LazySingleton() {
        super();
    }

    public static LazySingleton getInstance() {
        if (onlyInstance == null) {
            onlyInstance = new LazySingleton(); // Only needed if lazy singleton

        }

        return onlyInstance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
