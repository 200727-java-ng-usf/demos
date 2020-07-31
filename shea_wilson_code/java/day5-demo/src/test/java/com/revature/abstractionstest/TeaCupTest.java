package com.revature.abstractionstest;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TeaCupTest {

    @Test
    public void test() {

        int durability = 100;
        System.out.println(durability);
        assertEquals(100, durability);

        boolean breakable = true;
        System.out.println(breakable);
        assertTrue(breakable);

        boolean isClean = true;
        System.out.println(isClean);
        assertTrue(isClean);





    }



}
