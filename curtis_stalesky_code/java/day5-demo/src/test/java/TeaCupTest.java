import com.revature.abstractions.TeaCup;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TeaCupTest {

    private TeaCup breakThisCup = new TeaCup();

    @Test
    public void test() {

        // Does this cup break
        breakThisCup.BreakTheCup("Plastic", 100); // Requires parameters
        assertEquals(85, TeaCup.durability);

    }


}
