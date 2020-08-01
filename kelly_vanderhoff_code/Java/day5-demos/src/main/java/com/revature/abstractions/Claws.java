package com.revature.abstractions;

public interface Claws {

    int howLongAreClaws = 5; // implicitly "public final static" scope
    // Note: abstract class members have no implicit modifiers

//    public abstract void scratch();
    void scratch(); // implicitly "public abstract" scope
    // Note:  abstract class methods have no implicit modifiers
    // (even abstract must be specified)

//    void scratch2() { } // no implementation allowed allowed!  Except...

    // Method implementations only allowed with "default" modifier in interfaces
    default int dig() {
        return -1;
    }

}
