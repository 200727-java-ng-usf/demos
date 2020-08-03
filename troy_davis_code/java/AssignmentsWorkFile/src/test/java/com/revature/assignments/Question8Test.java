/*
    Q8. Write a program that stores the following strings in an
    ArrayList and saves all the palindromes in another ArrayList.

        “karan”, “madam”, ”tom”, “civic”, “radar”, “jimmy”, “kayak”, “john”,  “refer”, “billy”, “did”
 */
package com.revature.assignments;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Question8Test {
    Question8 q = new Question8();

    @Test
    public void canDetectPalindrome(){
        //can the class detect a single palindrome when passed?
        Assert.assertTrue(q.isTHisAPalindrome("madam") );
    }

    @Test
    public void falsePositiveTest(){
        //when given a string that it not a palindrome, will it make it into the list anyway?
        Assert.assertFalse(q.isTHisAPalindrome("john"));
    }

    @Test
    public void palindromeStoreTest(){
        //will the method return a separate array list of known palindromes?
        //add known palindrome to ArrayList
        q.addToPalindromeArrayList("madam");
        //did it end up in the separated palindrome ArrayList?
        Assert.assertTrue(q.getPalindromeArrayList().contains("madam"));
    }
    @Test
    public void fullArrayListTest(){
        //we will try to pass the entire given sting array to see if it can put the correct ones into the correct arraylist
        ArrayList<String> allStrings = new ArrayList<>(Arrays.asList("Karen", "madam", "tom", "civic", "radar", "jimmy",
                                                                    "kayak", "john", "refer", "billy", "did"));
        ArrayList<String> onlyPalindromeList = new ArrayList<>(Arrays.asList("madam", "civic", "radar", "kayak", "refer", "did"));
        q.setStorageArrayList(allStrings);
        //check one by one to see if the palindromes made it into the list
        for(String s : onlyPalindromeList){
            Assert.assertTrue(q.getPalindromeArrayList().contains(s));
        }
    }
}
