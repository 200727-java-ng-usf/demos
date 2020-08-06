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
        stringList.insert("test3");
        stringList.insert("test3");
        stringList.insert("test5");

        stringList.printList();

        System.out.println("+--------------------------+");
        System.out.println(stringList.peek()); // Looks but does not remove
        System.out.println(stringList.peek()); // Same as before, because not removed
        System.out.println(stringList.poll()); // Still same as before, but removed this time
        System.out.println(stringList.poll()); // Now the next one


    }

}
