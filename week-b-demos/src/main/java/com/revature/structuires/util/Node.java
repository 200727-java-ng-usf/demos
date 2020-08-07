package com.revature.structuires.util;

public class Node<T> {

    private  T data;
    private Node<T> nextNode;

    public Node(T data, Node<T> nextNode) {
        this.data = data;
        this.nextNode = nextNode;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }
}

    /**
     * Removes the first occurrence of the provided data value in the linked list
     * @param dataValue
     * @return a boolean value; true if a data node was removed and false if one was not
     */
//    public boolean removeByKey(T dataValue) {
//        return false;
//    }
    /**
     * Removes all duplicates of a provided data value - leaving only one node with that value
     * @param dataValue
     */
//    public void removeDuplicatesOf(T dataValue) {
//    }