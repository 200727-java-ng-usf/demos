package com.revature.teacup;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TeaCupTest {

    TeaCup myCup = new TeaCup(3);



    @Test
    public void drop() {
        myCup.drop(3);
    }


    @Test
    public void onTable() {
        myCup.onTable(5);
    }

    @Test
    public void afterDrop() {
       assertEquals(true,myCup.afterDrop());
    }


    @Test
    public void getCupNum() {
        assertEquals(3,myCup.getCupNum());
    }


    @Test
    public void testToString() {
        myCup.drop(3);
        assertEquals("cupNum=3, broken=true",myCup.toString());
    }
}