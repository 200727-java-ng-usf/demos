import com.revature.abstractions.Cat;
import com.revature.abstractions.TeaCup;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class TeaCupTest {
    private TeaCup tc1 = new TeaCup();
    @Test
    public void testDurablility1() {
        tc1.damage(4.3);
        assertEquals(0.7, tc1.durability, .001);
        System.out.println(tc1.durability);
        //assertEquals((long)8, (long)cat.getNumberOfLives());
    }
    @Test
    public void testDurablility2() {
        tc1.damage(9999999.1);
        assertEquals(0.0, tc1.durability, .001);
        System.out.println(tc1.durability);
        //assertEquals((long)8, (long)cat.getNumberOfLives());
    }
    @Test
    public void testVolume1() {
        tc1.pour(7);
        assertEquals(3, tc1.volume);
        System.out.println(tc1.volume);
    }
    @Test
    public void testVolume2() {
        tc1.pour(50);
        assertEquals(0, tc1.volume);
        System.out.println(tc1.volume);
    }
    @Test
    public void testVolume3() {
        TeaCup tc2 = new TeaCup();
        tc2.fill(50);
        assertEquals(60, tc2.volume);
        System.out.println(tc2.volume);
    }
    @Test
    public void testVolume4() {
        TeaCup tc2 = new TeaCup();
        tc2.fill(500000);
        assertEquals(9000, tc2.volume);
        System.out.println(tc2.volume);
    }
    @Test
    public void testDestroyTeaCupViolently() {
        TeaCup tc2 = new TeaCup();
        tc2.damage(500000.0);
        assertEquals(0xFFFF0000, tc2.color.getRGB());
        System.out.println(tc2.color.getRGB());
        System.out.println(0xFFFF0000);
    }
}