import com.revature.abstractions.teaCup.TeaCup;
import org.junit.Test;
import static org.junit.Assert.assertEquals;



public class TeaCupTest {
    private TeaCup teaCup = new TeaCup();
    @Test
    public void test(){
        teaCup.drop();
        assertEquals(5, teaCup.getQuality());
    }

    @Test
    public void test2(){
        teaCup.use();
        System.out.println(teaCup.getQuality());
        assertEquals(9, teaCup.getQuality());
    }

    @Test
    public void test3(){
        teaCup.use();
        teaCup.drop();
        assertEquals(4,teaCup.getQuality());
        System.out.println(teaCup.toString());
    }
}
