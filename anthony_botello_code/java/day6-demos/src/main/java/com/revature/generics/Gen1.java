package com.revature.generics;

public class Gen1<T> {
    /* Generics
        - Using a type as parameter
        - Write code that can handle different types of objects
        - Use angle brackets <> to denote that something is a generic
        - Allows us to ensure type safety
        - Adds stability and reusability to our code
        - Placeholder(T, E, ?, etc.), use instead of an explicit type
    */

    // declare an object of type T
    T obj;

    // pass the constructor a reference to an object of type T
    public Gen1(T obj){
        this.obj = obj;
    }

    // return T object
    public T getObj(){ return obj; }

    // show the type of T
    public void showType(){
        System.out.println("The type of T is: " + obj.getClass().getName()); // prints fully qualified class name
    }
}