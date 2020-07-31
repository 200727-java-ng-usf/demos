package com.revature.interfaces;

public interface Claws {

    int howLongAreClaws = 5 ;

     void scratch(); // implicitly  public abstract method

    default int dig(){
        return -1;
    }




}



