package com.revature.abstractions.cat;


public interface Claws {

    public final static int howLongAreClaws =5;

    abstract void scratch();

    default int dig(){
        return howLongAreClaws -1;

    }


}
