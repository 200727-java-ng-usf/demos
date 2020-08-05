import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;


public class TeaCupTest {

    @Test
    public void notTransparent(int opacity){

        assertEquals(100, opacity);
        fail("Not solid, possibly made of glass, not a teacup");

    }

    @Test
    public void correctDimentions(double height, double width){
        if (height>width){
            fail("Container too tall, possibly a mug");

        }
    }

}
