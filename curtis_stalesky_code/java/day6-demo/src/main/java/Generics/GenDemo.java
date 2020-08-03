// java.lang.Integer = Fully qualified class name

package Generics;

public class GenDemo {

    public static void main(String[] args) {

        // Create a Gen1 Reference for Integers
        // Wrapper classes turn a primitive type to an object
        Gen1<Integer> i;
        i = new Gen1<Integer>(88);

        // show the type of i
        i.showType();

        // Get value of i
        int v = i.getOb();
        System.out.println("value: " + v);
        System.out.println("+----------------------------------------------+");

        Gen1<String> s = new Gen1<String>("Roll Tide");
        s.showType();
        String str = s.getOb();
        System.out.println("Value: " + str);
        System.out.println("+----------------------------------------------+");

    }

    // Void doStuff(T object1 T object2){
    // object1+object2;}
}
