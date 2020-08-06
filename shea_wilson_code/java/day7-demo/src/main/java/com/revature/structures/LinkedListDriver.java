package com.revature.structures;

import com.revature.structures.util.CustomLinkedList;

public class LinkedListDriver {

    public static void main(String[] args) {

        CustomLinkedList<String> stringList = new CustomLinkedList<>();

        stringList.insert("Test1");
        stringList.insert("Test2");
        stringList.insert("Test3");
        stringList.insert("Test4");

        stringList.printList();

        System.out.println("+--------------------------------------+");

//        System.out.println(stringList.peek());
//        System.out.println(stringList.poll());
//        System.out.println(stringList.poll());
//        System.out.println(stringList.poll());
//        System.out.println(stringList.poll());

        System.out.println("+----------------------------------------");

        stringList.removeByKey("Test3");
        stringList.printList();
    }
}
