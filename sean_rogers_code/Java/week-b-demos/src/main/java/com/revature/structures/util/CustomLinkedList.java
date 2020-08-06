package com.revature.structures.util;

/**
 * This is a custom implementation of a linked list data structure,
 * which vaguely mirrors the Java Collections
 * API implementation LinkedList
 * @param <T> a parameterized type
 */
public class CustomLinkedList<T> {

    /**
     * The starting, or root, node of our linked list.
     */
    private Node<T> head;
    /**
     * The ending, or last, node of our linked list.
     */
    private Node<T> tail;
    /**
     * Inserts a new node, containing provided data, at the
     * end/tail of the linked list.
     */
    public void insert(T data) {
        // create a new node object, whose nextNode value is null and contains the provided data
        Node<T> newNode = new Node<>(data, null);
        // if the head of our list is null, then the new node will become the head and the tail
        if (head == null) {
            System.out.println("List is empty, adding first element.");
            head = newNode;
        }
        // if there is already elements in our list, then we will select the tail, setting its nextNode
        // value to the newNode we just created.
        else {
            System.out.println("List has existing elements, adding new node to the end.");
            tail.setNextNode(newNode);
        }
        tail = newNode;
    }
    /**
     * Returns, but does not remove, the data of first node in the list.
     */
    public T peek() {
        if (head != null) {
            return head.getData();
        }
        return null;
    }
    /**
     * Returns, and removes, the data of the first node in the list
     */
    public T poll() {
        if (head != null) {
            T data = head.getData();
            head = head.getNextNode();
            return data;
        }
        return null;
    }
    /**
     * Convenience method for printing out our list's contents
     */
    public void printList() {
        // Start with the head of the list
        Node<T> currentNode = this.head;
        // while the current node is not null, print node info and move on to the next node
        while (currentNode != null) {
            System.out.println("Node value: " + currentNode.getData());
            currentNode = currentNode.getNextNode();
        }
    }

}