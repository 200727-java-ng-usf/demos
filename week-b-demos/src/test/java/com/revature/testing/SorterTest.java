package com.revature.testing;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import static org.junit.Assert.*;

public class SorterTest {

    Sorter sut;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Rule
    public Timeout maximumTime = Timeout.seconds(3);


    @Before
    public void setUp(){
        sut = new Sorter();
    }

    @After
    public void tearDown() {
        sut = null;
    }

    @Test
    public void sort() {

        String msg = " empty array";
        int [] emptyArray =  new int[]{};

        assertArrayEquals(msg,emptyArray,sut.sort(null));


    }
}