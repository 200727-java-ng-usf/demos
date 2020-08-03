package scopes;

public class Driver {
    static int myInt = 5;

    public static void main(String[] args) {

        Human h1= new Human(); //instance of a human
        h1.setName("Bill");
        System.out.println(h1);

        Human h2 = new Human("Shea", 36, 200);
        System.out.println(h2);

        myMethod(myInt+6);
        showBlocScope();

    }

    public static void myMethod(int x){
        System.out.println(x);

        System.out.println(myInt);
    }

    public static void showBlocScope(){
        int j = 0;
        for(int i=0 ; i <10; i++){
            i = i + j;
            j++;
            System.out.println(i);

        }
        //j = j + i;
        System.out.println("Outside for loop:"+ j);
    }
}
