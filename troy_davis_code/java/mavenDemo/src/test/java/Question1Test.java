import com.revature.*;
import org.junit.*;

import java.util.Random;


public class Question1Test {
    //int array to hold the test array
    //int array to hold the result
    Random rand = new Random();
    int[] result;
    int[] freshArray = new int[25];
    int[] givenArray = getRandomArray(freshArray);

    @Before
    public void setup(){
        //go ahead and try to call the method to sort the array
        result = Question1.bubbleSort(givenArray);
        //result = givenArray;
        //print result
        System.out.println("result is:");
        printValue(result);
    }

    //test for basic sorting by making sure that the first int is at lest smaller than
    //the last int and the middle int
    @Test
    public void firstOverLastTest(){
        //boolean variables to hold the test result
        boolean pass;
        //is the first int smaller than the last?
        pass = result[0] <= result[result.length - 1];
        Assert.assertTrue(pass);
    }

    @Test
    public void middleOverLastTest(){
        boolean pass2;
        //int to hold the number of the middle index
        int half = result.length/2;
        //is the middle int smaller than the last?
        pass2 = result[half] <= result[result.length-1];
        Assert.assertTrue(pass2);
    }

    private void printValue(int[] arr){
        for(int n : arr){
            System.out.print(n+",");
        }
        System.out.println("\n");
    }

    public int[] getRandomArray(int[] arr3){
        for (int i =0; i< arr3.length;i++){
            int x = rand.nextInt(50);
            arr3[i] = x;
        }
        return arr3;
    }
}
