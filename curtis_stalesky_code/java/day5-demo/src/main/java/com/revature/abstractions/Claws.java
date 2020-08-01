package com.revature.abstractions;

public interface Claws {
    // public static final implicit modifiers associated with interfaces
    public final static int howLongAreClaws = 5;

    // public abstract implicit modifiers associated iwth interfaces

    abstract void scratch();

    default int dig(){
        return -1;
    }

    //void scratch2();

    // abstract methods will not have any bodies ( {} )
    // abstract class doesn't have any implicit modifiers


}
