package com.revature.assignments;

import org.junit.*;
import com.revature.assignments.Question12;

public class Question12Test {
    Question12 q = new Question12();
    Question12 q500 = new Question12(500);

    @Test
    public void numberOfIntegersTest(){
        //does the return match the correct number of integers? should be half
        System.out.println(q);
        System.out.println(q500);

        Assert.assertTrue(q.evenOnlyArray.length == 50);
    }
}
