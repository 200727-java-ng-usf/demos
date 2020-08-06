package com.revature.structures.util;

import java.util.Deque;

// solve the issue with the poll() method of our custom linked list.
// swap roles for the next task
// remove by key
// implement a method that removes all duplicates of a provided data value
// leaving only one Node with that value


/**
 * This is a custom implementation of a linked list data
 * structure which vaguely mirrors the Java Collections
 * API implementation of LinkedList.
 * @param <T> a parameterized type
 * @author Stephen Brasel
 */
public class CustomLinkedList<T> {

    /**
     * The starting, or root, node of our list
     */
    private Node<T> head;

    /**
     * The ending, or last, node of our list
     */
    private Node<T> tail;

    /**
     * Inserts a new node, containing provided data, at the
     * end/tail of the linked list.
     */
    public void insert(T data){
        // create a new Node object, whose nextNode value is
        // null
        Node<T> newNode= new Node<>(data, null);
        // if the head of our list is null, then the new node will become the head and the tail.
        if(this.head == null){
            System.out.println("List is empty, adding first element");
            this.head = newNode;
        }

        // if there is already elements in our list,. then we will select the tail,
        // setting its nextNode value to the newNode we just created.
        else{
            System.out.println("List has existing elements, adding new node to the end.");
            this.tail.setNextNode(newNode);
        }
        this.tail = newNode;

    }

    /**
     * Returns, but does not remove, the data of the first node of the list.
     */
    public T peek(){
        if(head != null) {
            return head.getData();
        }
        return null;
    }

    /**
     * Returns the data of the first node of the list, and removes the first node.
     */
    public T poll(){

        if(head != null){
            T data = head.getData();
            if(this.head == this.tail){
                this.tail = null;
            }
            this.head = head.getNextNode();
            return data;
        }
        return null;
    }

    /**
     * Removes the first occurrence of the provided data value in the linked list
     * @param dataValue
     * @return a boolean value; true if a data node was removed and false if one was not
     */
    public boolean removeByKey(T dataValue) {
        Node<T> currentNode = this.head;

        if(currentNode.getData() == dataValue){
            this.poll();
            return true;
        }

        while(currentNode != null){
            if(currentNode.getNextNode().getData() == dataValue){
                currentNode.setNextNode(currentNode.getNextNode().getNextNode());
                return true;
            }
            currentNode = currentNode.getNextNode();
        }
        return false;
    }

    /**
     * Removes all duplicates of a provided data value - leaving only one node with that value
     * @param dataValue
     */
    public void removeDuplicatesOf(T dataValue) {
        // Ensure list ONLY CONTAINS Unique Values
        Node<T> currentNode = this.head;
        int uniqueCount = 0;

        if(currentNode.getData() == dataValue){
            uniqueCount++;
        }

        while(currentNode != null){
            if(currentNode.getNextNode() != null && currentNode.getNextNode().getData() == dataValue){
                uniqueCount++;
                if(uniqueCount > 1) {
                    currentNode.setNextNode(currentNode.getNextNode().getNextNode());
                }
            }
            currentNode = currentNode.getNextNode();
        }
    }

    /**
     * Convenience method for printing out our list's contents
     */
    public void printList(){

        // Start with the head of the list
        Node<T> currentNode = this.head;

        while(currentNode != null){
            System.out.println("Node value: " + currentNode.getData());
            currentNode = currentNode.getNextNode();
        }
    }

}
