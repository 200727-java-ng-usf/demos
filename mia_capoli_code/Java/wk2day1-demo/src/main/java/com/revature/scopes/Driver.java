package com.revature.scopes;

public class Driver {

    static int myInt = 5; //keeps it in memory so we can reference it anywhere not just in the class

    public static void main(String[] args) {
        Human h1 = new Human();
        h1.setName("Bill");
        System.out.println(h1);

        Human h2 = new Human("Matt", 34, 555555); // same type, have their own values bc theyre instance specific bc they were instanced w different values
        System.out.println(h2);

        Human h3 = new Human("Sean", 20, 200);
        h3.setHomePlanet("Mars");
        System.out.println(h3);
        myMethod(myInt + 6); // make an instance of a class to utilize this method / put static to create instance
        //other logic... i=? - eaten by garbage man when not declared as static and only initialized by the method
        showBlockScope();
    }

    public static void myMethod(int i){
        System.out.println(myInt);
        System.out.println(i);
    }

    public static void showBlockScope() {
        int j=0;
        for(int i = 0; i < 10; i++){ // i is block scope
            i += j;
            j++;
            System.out.println(i);

        }
        //j =j+i; // i isnt in scope, outside of for loop
        System.out.println("Outside for loop:"+j); // js value changes outside of the scope of the loop
    }
}

