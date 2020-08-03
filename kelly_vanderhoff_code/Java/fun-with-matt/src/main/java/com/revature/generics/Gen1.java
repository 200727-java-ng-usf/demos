package com.revature.generics;

public class Gen1<T> {
    /* Generics
     * using a type as a parameter
     * write code that can handle diff types of objects
     * use angle brackets <> to denote that something is a generic
     * Allows us to ensure type safety
     * adds stability and reusability to our code
     * Placeholder (T, E, ?, etc.) - use instead of an explicit type
     */

    // declare an object Type T
    T obj;

    // pass the constructor a reference to an object of type T
    Gen1(T obj) {
        this.obj = obj;
    }

    // return object
    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    // show the type of T
    public void showType() {
        System.out.println("Type of T is: " + obj.getClass().getName());
    }

}
