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
            if(head == null)
                tail=null;
            return data;
        }
        return null;
    }

    public void printList() {
        Node<T> currentNode = this.head;
        System.out.println("Current node: " + currentNode);
        currentNode = currentNode.getNextNode();
    }

//    public boolean removeByKey(T dataValue) {
//        return false;
//    }
//
//    public void removeDuplicate() {
//        //Node current will point to head
//        Node<T> currentNode = head;
//        Object index, temp = null;
//
//        if(head == null) {
//            return;
//        }
//        else {
//            while(currentNode != null){
//                //Node temp will point to previous node to index.
//                temp = currentNode;
//                //Index will point to node next to current
//                index = currentNode.getNextNode();
//
//                while(index != null) {
//                    //If current node's data is equal to index node's data
//                    if(currentNode.getData() == index.data) {
//                        //Here, index node is pointing to the node which is duplicate of current node
//                        //Skips the duplicate node by pointing to next node
//                        ((Node<?>) temp).getNextNode() = index.getNextNode();
//                    }
//                    else {
//                        //Temp will point to previous node of index.
//                        temp = index;
//                    }
//                    index = index.next;
//                }
//                currentNode = currentNode.next;
            }


