package com.revature.structures;

import com.revature.structures.util.CustomLinkedList;

import java.util.LinkedList;

public class LinkedListDriver {

    public static void main(String[] args) {


        CustomLinkedList<String> stringList = new CustomLinkedList<>();
        stringList.insert("test 1");
//        stringList.insert("test 3");
//        stringList.insert("test 1");
//        stringList.insert("test 5");
//        stringList.insert("test 6");

        stringList.printList();
//        System.out.println(stringList.peek());
       System.out.println(stringList.peek());
       System.out.println(stringList.poll());
//        System.out.println(stringList.peek());
        System.out.println("--------------------");
        stringList.printList();





    }
}
