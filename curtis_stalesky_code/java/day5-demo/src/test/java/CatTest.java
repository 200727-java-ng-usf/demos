import com.revature.abstractions.Cat;
import com.revature.abstractions.Claws;
import com.revature.abstractions.Owner;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

// This should be in src/test/java
public class CatTest {

    private Cat cat = new Cat();
    private Cat mockedCat = Mockito.mock(Cat.class);
    @Before
    public void setup(){
        System.out.println("before");
    }
    @After
    public void after(){
        System.out.println("After");
    }

    @BeforeClass
    public static void beforeAll(){
        System.out.println("before everything");
    }

    public static void afterAll(){
        System.out.println("after everything");
    }

    @Test
    public void test() {
        cat.makeSound();
         System.out.println(cat.getNumberOfLives());
        assertEquals(8, cat.getNumberOfLives());
    }

    @Test
    public void test2(){
        assertEquals("Domestic shorthair", cat.getBreed());

    }

    @Test
    public void checkOwnerLives(){
        Mockito.when(mockedCat.getNumberOfLives()).thenReturn(5);
        Owner a = new Owner(cat);
        assertEquals(10, a.countLives());
    }
}

/*

 */