package com.revature.abstractions;

public interface Claws {

    public final static int howLongAreClaws = 5;
    public abstract void scratch();

    default int dig(){
        return -1;
    }

}
