package generics;

public class GenDemo {

    public static void main(String[] args) {

        //Create a Gen1 reference for Integers
        Gen1<Integer> i;

         i = new Gen1<Integer>(88);

         //show the type of i
        i.showType(); // output (java.lang.Integer): fully qualified class name

        //get the value of i

        int v = i.getOb();

        System.out.println("Value: "+ v);

        Gen1<String> s = new Gen1<String>("Roll Tide");

        s.showType();
        String str = s.getOb();
        System.out.println("Value: "+str);
    }

    //void doStuff(T o1 T o2) {
    // o1 + o2;
}