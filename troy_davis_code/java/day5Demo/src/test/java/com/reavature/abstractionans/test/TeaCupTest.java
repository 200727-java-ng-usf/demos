package com.reavature.abstractionans.test;
import org.junit.Assert;
import org.junit.*;

import com.revature.abstractions.TeaCup;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;



public class TeaCupTest {
    private TeaCup tc = new TeaCup();


    //++------------------------------------------------++
    //Environment Setup
    @Before
    public void setup(){
        System.out.println("before");
    }
    @After
    public void cleanup(){
        System.out.println("all Done");
    }

    @BeforeClass
    public static void  beforeAll(){
        System.out.println("Before Everything");
    }

    @AfterClass
    public static void afterAll(){
        System.out.println("After everything");
    }

    //++------------------------------------------------------++

    @Test
    public void testBreakability(){
        //if true, it is breakable
        assertTrue(tc.isBreakable);
    }

    @Test
    public void isFull(){
        //if the ounces in cup are equal to its capacity, it is full
        tc.setOuncesInCup(100);
        assertTrue((tc.ouncesInCup == tc.capacity));
    }

    @Test
    public void isEmpty(){
        //if no ounces in cup then it is empty
        tc.setOuncesInCup(0);
        assertTrue("The cup appears to be empty",tc.getOuncesInCup() == 0);
    }

    @Test
    public void isWaterTight(){
        //can we add water?
        tc.setOuncesInCup(50);
        //is is there later?
        assertTrue("It dont hold water",tc.getOuncesInCup() == 50);
    }

    @Test
    public void isSeeThrough(){
        //if opacity is greater than 50% then it is not see through
        assertTrue("TeaCup is not see through",tc.getOpacity() > 50);
    }

    @Test
    public void isMicrowavable(){
        //is it microwavable
        assertTrue(tc.isMicrowavable());
    }

    @Test
    public void isDimensionallyAccurate(){
        //if the height is greater than the width, then it is a teacup
        assertTrue((tc.height > tc.width));
    }
    @Test
    public void isClean(){
        //tc.setDirty();
        //is it clean?
        assertTrue("This cup is dirty",tc.isClean());
    }

}
