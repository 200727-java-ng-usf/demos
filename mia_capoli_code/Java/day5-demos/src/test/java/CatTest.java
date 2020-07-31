import com.revature.abstractions.Cat;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CatTest {


    private Cat cat = new Cat();

    @Test
    public void test() {
        cat.makeSound();
        System.out.println(cat.getNumberOfLives());
        assertEquals(8, cat.getNumberOfLives());
    }
}
