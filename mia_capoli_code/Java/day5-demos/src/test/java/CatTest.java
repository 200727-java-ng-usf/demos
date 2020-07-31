import com.revature.abstractions.Cat;
import com.revature.abstractions.Owner;
import org.junit.*;
import org.mockito.Mockito;

import static junit.framework.TestCase.assertEquals;
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
        System.out.println("before everything");
    }
    @AfterClass
    public static void afterAll() {
        System.out.println("after everything");
    }

    @Test
    public void test() {
        System.out.println(cat.getNumberOfLives());
        assertEquals(9, cat.getAnimalNumberOfLives());
    }

    @Test
    public void test2() {
        assertEquals("Domestic shorthair", cat.getBreed());
    }

    @Test
    public void checkOwnerLives() {
        Mockito.when(mockedCat.getNumberOfLives()).thenReturn(5);
        Owner a = new Owner(mockedCat);
        assertEquals(6, a.countLives());
    }
}
