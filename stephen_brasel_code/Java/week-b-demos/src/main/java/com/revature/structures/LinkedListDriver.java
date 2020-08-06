package com.revature.structures;

import com.revature.structures.util.CustomLinkedList;

public class LinkedListDriver {
    public static void main(String[] args) {
        CustomLinkedList<String> stringList = new CustomLinkedList<String>();
        int num = 10;
        method1(stringList, num);
//        stringList.insert("test1");
//        System.out.println(stringList.poll());
//        System.out.println(stringList.poll());
    }

    private static void method1(CustomLinkedList<String> stringList, int num) {
//        for (int i = 0; i < num; i++) {
//            stringList.insert("test" + i);
//        }
        stringList.insert("test1");
        stringList.insert("test1");
        stringList.insert("test3");
        stringList.insert("test2");
        stringList.insert("test3");
        stringList.insert("test4");
        stringList.insert("test5");
        stringList.insert("test6");
        stringList.insert("test3");
        stringList.insert("test9");
        stringList.insert("test1");
        stringList.insert("test1");

        stringList.printList();

//        stringList.removeByKey("test1");
//        System.out.println("+----------------------------------+");
//        stringList.printList();
//        stringList.removeByKey("test3");
//        System.out.println("+----------------------------------+");
//        stringList.printList();
//        stringList.removeByKey("test9");
//        System.out.println("+----------------------------------+");
//        stringList.printList();

        stringList.removeDuplicatesOf("test1");
        System.out.println("+----------------------------------+");
        stringList.printList();
        stringList.removeDuplicatesOf("test3");
        System.out.println("+----------------------------------+");
        stringList.printList();
        stringList.removeDuplicatesOf("test9");
        System.out.println("+----------------------------------+");
        stringList.printList();
        stringList.removeDuplicatesOf("test00");
        System.out.println("+----------------------------------+");
        stringList.printList();


        System.out.println("+----------------------------------+");
//        System.out.println(stringList.peek());
//        System.out.println(stringList.peek());
//        System.out.println("+----------------------------------+");
//        System.out.println(stringList.poll());
//        System.out.println(stringList.poll());
    }
}
