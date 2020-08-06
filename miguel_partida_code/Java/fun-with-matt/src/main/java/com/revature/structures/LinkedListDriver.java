package com.revature.structures;


import com.revature.structures.util.CustomLiknkedList;

/*
util packages has a lot of util methods
 */
public class LinkedListDriver {

    public static void main(String[] args) {
        CustomLiknkedList<String> stringList = new CustomLiknkedList<>();

        stringList.insert("Test1");

        stringList.printList();

        System.out.println("+________________________+");
        stringList.poll();
        stringList.printList();

    }

}
