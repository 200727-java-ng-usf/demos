import com.revature.teacup.Teacup;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;


public class TeacupTest {

    private Teacup teacup = new Teacup();

    @Test
    public void testDrinkMethod() {
        teacup.drink();
        assertEquals(7, teacup.getVolumeOfTeacup()); //only runs once
    }

    @Test
    public void testDropMethod() {
        teacup.drop();
        assertEquals(75, teacup.getCondition()); // only dropped once
    }

    @Test
    public void testIfBreaks() {
        while (teacup.getCondition() > 0) {
            teacup.drop();
        }
        assertTrue(teacup.isBroken());

    }
}
