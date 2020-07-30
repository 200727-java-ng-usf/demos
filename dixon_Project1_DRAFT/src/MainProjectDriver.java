import com.revature.Arrays;
import com.revature.*;

public class MainProjectDriver {

public static void main(String args[]){
    
    
    Arrays obj= new Arrays();
    int arr[] = {1,0,5,6,3,2,3,7,9,8,4};
    obj.bubbledArray(arr);
    System.out.println("Sorted");
    obj.printArr(arr);
    
}

   /* private static class Sorted {

        public void bubbledArray(int[] arr) {
        }

        public void printArray(int[] arr) {
        }
    } */
}
