package generics;

public class GenDemo {
    public static void main(String[] args) {
        Gen1<Integer> i;
        i = new Gen1<Integer>(88);

        i.showType();

        int v = i.getOb();
        System.out.println("value: " + v);

        Gen1<String> s = new Gen1<String>("Roll Tide");
        s.showType();
        String str = s.getOb();
        System.out.println("value: " + str);

    }
}
