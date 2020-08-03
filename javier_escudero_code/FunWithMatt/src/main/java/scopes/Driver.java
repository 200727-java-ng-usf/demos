package scopes;

public class Driver {
    static int myInt = 5;
    public static void main(String[] args){

        Human h1 = new Human(); //instance of human
        h1.setName("Bill"); // local scope ex
        System.out.println(h1);

        Human h2 = new Human("Matt", 34, 555555);
        System.out.println(h2);

        Human h3 = new Human("Sean", 20, 300);
        Human.setHomePlanet("Mars");
        System.out.println(h3);
        System.out.println(h1);
        System.out.println(h2);


        myMethod(myInt+6);
        showBlockScope();
    }
    public static void myMethod(int i){//belongs to the class
        System.out.println(myInt); // 5
        System.out.println(i); // 3
    }

    //Block scope example
    public static void showBlockScope() {
        int j = 0; // method scope
        for(int i = 0; i < 10; i++){ // i is a block scope
            i = i + j;
            j++;
            System.out.println(i);
        }
        // j = j+i; // i no longer exist
        System.out.println("Outside for loop: " + j);


    }
}
