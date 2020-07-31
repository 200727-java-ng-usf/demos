package com.revature.abstractions;

public interface Claws {

    //public static final implicit modifier associated with interface
    public final static int howLongAreClaws = 5;

    //implicitly public and abstract
    //public abstract implicit modifiers associated with interfaces
    public abstract void scratch();

    default int dig(){
        return -1;
    }

    //abstract void scratch2(){} no-no


}
