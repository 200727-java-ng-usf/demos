package com.revature.abstractions;

public interface Claws {


    // public static final implicit modifier asasociated with interfaces
    //variable implicit modifiers in an interface are
//        public final static
    public final static int howLongAreClows = 5;

    //methods are implicitly
    //  public abstract
    public abstract void scratch();

    default int dig(){
        return -1;
    }

    //abstract methods cannot have a block/body
//    abstract void scratch2(){}

}
