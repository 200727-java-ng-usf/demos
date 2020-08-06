package com.revature.structures;

import com.revature.structures.util.CustomLinkedList;

public class LinkedListDriver {

    public static void main(String[] args) {

        CustomLinkedList<String> stringList = new CustomLinkedList<>();
        stringList.insert("test1");
        stringList.insert("test2");
        stringList.insert("test3");
        stringList.insert("test4");
        stringList.insert("test5");
        stringList.insert("test2");
        stringList.insert("test3");

        stringList.printList(); //

        System.out.println("+--------Prints out the contents of the Linked List-----------------+");

        System.out.println(stringList.peek()); // text1
        System.out.println(stringList.peek()); // text1
        System.out.println(stringList.poll()); // text1
        System.out.println(stringList.peek()); // text2

    }


}
