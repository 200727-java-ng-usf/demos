package com.scope;

public class Driver {

    public static int myInt = 5;    // static, belongs to the class

    public static void main(String[] args){

        Human h1 = new Human(); // instance of human
        
        h1.setName("Bill");
        System.out.println(h1);

        Human h2 = new Human("Anthony", 28, 145);
        System.out.println(h2);

        Human h3 = new Human("Hank Hill", 45, 190);
        h3.setHomePlanet("Vegeta");
        System.out.println(h3);
        System.out.println(h1);
        System.out.println(h2);

        myMethod(4);
        // other logic...
        // i = ? (doesn't exist outside of method scope)

        myMethod(myInt + 6);

        showBlockScope();

    }

    // method belongs to class when declared 'static'
    public static void myMethod(int i){
        
        System.out.println(myInt);
        System.out.println(i); // i is part of method scope
    }

    public static void showBlockScope(){
        
        int j = 0;  // belongs to scope of method

        // i belongs to block scope
        for(int i = 0; i < 10; i++){
            i = i + j;  // j belongs to bigger scope, so we can reference it inside block
            j++;
            System.out.println(i);
        }

        // j = j + i;  // i no longer exists
        System.out.println("Outside for loop j = " + j);
    }
}