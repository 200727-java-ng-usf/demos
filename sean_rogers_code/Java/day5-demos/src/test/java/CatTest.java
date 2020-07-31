import com.revature.abstractions.Cat;
import com.revature.abstractions.Owner;
import org.junit.*;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class CatTest {
    private Cat cat = new Cat();
    private Cat mockedCat = Mockito.mock(Cat.class);


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
        System.out.println("Before everything");
    }

    @AfterClass
    public static void afterAll() {
        System.out.println("After everything");
    }

    @Test
    public void test() {
        cat.makeSound();
        System.out.println(cat.getNumberOfLives());

        assertEquals((long)8, (long)cat.getNumberOfLives());

    }

    @Test
    public void test2() {
        cat.makeSound();
        assertEquals("Domestic shorthair", cat.getBreed());
    }

    public void checkOwnerLives() {
        Mockito.when(mockedCat.getNumberOfLives());
        Owner a = new Owner(mockedCat);
        assertEquals(6, a.countLives());
    }

}
