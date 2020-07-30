import java.util.Stack;

public class Driver {
    public static void main(String[] args) {
        //bubbleSort Test
//        int[] ar = {5, 3, 8, 4, 6};
//        bubbleSort(ar);
//        for(int value : ar) {
//            System.out.println(value);
//        }

        //fibonacci test
//        fibonacci(25);

        //reverse string test
//        reverseString("Sean");

        //factorial test
//        factorial(5);

        //substring test
//        System.out.println(subString("Revature", 4));

        //is even test
//        System.out.println(isEven(-2) + " true");
//        System.out.println(isEven(-1) + " false");
//        System.out.println(isEven(0) + " true");
//        System.out.println(isEven(3) + " false");
//        System.out.println(isEven(4) + " true");
//        System.out.println(isEven(5) + " false");
    }

    //Question 1
    public static void bubbleSort(int[] ar) {
        int temp;
        for(int i = 1; i < ar.length - 1; i++) {
            for(int j = i; j < ar.length; j++) {
                if(ar[j] < ar[j - 1]) {
                    temp = ar[j];
                    ar[j] = ar[j-1];
                    ar[j-1] = temp;
                }
            }
        }
    }//end bubbleSort(int[] ar)

    //Question 2
    public static void fibonacci(int x) {
        x = 25;
        int previousNum = 0;
        int currentNum = 1;
        int temp;
        System.out.println(0);
        for(int i = 0; i < x; i++) {
            System.out.println(currentNum);
            temp = previousNum;
            previousNum = currentNum;
            currentNum += temp;
        }
    }

    //Question 3
    public static void reverseString(String str) {
        StringBuilder sb = new StringBuilder();
        for(int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        System.out.println(sb.toString());
    }

    //Question 4
    public static void factorial(int x) {
        int total = 1;
        for(int i = x; i > 0; i--) {
            total *= i;
        }
        System.out.println(total);
    }

    //Question 5
    public static String subString(String str, int idx) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < idx - 1; i++) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    //Question 6
    public static boolean isEven(int x) {
        if(x == 2 * (x / 2)) {
            return true;
        }
        return false;
    }

    //Question 7

}
