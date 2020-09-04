package com.revature.patterns;

public class MySingleton {

    //A static member of type MySingleton holds the only instance of this class
    private static MySingleton onlyInstance;

    //private constructor makes it so anything outside of this class can't create a new obj
    private MySingleton() {
        super();
    }

    // public static will allow access to the method outside of obj/class
    public static MySingleton getInstance() {

        //checks to see if instance already exists, if not creates one
        if(onlyInstance == null) {
            onlyInstance = new MySingleton();
        }

        return onlyInstance;
    }

    // prevents cloning (a new obj with the same vars)
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
