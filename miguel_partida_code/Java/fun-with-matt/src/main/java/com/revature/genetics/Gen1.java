package com.revature.genetics;

public class Gen1 <T> {
    /*
    -using a type as parameter
    -write code that can handle different types of objects
    -use angle brackets <> to denote that something is a generic
    -Allows us to ensure type safety
    -adds stability and reusablity to our code
    -Placeholder(T,E,?,etc) use instead of an explicit type
     */
    //declare an object of Type T

    T ob;
    //pass the constructor a referance of type T

    Gen1(T o){
        ob = o;
    }

    //return ob
    T getOb(){
        return ob;
    }
    //show the type of T
    void showType (){
        System.out.println("type of T is: " + ob.getClass().getName());
    }

}
