package scopes;

public class Driver {
    static int myInt = 5;
    public static void main(String[] args) {
        Human h1 = new Human();
        h1.setName("Bill");//h1 is an instance setName is an instance method "bill" is a method instance
        System.out.println(h1);

        Human h2 = new Human("Matt", 34,55555);
        System.out.println(h2);

        Human h3 = new Human("Sean",20,300);
        h3.setHomePlanet("Mars");
        System.out.println(h3);
        myMethod(74968);
        showBlockScope();
    }
    //when this becomes static the whole class
    static void myMethod(int i){
        System.out.println(myInt);
        System.out.println(i);

    }
    public static void showBlockScope(){
        int j = 0;//method scope
        for(int i=0; i<10; i++){// i is block scope
        i=i+j;
        j++;
            System.out.println(i);
        }
        System.out.println("Outside for loop: " + j);
    }

}

/*
some other class
Driver.myMethod(43);
 */
