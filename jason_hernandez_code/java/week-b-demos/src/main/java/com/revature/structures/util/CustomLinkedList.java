package com.revature.structures.util;

public class CustomLinkedList<T> {

    private Node<T> head;
    private Node<T> tail;

    public void insert(T data) {
        Node<T> newNode = new Node<>(data, null);
        if(head == null) {
            System.out.println("List is empty; adding first node");
            head = newNode;
        } else {
            System.out.println("List has existing elements; adding new node to the end");
            tail.setNextNode(newNode);

        }tail = newNode;
    }
    public T peek () {
        if(head != null) {
            return head.getData();
        }
        return null;
    }
    public T poll () {
        if(head != null) {
            T data = head.getData();
            head = head.getNextNode();
            return data;
        }
        return null;
    }

    public void printList() {
        Node<T> currentNode = this.head;
        System.out.println("Current node: " + currentNode);
        currentNode = currentNode.getNextNode();
    }
}
