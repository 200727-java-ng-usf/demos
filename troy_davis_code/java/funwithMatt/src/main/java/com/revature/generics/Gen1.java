package com.revature.generics;


import org.w3c.dom.ls.LSOutput;

public class Gen1<T> { //use "T" as a generic placeholder
    /*
        Generics:
            -using a type as a parameter
            - write code that can handle diff types of object
            - use angle brackets<> to denote that something is a generic
            - allows us to ensure type safety
            - adds stability and reusability to our code
            placeholder (T, E, ?. etc.) use instead of an explicit type
      */
    // declare an object of Type T
    T ob;

    //pass the constructor a reerence to an object ot type T
    Gen1(T o){
        ob=o;
    }
    //return ob
    T getOb(){
        return ob;
    }

    //show the type of T
    void showType(){
        System.out.println("Type of T is " + ob.getClass().getName());
    }


}

