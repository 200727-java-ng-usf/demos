package com.revature.abstractions;

import org.junit.Test;

import static org.junit.Assert.*;

public class TeaCupTest {

    private TeaCup myCup = new TeaCup();

    @Test
    public void test1() {
        assertNotNull("My cup should exist.", myCup);
    }

    @Test
    public void test2() {
        assertTrue("There is nothing in the cup", myCup.isEmpty());
    }

    @Test
    public void test3() {
        myCup.fill("tea");
        assertFalse("The cup is filled with tea", myCup.isEmpty());
    }

    @Test
    public void test4() {
        myCup.fill("tea");
        assertEquals("tea", myCup.getDrink());
    }

    @Test
    public void test5() {
        assertTrue("Default tea cups have handles", myCup.hasHandle());
    }

    @Test
    public void test6() {
        assertEquals(8, myCup.size());
    }

    @Test
    public void test7() {
        myCup.drink();
        assertTrue(myCup.isEmpty());
    }

    @Test
    public void test8() {
        myCup.fill("coffee");
        assertEquals("coffee", myCup.getDrink());
    }

    @Test
    public void test9() {
        myCup.fill("coffee");
        myCup.drink(6);
        assertFalse(myCup.isEmpty());
    }

    @Test
    public void test10() {
        myCup.fill("coffee");
        myCup.drink(6);
        assertEquals(2,myCup.getRemainder());
    }

    @Test
    public void test11() {
        myCup.fill("coffee");
        myCup.drink(6);
        myCup.drink();
        assertTrue(myCup.isEmpty());
    }
}
