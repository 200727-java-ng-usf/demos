package com.revature;

public class GenericsSandbox<T> {
        /*
        using type as parameter
        write code that can handle diff types of objects
        use angle brackets <> to denote that something is generic
        allows us to ensure type safety
        adds stability and reusability to our code
        placeholder(T, E, ?, etc.) use instead of an explicit type
         */



        //declare an object of Type T
    T ob;

    //pass constructor of a reference to an object of type T
    GenericsSandbox(T o){
        ob=o;
    }

    //return ob
    T getOb(){
        return ob;
    }

    //show type of T
    void showType(){
        System.out.println("Type of T is: " + ob.getClass().getName());
    }

}
