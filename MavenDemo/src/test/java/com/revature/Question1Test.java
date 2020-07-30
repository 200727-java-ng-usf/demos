package com.revature;

import org.junit.Test;

import static org.junit.Assert.*;

public class Question1Test {

    @Test
    public void getName() {
        Question1 test = new Question1("yuanfeng");
        assertEquals("yuanfeng",test.getName());
    }


    @Test
    public void testToString() {
        Question1 test = new Question1("Eden");
        assertEquals("Question1{name=Eden}",test.toString());
    }
}