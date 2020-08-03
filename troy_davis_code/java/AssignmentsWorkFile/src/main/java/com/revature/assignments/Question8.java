/*
    Q8. Write a program that stores the following strings in an ArrayList and saves all the palindromes in another ArrayList.

        “karan”, “madam”, ”tom”, “civic”, “radar”, “jimmy”, “kayak”, “john”,  “refer”, “billy”, “did”

 */

package com.revature.assignments;

import java.util.ArrayList;

public class Question8 {
    //ArrayList to hold Arrays before they are tested
    public ArrayList<String> storageArrayList = new ArrayList<>();
    //ArrayList to hold only Strings which are palindromes
    public ArrayList<String> palindromeArrayList = new ArrayList<>();

    //method to test if a single string is a palindrome or not
    public boolean isTHisAPalindrome(String someString) {
        boolean s = someString.equalsIgnoreCase(new StringBuilder(someString).reverse().toString());
            if(s){
                return true;
            }else return false;
    }

    //method to add a single string to the Palindrome arraylist, once tested of course
    public void addToPalindromeArrayList(String someString){
        palindromeArrayList.add(someString);
    }

    public void setStorageArrayList(ArrayList<String> storageArrayList) {
        //take in an Array List, find if each is a palindrome, if so, add it to the palindrome array list
        for(String s: storageArrayList){
            if(isTHisAPalindrome(s)){
                addToPalindromeArrayList(s);
            }
        }
    }

    public ArrayList<String> getPalindromeArrayList() {
        return palindromeArrayList;
    }



    //method to print out the ArrayList
    @Override
    public String toString() {
        return "Question8{" +
                "storageArrayList=" + storageArrayList +
                ", palindromeArrayList=" + palindromeArrayList +
                '}';
    }
}
