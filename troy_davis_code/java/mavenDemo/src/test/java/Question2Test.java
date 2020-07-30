import com.revature.Question2;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Question2Test {
    @Test
    public void febioTest(){
        int [] result = Question2.getFebNumber();
        for (int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }
    }
}
