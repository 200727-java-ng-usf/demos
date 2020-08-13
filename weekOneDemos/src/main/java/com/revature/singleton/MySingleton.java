package com.revature.singleton;

public class MySingleton {
    private static MySingleton onlySingleton;

    private MySingleton(){

    }

    public static MySingleton getInstance(){
        if(onlySingleton==null){
            onlySingleton = new MySingleton();
        }
        return onlySingleton;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
