package com.revature.scope;

public class Driver {

    public static void main(String[] args) {

        // Illegal, object is not in scope.
//        h1.getName();

        Human h1 = new Human();
        h1.setName("Bill");
        System.out.println(h1);

        Human h2 = new Human("Stephen", 27, 9001);
        System.out.println(h2);

        Human h3 = new Human("Sean", 20, 300);
        Human.setHomePlanet("Earth");
        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);

        myMethod(myInt+6);
        System.out.println(myInt);
        showBlockScope();
    }

    private static int myInt = 5;
    public static void myMethod(int i){
        System.out.println(myInt);
        System.out.println(i);
//        llegal, j is in a different method scope.
//        System.out.println(j);
    }

    public static void showBlockScope(){
        int j = 0;
        for (int i = 0; i < 10; i++) {
            i = i + j;
            j++;
            System.out.println(i);
        }
        //Illegal, i is out of scope of the block.
//        j = j+i;
        System.out.println("Outside for loop: " + j);
    }
}
