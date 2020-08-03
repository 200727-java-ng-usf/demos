package com.revature.generics;

public class Gen1<T> {
    /*
        Generics
        * using atype as a parameter
        * write code that can handle diff types of objects
        * use angle brackets <> to denote that something is a generic
        * allows us to ensure type safety
        * adds stability and re-usability to our code
        * Placeholder(T, E, ?, etc.() - use instead of an explicit type
     */

    // declare an object of Type T
    T ob;

    //pass the constructor a reference to an object of type T
    public Gen1(T o){
        ob=o;
    }

    // return ob;
    public T getOb(){
        return ob;
    }

    //show the type of T
    public void showType(){
        //Fully Qualified Class name: (package structure).package.class
        System.out.println("Type of T is: " + ob.getClass().getName());
    }


}
