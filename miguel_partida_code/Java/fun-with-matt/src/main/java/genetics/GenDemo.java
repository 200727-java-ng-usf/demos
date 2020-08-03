package genetics;

public class GenDemo {

    public static void main(String[] args) {
        //Create a Gen1 Reference for Integers
        Gen1<Integer> i;
        i = new Gen1<Integer>(88);

        //show the type of i
        i.showType();

        //get the value of i
        int v = i.getOb();

        System.out.println("Value: " + v );
        //Fully qualified class name i.e: java.lang.Integer

        Gen1<String > s = new Gen1<String>("Roll Tide");
        s.showType();
        String str = s.ob;
        System.out.println("Value: " + str);


     }
     //void doStuff(T object1 T object2)
    //object1 + object2;

}
