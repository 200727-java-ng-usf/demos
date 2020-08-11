import com.revature.unittesting.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalcTest {

    private Calculator sut; //sut = system under testing
    //aim for test independence from class

    @Before
    public void setUp(){
        sut = new Calculator();
    }
    @After
    public void tearDown(){
        sut = null;
    }

    @Test
    public void additionTwoAndFive(){
        double expected = 7;
        double actual = sut.add(2,5);
        Assert.assertEquals("2 plus 5: ", expected, actual, 0.01);
    }



}
