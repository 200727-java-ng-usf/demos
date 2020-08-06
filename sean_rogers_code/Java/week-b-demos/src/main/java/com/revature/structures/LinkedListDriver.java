package com.revature.structures;

import com.revature.structures.util.CustomLinkedList;

public class LinkedListDriver {
    public static void main(String[] args) {
        CustomLinkedList<String> stringList = new CustomLinkedList<>();
        stringList.insert("test1");
        stringList.insert("test3");
        stringList.insert("test2");
        stringList.insert("test3");
        stringList.insert("test4");
        stringList.insert("test5");
        stringList.insert("test6");
        stringList.insert("test7");
        stringList.insert("test3");
        stringList.insert("test8");
        stringList.insert("test9");
        stringList.insert("test3");
        stringList.insert("test13");
        stringList.printList();

        stringList.removeByKey("test13");
        //stringList.removeDuplicatesOf("test3");
        System.out.println();
        stringList.printList();

        System.out.println("1---------------+");

//        System.out.println(stringList.peek()); //test1
//        System.out.println(stringList.peek()); //test1
//        System.out.println(stringList.poll()); //test1
//        System.out.println(stringList.poll()); //test2
        /*System.out.println(stringList.poll());
        System.out.println(stringList.poll());
        System.out.println(stringList.poll());*/

        System.out.println("2---------------+");
        //stringList.printList();

    }
}
