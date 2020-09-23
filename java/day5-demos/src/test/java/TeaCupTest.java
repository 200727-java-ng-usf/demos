import com.revature.abstractions.cat.Cat;

import com.revature.abstractions.teacup.Teacup;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TeaCupTest {

    private Teacup teacup = new Teacup();
    @Test
    public void test() {
        teacup.drop();
        System.out.println(teacup.getQuality());
        assertEquals(5, teacup.getQuality());
    }

    @Test
    public void test2() {
        teacup.use();
        System.out.println(teacup.getQuality());
        assertEquals(9, teacup.getQuality());

    }

    @Test
    public void test3() {
        teacup.use();
        teacup.drop();
        System.out.println(teacup.getQuality());
        assertEquals(4, teacup.getQuality());
    }

    @Test
    public void test4() {
        assertEquals("Ceramic", teacup.getMadeOf());
    }

    @Test
    public void test5() {
        assertEquals(true, teacup.isHasHandle());
    }


}
