package com.revature.abstractions.cat;

// The functional interface is meant to perform one action. Think Comparable
//  Comparator, etc...
@FunctionalInterface
public interface WaggingTail {

    void wag();

//    void wetWag(); // cannot add another method, because we labeled this as @FunctionalInterface

}
