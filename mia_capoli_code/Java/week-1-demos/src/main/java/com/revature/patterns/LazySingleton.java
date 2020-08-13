package com.revature.patterns;

public class LazySingleton {

    // A static member of type MySingleton holds the one and only instance of this type
    private static LazySingleton onlyInstance; // lazy singleton (not instantiated)

    // Private constructor, so that others cant access it
    private LazySingleton() {
        super();
    }

    public static LazySingleton getInstance() {

//        if (onlyInstance == null) {
//            onlyInstance = new MySingleton();
//        }
//        return onlyInstance;

        // ternary version of the above
        return (onlyInstance == null) ? onlyInstance = new LazySingleton() : onlyInstance;

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

}
