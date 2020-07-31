package com.revature.abstractions;

public interface Claws {
    // public static final implicit modifier associated with interfaces
    public static final int howLongAreClaws = 5;

    // public abstract implicit modifiers associated with interfaces
    public abstract void scratch();

    //
    default public int dig() {
        return -1;
    }
}
