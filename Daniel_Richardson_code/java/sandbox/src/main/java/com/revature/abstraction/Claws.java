package com.revature.abstraction;

public interface Claws {
    //public static final implicit modifier associate with interfaces
    public final static int clawLength = 5;

    //public abstract implicit modifiers associated with interfaces
    public abstract void scratch();

    default int dig(){ //i assume this is to allow logic without fckin up all the classes
        return -1;
    }


}
