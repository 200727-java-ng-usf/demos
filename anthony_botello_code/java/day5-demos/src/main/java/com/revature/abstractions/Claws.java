package com.revature.abstractions;

public interface Claws {

    public static final int howLongAreClaws = 5;
    
    public abstract void scratch();

    default int dig() {
        return -1;
    }

}