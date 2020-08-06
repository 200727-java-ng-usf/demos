package com.revature.structures;

import com.revature.structures.util.CustomLinkedList;

public class LinkedListDriver {

    public static void main(String[] args) {

        CustomLinkedList<String> stringList = new CustomLinkedList<>();
        stringList.insert("terst1");
        stringList.insert("terst9");
        stringList.insert("terst7");
        stringList.insert("terst6");
        stringList.insert("terst2");
        stringList.insert("terst3");
        stringList.insert("terst4");
        stringList.insert("terst5");

        stringList.printList();
        System.out.println("++---------------------++");

        System.out.println(stringList.peek()); //test1
        System.out.println(stringList.peek()); //test1
        System.out.println(stringList.poll());//test1
        System.out.println(stringList.poll());//test9
    }
}
