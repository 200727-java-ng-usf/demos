package com.revature.collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDriver {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        q.add("yo");
        q.add("hello");
        q.add("world");
        System.out.println(q);
    }
}
