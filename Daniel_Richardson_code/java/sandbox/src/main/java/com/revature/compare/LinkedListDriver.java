package com.revature.compare;

import com.revature.compare.util.CustomLinkedList;

public class LinkedListDriver {
    public static void main(String[] args) {

        CustomLinkedList<String> stringList = new CustomLinkedList<>();
        stringList.insert("test1");
        stringList.insert("test2");
        stringList.insert("test3");
        stringList.insert("test3");
        stringList.insert("test3");
        stringList.insert("test4");
        stringList.insert("test5");
        stringList.insert("test6");
        stringList.insert("test6");
        stringList.insert("test6");
        stringList.printList();
        System.out.println("---");
        System.out.println(stringList.peek());
        System.out.println(stringList.poll());
        stringList.printList();
        System.out.println();
        stringList.removeDups();
    }
}
