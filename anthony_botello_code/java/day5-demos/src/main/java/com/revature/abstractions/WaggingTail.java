package com.revature.abstractions;

// A functional interface is meant to perform one action
//  think Comparable, Comparator
@FunctionalInterface
public interface WaggingTail {
    
    void wag();

    // void wetWag(); // Can't add another method due to annotation
}