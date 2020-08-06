package com.revature.structures.util;

/**
 * This is a custom implementation of a linked list data
 * structure which vaugely mirrors the Java Collections API
 * implementation LinkedList.
 *
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
    public T peek() {

        if (head != null) {
            return head.getData();
        } else {
            return null;
        }

    }

    /**
     * returns and removes the data of the first node in the list
     */
    public T poll() {


        if (head != null) {
            if (head == tail) {
                T data = head.getData();
                head = null;
                tail = null;
                return data;
            } else {
                T data = head.getData();
                head = head.getNextNode();
                return data;
            }
        } else {
            return null;
        }

    }

    public void printList() {
        Node<T> currentNode = this.head;
        while (currentNode != null) {
            System.out.println("Node value:" + currentNode.getData());
            currentNode = currentNode.getNextNode();
        }

    }

    /**
     * Removes the first occurrence of the provided data value in the linked list
     *
     * @param dataValue
     * @return a boolean value; true if a data node was removed and false if one was not
     */
    public boolean removeByKey(T dataValue) {
        Node<T> currentNode = this.head;

        if (currentNode.getData() == dataValue) {
            this.poll();
            return true;
        }

        while (currentNode != null) {
            while (currentNode.getNextNode() != null) {
                if (currentNode.getNextNode().getData() == dataValue) {
                    currentNode.setNextNode(currentNode.getNextNode().getNextNode());
                    return true;
                }
                currentNode = currentNode.getNextNode();
            }
        }
        return false;
    }

    /**
     * Removes all duplicates of a provided data value - leaving only one node with that value
     *
     * @param dataValue
     */
    public void removeDuplicatesOf(T dataValue) {
        Node<T> currentNode = this.head;
        int intCounter = 0;
        if (currentNode.getData() == dataValue) {
            intCounter++;
        }

        while (currentNode != null) {
            if (currentNode.getNextNode() != null) {
                if (currentNode.getNextNode().getData() == dataValue) {
                    intCounter++;
                    if (intCounter > 1 || currentNode.getNextNode().getNextNode() != null) {
                        currentNode.setNextNode(currentNode.getNextNode().getNextNode());
                    }
                }
            }
            currentNode = currentNode.getNextNode();
        }

    }
}
