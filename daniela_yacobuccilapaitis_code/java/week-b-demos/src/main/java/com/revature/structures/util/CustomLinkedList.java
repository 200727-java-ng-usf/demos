package com.revature.structures.util;

/**
 * Custom linkedlist
 * @param <T> a parametirized type
 * @author Daniela Yacobucci
 *
 */
public class CustomLinkedList<T> {

    /**
     * The starting or root of our linked list
     */
    private Node<T> head;

    /**
     * The ending, or last node of out linked list
     */
    private Node<T> tail;

    /**
     * Inserts a new node containing provinded data at the end.tail of the linkedlist
     */
    public void insert(T data) {
        //create a new node object, whose nextNode value is null and contains the provided data
        Node<T> newNode = new Node<>(data,null);

        // if the head of our list is null, then the new node will become the head and the tail
        if (head == null) {
            System.out.println("List is empty, adding first element");
            head = newNode;
        }

        // if there are already elements in our list, then we will select the tail setting its nextNode
        // value to the newNode we just created
        else {
            System.out.println("List has existing elements, adding new node to the end"); // dont necesarily have to add these
            tail.setNextNode(newNode);
        }
        tail = newNode;
    }

    /**
     * Returns, but does not remove, data of the first node in the list
     */
    public T peek () {

        if (head != null) {
            return head.getData();
        }
        return null;
    }   // its returning T, not the node, because it only cares about the data, the node is being abstracted for the user

    /**
     * Returns, and removes, the data of the first node in the list
     * @return
     */
    public T poll () {
        if (head!= null) {
            T data = head.getData();
            head = head.getNextNode();
            return data;
        }

        return null;

    }

    /**
     * Convenience method for printing out List's contents
     */
    public void printList() {

        //Start with the head of the list
        Node<T> currentNode = this.head;

        while(currentNode != null) {
            System.out.println("Node value: " + currentNode.getData());
            currentNode = currentNode.getNextNode();
        }
    }

}
