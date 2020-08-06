// Q1Test.java

import org.junit.Test;
import static org.junit.Assert.*;

public class Q1Test {
    // create a class Q1 object to use it as reference
    // and call a method on it
    private Q1 q1 = new Q1();

    // array to be passed to Q1 class
    int arr[] ={1,0,5,6,3,2,3,7,9,8,4}; // array to be sorted
    int arrExpected[] ={0,1,2,3,3,4,5,6,7,8,9 }; // expected array

    @Test
    public void Q1TestEquals() {
        assertArrayEquals(arrExpected,
                q1.bubbleSort(arr)); // JUnit assert
    }
}
