package Generics.Scopes;

public class Driver {

    static int myInt = 5;

    public static void main(String[] args) {


        Human h1 = new Human(); // instance of a human and named it h1
        h1.setName("Bill"); // h1 refers to the the first instance of the Human class, while Bill refers to the Object

        System.out.println(h1);

        Human h2 = new Human("Curtis", 34, 120);
        System.out.println(h2);

        Human h3 = new Human("Curtis", 18, 180);
        h3.setHomePlanet("Mars");
        System.out.println(h3);
        System.out.println(h1);
        System.out.println(h2);
        // myMethod(2);
        myMethod(myInt + 6);
        //other Logic i=? nothing as it has been
        showBlockScope();
    }

    // When we use static, we make it
    static void myMethod(int i) {
        System.out.println(myInt);
        System.out.println(i); // i is in the method scope

    }

    public static void showBlockScope() {
        int j = 0; // Still in method scope
        for (int i = 0; i < 10; i++) { // i is block scope
            i = i+j;
            j++;
            System.out.println(i);
        }
        // j = j+i; i is no longer exists
        System.out.println("Outside the for Loop " + j);
    }
}

