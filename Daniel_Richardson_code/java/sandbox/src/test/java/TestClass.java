package com.revature.abstraction;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class TestClass {

    @Before
    public void setup(){
        System.out.println("null");
    }
    @BeforeClass //runs before any class instantiated
    public void sesstup(){
        System.out.println("null");
    }
    @After
    public void afterr(){
        System.out.println("null");
    }

    //@Test
    //assertEquals(xx, xx)




}
