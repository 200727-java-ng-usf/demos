import com.revature.abstractions.cat.Cat;

import com.revature.abstractions.cat.Owner;
import org.junit.*;

import static org.junit.Assert.assertEquals;

public class CatTest {

    private Cat cat = new Cat();

    @Before
    public void setup() {
        System.out.println("before");
    }

    @After
    public void after() {
        System.out.println("after");
    }

    @BeforeClass
    public static void beforeAll() {
        System.out.println("before everything");
    }

    @AfterClass
    public static void afterAll() {
        System.out.println("after everything");
    }



    @Test
    public void test() {
        cat.makeSound();
        System.out.println(cat.getNumberOfLives());
        assertEquals(8, cat.getNumberOfLives());
    }

    public void test2() {
        assertEquals("Domestic shorthair", cat.getBreed());
    }

    @Test
    public void checkOwnerLives() {
        Owner a = new Owner(cat);
        assertEquals(10, a.countLives());
    }

}
