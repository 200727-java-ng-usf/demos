package com.revature.patterns;

public class LazySingleton {

    // A static member of type MySingleton holds the one and only instance of this type
//    private static MySingleton onlyInstance; // lazy singleton (not pre-instantiated)

    private static LazySingleton onlyInstance = new LazySingleton(); //eager singletong (pre-instantiated


    private LazySingleton() {
        super();
        System.out.println("LazySingleton.new invoked");
    }

    public static LazySingleton getInstance() {
        return (onlyInstance == null) ? onlyInstance = new LazySingleton() : onlyInstance;
    }

    // Override the Object.clone() method; because it woudln't be a singtleton if you could clone it
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
