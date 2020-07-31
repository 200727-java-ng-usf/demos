import com.revature.abstractions.Cat;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CatTest {
    private Cat cat = new Cat();
    @Test
    public void test() {
        cat.makeSound();
        assertEquals(8, cat.getNumberOfLives());
    }
}
