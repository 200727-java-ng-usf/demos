package com.revature.abstractions.cat;

public interface Claws {

    int howLongAreClaws = 5;

    abstract void scratch();

    // abstract void scratch2() {} no body, because class that implements
    // the interface must make it's own method.

    default int dig() {
        return -1;
    } // default methods allow us to change interfaces after they are
    //implemented without...

}
