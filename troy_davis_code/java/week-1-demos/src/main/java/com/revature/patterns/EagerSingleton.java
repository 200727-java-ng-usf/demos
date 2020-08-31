package com.revature.patterns;

public class EagerSingleton {
    private static EagerSingleton eagerSingleton = new EagerSingleton();
    private EagerSingleton(){
        super();
        System.out.println("[LOG] - EagerSingleton.new invoked");
    }
    public static EagerSingleton getEagerSingleton(){
        return eagerSingleton;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
