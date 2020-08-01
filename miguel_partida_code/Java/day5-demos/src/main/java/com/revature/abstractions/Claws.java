package com.revature.abstractions;

public interface Claws {
    // public static final implicit modifier associated with interfaces
    public final static int howLongAreClaws = 5;

    //public abstract implicit modifiers associated with interfaces
    abstract void scratch();

    default int dig(){

        return -1;
    }

    // abstract void scratch2 {} no-no
}
