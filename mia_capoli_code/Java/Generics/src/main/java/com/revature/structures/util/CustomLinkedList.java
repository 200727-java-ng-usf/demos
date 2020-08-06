package com.revature.structures.util;

/**
 * This is a custom implementation of a linked list data
 * structure which vaugely mirrors the Java Collections API
 * implementation LinkedList.
 * @param <T> a parameterized type
 * @author Mia
 */

public class CustomLinkedList<T> {

    /**
     * The starting, or root node of our linked list.
     */
    private Node<T> head;

    /**
     * The ending, or last, node of our inked list.
     */
    private Node<T> tail;

    /**
     * Inserts a new node, containing provided data, at the end/tail
     * of the linked list.
     */
    public void insert(T data) {

        // Create a new node object to wrap data in whos nextNode value is
        // null and contains the provided data
        Node<T> newNode = new Node<>(data, null);

        //if the head of our list doesn't exist / is null, new node will become the head and the tail
        if (this.head == null) {
            System.out.println("List is empty, adding first element");
            head = newNode;

        }
        // if there is already elements in our list then select the tail, setting its next node
        // value to the new node we just made
        else {
            System.out.println("List has elements, adding a new node to the end");
            tail.setNextNode(newNode);
        }
        tail = newNode;
    }

        /**
         * returns, but doesnt remove the data of the first node in the list.
         */
        public T peek(){

            if (head != null) {
                return head.getData();
            } else {
                return null;
            }

        }

    /**
     * returns and removes the data of the first node in the list
     */
    public T poll(){

        if (head != null) {
            T data = head.getData();
            head = head.getNextNode();
            return data;
        } else {
            return null;
        }

    }

    public void printList() {
        Node <T> currentNode = this.head;
        while (currentNode != null) {
        System.out.println("Node value:" + currentNode.getData());
        currentNode = currentNode.getNextNode();
        }

    }
}
