package scopes;

public class Driver {

    public static void main(String[] args) {

        Human h1 = new Human(); //instance of human
        h1.setName("Bill");
        Human h2 = new Human("Matt", 34, 55555);
        System.out.println(h1);
        System.out.println(h2);
        Human h3 = new Human("Sean", 20, 300);
        h3.setHomePlanet("Mars"); //changes a static variable
        System.out.println(h3);
        System.out.println(h1);//home planet is now mars, h3 changed it
        myMethod(2);
        showBlockScope();
    }
    //static method can be called anywhere as long as the class can access it
    static void myMethod(int i){
        //i only exists in method, once method completes, i no longer exists
        System.out.println(i);
    }
    public static void showBlockScope(){
        int j = 0;
        for(int i = 0; i < 10; i++){
            i = i +j; //can access j from inside block, j is in method scope, i is in block
            j++;
            System.out.println(i);
        }
        // can not do j =j+i; i does not exist
        System.out.println("Outside for loop: " + j);
    }

}
