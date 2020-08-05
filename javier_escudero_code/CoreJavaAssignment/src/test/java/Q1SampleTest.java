import org.junit.Test;

import static org.junit.Assert.*;

public class Q1SampleTest {
    private Q1Sample q1Sample = new Q1Sample("TestQ1");

    @Test
    public void Q1Test() throws Exception{
        //Q1Sample q1Sample = new Q1Sample("TestQ1");
        assertEquals("TestQ1", q1Sample.getName()); // JUnit assert
    }

    @Test
    public void tesUntHappy() throws Exception {
       // Q1Sample q = new Q1Sample("q");
        assertFalse(q1Sample.isHappy());
    }

    @Test
    public void testHappyAfterPlay() throws Exception{
    q1Sample.testQ1();
    assertTrue(q1Sample.isHappy());
    }
}