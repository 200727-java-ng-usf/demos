package com.revature.abstractions;

import org.junit.Test;

import static org.junit.Assert.*;

public class TeaCupTest {

    private TeaCup myCup = new TeaCup();

    @Test
    public void test1() {
        assertNotNull("myCup should exist", myCup);
    }

    @Test
    public void test2() {
        assertTrue("myCup should be empty when made with the default parameters", myCup.isEmpty());
    }

    @Test
    public void test3() {
        myCup.fill("tea");
        assertFalse("myCup should not be empty when you fill it with tea", myCup.isEmpty());
    }

    @Test
    public void test4() {
        myCup.fill("tea");
        assertEquals("myCup should contain tea when you fill it with tea", "tea", myCup.getDrink());
    }

    @Test
    public void test5() {
        assertTrue("myCup made with the default parameters should have handles", myCup.hasHandle());
    }

    @Test
    public void test6() {
        assertEquals("myCup made with the default parameters should hold 8 ounces", 8, myCup.size());
    }

    @Test
    public void test7() {
        myCup.drink();
        assertTrue("myCup should be empty when you drink it dry", myCup.isEmpty());
    }

    @Test
    public void test8() {
        myCup.fill("coffee");
        assertEquals("myCup should contain coffee when you fill it with coffee", "coffee", myCup.getDrink());
    }

    @Test
    public void test9() {
        myCup.fill("coffee");
        myCup.drink(6);
        assertFalse("myCup should not be empty when you only drink 6 ounces", myCup.isEmpty());
    }

    @Test
    public void test10() {
        myCup.fill("coffee");
        myCup.drink(6);
        assertEquals("myCup should still have 2 ounces left when you only drink 6", 2,myCup.getRemainder());
    }

    @Test
    public void test11() {
        myCup.fill("coffee");
        myCup.drink(6);
        myCup.drink();
        assertTrue("myCup should be empty after you finish the dregs", myCup.isEmpty());
    }

    @Test
    public void test12() {
        myCup.fill("milk");
        myCup.drink(10);
        assertTrue("myCup should be empty even though there was less than you wanted to drink", myCup.isEmpty());
    }

    @Test
    public void test13() {
        TeaCup cup2 = myCup;
        assertSame("cup2 and myCup should be the same TeaCup when myCup is assigned to cup2", myCup, cup2);
        myCup = new TeaCup();
    }

    @Test
    public void test14() {
        TeaCup cup2 = myCup;
        myCup = new TeaCup();
        assertNotSame("cup2 and myCup should not be the same after assigning myCup to a new TeaCup", cup2, myCup);
    }
}
