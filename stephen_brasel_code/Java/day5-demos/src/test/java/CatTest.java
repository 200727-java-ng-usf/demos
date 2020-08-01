import com.revature.abstractions.Cat;
import com.revature.abstractions.Owner;
import org.junit.*;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class CatTest {

    private Cat cat = new Cat();
    private Cat mockedCat = Mockito.mock(Cat.class);

    @Before
    public void setup(){
        System.out.println("before every test");
    }

    @After
    public void after(){
        System.out.println("after every test");
    }

    @BeforeClass
    public static void beforeAll(){
        System.out.println("before EVERYTHING");
    }

    @AfterClass
    public static void afterAll(){
        System.out.println("after EVERYTHING");
    }

//    @Test
//    public void test(){
//        cat.makeSound();
//        assertEquals(9, cat.getNumberOfLives());
//    }

    @Test
    public void Test2(){
        assertEquals("Domestic shorthair", cat.getBreed());
        System.out.println(cat.getBreed());
    }

    @Test
    public void CheckOwnerLives(){
        Owner a = new Owner(cat);
        assertEquals(10, a.countLives());
    }

    @Test
    public void checkOwnerlives(){
        Mockito.when(mockedCat.getNumberOfLives()).thenReturn(5);
        Owner a = new Owner(mockedCat);
        assertEquals(6, a.countLives());
    }

}
