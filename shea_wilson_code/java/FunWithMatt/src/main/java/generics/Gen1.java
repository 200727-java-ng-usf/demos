package generics;

public class Gen1 <T>{
    /*
        Generics
        * using a type of parameter
        * write code that can handle diff types of objects
        * use angle brackets <> to denote that something is a generic
        * Allows us to ensure type safely
        * Adds stability and reusability to our code
        * Placeholder (T,E,?,etc...) use instead of an explicit type
     */

    //declase and object of type T
    T ob;

    //pass the constructor a reference to an object of type T
    Gen1(T o){
        ob = o;
    }

    //return ob
    T getOb(){
        return ob;
    }

    //show the type of T
    void showType(){
        System.out.println("Type of T is: "+ob.getClass().getName());
    }





}


