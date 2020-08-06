package com.revature.structures.util;

/**
 * This is a custom implementation of a linked list
 * which vaguely mirrors the Java Collections API implementation
 *
 * @param <T> a parameterized type
 * @author Troy Davis
 */


public class CustomLinkedList<T> {

    /**
     * The starting node, or root, node of our linked list
     */
    private Node<T> head;

    /**
     * The starting node, or root, node of our linked list
     */
    private Node<T> tail;

    /**
     * Inserts a new node containing provided data
     * at the end/ tail of the linked list
     */
    public void insert(T data){
        //create a new node object, whose next node value is null
        //and provides data
        Node<T> newNode = new Node<>(data, null);
        //does the list have a head? if so new node is head and tail
        if (head == null){
            System.out.println("list is empty, adding to first element");
            head = newNode;
        }
        // if there is already elelments in list, then we will select the tail setting its next node
        //value to the new node we just created
        else {
            System.out.println("List has existing elements, adding new node to the end.");
            tail.setNextNode(newNode);
        }
        tail = newNode;

    }

    /**
     * Returns but does not remove the data of the first node in the list
     */
    public T peek() {
        if(head != null){
            return head.getData();
        }
        return null;
    }
    /**
     * Returns and removes the data of the first node in the list
     * Queue Methods
     */
    public T poll(){
        if(head != null ){

            T data = head.getData();
            if(head.getNextNode() == null){
                tail = null;

            }
            this.head = head.getNextNode();

            return data;
        }


        return null;
    }
    /**
     * Convenience method for printing out our list contents
     */
    public void printList(){
        //startwith the head
        Node<T> currentNode= this.head;
        while (currentNode != null){
            System.out.println("Node Value: " + currentNode.getData());
            currentNode = currentNode.getNextNode();
        }
    }
    /**
     * Removes the first occurrence of the provided data value in the linked list
     * @param dataValue
     * @return a boolean value; true if a data node was removed and false if one was not
     */
    public boolean removeByKey(T dataValue) {

        //empty
        if(this.head == null){
            return false;
        }
        Node<T> currentNode = this.head;
        Node<T> nextNode = this.head.getNextNode();
        Node<T> temp = new Node<>(dataValue, null);

        while (head != null && head.getNextNode() != null){

            if(currentNode.getData() == dataValue){

//
                currentNode.setNextNode(currentNode.getNextNode().getNextNode());
                //currentNode.setNextNode(currentNode.getNextNode());
                System.out.println("The data is in the list");
                this.head = currentNode.getNextNode();

                return true;
            }
        }

        return false;
    }
    /**
     * Removes all duplicates of a provided data value - leaving only one node with that value
     * @param dataValue
     */
    public void removeDuplicatesOf(T dataValue) {

    }

}

