package com.revature.abstraction.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.revature.abstractions.teaCup;


public class teaCuptest {
    private teaCup myTeaCup = new teaCup();
    @Test
    public void test(){
        myTeaCup.holding();
    }
   public void setup(){
        System.out.println("before");

    }

}
