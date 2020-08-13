package com.revature.patterns;

public class LazySingleton {

    // A static member of type MySingleton holds the one and only instance of this type
    private static LazySingleton onlyInstance; // lazy singleton (not pre-instantiated)

    // private constructor, so that other classes cannot invoke it
    private LazySingleton() {
        super();
        System.out.println("LazySingleton.new invoked!");
    }

    public static LazySingleton getInstance() {

//        if (onlyInstance == null) {
//            onlyInstance = new MySingleton();
//        }
//
//        return onlyInstance;

        // ternary version of the above
        return (onlyInstance == null) ? onlyInstance = new LazySingleton() : onlyInstance;

    }


    // Override the Object.clone() method; because it wouldn't be a singleton if you could clone it
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
