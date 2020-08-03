package com.revature.scopes;

public class Driver {
    static int myInt=5;
    public static void main(String[] args) {

        Human h1 = new Human(); //instance of human

        //edit instance variable
        h1.setName("Bill");
        h1.setAge(30);
        h1.setWeight(5000);
        System.out.println(h1);

        Human h2 = new Human("troy",30,150);
        System.out.println(h2);

        Human h3 = new Human("sean", 20,300);

        System.out.println(h3);

        //edit static class variable
        h3.setHomePlanet("Mars");


        System.out.println(h3);
        System.out.println(h1);
        System.out.println(h2);

        //System.out.println(h1);
        myMethod(myInt+6);
        //other logic.. i=?
        showBlockScope();
    }
    //can be called by class name because it belongs to the class
    static void myMethod(int i){
        System.out.println(myInt);
        System.out.println(i);

    }
    public static void showBlockScope(){
        int j=0; //method scope
        for(int i=0; i <10;i++){
            //block scope
            i = i+j; //accessing the method level variable from the block level
            j++;
            System.out.println(i);
        }
        //j =j+i; no-no! i no longer exists!!
        System.out.println("outside for loop: " + j);
    }
}

