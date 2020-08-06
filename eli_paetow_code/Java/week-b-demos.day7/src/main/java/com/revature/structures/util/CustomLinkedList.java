package com.revature.structures.util;

public class CustomLinkedList<T> {


    /**
     * the starting, or root node, of our linked list
     */
    private Node<T> head;
    /**
     * the ending, or last node, of our linked list
     */
    private Node<T> tail;

    /**
     * inserts a new node containg provided data at the end/tail of the linked list
     */
    public void insert(T data) {

        //create a new node obj, whose next node value is null and contains the provided data
        Node<T> newNode = new Node<>(data, null);

        //check if there is a head node. if not the new node will be the head and the tail node

        if (head == null) {
            System.out.println("list is empty, adding first element");
            head = newNode;

        }
        //if alrady node in there, select the tail node and set its value to the new node just created
        else {
            System.out.println("list has element already. now adding new node to the tail");
            tail.setNextNode(newNode);

        }
        tail = newNode;

    }

    /**
     * peek method - returns the value but does not remove the first node of the list
     */
    public T peek() {
        if (head != null) {
            return head.getData();
        }
        return null;

    }
    public T poll(){
        if (head != null){
            T data = head.getData();
            head = head.getNextNode();
            return data;
        }return null;
    }
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
