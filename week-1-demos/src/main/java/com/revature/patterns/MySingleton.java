package com.revature.patterns;

public class MySingleton {

//    private static MySingleton onlyInstance; // lazy singleton (non pre-instantiated)

    private static  MySingleton onlyInstance = new MySingleton(); // eager singleton (pre-instantiated)

    private MySingleton(){
        super();
    }

    public static MySingleton getOnlyInstance() {
//        if (onlyInstance == null){
//            onlyInstance = new MySingleton();
//        }
//        return onlyInstance;

        return (onlyInstance == null)? onlyInstance = new MySingleton() : onlyInstance;

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

}
