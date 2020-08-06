package com.revature.abstractions;
import static com.revature.abstractions.Claws.howLongAreClaws;
public interface Claws {
    // public static final implicit modifier associated with interfaces
    public final static int howLongAreClaws = 5;

    // public abstract implicit modifiers associated with interfaces
   // abstract void scratch();

    default int dig(){
        return -1;
    }
}

