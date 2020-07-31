package com.revature.abstractions;

import com.revature.abstractions.Cat;
import com.revature.unittesting.Teacup;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TeacupTest {

    private Teacup breakThisCup = new Teacup();

    @Test
    public void test() {
        breakThisCup.breakTheCup();
//            assertEquals(breakThisCup);
        }

    }

