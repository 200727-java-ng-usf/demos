package com.revature;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.revature.teacup.TeaCup;

import org.junit.Test;

public class TeaCupTest {
    
    private TeaCup teacup = new TeaCup();

    @Test
    public void testDrinkMethod(){
        teacup.drink();
        assertEquals(teacup.getVolume(), 7);
    }

    @Test
    public void testDropMethod(){
        teacup.drop();
        assertEquals(teacup.getCondition(), 75);
    }

    @Test
    public void testIfBreaks(){
        while(teacup.getCondition() > 0){
            teacup.drop();
        }

        System.out.println(teacup.getCondition());

        assertTrue(teacup.isBroken());
    }
}