package generics;

public class Gen1<T> {
    T ob;
    Gen1(T o) {
        ob = o;
    }
    T getOb() {
        return ob;
    }void showType() {
        System.out.println("The type of T is: "  + ob.getClass().getName());
    }
}