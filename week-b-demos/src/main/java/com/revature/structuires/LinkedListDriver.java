package com.revature.structuires;

import com.revature.structuires.util.CustomLinkedList;

public class LinkedListDriver {
    public static void main(String[] args) {

        CustomLinkedList<String> stringList = new CustomLinkedList<>();
        stringList.insert("test1");
        stringList.insert("test2");
        stringList.poll();
        stringList.printList();

    }
}
