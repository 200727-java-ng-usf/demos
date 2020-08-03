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
    public void doesItStoreTest(){
        //does the method store the names when passed into the array list
        //and then return the completed array list?

        q.addToStorageArrayList("karen");
        ArrayList<String> test = q.getPalindromeArrayList();
        String t = test.get(0);
        Assert.assertTrue(t == "karen");

        System.out.println(q);
    }
    @Test
    public void palendromStoreTest(){
        //will the method return a separate array list of known palindromes?

    }
}
