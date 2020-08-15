package com.revature.patterns;

public class MySingleton {

    // A static member of type MySingleton hold the one and only instance of this type
    // private static MySingleton onlyInstance; // lazy single (new pre-instantiated)
    private static MySingleton onlyInstance = new MySingleton();    // inherently thread safe

    private MySingleton() {
        super();
    }

    public static MySingleton getInstance() {
//        if (onlyInstance==null) {
//            onlyInstance = new MySingleton(); // part of lazy singleton
//        }

        return onlyInstance;

        // ternary version
        // return (onlyInstance == null) ? onlyInstance = new mySingleton() : onlyInstance;
    }

    // Override the Object.clone() method bc it wouldnt be a singleton if you clone it
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
