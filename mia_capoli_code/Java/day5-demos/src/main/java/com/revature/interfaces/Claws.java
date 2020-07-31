package com.revature.interfaces;

public interface Claws {

    // don't have to instantiate it in order to access it, its associated with the c lass that implements the
    // interface, and accessible by any member of the class
    // static, public, final modifiers are implicit for interface variables
    //
    public static final int howLongAreClaws = 5;

    // implicitly public; cant have body, because implicitly abstract
    //abstract void scratch2() {} -- no no
    abstract void scratch();

    // implicitly implemented in the interfacing class, does not have to be implemented
    // bc it isnt a abstract method?
    default int dig() {
        return -1;
    }


}
