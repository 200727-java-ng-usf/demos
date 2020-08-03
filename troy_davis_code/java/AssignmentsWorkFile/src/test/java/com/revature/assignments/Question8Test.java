/*
    Q8. Write a program that stores the following strings in an
    ArrayList and saves all the palindromes in another ArrayList.

        “karan”, “madam”, ”tom”, “civic”, “radar”, “jimmy”, “kayak”, “john”,  “refer”, “billy”, “did”
 */
package com.revature.assignments;

import com.revature.assignments.Question8;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

public class Question8Test {
    Question8 q = new Question8();
                //{"karen", "madam", "tom", "civic", "radar", "jimmy",
                  //                              "kayak", "john", "refer", "billy", "did"};
    @Test
    public void canDetectPalindrome(){
        //can the class detect a single palendrome when passed?
        Assert.assertTrue(q.isTHisAPalindrome("madam") );

    }
    @Test
    public void palendromStoreTest(){
        //will the method return a separate array list of known palindromes?

        //add known palindrome to ArrayList
        q.addToStorageArrayList("madam");
        //did it end up in the separated palindrome ArrayList?
        Assert.assertTrue(q.getPalindromeArrayList().contains("madam"));
    }
}
