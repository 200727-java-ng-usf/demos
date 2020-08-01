/*
    Q8. Write a program that stores the following strings in an
    ArrayList and saves all the palindromes in another ArrayList.

        “karan”, “madam”, ”tom”, “civic”, “radar”, “jimmy”, “kayak”, “john”,  “refer”, “billy”, “did”
 */
package com.revature.assignments;

import com.revature.assignments.Question8;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class Question8Test {

    @Before
    public void setup(){
        String[] startingArray = new String[]{"karen", "madam", "tom", "civic", "radar", "jimmy",
                                                "kayak", "john", "refer", "billy", "did"};
        Question8 q = new Question8(startingArray);
    }

    @Test
    public void numberResturnTest(){

    }
}
