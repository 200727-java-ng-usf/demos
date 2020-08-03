/*
    Q8. Write a program that stores the following strings in an ArrayList and saves all the palindromes in another ArrayList.

        “karan”, “madam”, ”tom”, “civic”, “radar”, “jimmy”, “kayak”, “john”,  “refer”, “billy”, “did”

 */

package com.revature.assignments;

import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.util.ArrayList;

public class Question8 {
    public ArrayList<String> storageArrayList = new ArrayList<>();
    public ArrayList<String> palindromeArrayList = new ArrayList<>();



    public boolean isTHisAPalindrome(String someString) {
        //method to add an item to the array list
        boolean s = someString.equalsIgnoreCase(new StringBuilder(someString).reverse().toString());
            if(s){
                return true;
            }else return false;
    }

    public void addToStorageArrayList(String someString){
        if(isTHisAPalindrome(someString)){
            palindromeArrayList.add(someString);
            System.out.println("it appears that " + someString + " is a palindrome, i will add it to the list");
        }
        else{
            System.out.println("it appears that "+ someString + " is not a palindrome, i won't add it to the list.");
        }
    }

    public ArrayList<String> getStorageArrayList() {
        return storageArrayList;
    }

    public void setStorageArrayList(ArrayList<String> storageArrayList) {
        this.storageArrayList = storageArrayList;
    }

    public ArrayList<String> getPalindromeArrayList() {
        return palindromeArrayList;
    }

    public void setPalindromeArrayList(ArrayList<String> palindromeArrayList) {
        //TODO: add items to arraylist
        this.palindromeArrayList = palindromeArrayList;
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
