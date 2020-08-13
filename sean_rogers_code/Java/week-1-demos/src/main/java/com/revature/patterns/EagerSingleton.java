package com.revature.patterns;

public class EagerSingleton {

    private static EagerSingleton onlyInstance = new EagerSingleton(); //eager singletong (pre-instantiated


    private EagerSingleton() {
        super();
        System.out.println("EagerSingleton.new invoked");
    }

    public static EagerSingleton getInstance() {
        return onlyInstance; // no need to do a null check for eager singletons
    }

    // Override the Object.clone() method; because it woudln't be a singtleton if you could clone it
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
