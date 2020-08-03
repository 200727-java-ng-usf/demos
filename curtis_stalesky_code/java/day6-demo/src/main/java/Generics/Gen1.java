package Generics;

public class Gen1<T> { // <T> specifies that the class can have just generic objects

    // Generics can be used as a place holder
    // using a type as parameter
    // write code that can handle different types of objects
    // use angle brackets <> to demote that something is a generic
    // Allows us to ensure type safety
    // adds stability and reusability to our code
    // Placeholder (T,E,?, etc)- use instead of an explicit type

    // Declare an object of Type T
    T ob;

    // Pass the constructor a reference to an object of type T
    Gen1(T o){
        ob=o;
    }

    // return ob
    T getOb(){
        return ob;
    }

    // Show the type T
    void showType(){
        System.out.println("Type of T is: " + ob.getClass().getName());
    }

}
