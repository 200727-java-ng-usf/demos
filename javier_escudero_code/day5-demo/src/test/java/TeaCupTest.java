import com.revature.teacup.TeaCup;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class TeaCupTest {

    private TeaCup teacup = new TeaCup();

    @Test
    public void testDrinkMethod(){
        teacup.drink();
        assertEquals(7, teacup.getVolume()); // only runs once
    }

    @Test
    public void testDropMethod(){
        teacup.drop();
        assertEquals(75, teacup.getCondition()); // only dropped once
    }
}
