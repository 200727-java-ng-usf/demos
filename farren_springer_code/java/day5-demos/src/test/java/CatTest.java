import com.revature.abstractions.cat.Cat;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CatTest {

    private Cat cat = new Cat();
    @Test
    public void test() {
        cat.makeSound();
        System.out.println(cat.getNumberOfLives());
        assertEquals(8, cat.getNumberOfLives());
    }

}
