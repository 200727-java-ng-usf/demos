package com.revature.abstractions;

/*
    The functional interface is meant to perform one action.
    Think Comparable, Comparator

    Functional interfaces are useful in lambda expressions
 */
@FunctionalInterface
public interface WaggingTail {
    void wag();
}
